package com.github.nefasu.nordicmyth;

import com.github.nefasu.nordicmyth.init.NordicMythArmorMaterials;
import com.github.nefasu.nordicmyth.init.NordicMythBlocks;
import com.github.nefasu.nordicmyth.init.NordicMythEntities;
import com.github.nefasu.nordicmyth.init.NordicMythItems;
import com.github.nefasu.nordicmyth.init.NordicMythToolMaterials;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class NordicMythRegistries {
	@SubscribeEvent
	public static void  registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			// SVARTALFHEIM
			// Svartalfheim Blocks
			NordicMythItems.svartin_ore = new BlockItem(NordicMythBlocks.svartin_ore, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(NordicMythBlocks.svartin_ore.getRegistryName()),
			// Svartin Items
			NordicMythItems.svartin_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
				.setRegistryName(location("svartin_ingot")),
			// Svartin Tools
			NordicMythItems.svartin_sword = new SwordItem(NordicMythToolMaterials.SVARTIN, 0, -2.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_sword")),
			NordicMythItems.svartin_axe = new AxeItem(NordicMythToolMaterials.SVARTIN, -1.5f, -2.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_axe")),
			NordicMythItems.svartin_pickaxe = new PickaxeItem(NordicMythToolMaterials.SVARTIN, -2, -2.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_pickaxe")),
			NordicMythItems.svartin_shovel = new ShovelItem(NordicMythToolMaterials.SVARTIN, -3, -2.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_shovel")),
			NordicMythItems.svartin_hoe = new HoeItem(NordicMythToolMaterials.SVARTIN, -2.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("svartin_hoe")),
			// Svartin Armor
			NordicMythItems.svartin_helmet = new ArmorItem(NordicMythArmorMaterials.SVARTIN, EquipmentSlotType.HEAD, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_helmet")),
			NordicMythItems.svartin_chestplate = new ArmorItem(NordicMythArmorMaterials.SVARTIN, 
					EquipmentSlotType.CHEST, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_chestplate")),
			NordicMythItems.svartin_leggings = new ArmorItem(NordicMythArmorMaterials.SVARTIN, EquipmentSlotType.LEGS, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_leggings")),
			NordicMythItems.svartin_boots = new ArmorItem(NordicMythArmorMaterials.SVARTIN, EquipmentSlotType.FEET, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("svartin_boots")),
			
			
			// JOETUNHEIM
			// Jotunite Items
				NordicMythItems.jotunite_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
				.setRegistryName(location("jotunite_ingot")),
			// Jotunite Tools
			NordicMythItems.jotunite_sword = new SwordItem(NordicMythToolMaterials.JOTUNITE, 0, -2.4f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("jotunite_sword")),
			NordicMythItems.jotunite_axe = new AxeItem(NordicMythToolMaterials.JOTUNITE, -1.5f, -2.4f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("jotunite_axe")),
			NordicMythItems.jotunite_pickaxe = new PickaxeItem(NordicMythToolMaterials.JOTUNITE, -2, -2.4f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("jotunite_pickaxe")),
			NordicMythItems.jotunite_shovel = new ShovelItem(NordicMythToolMaterials.JOTUNITE, -3, -2.4f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("jotunite_shovel")),
			NordicMythItems.jotunite_hoe = new HoeItem(NordicMythToolMaterials.JOTUNITE, -2.4f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("jotunite_hoe")),
			// Jotunite Armor
			NordicMythItems.jotunite_helmet = new ArmorItem(NordicMythArmorMaterials.JOTUNITE, EquipmentSlotType.HEAD, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("jotunite_helmet")),
			NordicMythItems.jotunite_chestplate = new ArmorItem(NordicMythArmorMaterials.JOTUNITE, 
					EquipmentSlotType.CHEST, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("jotunite_chestplate")),
			NordicMythItems.jotunite_leggings = new ArmorItem(NordicMythArmorMaterials.JOTUNITE, EquipmentSlotType.LEGS, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("jotunite_leggings")),
			NordicMythItems.jotunite_boots = new ArmorItem(NordicMythArmorMaterials.JOTUNITE, EquipmentSlotType.FEET, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("jotunite_boots")),
			
			
			// MUSPELHEIM
			// Volcanium Items
			NordicMythItems.volcanium_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_ingot")),
			// Volcanium Tools
			NordicMythItems.volcanium_sword = new SwordItem(NordicMythToolMaterials.VOLCANIUM, 0, -2.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_sword")),
			NordicMythItems.volcanium_axe = new AxeItem(NordicMythToolMaterials.VOLCANIUM, -3.5f, -2.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("volcanium_axe")),
			NordicMythItems.volcanium_pickaxe = new PickaxeItem(NordicMythToolMaterials.VOLCANIUM, -5, -2.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_pickaxe")),
			NordicMythItems.volcanium_shovel = new ShovelItem(NordicMythToolMaterials.VOLCANIUM, -6, -2.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_shovel")),
			NordicMythItems.volcanium_hoe = new HoeItem(NordicMythToolMaterials.VOLCANIUM, -2.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("volcanium_hoe")),
			// Volcanium Armor
			NordicMythItems.volcanium_helmet = new ArmorItem(NordicMythArmorMaterials.VOLCANIUM, EquipmentSlotType.HEAD, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_helmet")),
			NordicMythItems.volcanium_chestplate = new ArmorItem(NordicMythArmorMaterials.VOLCANIUM, 
					EquipmentSlotType.CHEST, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_chestplate")),
			NordicMythItems.volcanium_leggings = new ArmorItem(NordicMythArmorMaterials.VOLCANIUM, 
					EquipmentSlotType.LEGS, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_leggings")),
			NordicMythItems.volcanium_boots = new ArmorItem(NordicMythArmorMaterials.VOLCANIUM, EquipmentSlotType.FEET, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("volcanium_boots")),
			
			
			// NIFLHEIM
			// Frostborne Items
			NordicMythItems.frostborne_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_ingot")),
			// Frostborne Tools
			NordicMythItems.frostborne_sword = new SwordItem(NordicMythToolMaterials.FROSTBORNE, 0, -2.0f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_sword")),
			NordicMythItems.frostborne_axe = new AxeItem(NordicMythToolMaterials.FROSTBORNE, -3.5f, -2.0f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_axe")),
			NordicMythItems.frostborne_pickaxe = new PickaxeItem(NordicMythToolMaterials.FROSTBORNE, -5, -2.0f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_pickaxe")),
			NordicMythItems.frostborne_shovel = new ShovelItem(NordicMythToolMaterials.FROSTBORNE, -6, -2.0f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_shovel")),
			NordicMythItems.frostborne_hoe = new HoeItem(NordicMythToolMaterials.FROSTBORNE, -2.0f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_hoe")),
			// Frostborne Armor
			NordicMythItems.frostborne_helmet = new ArmorItem(NordicMythArmorMaterials.FROSTBORNE, 
					EquipmentSlotType.HEAD, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_helmet")),
			NordicMythItems.frostborne_chestplate = new ArmorItem(NordicMythArmorMaterials.FROSTBORNE, 
					EquipmentSlotType.CHEST, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_chestplate")),
			NordicMythItems.frostborne_leggings = new ArmorItem(NordicMythArmorMaterials.FROSTBORNE, 
					EquipmentSlotType.LEGS, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_leggings")),
			NordicMythItems.frostborne_boots = new ArmorItem(NordicMythArmorMaterials.FROSTBORNE, 
					EquipmentSlotType.FEET, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("frostborne_boots")),
			
			
			// LIOSSALFHEIM
			// Radiance Items
			NordicMythItems.radiance_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_ingot")),
			// Radiance Tools
			NordicMythItems.radiance_sword = new SwordItem(NordicMythToolMaterials.RADIANCE, 0, -1.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_sword")),
			NordicMythItems.radiance_axe = new AxeItem(NordicMythToolMaterials.RADIANCE, -3.5f, -1.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("radiance_axe")),
			NordicMythItems.radiance_pickaxe = new PickaxeItem(NordicMythToolMaterials.RADIANCE, -5, -1.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_pickaxe")),
			NordicMythItems.radiance_shovel = new ShovelItem(NordicMythToolMaterials.RADIANCE, -6, -1.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_shovel")),
			NordicMythItems.radiance_hoe = new HoeItem(NordicMythToolMaterials.RADIANCE, -1.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("radiance_hoe")),
			// Radiance Armor
			NordicMythItems.radiance_helmet = new ArmorItem(NordicMythArmorMaterials.RADIANCE, EquipmentSlotType.HEAD, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_helmet")),
			NordicMythItems.radiance_chestplate = new ArmorItem(NordicMythArmorMaterials.RADIANCE, 
					EquipmentSlotType.CHEST, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_chestplate")),
			NordicMythItems.radiance_leggings = new ArmorItem(NordicMythArmorMaterials.RADIANCE, EquipmentSlotType.LEGS, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_leggings")),
			NordicMythItems.radiance_boots = new ArmorItem(NordicMythArmorMaterials.RADIANCE, EquipmentSlotType.FEET, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("radiance_boots")),
			
			// HELHEIM
			// Purgatorium Items
			NordicMythItems.purgatorium_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_ingot")),
			// Purgatorium Tools
			NordicMythItems.purgatorium_sword = new SwordItem(NordicMythToolMaterials.PURGATORIUM, 0, -1.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_sword")),
			NordicMythItems.purgatorium_axe = new AxeItem(NordicMythToolMaterials.PURGATORIUM, -6.5f, -1.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_axe")),
			NordicMythItems.purgatorium_pickaxe = new PickaxeItem(NordicMythToolMaterials.PURGATORIUM, -8, -1.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_pickaxe")),
			NordicMythItems.purgatorium_shovel = new ShovelItem(NordicMythToolMaterials.PURGATORIUM, -10, -1.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_shovel")),
			NordicMythItems.purgatorium_hoe = new HoeItem(NordicMythToolMaterials.PURGATORIUM, -1.2f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_hoe")),
			// Purgatorium Armor
			NordicMythItems.purgatorium_helmet = new ArmorItem(NordicMythArmorMaterials.PURGATORIUM, 
					EquipmentSlotType.HEAD, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_helmet")),
			NordicMythItems.purgatorium_chestplate = new ArmorItem(NordicMythArmorMaterials.PURGATORIUM, 
					EquipmentSlotType.CHEST, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_chestplate")),
			NordicMythItems.purgatorium_leggings = new ArmorItem(NordicMythArmorMaterials.PURGATORIUM, 
					EquipmentSlotType.LEGS, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_leggings")),
			NordicMythItems.purgatorium_boots = new ArmorItem(NordicMythArmorMaterials.PURGATORIUM, 
					EquipmentSlotType.FEET, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("purgatorium_boots")),
					
					
			// VANAHEIM
			// Seidr Items
			NordicMythItems.seidr_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("seidr_ingot")),
			// Seidr Tools
			NordicMythItems.seidr_hoe = new HoeItem(NordicMythToolMaterials.SEIDR, -0.6f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("seidr_hoe")),
			// Seidr Armor
			NordicMythItems.seidr_helmet = new ArmorItem(NordicMythArmorMaterials.SEIDR, EquipmentSlotType.HEAD, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("seidr_helmet")),
			NordicMythItems.seidr_chestplate = new ArmorItem(NordicMythArmorMaterials.SEIDR, EquipmentSlotType.CHEST, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("seidr_chestplate")),
			NordicMythItems.seidr_leggings = new ArmorItem(NordicMythArmorMaterials.SEIDR, EquipmentSlotType.LEGS, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("seidr_leggings")),
			NordicMythItems.seidr_boots = new ArmorItem(NordicMythArmorMaterials.SEIDR, EquipmentSlotType.FEET, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("seidr_boots")),
			
			// ASGARD
			// Asgard Blocks
			NordicMythItems.asgard_floor_block = new BlockItem(NordicMythBlocks.asgard_floor_block, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(NordicMythBlocks.asgard_floor_block.getRegistryName()),
			// Godsteel Items
			NordicMythItems.godsteel_ingot = new Item(new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("godsteel_ingot")),
			// Godsteel Tool declaration
			NordicMythItems.godsteel_axe = new AxeItem(NordicMythToolMaterials.GODSTEEL, -20.5f, -4.5f, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP)).setRegistryName(location("godsteel_axe")),
			// Godsteel Armor
			NordicMythItems.godsteel_helmet = new ArmorItem(NordicMythArmorMaterials.GODSTEEL, EquipmentSlotType.HEAD, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("godsteel_helmet")),
			NordicMythItems.godsteel_chestplate = new ArmorItem(NordicMythArmorMaterials.GODSTEEL, 
					EquipmentSlotType.CHEST, new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("godsteel_chestplate")),
			NordicMythItems.godsteel_leggings = new ArmorItem(NordicMythArmorMaterials.GODSTEEL, EquipmentSlotType.LEGS, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("godsteel_leggings")),
			NordicMythItems.godsteel_boots = new ArmorItem(NordicMythArmorMaterials.GODSTEEL, EquipmentSlotType.FEET, 
					new Item.Properties().group(NordicMyth.NORDICITEMGROUP))
					.setRegistryName(location("godsteel_boots")),

			
			
			// MISCEALLANEOUS
			// Food Items
			NordicMythItems.meatplate = new Item(new Item.Properties().group(ItemGroup.FOOD)
					.group(NordicMyth.NORDICITEMGROUP).food(Foods.RABBIT_STEW)).setRegistryName(location("meatplate"))
		);
		
		NordicMythEntities.registerEntitySpawnEggs(event);
		
		NordicMyth.LOGGER.info("Items registered.");
	}

	@SubscribeEvent
	public static void  registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				// SVARTALFHEIM
				NordicMythBlocks.svartin_ore = new Block(
						Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0f, 2.0f)
						.sound(SoundType.STONE)).setRegistryName(location("svartin_ore")),
				
				// ASGARD
				NordicMythBlocks.asgard_floor_block = new Block(
						Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f)
						.lightValue(15).sound(SoundType.METAL)).setRegistryName(location("asgard_floor_block"))
		);
		
		NordicMyth.LOGGER.info("Blocks registered.");
	}
	
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
	{
		event.getRegistry().registerAll
		(
			NordicMythEntities.svartalf_entity
		);
		
		NordicMythEntities.registerEntityWorldSpawns();
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(NordicMyth.MODID, name);
	}
}
