package com.kcaluru.burlapbot.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.kcaluru.burlapbot.helpers.BurlapAIHelper;
import com.kcaluru.burlapbot.items.ItemFinderWand;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import burlap.behavior.singleagent.Policy;
import burlap.behavior.singleagent.Policy.PolicyUndefinedException;
import burlap.behavior.singleagent.planning.StateConditionTest;
import burlap.behavior.singleagent.planning.deterministic.DeterministicPlanner;
import burlap.behavior.singleagent.planning.deterministic.SDPlannerPolicy;
import burlap.behavior.singleagent.planning.deterministic.TFGoalCondition;
import burlap.behavior.singleagent.planning.deterministic.uninformed.bfs.BFS;
import burlap.behavior.statehashing.DiscreteStateHashFactory;
import burlap.domain.singleagent.gridworld.GridWorldDomain;
import burlap.domain.singleagent.gridworld.GridWorldStateParser;
import burlap.oomdp.auxiliary.StateParser;
import burlap.oomdp.core.AbstractGroundedAction;
import burlap.oomdp.core.Domain;
import burlap.oomdp.core.State;
import burlap.oomdp.core.TerminalFunction;
import burlap.oomdp.singleagent.RewardFunction;
import burlap.oomdp.singleagent.common.SinglePFTF;
import burlap.oomdp.singleagent.common.UniformCostRF;

public class BFSMovement {

	
	
	GridWorldDomain 			gwdg;
	Domain						domain;
	StateParser 				sp;
	RewardFunction 				rf;
	TerminalFunction			tf;
	StateConditionTest			goalCondition;
	State 						initialState;
	DiscreteStateHashFactory	hashingFactory;
	
	private int index = 0;
	private int actionSize = 0;
	private int curX = (int) Minecraft.getMinecraft().thePlayer.posX;
	private final int curY = (int) Minecraft.getMinecraft().thePlayer.posY;
	private int curZ = (int) Minecraft.getMinecraft().thePlayer.posZ;
	private int destX;
	private int destZ;
//	EntityPlayer p1;
//	State next;
//	World w;
	
	public BFSMovement(int [][] map, int startX, int startZ, int destX, int destZ) {
	
		//create the domain
		gwdg = new GridWorldDomain(map);

		domain = gwdg.generateDomain();
		
		this.destX = destX;
		this.destZ = destZ;
		
		//create the state parser
		sp = new GridWorldStateParser(domain); 
		
		//define the task
		rf = new UniformCostRF(); 
		tf = new SinglePFTF(domain.getPropFunction(GridWorldDomain.PFATLOCATION)); 
		goalCondition = new TFGoalCondition(tf);
		
		//set up the initial state of the task
		initialState = GridWorldDomain.getOneAgentOneLocationState(domain);
		GridWorldDomain.setAgent(initialState, startX, startZ);
		GridWorldDomain.setLocation(initialState, 0, destX, destZ);
		
		//set up the state hashing system
		hashingFactory = new DiscreteStateHashFactory();
		hashingFactory.setAttributesForClass(GridWorldDomain.CLASSAGENT, 
		domain.getObjectClass(GridWorldDomain.CLASSAGENT).attributeList); 
	}
	
//	public void BFS(EntityPlayer player, State state, boolean first, World world) {
//		p1 = player;
//		next = null;
//		w = world;
//		
//		//BFS ignores reward; it just searches for a goal condition satisfying state
//		DeterministicPlanner planner = new BFS(domain, goalCondition, hashingFactory); 
//		if (first) {
//			state = initialState;
//		}
//		if (tf.isTerminal(state)) {
//			Block b = w.getBlock((int) p1.posX, (int) p1.posY - 1, (int) ((int) p1.posZ - 0.5));
//			b.removedByPlayer(w, p1, (int) p1.posX, (int) p1.posY - 1, (int) ((int) p1.posZ - 0.5), true);
//			return;
//		}
//		planner.planFromState(state);
//		//capture the computed plan in a partial policy
//		Policy p = new SDPlannerPolicy(planner);
//		AbstractGroundedAction action = p.getAction(state);
//		if (action == null) {
//			throw new PolicyUndefinedException();
//		}
//		next = action.executeIn(state);
//		int direction = getDirection(action.toString());
//		move(player, direction);
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			  @Override
//			  public void run() {
//					BFS(p1, next, false, w);
//			  }
//			}, 175);
//		//record the plan results to a file
////		p.evaluateBehavior(initialState, rf, tf).writeToFile(outputPath + "planResult", sp);
//			
//	}
	
	public void BFSExample() {
		DeterministicPlanner planner = new BFS(domain, goalCondition, hashingFactory);
		planner.planFromState(initialState);
		
		Policy p = new SDPlannerPolicy(planner);
		
		System.out.println(p.evaluateBehavior(initialState, rf, tf).getActionSequenceString("\n"));
		
		executeActions(p.evaluateBehavior(initialState, rf, tf).getActionSequenceString("\n"), this.destX, this.destZ);
	}
	
	public void executeActions(String actionString, final int destX, final int destZ) {
		final String[] lines = actionString.split("\\r?\\n");
		final Timer timer = new Timer();
		actionSize = lines.length;
//		for (int i = 0; i < actionSize; i++) {
//			System.out.println(lines[i]);
//		}
		timer.scheduleAtFixedRate(new TimerTask() {
			  @Override
			  public void run() {
				  if (index < actionSize) {
					  if (lines[index].equals("north")) {
						  BurlapAIHelper.walkNorth(false, curX - 1, curY - 2, curZ - 1);
						  curZ -= 1;
					  }
					  else if (lines[index].equals("south")) {
						  BurlapAIHelper.walkSouth(false, curX - 1, curY - 2, curZ - 1);
						  curZ += 1;
					  }
					  else if (lines[index].equals("east")) {
						  BurlapAIHelper.walkEast(false, curX - 1, curY - 2, curZ - 1);
						  curX += 1;
					  }
					  else if (lines[index].equals("west")) {
						  BurlapAIHelper.walkWest(false, curX - 1, curY - 2, curZ - 1);
						  curX -= 1;
					  }
					  index += 1;
				  }
				  else {
//					  BurlapAIHelper.faceBlock(ItemFinderWand.actualDestX, curY - 1, ItemFinderWand.actualDestZ);
					  timer.cancel();
				  }
			  }
		}, 0, 350);
	}
}
	
//	AbstractGroundedAction action = p.getAction(state);
//	if (action == null) {
//		throw new PolicyUndefinedException();
//	}
//	next = action.executeIn(state);
//	int direction = getDirection(action.toString());
//	move(player, direction);
//	Timer timer = new Timer();
//	timer.schedule(new TimerTask() {
//		  @Override
//		  public void run() {
//				BFS(p1, next, false, w);
//		  }
//		}, 175);
	
	// 0: north; 1: south; 2: east; 3: west
//	void move(EntityPlayer player, int direction) {
//		if (direction == 0) {
//			player.motionZ = -0.5;
//		}
//		else if (direction == 1) {
//			player.motionZ = 0.5;
//		}
//		else if (direction == 2) {
//			player.motionX = 0.5;
//		}
//		else {
//			player.motionX = -0.5;
//		}
//	}
//	
//	public int getDirection(String direction) {
//		System.out.println("in get: " + direction);
//		if (direction.equals("north")) {
//			return 0;
//		}
//		else if (direction.equals("south")) {
//			return 1;
//		}
//		else if (direction.equals("east")) {
//			return 2;
//		}
//		else {
//			return 3;
//		}
//	}
//	
