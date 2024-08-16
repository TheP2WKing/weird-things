package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityPigVillager extends EntityVillager {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(WeirdThings.MODID, "entities/pig_villager");
	public static final int EXPERIENCE_VALUE = 0;

	public EntityPigVillager(World worldIn) {
		super(worldIn);
		this.setSize(0.7F, 1.9F);
		this.experienceValue = EXPERIENCE_VALUE;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return this.isTrading() ? SoundEvents.ENTITY_VILLAGER_TRADING : SoundEvents.ENTITY_PIG_AMBIENT;
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

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return LOOT_TABLE;
	}

	@Override
	public float getEyeHeight() {
		return this.isChild() ? 0.86F : 1.67F;
	}

	@Override
	public EntityPigVillager createChild(EntityAgeable ageable) {
		return new EntityPigVillager(this.world);
	}

	@Override
	public void onDeathUpdate() {
		if (this.deathTime == 20) {
			this.setDead();
		} else {
			++this.deathTime;
		}
	}
}