package com.github.nefasu.nordicmyth;

import com.github.nefasu.nordicmyth.init.NordicMythItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class NordicMythItemGroup extends ItemGroup{

	public NordicMythItemGroup() {
		super("nordicmythitemgroup");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(NordicMythItems.asgard_floor_block);
	}
	
}
