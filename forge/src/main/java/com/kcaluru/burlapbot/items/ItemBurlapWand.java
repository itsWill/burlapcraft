package com.kcaluru.burlapbot.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.RegistryNamespaced;
import net.minecraft.world.World;

import com.kcaluru.burlapbot.BurlapMod;
import com.kcaluru.burlapbot.helpers.BurlapAIHelper;
import com.kcaluru.burlapbot.helpers.NameSpace;
import com.kcaluru.burlapbot.test.BFSMovement;

import cpw.mods.fml.common.registry.GameData;

public class ItemBurlapWand extends Item {
	
	// name of item
	private String name = "burlapwand";
	public static int actualDestX;
	public static int actualDestZ;
	
	// block registry
//	public static final RegistryNamespaced blockRegistry = GameData.getBlockRegistry();
	
	public ItemBurlapWand() {
		// give the item a name
		setUnlocalizedName(BurlapMod.MODID + "_" + name);
		
		// add the item to misc tab
		setCreativeTab(CreativeTabs.tabMisc);
		
		// set texture
		setTextureName(BurlapMod.MODID + ":" + name);
	}
	
	@Override
	public boolean onItemUseFirst(ItemStack itemstack, EntityPlayer player, World world, 
			 int x, int y, int z, int side, float px, float py, float pz) {
		
//		System.out.println(x);
//		System.out.println(z);
		
		int posX = (int) player.posX;
		int posY = (int) player.posY;
		int posZ = (int) player.posZ;
		
//		System.out.println(posX);
//		System.out.println(posZ);
		
//		BurlapAIHelper.walkWest(false, posX - 1, posY - 2, posZ - 1);
		
		int startX = 8;
		int startZ = 8;
		
		int [][] map = new int[][]{
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		};
		
		
		int destX = 0;
		int destZ = 0;
		
		for (int a = posX - 8; a < posX + 8; a++) {
			for (int b = posZ - 8; b < posZ + 8; b++) {
				Block block = world.getBlock(a, posY - 1, b);
				int type = NameSpace.getBlock(block);
				if (type == -1) {
					destX = a - (posX - 8);
					actualDestX = a;
					destZ = (posZ + 8) - b;
					actualDestZ = b;
					map[a - (posX - 8)][(posZ + 8) - b - 1] = 0;
				} 
				else {
					map[a - (posX - 8)][(posZ + 8) - b - 1] = type;
				}
			}
		}
		
//		for (int i = 0; i < 16; i++) {
//			System.out.println();
//			for (int j = 0; j < 16; j++) {
//				System.out.println(map[i][j]);
//			}
//		}
		
//		System.out.println(startX);
//		System.out.println(startZ);
//		System.out.println(destX);
//		System.out.println(destZ);
		
		BFSMovement movement = new BFSMovement(map, startX, startZ, destX, destZ);
		movement.BFSExample();
		
		return true;
	}
}
