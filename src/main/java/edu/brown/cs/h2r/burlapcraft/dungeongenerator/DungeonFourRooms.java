package edu.brown.cs.h2r.burlapcraft.dungeongenerator;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import edu.brown.cs.h2r.burlapcraft.BurlapCraft;
import edu.brown.cs.h2r.burlapcraft.helper.HelperGeometry.Pose;

public class DungeonFourRooms extends Dungeon {

	public DungeonFourRooms(Pose _pose) {
		super("fourrooms", _pose, 11, 12, 4, Pose.fromXyz(1.5, 5, 3));
	}

	@Override
	protected void generate(World world, int x, int y, int z) {

		System.out.println("Making four rooms dungeon at " + x + "," + y + "," + z);

		world.setBlock(x+0, y+0, z+0, BurlapCraft.redRock);
		world.setBlock(x+1, y+0, z+0, BurlapCraft.redRock);
		world.setBlock(x+2, y+0, z+0, BurlapCraft.redRock);
		world.setBlock(x+3, y+0, z+0, BurlapCraft.redRock);
		world.setBlock(x+4, y+0, z+0, BurlapCraft.redRock);
		world.setBlock(x+5, y+0, z+0, BurlapCraft.redRock);
		world.setBlock(x+6, y+0, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+0, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+0, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+0, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+0, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+0, z+1, BurlapCraft.redRock);
		world.setBlock(x+1, y+0, z+1, BurlapCraft.redRock);
		world.setBlock(x+2, y+0, z+1, BurlapCraft.redRock);
		world.setBlock(x+3, y+0, z+1, BurlapCraft.redRock);
		world.setBlock(x+4, y+0, z+1, BurlapCraft.redRock);
		world.setBlock(x+5, y+0, z+1, BurlapCraft.redRock);
		world.setBlock(x+6, y+0, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+0, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+0, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+0, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+0, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+0, z+2, BurlapCraft.redRock);
		world.setBlock(x+1, y+0, z+2, BurlapCraft.redRock);
		world.setBlock(x+2, y+0, z+2, BurlapCraft.redRock);
		world.setBlock(x+3, y+0, z+2, BurlapCraft.redRock);
		world.setBlock(x+4, y+0, z+2, BurlapCraft.redRock);
		world.setBlock(x+5, y+0, z+2, BurlapCraft.redRock);
		world.setBlock(x+6, y+0, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+0, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+0, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+0, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+0, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+0, z+3, BurlapCraft.redRock);
		world.setBlock(x+1, y+0, z+3, BurlapCraft.redRock);
		world.setBlock(x+2, y+0, z+3, BurlapCraft.redRock);
		world.setBlock(x+3, y+0, z+3, BurlapCraft.redRock);
		world.setBlock(x+4, y+0, z+3, BurlapCraft.redRock);
		world.setBlock(x+5, y+0, z+3, BurlapCraft.redRock);
		world.setBlock(x+6, y+0, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+0, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+0, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+0, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+0, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+0, z+4, BurlapCraft.redRock);
		world.setBlock(x+1, y+0, z+4, BurlapCraft.redRock);
		world.setBlock(x+2, y+0, z+4, BurlapCraft.redRock);
		world.setBlock(x+3, y+0, z+4, BurlapCraft.redRock);
		world.setBlock(x+4, y+0, z+4, BurlapCraft.redRock);
		world.setBlock(x+5, y+0, z+4, BurlapCraft.redRock);
		world.setBlock(x+6, y+0, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+0, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+0, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+0, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+0, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+0, z+5, BurlapCraft.redRock);
		world.setBlock(x+1, y+0, z+5, BurlapCraft.redRock);
		world.setBlock(x+2, y+0, z+5, BurlapCraft.redRock);
		world.setBlock(x+3, y+0, z+5, BurlapCraft.redRock);
		world.setBlock(x+4, y+0, z+5, BurlapCraft.redRock);
		world.setBlock(x+5, y+0, z+5, BurlapCraft.redRock);
		world.setBlock(x+6, y+0, z+5, BurlapCraft.greenRock);
		world.setBlock(x+7, y+0, z+5, BurlapCraft.greenRock);
		world.setBlock(x+8, y+0, z+5, BurlapCraft.greenRock);
		world.setBlock(x+9, y+0, z+5, BurlapCraft.greenRock);
		world.setBlock(x+10, y+0, z+5, BurlapCraft.greenRock);
		world.setBlock(x+0, y+0, z+6, BurlapCraft.blueRock);
		world.setBlock(x+1, y+0, z+6, BurlapCraft.blueRock);
		world.setBlock(x+2, y+0, z+6, BurlapCraft.blueRock);
		world.setBlock(x+3, y+0, z+6, BurlapCraft.blueRock);
		world.setBlock(x+4, y+0, z+6, BurlapCraft.blueRock);
		world.setBlock(x+5, y+0, z+6, BurlapCraft.greenRock);
		world.setBlock(x+6, y+0, z+6, BurlapCraft.greenRock);
		world.setBlock(x+7, y+0, z+6, BurlapCraft.greenRock);
		world.setBlock(x+8, y+0, z+6, BurlapCraft.greenRock);
		world.setBlock(x+9, y+0, z+6, BurlapCraft.greenRock);
		world.setBlock(x+10, y+0, z+6, BurlapCraft.greenRock);
		world.setBlock(x+0, y+0, z+7, BurlapCraft.blueRock);
		world.setBlock(x+1, y+0, z+7, BurlapCraft.blueRock);
		world.setBlock(x+2, y+0, z+7, BurlapCraft.blueRock);
		world.setBlock(x+3, y+0, z+7, BurlapCraft.blueRock);
		world.setBlock(x+4, y+0, z+7, BurlapCraft.blueRock);
		world.setBlock(x+5, y+0, z+7, BurlapCraft.greenRock);
		world.setBlock(x+6, y+0, z+7, BurlapCraft.greenRock);
		world.setBlock(x+7, y+0, z+7, BurlapCraft.greenRock);
		world.setBlock(x+8, y+0, z+7, BurlapCraft.greenRock);
		world.setBlock(x+9, y+0, z+7, BurlapCraft.greenRock);
		world.setBlock(x+10, y+0, z+7, BurlapCraft.greenRock);
		world.setBlock(x+0, y+0, z+8, BurlapCraft.blueRock);
		world.setBlock(x+1, y+0, z+8, BurlapCraft.blueRock);
		world.setBlock(x+2, y+0, z+8, BurlapCraft.blueRock);
		world.setBlock(x+3, y+0, z+8, BurlapCraft.blueRock);
		world.setBlock(x+4, y+0, z+8, BurlapCraft.blueRock);
		world.setBlock(x+5, y+0, z+8, BurlapCraft.greenRock);
		world.setBlock(x+6, y+0, z+8, BurlapCraft.greenRock);
		world.setBlock(x+7, y+0, z+8, BurlapCraft.greenRock);
		world.setBlock(x+8, y+0, z+8, BurlapCraft.greenRock);
		world.setBlock(x+9, y+0, z+8, BurlapCraft.greenRock);
		world.setBlock(x+10, y+0, z+8, BurlapCraft.greenRock);
		world.setBlock(x+0, y+0, z+9, BurlapCraft.blueRock);
		world.setBlock(x+1, y+0, z+9, BurlapCraft.blueRock);
		world.setBlock(x+2, y+0, z+9, BurlapCraft.blueRock);
		world.setBlock(x+3, y+0, z+9, BurlapCraft.blueRock);
		world.setBlock(x+4, y+0, z+9, BurlapCraft.blueRock);
		world.setBlock(x+5, y+0, z+9, BurlapCraft.greenRock);
		world.setBlock(x+6, y+0, z+9, BurlapCraft.greenRock);
		world.setBlock(x+7, y+0, z+9, BurlapCraft.greenRock);
		world.setBlock(x+8, y+0, z+9, BurlapCraft.greenRock);
		world.setBlock(x+9, y+0, z+9, BurlapCraft.greenRock);
		world.setBlock(x+10, y+0, z+9, BurlapCraft.greenRock);
		world.setBlock(x+0, y+0, z+10, BurlapCraft.blueRock);
		world.setBlock(x+1, y+0, z+10, BurlapCraft.blueRock);
		world.setBlock(x+2, y+0, z+10, BurlapCraft.blueRock);
		world.setBlock(x+3, y+0, z+10, BurlapCraft.blueRock);
		world.setBlock(x+4, y+0, z+10, BurlapCraft.blueRock);
		world.setBlock(x+5, y+0, z+10, BurlapCraft.greenRock);
		world.setBlock(x+6, y+0, z+10, BurlapCraft.greenRock);
		world.setBlock(x+7, y+0, z+10, BurlapCraft.greenRock);
		world.setBlock(x+8, y+0, z+10, BurlapCraft.greenRock);
		world.setBlock(x+9, y+0, z+10, BurlapCraft.greenRock);
		world.setBlock(x+10, y+0, z+10, BurlapCraft.greenRock);
		world.setBlock(x+0, y+0, z+11, BurlapCraft.blueRock);
		world.setBlock(x+1, y+0, z+11, BurlapCraft.blueRock);
		world.setBlock(x+2, y+0, z+11, BurlapCraft.blueRock);
		world.setBlock(x+3, y+0, z+11, BurlapCraft.blueRock);
		world.setBlock(x+4, y+0, z+11, BurlapCraft.blueRock);
		world.setBlock(x+5, y+0, z+11, BurlapCraft.greenRock);
		world.setBlock(x+6, y+0, z+11, BurlapCraft.greenRock);
		world.setBlock(x+7, y+0, z+11, BurlapCraft.greenRock);
		world.setBlock(x+8, y+0, z+11, BurlapCraft.greenRock);
		world.setBlock(x+9, y+0, z+11, BurlapCraft.greenRock);
		world.setBlock(x+10, y+0, z+11, BurlapCraft.greenRock);
		world.setBlock(x+0, y+1, z+0, BurlapCraft.redRock);
		world.setBlock(x+1, y+1, z+0, BurlapCraft.redRock);
		world.setBlock(x+2, y+1, z+0, BurlapCraft.redRock);
		world.setBlock(x+3, y+1, z+0, BurlapCraft.redRock);
		world.setBlock(x+4, y+1, z+0, BurlapCraft.redRock);
		world.setBlock(x+5, y+1, z+0, BurlapCraft.redRock);
		world.setBlock(x+6, y+1, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+1, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+1, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+1, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+1, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+1, z+1, BurlapCraft.redRock);
		world.setBlock(x+1, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+1, BurlapCraft.redRock);
		world.setBlock(x+6, y+1, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+1, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+1, z+2, BurlapCraft.redRock);
		world.setBlock(x+1, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+2, BurlapCraft.redRock);
		world.setBlock(x+6, y+1, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+2, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+1, z+3, BurlapCraft.redRock);
		world.setBlock(x+1, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+3, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+1, z+4, BurlapCraft.redRock);
		world.setBlock(x+1, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+4, BurlapCraft.redRock);
		world.setBlock(x+6, y+1, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+1, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+1, z+4, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+1, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+1, z+5, BurlapCraft.redRock);
		world.setBlock(x+1, y+1, z+5, BurlapCraft.redRock);
		world.setBlock(x+2, y+1, z+5, BurlapCraft.redRock);
		world.setBlock(x+3, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+5, BurlapCraft.redRock);
		world.setBlock(x+5, y+1, z+5, BurlapCraft.redRock);
		world.setBlock(x+6, y+1, z+5, BurlapCraft.greenRock);
		world.setBlock(x+7, y+1, z+5, BurlapCraft.greenRock);
		world.setBlock(x+8, y+1, z+5, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+5, BurlapCraft.greenRock);
		world.setBlock(x+10, y+1, z+5, BurlapCraft.greenRock);
		world.setBlock(x+0, y+1, z+6, BurlapCraft.blueRock);
		world.setBlock(x+1, y+1, z+6, BurlapCraft.blueRock);
		world.setBlock(x+2, y+1, z+6, BurlapCraft.blueRock);
		world.setBlock(x+3, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+6, BurlapCraft.blueRock);
		world.setBlock(x+5, y+1, z+6, BurlapCraft.greenRock);
		world.setBlock(x+6, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+6, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+6, BurlapCraft.greenRock);
		world.setBlock(x+0, y+1, z+7, BurlapCraft.blueRock);
		world.setBlock(x+1, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+7, BurlapCraft.blueRock);
		world.setBlock(x+5, y+1, z+7, BurlapCraft.greenRock);
		world.setBlock(x+6, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+7, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+7, BurlapCraft.greenRock);
		world.setBlock(x+0, y+1, z+8, BurlapCraft.blueRock);
		world.setBlock(x+1, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+5, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+6, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+8, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+8, BurlapCraft.greenRock);
		world.setBlock(x+0, y+1, z+9, BurlapCraft.blueRock);
		world.setBlock(x+1, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+9, BurlapCraft.blueRock);
		world.setBlock(x+5, y+1, z+9, BurlapCraft.greenRock);
		world.setBlock(x+6, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+9, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+9, BurlapCraft.greenRock);
		world.setBlock(x+0, y+1, z+10, BurlapCraft.blueRock);
		world.setBlock(x+1, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+2, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+3, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+4, y+1, z+10, BurlapCraft.blueRock);
		world.setBlock(x+5, y+1, z+10, BurlapCraft.greenRock);
		world.setBlock(x+6, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+7, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+8, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+9, y+1, z+10, Block.getBlockById(0));
		world.setBlock(x+10, y+1, z+10, BurlapCraft.greenRock);
		world.setBlock(x+0, y+1, z+11, BurlapCraft.blueRock);
		world.setBlock(x+1, y+1, z+11, BurlapCraft.blueRock);
		world.setBlock(x+2, y+1, z+11, BurlapCraft.blueRock);
		world.setBlock(x+3, y+1, z+11, BurlapCraft.blueRock);
		world.setBlock(x+4, y+1, z+11, BurlapCraft.blueRock);
		world.setBlock(x+5, y+1, z+11, BurlapCraft.greenRock);
		world.setBlock(x+6, y+1, z+11, BurlapCraft.greenRock);
		world.setBlock(x+7, y+1, z+11, BurlapCraft.greenRock);
		world.setBlock(x+8, y+1, z+11, BurlapCraft.greenRock);
		world.setBlock(x+9, y+1, z+11, BurlapCraft.greenRock);
		world.setBlock(x+10, y+1, z+11, BurlapCraft.greenRock);
		world.setBlock(x+0, y+2, z+0, BurlapCraft.redRock);
		world.setBlock(x+1, y+2, z+0, BurlapCraft.redRock);
		world.setBlock(x+2, y+2, z+0, BurlapCraft.redRock);
		world.setBlock(x+3, y+2, z+0, BurlapCraft.redRock);
		world.setBlock(x+4, y+2, z+0, BurlapCraft.redRock);
		world.setBlock(x+5, y+2, z+0, BurlapCraft.redRock);
		world.setBlock(x+6, y+2, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+2, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+2, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+2, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+2, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+2, z+1, BurlapCraft.redRock);
		world.setBlock(x+1, y+2, z+1, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+1, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+1, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+1, Block.getBlockById(0));
		world.setBlock(x+5, y+2, z+1, BurlapCraft.redRock);
		world.setBlock(x+6, y+2, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+2, z+1, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+1, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+1, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+2, z+2, BurlapCraft.redRock);
		world.setBlock(x+1, y+2, z+2, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+2, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+2, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+2, Block.getBlockById(0));
		world.setBlock(x+5, y+2, z+2, BurlapCraft.redRock);
		world.setBlock(x+6, y+2, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+2, z+2, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+2, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+2, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+2, z+3, BurlapCraft.redRock);
		world.setBlock(x+1, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+5, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+6, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+7, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+3, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+2, z+4, BurlapCraft.redRock);
		world.setBlock(x+1, y+2, z+4, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+4, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+4, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+4, Block.getBlockById(0));
		world.setBlock(x+5, y+2, z+4, BurlapCraft.redRock);
		world.setBlock(x+6, y+2, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+2, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+2, z+4, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+2, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+2, z+5, BurlapCraft.redRock);
		world.setBlock(x+1, y+2, z+5, BurlapCraft.redRock);
		world.setBlock(x+2, y+2, z+5, BurlapCraft.redRock);
		world.setBlock(x+3, y+2, z+5, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+5, BurlapCraft.redRock);
		world.setBlock(x+5, y+2, z+5, BurlapCraft.redRock);
		world.setBlock(x+6, y+2, z+5, BurlapCraft.greenRock);
		world.setBlock(x+7, y+2, z+5, BurlapCraft.greenRock);
		world.setBlock(x+8, y+2, z+5, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+5, BurlapCraft.greenRock);
		world.setBlock(x+10, y+2, z+5, BurlapCraft.greenRock);
		world.setBlock(x+0, y+2, z+6, BurlapCraft.blueRock);
		world.setBlock(x+1, y+2, z+6, BurlapCraft.blueRock);
		world.setBlock(x+2, y+2, z+6, BurlapCraft.blueRock);
		world.setBlock(x+3, y+2, z+6, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+6, BurlapCraft.blueRock);
		world.setBlock(x+5, y+2, z+6, BurlapCraft.greenRock);
		world.setBlock(x+6, y+2, z+6, Block.getBlockById(0));
		world.setBlock(x+7, y+2, z+6, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+6, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+6, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+6, BurlapCraft.greenRock);
		world.setBlock(x+0, y+2, z+7, BurlapCraft.blueRock);
		world.setBlock(x+1, y+2, z+7, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+7, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+7, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+7, BurlapCraft.blueRock);
		world.setBlock(x+5, y+2, z+7, BurlapCraft.greenRock);
		world.setBlock(x+6, y+2, z+7, Block.getBlockById(0));
		world.setBlock(x+7, y+2, z+7, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+7, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+7, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+7, BurlapCraft.greenRock);
		world.setBlock(x+0, y+2, z+8, BurlapCraft.blueRock);
		world.setBlock(x+1, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+5, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+6, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+7, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+8, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+8, BurlapCraft.greenRock);
		world.setBlock(x+0, y+2, z+9, BurlapCraft.blueRock);
		world.setBlock(x+1, y+2, z+9, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+9, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+9, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+9, BurlapCraft.blueRock);
		world.setBlock(x+5, y+2, z+9, BurlapCraft.greenRock);
		world.setBlock(x+6, y+2, z+9, Block.getBlockById(0));
		world.setBlock(x+7, y+2, z+9, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+9, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+9, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+9, BurlapCraft.greenRock);
		world.setBlock(x+0, y+2, z+10, BurlapCraft.blueRock);
		world.setBlock(x+1, y+2, z+10, Block.getBlockById(0));
		world.setBlock(x+2, y+2, z+10, Block.getBlockById(0));
		world.setBlock(x+3, y+2, z+10, Block.getBlockById(0));
		world.setBlock(x+4, y+2, z+10, BurlapCraft.blueRock);
		world.setBlock(x+5, y+2, z+10, BurlapCraft.greenRock);
		world.setBlock(x+6, y+2, z+10, Block.getBlockById(0));
		world.setBlock(x+7, y+2, z+10, Block.getBlockById(0));
		world.setBlock(x+8, y+2, z+10, Block.getBlockById(0));
		world.setBlock(x+9, y+2, z+10, Block.getBlockById(0));
		world.setBlock(x+10, y+2, z+10, BurlapCraft.greenRock);
		world.setBlock(x+0, y+2, z+11, BurlapCraft.blueRock);
		world.setBlock(x+1, y+2, z+11, BurlapCraft.blueRock);
		world.setBlock(x+2, y+2, z+11, BurlapCraft.blueRock);
		world.setBlock(x+3, y+2, z+11, BurlapCraft.blueRock);
		world.setBlock(x+4, y+2, z+11, BurlapCraft.blueRock);
		world.setBlock(x+5, y+2, z+11, BurlapCraft.greenRock);
		world.setBlock(x+6, y+2, z+11, BurlapCraft.greenRock);
		world.setBlock(x+7, y+2, z+11, BurlapCraft.greenRock);
		world.setBlock(x+8, y+2, z+11, BurlapCraft.greenRock);
		world.setBlock(x+9, y+2, z+11, BurlapCraft.greenRock);
		world.setBlock(x+10, y+2, z+11, BurlapCraft.greenRock);
		world.setBlock(x+0, y+3, z+0, BurlapCraft.redRock);
		world.setBlock(x+1, y+3, z+0, BurlapCraft.redRock);
		world.setBlock(x+2, y+3, z+0, BurlapCraft.redRock);
		world.setBlock(x+3, y+3, z+0, BurlapCraft.redRock);
		world.setBlock(x+4, y+3, z+0, BurlapCraft.redRock);
		world.setBlock(x+5, y+3, z+0, BurlapCraft.redRock);
		world.setBlock(x+6, y+3, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+3, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+3, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+9, y+3, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+3, z+0, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+3, z+1, BurlapCraft.redRock);
		world.setBlock(x+1, y+3, z+1, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+1, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+1, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+1, Block.getBlockById(0));
		world.setBlock(x+5, y+3, z+1, BurlapCraft.redRock);
		world.setBlock(x+6, y+3, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+3, z+1, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+1, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+1, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+1, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+3, z+2, BurlapCraft.redRock);
		world.setBlock(x+1, y+3, z+2, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+2, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+2, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+2, Block.getBlockById(0));
		world.setBlock(x+5, y+3, z+2, BurlapCraft.redRock);
		world.setBlock(x+6, y+3, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+3, z+2, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+2, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+2, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+2, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+3, z+3, BurlapCraft.redRock);
		world.setBlock(x+1, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+5, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+6, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+7, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+3, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+3, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+3, z+4, BurlapCraft.redRock);
		world.setBlock(x+1, y+3, z+4, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+4, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+4, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+4, Block.getBlockById(0));
		world.setBlock(x+5, y+3, z+4, BurlapCraft.redRock);
		world.setBlock(x+6, y+3, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+7, y+3, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+8, y+3, z+4, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+10, y+3, z+4, BurlapCraft.orangeRock);
		world.setBlock(x+0, y+3, z+5, BurlapCraft.redRock);
		world.setBlock(x+1, y+3, z+5, BurlapCraft.redRock);
		world.setBlock(x+2, y+3, z+5, BurlapCraft.redRock);
		world.setBlock(x+3, y+3, z+5, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+5, BurlapCraft.redRock);
		world.setBlock(x+5, y+3, z+5, BurlapCraft.redRock);
		world.setBlock(x+6, y+3, z+5, BurlapCraft.greenRock);
		world.setBlock(x+7, y+3, z+5, BurlapCraft.greenRock);
		world.setBlock(x+8, y+3, z+5, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+5, BurlapCraft.greenRock);
		world.setBlock(x+10, y+3, z+5, BurlapCraft.greenRock);
		world.setBlock(x+0, y+3, z+6, BurlapCraft.blueRock);
		world.setBlock(x+1, y+3, z+6, BurlapCraft.blueRock);
		world.setBlock(x+2, y+3, z+6, BurlapCraft.blueRock);
		world.setBlock(x+3, y+3, z+6, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+6, BurlapCraft.blueRock);
		world.setBlock(x+5, y+3, z+6, BurlapCraft.greenRock);
		world.setBlock(x+6, y+3, z+6, Block.getBlockById(0));
		world.setBlock(x+7, y+3, z+6, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+6, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+6, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+6, BurlapCraft.greenRock);
		world.setBlock(x+0, y+3, z+7, BurlapCraft.blueRock);
		world.setBlock(x+1, y+3, z+7, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+7, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+7, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+7, BurlapCraft.blueRock);
		world.setBlock(x+5, y+3, z+7, BurlapCraft.greenRock);
		world.setBlock(x+6, y+3, z+7, Block.getBlockById(0));
		world.setBlock(x+7, y+3, z+7, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+7, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+7, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+7, BurlapCraft.greenRock);
		world.setBlock(x+0, y+3, z+8, BurlapCraft.blueRock);
		world.setBlock(x+1, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+5, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+6, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+7, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+8, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+8, BurlapCraft.greenRock);
		world.setBlock(x+0, y+3, z+9, BurlapCraft.blueRock);
		world.setBlock(x+1, y+3, z+9, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+9, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+9, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+9, BurlapCraft.blueRock);
		world.setBlock(x+5, y+3, z+9, BurlapCraft.greenRock);
		world.setBlock(x+6, y+3, z+9, Block.getBlockById(0));
		world.setBlock(x+7, y+3, z+9, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+9, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+9, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+9, BurlapCraft.greenRock);
		world.setBlock(x+0, y+3, z+10, BurlapCraft.blueRock);
		world.setBlock(x+1, y+3, z+10, Block.getBlockById(0));
		world.setBlock(x+2, y+3, z+10, Block.getBlockById(0));
		world.setBlock(x+3, y+3, z+10, Block.getBlockById(0));
		world.setBlock(x+4, y+3, z+10, BurlapCraft.blueRock);
		world.setBlock(x+5, y+3, z+10, BurlapCraft.greenRock);
		world.setBlock(x+6, y+3, z+10, Block.getBlockById(0));
		world.setBlock(x+7, y+3, z+10, Block.getBlockById(0));
		world.setBlock(x+8, y+3, z+10, Block.getBlockById(0));
		world.setBlock(x+9, y+3, z+10, Block.getBlockById(0));
		world.setBlock(x+10, y+3, z+10, BurlapCraft.greenRock);
		world.setBlock(x+0, y+3, z+11, BurlapCraft.blueRock);
		world.setBlock(x+1, y+3, z+11, BurlapCraft.blueRock);
		world.setBlock(x+2, y+3, z+11, BurlapCraft.blueRock);
		world.setBlock(x+3, y+3, z+11, BurlapCraft.blueRock);
		world.setBlock(x+4, y+3, z+11, BurlapCraft.blueRock);
		world.setBlock(x+5, y+3, z+11, BurlapCraft.greenRock);
		world.setBlock(x+6, y+3, z+11, BurlapCraft.greenRock);
		world.setBlock(x+7, y+3, z+11, BurlapCraft.greenRock);
		world.setBlock(x+8, y+3, z+11, BurlapCraft.greenRock);
		world.setBlock(x+9, y+3, z+11, BurlapCraft.greenRock);
		world.setBlock(x+10, y+3, z+11, BurlapCraft.greenRock);

	}

}
