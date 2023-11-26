package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntitySquidBlaze extends EntityBlaze {
	public EntitySquidBlaze(World worldIn) {
		super(worldIn);
		this.setSize(0.75f, 1.85f);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SQUID_AMBIENT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_SQUID_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SQUID_DEATH;
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/squid_blaze");
	}

	@Override
	public float getEyeHeight() {
		return 1.5F;
	}
}