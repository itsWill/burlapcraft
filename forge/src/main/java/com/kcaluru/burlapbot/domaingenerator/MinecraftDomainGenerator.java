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

public class MinecraftDomainGenerator implements DomainGenerator {
	
	// block registry
	public static final RegistryNamespaced blockRegistry = GameData.getBlockRegistry();
	
	@Override
	public Domain generateDomain() {
		
		Domain domain = new SADomain();
		
		// Attributes
		
		// x-position attribute
		Attribute xAtt = new Attribute(domain, NameSpace.ATX, Attribute.AttributeType.DISC);
		xAtt.setLims(0, 15);
		// y-position attribute
		Attribute yAtt = new Attribute(domain, NameSpace.ATY, Attribute.AttributeType.DISC);
		yAtt.setLims(0, 5);
		// z-position attribute
		Attribute zAtt = new Attribute(domain, NameSpace.ATZ, Attribute.AttributeType.DISC);
		zAtt.setLims(0, 15);
		// rotational direction attribute for agent
		Attribute rotDirAt = new Attribute(domain, NameSpace.ATROTDIR, Attribute.AttributeType.DISC);
		rotDirAt.setDiscValuesForRange(0,NameSpace.RotDirection.size-1,1);
		// vertical direction attribute for agent
		Attribute vertDirAt = new Attribute(domain, NameSpace.ATVERTDIR, Attribute.AttributeType.DISC);
		vertDirAt.setDiscValuesForRange(0,NameSpace.VertDirection.size-1,1);
		
		
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
		
		
		// Actions
		
//		new Movement(NameSpace.ACTIONEAST, domain, 0);
//		new Movement(NameSpace.ACTIONWEST, domain, 1);
//		new Movement(NameSpace.ACTIONNORTH, domain, 2);
//		new Movement(NameSpace.ACTIONSOUTH, domain, 3);
		
		return domain;
		
	}

}
