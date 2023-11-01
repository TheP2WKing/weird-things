package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityContinuouslyTurningPig extends EntityPig {
	public EntityContinuouslyTurningPig(World worldIn) {
		super(worldIn);
        this.setSize(0.9F, 1.2F);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_PIG_AMBIENT;
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
	public void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15F, 1.0F);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/continuously_turning_pig");
	}

	@Override
	public EntityContinuouslyTurningPig createChild(EntityAgeable ageable) {
		return new EntityContinuouslyTurningPig(this.world);
	}

	@Override
	public float getEyeHeight() {
		float f = 0.8F;
		if (this.isChild()) {
			f = (float) ((double) f - 0.31D);
		}
		return f;
	}
}