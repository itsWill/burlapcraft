package com.kcaluru.burlapbot.items;

import java.util.ArrayList;

import com.kcaluru.burlapbot.BurlapMod;
import com.kcaluru.burlapbot.BurlapWorldGenHandler;
import com.kcaluru.burlapbot.solver.BridgeDungeonSolver;
import com.kcaluru.burlapbot.solver.FinderDungeonSolver;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class ItemBridgeWand extends Item {

	// name of item
	private String name = "bridgewand";
	
	// start x, y and z of agent
	private double startX; 
	private double startY;
	private double startZ;
	
	// bridge dungeon map
	final int [][][] bridgeMap = {
			{
				{7,7,7,7,7},
				{7,7,7,7,7},
				{7,7,7,7,7},
				{7,7,7,7,7},
				{7,7,7,7,7}
			},
			{
				{7,7,7,7,7},
				{7,7,11,7,7},
				{7,7,11,7,7},
				{7,7,11,7,7},
				{7,7,7,7,7}
			},
			{
				{7,7,7,7,7},
				{7,41,0,0,7},
				{7,0,0,0,7},
				{7,0,0,7,7},
				{7,7,7,7,7}
			},
			{
				{7,7,7,7,7},
				{7,0,0,0,7},
				{7,0,0,0,7},
				{7,0,0,0,7},
				{7,7,7,7,7}
			},
			{
				{7,7,7,7,7},
				{7,7,7,7,7},
				{7,7,7,7,7},
				{7,7,7,7,7},
				{7,7,7,7,7}
			}
	};
	
	
	// indicate whether agent is in dungeon or not
	public static boolean bridgeInside;
	
	public ItemBridgeWand() {
		
		// set brideInside to false
		bridgeInside = false;
		
		// give the item a name
		setUnlocalizedName(BurlapMod.MODID + "_" + name);
		
		// add the item to misc tab
		setCreativeTab(CreativeTabs.tabCombat);
		
		// set texture
		setTextureName(BurlapMod.MODID + ":" + name);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
		if (!world.isRemote) {
			if (bridgeInside) {
				double posX = player.posX;
				double posZ = player.posZ;
				// hashmap block to coords arraylist of coords. if block not in walkable, add all coords to reward function -1. 
				ArrayList<Block> blockList = new ArrayList<Block>();
				
				int convertedX = (int) Math.ceil((8 + posX - this.startX));
				int convertedZ = (int) Math.ceil((2 + posZ - this.startZ));
				
				BridgeDungeonSolver solver = new BridgeDungeonSolver(bridgeMap, convertedX, convertedZ, 1, 1);
				solver.BFS();
				
			}
			else {
				if (!world.isRemote) {
					ItemFinderWand.finderInside = false;
					player.setPositionAndUpdate((double) BurlapWorldGenHandler.bridgeDungeonPos.x + 2, (double) BurlapWorldGenHandler.bridgeDungeonPos.y + 2, (double) BurlapWorldGenHandler.bridgeDungeonPos.z + 4);
					bridgeInside = true;
				}
			}
		}
        return itemStack;
    }
}
