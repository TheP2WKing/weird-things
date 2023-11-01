package net.thep2wking.weirdthings.content.entity;

import java.util.UUID;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityHotdog extends EntityWolf {
	public EntityHotdog(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 0.85F);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_WOLF_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_WOLF_DEATH;
	}

	@Override
	public void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 1.0F);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/hotdog");
	}

	@Override
	public EntityHotdog createChild(EntityAgeable ageable) {
		EntityHotdog entitywolf = new EntityHotdog(this.world);
		UUID uuid = this.getOwnerId();
		if (uuid != null) {
			entitywolf.setOwnerId(uuid);
			entitywolf.setTamed(true);
		}
		return entitywolf;
	}

	@Override
	public float getEyeHeight() {
		return this.height * 0.9F;
	}
}