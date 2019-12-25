package com.github.nefasu.nordicmyth.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;

public class OreGenerationConfiguration {
	public static ForgeConfigSpec.IntValue svartin_occurence;
	public static ForgeConfigSpec.IntValue svartin_vein_size;
	public static ForgeConfigSpec.IntValue svartin_bottom_offset;
	public static ForgeConfigSpec.IntValue svartin_top_offset;
	public static ForgeConfigSpec.IntValue svartin_max_height;
	
	public static void init(Builder server, Builder client) {
		server.comment("Ore Generation Configuration");
		svartin_occurence = server
				.comment("Maximum number of Svartin ore veins, spawning in one Chunk.")
				.defineInRange("oregeneration.svartin_occurence", 2, 1, 1000);
		svartin_vein_size = server
				.comment("Nnumber of Svartin ores in a signle vein.")
				.defineInRange("oregeneration.svartin_vein_size", 10, 1, 100);
		svartin_bottom_offset = server
				.comment("Offset from the bottom of the world, the lowest level the pre can spawn.")
				.comment("E.g. 8 means this ore can only be encountered at Y-Levels of 8 and above (until maxHeight).")
				.defineInRange("oregeneration.svartin_bottom_offset", 0, 0, 256);
		svartin_top_offset = server
				.comment("Offset from the maxumim configured heigth at which the ore can spawn.")
				.comment("Usage of maxHeight should be preferred.")
				.defineInRange("oregeneration.svartin_top_offset", 0, 0, 256);
		svartin_max_height = server
				.comment("Maximum height at which Svartin can be encountered. The ore won't spawn above this Y-Value.")
				.defineInRange("oregeneration.svartin_max_height", 16, 1, 256);
	}
}
