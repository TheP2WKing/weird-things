package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityVillagerBlaze extends EntityBlaze {
	public EntityVillagerBlaze(World worldIn) {
		super(worldIn);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
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
		return new ResourceLocation(WeirdThings.MODID, "entities/villager_blaze");
	}

	@Override
	public float getEyeHeight() {
		return 1.38F;
	}

	@Override
	public void onLivingUpdate() {
		if (!this.onGround && this.motionY < 0.0D) {
			this.motionY *= 0.6D;
		}
		if (this.world.isRemote) {
			if (this.rand.nextInt(24) == 0 && !this.isSilent()) {
				this.world.playSound(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D,
						SoundEvents.ENTITY_VILLAGER_NO, this.getSoundCategory(), 1.0F + this.rand.nextFloat(),
						this.rand.nextFloat() * 0.7F + 0.3F, false);
			}
			for (int i = 0; i < 2; ++i) {
				this.world.spawnParticle(EnumParticleTypes.VILLAGER_ANGRY,
						this.posX + (this.rand.nextDouble() - 0.5D) * (double) this.width,
						this.posY + this.rand.nextDouble() * (double) this.height,
						this.posZ + (this.rand.nextDouble() - 0.5D) * (double) this.width, 0.0D, 0.0D, 0.0D);
			}
		}
		super.onLivingUpdate();
	}
}