package com.github.nefasu.nordicmyth.world;

import com.github.nefasu.nordicmyth.config.OreGenerationConfiguration;
import com.github.nefasu.nordicmyth.init.NordicMythBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	final static CountRangeConfig SVARTIN_ORE_PLACEMENT = new CountRangeConfig(
			OreGenerationConfiguration.svartin_occurence.get(), 
			OreGenerationConfiguration.svartin_bottom_offset.get(), 
			OreGenerationConfiguration.svartin_top_offset.get(), 
			OreGenerationConfiguration.svartin_max_height.get());
	
	public static void SetupOreGeneration() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, 
					new OreFeatureConfig(FillerBlockType.NATURAL_STONE, NordicMythBlocks.svartin_ore.getDefaultState(),
							OreGenerationConfiguration.svartin_vein_size.get()), 
					Placement.COUNT_RANGE, SVARTIN_ORE_PLACEMENT)); // Svartin Ore Midgard
		}

		Biomes.NETHER.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, 
				new OreFeatureConfig(FillerBlockType.NETHERRACK, NordicMythBlocks.svartin_ore.getDefaultState(),
						OreGenerationConfiguration.svartin_vein_size.get()), 
				Placement.COUNT_RANGE, SVARTIN_ORE_PLACEMENT)); // Svartin Ore Svartalfheim
	}	
}