package com.kcaluru.burlapbot.domaingenerator;

import net.minecraft.util.RegistryNamespaced;
import burlap.oomdp.auxiliary.DomainGenerator;
import burlap.oomdp.core.Attribute;
import burlap.oomdp.core.Domain;
import burlap.oomdp.core.ObjectClass;
import burlap.oomdp.core.ObjectInstance;
import burlap.oomdp.core.State;
import burlap.oomdp.singleagent.Action;
import burlap.oomdp.singleagent.SADomain;

import com.kcaluru.burlapbot.helpers.BurlapAIHelper;
import com.kcaluru.burlapbot.helpers.NameSpace;

import cpw.mods.fml.common.registry.GameData;

/**
 * Class to generate burlap domain for minecraft
 * @author Krishna Aluru
 *
 */

public class DungeonWorldDomain implements DomainGenerator {
		
	protected int length;
	protected int width;
	protected int height;
	protected int fixedFeetY;
	
	protected int [][][] map;
	protected int [][] movementMap;
	
	protected double [][] transitionDynamics;
	
	public DungeonWorldDomain(int [][][] map, int feetY) {
		this.setMaps(map);
		this.fixedFeetY = feetY;
	}
	
	public void setMaps(int [][][] map) {
		this.height = map.length;
		this.length = map[0].length;
		this.width = map[0][0].length;
		this.movementMap = map[this.fixedFeetY].clone();
		this.map = map.clone();
	}
	
	@Override
	public Domain generateDomain() {
		
		SADomain domain = new SADomain();
		
		// Attributes
		// x-position attribute
		Attribute xAtt = new Attribute(domain, NameSpace.ATX, Attribute.AttributeType.DISC);
		xAtt.setLims(0, this.length - 1);
		// y-position attribute
		Attribute yAtt = new Attribute(domain, NameSpace.ATY, Attribute.AttributeType.DISC);
		yAtt.setLims(0, 5);
		// z-position attribute
		Attribute zAtt = new Attribute(domain, NameSpace.ATZ, Attribute.AttributeType.DISC);
		zAtt.setLims(0, this.width - 1);
		// block broken attribute
		Attribute isBroken = new Attribute(domain, NameSpace.ISBROKEN, Attribute.AttributeType.BOOLEAN);
		
		// Object classes
		// agent
		ObjectClass agentClass = new ObjectClass(domain, NameSpace.CLASSAGENT);
		agentClass.addAttribute(xAtt);
		agentClass.addAttribute(yAtt);
		agentClass.addAttribute(zAtt);
		// blocks
		ObjectClass blockClass = new ObjectClass(domain, NameSpace.CLASSBLOCK);
		blockClass.addAttribute(xAtt);
		blockClass.addAttribute(yAtt);
		blockClass.addAttribute(zAtt);
		blockClass.addAttribute(isBroken);
		
		
		// Actions
		
		new MovementAction(NameSpace.ACTIONSOUTH, domain, 0);
		new MovementAction(NameSpace.ACTIONWEST, domain, 1);
		new MovementAction(NameSpace.ACTIONNORTH, domain, 2);
		new MovementAction(NameSpace.ACTIONEAST, domain, 3);
//		new FaceAction(NameSpace.ACTIONFACE, domain);
		
		return domain;
		
	}
	
	public class MovementAction extends Action {

		/**
		 * Probabilities of the actual direction the agent will go
		 * 0: south, 1: west, 2: north, 3: east 
		 */
		protected double [] directionProbs = new double[4];
		
		public MovementAction(String actionName, Domain domain, int direction) {
			super(actionName, domain, "");
			for(int i = 0; i < 4; i++) {
				if (i == direction) {
					directionProbs[i] = 0.8;
				}
				else {
					directionProbs[i] = 0.2/3.;
				}
			}
		}
		@Override
		protected State performActionHelper(State s, String[] params) {
			// TODO Auto-generated method stub
			ObjectInstance agent = s.getFirstObjectOfClass(NameSpace.CLASSAGENT);
			int curX = agent.getDiscValForAttribute(NameSpace.ATX);
			int curZ = agent.getDiscValForAttribute(NameSpace.ATZ);
			
			//sample directon with random roll
			double r = Math.random();
			double sumProb = 0.;
			int dir = 0;
			for(int i = 0; i < this.directionProbs.length; i++){
				sumProb += this.directionProbs[i];
				if(r < sumProb){
					dir = i;
					break; //found direction
				}
			}
			
			//get resulting position
			int [] newPos = this.moveResult(curX, curZ, dir);
			
			//set the new position
			agent.setValue(NameSpace.ATX, newPos[0]);
			agent.setValue(NameSpace.ATZ, newPos[1]);
			
			//return the state we just modified
			return s;
		}
		
		protected int [] moveResult(int curX, int curZ, int direction) {
			int xdelta = 0;
			int zdelta = 0;
			if(direction == 0){
				zdelta = -1;
			}
			else if(direction == 1){
				xdelta = -1;
			}
			else if(direction == 2){
				zdelta = 1;
			}
			else{
				xdelta = 1;
			}
			
			int nx = curX + xdelta;
			int nz = curZ + zdelta;
			
			int length = DungeonWorldDomain.this.movementMap.length;
			int width = DungeonWorldDomain.this.movementMap[0].length;
			
			//make sure new position is valid (not a wall or out of bounds)
			if(nx < 0 || nx >= length || nz < 0 || nz >= width ||  
				DungeonWorldDomain.this.movementMap[nx][nz] >= 1){
				nx = curX;
				nz = curZ;
			}
				
			
			return new int[]{nx,nz};
		}
		
	}

}
