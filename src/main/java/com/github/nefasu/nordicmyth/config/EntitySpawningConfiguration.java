package com.github.nefasu.nordicmyth.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;

public class EntitySpawningConfiguration {
	public static ForgeConfigSpec.IntValue svartalf_spawn_chance;
	
	public static void init(Builder server, Builder client) {
		server.comment("Ore Generation Configuration");
		svartalf_spawn_chance = server
				.comment("Chance in percentage at which a svartalf spawns in Midgard (Overworld).")
				.comment("E.g. Witches spawn at 5% chance.")
				.defineInRange("entityspawning.svartalf_spawn_chance", 100, 1, 100);
	}
}
