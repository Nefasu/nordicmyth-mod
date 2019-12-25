package com.github.nefasu.nordicmyth.entities;

import com.github.nefasu.nordicmyth.init.NordicMythEntities;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.world.World;

public class Svartalf extends CreatureEntity {

	@SuppressWarnings("unchecked")
	protected Svartalf(EntityType<? extends CreatureEntity> type, World worldIn) {
		super((EntityType<? extends CreatureEntity>)NordicMythEntities.svartalf, worldIn);
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new WaterAvoidingRandomWalkingGoal(this, 2.0d));
		this.goalSelector.addGoal(2, new FleeSunGoal(this, 2.5d));
		this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 1.0d));
		this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
	}
	
	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1000.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.2d);
	}
	
	@Override
	public boolean canBeCollidedWith() {
		return true;
	}
}