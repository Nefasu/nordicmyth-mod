package com.github.nefasu.nordicmyth.init;

import com.github.nefasu.nordicmyth.NordicMyth;
import com.github.nefasu.nordicmyth.NordicMythRegistries;
import com.github.nefasu.nordicmyth.config.EntitySpawningConfiguration;
import com.github.nefasu.nordicmyth.entities.SvartalfEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class NordicMythEntities {
	public static EntityType<?> svartalf_entity = EntityType.Builder
			.create(SvartalfEntity::new, EntityClassification.CREATURE).build(NordicMyth.MODID + ":svartalf_entity")
			.setRegistryName(NordicMythRegistries.location("svartalf_entity"));
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			NordicMythItems.svartalf_entity_egg = 
				RegisterEntitySpawnEgg(svartalf_entity, 0x261a0d, 0x000000, "svartalf_entity_egg")
		);
		
	}
	
	public static void registerEntityWorldSpawns() {
		registerEntityWorldSpawn(svartalf_entity, EntitySpawningConfiguration.svartalf_spawn_chance_midgard.get(), 1, 1,
				Biomes.BADLANDS, Biomes.BADLANDS_PLATEAU, Biomes.DARK_FOREST, Biomes.DARK_FOREST_HILLS, Biomes.DESERT, 
				Biomes.DESERT_HILLS, Biomes.END_BARRENS, Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS, 
				Biomes.ERODED_BADLANDS, Biomes.FOREST, Biomes.GIANT_SPRUCE_TAIGA, Biomes.GIANT_SPRUCE_TAIGA_HILLS, 
				Biomes.GIANT_TREE_TAIGA, Biomes.GIANT_TREE_TAIGA_HILLS, Biomes.GRAVELLY_MOUNTAINS, Biomes.MOUNTAINS, 
				Biomes.NETHER, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.SHATTERED_SAVANNA, 
				Biomes.SHATTERED_SAVANNA_PLATEAU,Biomes.SMALL_END_ISLANDS, Biomes.STONE_SHORE, Biomes.SWAMP_HILLS, 
				Biomes.TAIGA_HILLS, Biomes.TAIGA_MOUNTAINS, Biomes.THE_END, Biomes.WOODED_BADLANDS_PLATEAU, 
				Biomes.WOODED_HILLS,Biomes.WOODED_MOUNTAINS);
	}

	public static void registerEntityWorldSpawn(EntityType<?> entity, int spawnChance, int minSpawnCount, 
			int maxSpawnCount, Biome... biomes) {
		for(Biome biome : biomes) {
			biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, spawnChance
					, minSpawnCount, maxSpawnCount));
		}
	}
	
	public static Item RegisterEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) {
		SpawnEggItem item =  new SpawnEggItem(type, color1, color2, new Item.Properties()
				.group(NordicMyth.NORDICITEMGROUP));
		item.setRegistryName(NordicMythRegistries.location(name));
		
		return item;
	}
}