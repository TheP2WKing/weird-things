package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityVillagerPig extends EntityPig {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(WeirdThings.MODID, "entities/villager_pig");
	public static final int EXPERIENCE_VALUE = 0;

	public EntityVillagerPig(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 0.9F);
		this.experienceValue = EXPERIENCE_VALUE;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_VILLAGER_AMBIENT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_VILLAGER_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_VILLAGER_DEATH;
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
	public EntityVillagerPig createChild(EntityAgeable ageable) {
		return new EntityVillagerPig(this.world);
	}

	@Override
	public float getEyeHeight() {
		float f = 0.7F;
		if (this.isChild()) {
			f = (float) ((double) f - 0.3D);
		}
		return f;
	}
}