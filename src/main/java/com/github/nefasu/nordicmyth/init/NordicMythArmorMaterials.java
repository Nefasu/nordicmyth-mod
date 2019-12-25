package com.github.nefasu.nordicmyth.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum NordicMythArmorMaterials implements IArmorMaterial {
	// See constructor for value mapping
	SVARTIN("nordicmyth:svartin", 400, new int[] {4, 9, 7, 4}, 25, 
			NordicMythItems.svartin_ingot, "item.armor.equip_chainmail", 2.1f), // Svartalfheim
	JOTUNITE("nordicmyth:jotunite", 600, new int[] {6, 13, 10, 6}, 28, 
			NordicMythItems.jotunite_ingot, "item.armor.equip_chainmail", 2.2f), // Jötunheim
	VOLCANIUM("nordicmyth:volcanium", 900, new int[] {9, 20, 16, 9}, 32, 
			NordicMythItems.volcanium_ingot, "item.armor.equip_gold", 2.4f), // Muspelheim
	FROSTBORNE("nordicmyth:frostborne", 1200, new int[] {12, 27, 21, 34}, 35, 
			NordicMythItems.frostborne_ingot, "item.armor.equip_gold", 2.5f), // Niflheim
	RADIANCE("nordicmyth:radiance", 1500, new int[] {15, 34, 26, 15}, 38, 
			NordicMythItems.radiance_ingot, "item.armor.equip_iron", 2.6f), // Ljossalfheim 
	PURGATORIUM("nordicmyth:purgatorium", 1800, new int[] {18, 40, 31, 18}, 42, 
			NordicMythItems.purgatorium_ingot, "item.armor.equip_iron", 2.7f), // Helheim
	SEIDR("nordicmyth:seidr", 2500, new int[] {25, 50, 40, 25}, 50, 
			NordicMythItems.seidr_ingot, "item.armor.equip_leather", 3.0f), // Vanaheim
	GODSTEEL("nordicmyth:godsteel", 10000, new int[] {50, 100, 80, 50}, 100, 
			NordicMythItems.godsteel_ingot, "item.armor.equip_diamond", 4.0f); // Asgard
	
	private static final int[] MAXDAMAGEARRAY = new int[]{13, 15, 16, 11};
	
	private String name;
	private int durability;
	private int[] damageReductionAmounts;
	private int enchantability;
	private String equipSound;
	private Item repairMaterial;
	private float toughness;
	
	private NordicMythArmorMaterials(String name, int durability, int[] damageReductionAmounts, int enchantability, 
			Item repairMaterial, String equipSound, float toughness) {
		this.name = name;
		this.durability = durability;
		this.damageReductionAmounts = damageReductionAmounts;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
		this.equipSound = equipSound;
		this.toughness = toughness;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAXDAMAGEARRAY[slotIn.getIndex()] * this.durability;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmounts[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}

	@Override
	public SoundEvent getSoundEvent() {
		return new SoundEvent(new ResourceLocation(equipSound));
	}
	
	@Override
	public float getToughness() {
		return this.toughness;
	}

}
