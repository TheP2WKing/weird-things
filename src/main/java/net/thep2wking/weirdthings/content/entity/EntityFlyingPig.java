package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityFlyingPig extends EntityBat {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(WeirdThings.MODID, "entities/flying_pig");
	public static final int EXPERIENCE_VALUE = 0;

	public EntityFlyingPig(World worldIn) {
		super(worldIn);
		this.setSize(0.5F, 0.9F);
		this.experienceValue = EXPERIENCE_VALUE;
		this.setIsBatHanging(true);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8);
	}

	@Override
	public void entityInit() {
		super.entityInit();
	}

	@Override
	public SoundEvent getAmbientSound() {
		return this.getIsBatHanging() && this.rand.nextInt(4) != 0 ? null : SoundEvents.ENTITY_PIG_AMBIENT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_PIG_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_PIG_DEATH;
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	public float getSoundVolume() {
		return 0.25F;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return LOOT_TABLE;
	}
}