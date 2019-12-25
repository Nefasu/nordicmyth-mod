package com.github.nefasu.nordicmyth.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum NordicMythToolMaterials implements IItemTier {
	// See constructor for value mapping
	SVARTIN(9.0f, 12.0f, 1024, 4, 22, NordicMythItems.svartin_ingot), // Svartalfheim
	JOTUNITE(11.0f, 15.0f, 1280, 5, 27, NordicMythItems.jotunite_ingot), // Jötunheim
	VOLCANIUM(15.0f, 18.0f, 1536, 6, 33, NordicMythItems.volcanium_ingot), // Muspelheim
	FROSTBORNE(18.0f, 21.0f, 1792, 7, 38, NordicMythItems.frostborne_ingot), // Niflheim
	RADIANCE(22.0f, 24.0f, 2048, 8, 44, NordicMythItems.radiance_ingot), // Ljossalfheim 
	PURGATORIUM(26.0f, 27.0f, 2304, 9, 49, NordicMythItems.purgatorium_ingot), // Helheim
	SEIDR(35f, 35.0f, 3584, 10, 60, NordicMythItems.seidr_ingot), // Vanaheim
	GODSTEEL(100.0f, 50.0f, 10000, 11, 100, NordicMythItems.godsteel_ingot); // Asgard

	private float attackDamage;
	private float efficiency;
	private int maxUses;
	private int harvestLevel;
	private int enchantability;
	private Item repairMaterial;
	
	private NordicMythToolMaterials(float attackDamage, float efficiency, int maxUses, int harvestLevel, int enchantability, Item repairMaterial) {
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.maxUses = maxUses;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}
	
	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}
}
