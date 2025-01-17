package com.hbm.world.feature;

import com.hbm.blocks.ModBlocks;
import com.hbm.dim.SolarSystem;

import net.minecraft.world.World;

public class OilBubbleDuna {

	public static void spawnOil(World world, int x, int y, int z, int radius) {
		int r = radius;
		int r2 = r * r;
		int r22 = r2 / 2;

		for (int xx = -r; xx < r; xx++) {
			int X = xx + x;
			int XX = xx * xx;
			for (int yy = -r; yy < r; yy++) {
				int Y = yy + y;
				int YY = XX + yy * yy * 3;
				for (int zz = -r; zz < r; zz++) {
					int Z = zz + z;
					int ZZ = YY + zz * zz;
					if (ZZ < r22) {
						if(world.getBlock(X, Y, Z) == ModBlocks.duna_rock)
							world.setBlock(X, Y, Z, ModBlocks.ore_oil, SolarSystem.Body.DUNA.ordinal(), 2);
					}
				}
			}
		}
	}
	
}
