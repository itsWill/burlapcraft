package com.kcaluru.burlapbot;

import java.util.Random;

import com.kcaluru.burlapbot.helpers.BurlapAIHelper;
import com.kcaluru.burlapbot.helpers.Pos;
import com.kcaluru.burlapbot.items.ItemFinderWand;
import com.kcaluru.burlapbot.worldgen.WorldGenFinderDungeon;
import com.kcaluru.burlapbot.worldgen.WorldGenBridgeDungeon;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.settings.KeyBinding;

public class BurlapWorldGenHandler implements IWorldGenerator {
	
	public static Pos finderDungeonPos;
	public static Pos bridgeDungeonPos;
	public static Pos playerSpawnPos;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub

		switch (world.provider.dimensionId) {

		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);

		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);

		}

	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub

	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub

	}

	private void generateSurface(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
		if(!BurlapMod.structCreated && BurlapAIHelper.getMinecraft().thePlayer != null) {
			
			playerSpawnPos = BurlapAIHelper.getPlayerPosition();
			
			finderDungeonPos.x = playerSpawnPos.x;
			finderDungeonPos.y = playerSpawnPos.y + 40;
			finderDungeonPos.z = playerSpawnPos.z;
			
			bridgeDungeonPos.x = playerSpawnPos.x + 40;
			bridgeDungeonPos.y = playerSpawnPos.y + 40;
			bridgeDungeonPos.z = playerSpawnPos.z;
			
			new WorldGenFinderDungeon().generate(world, random, finderDungeonPos.x, finderDungeonPos.y, finderDungeonPos.z);
			new WorldGenBridgeDungeon().generate(world, random, bridgeDungeonPos.x, bridgeDungeonPos.y, bridgeDungeonPos.z);

			BurlapMod.structCreated = true;
			
		}
		
	}

}
