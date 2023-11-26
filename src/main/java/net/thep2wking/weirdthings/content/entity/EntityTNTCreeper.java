package net.thep2wking.weirdthings.content.entity;

import java.util.Collection;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityTNTCreeper extends EntityCreeper {
	public EntityTNTCreeper(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.7F);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_CREEPER_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_CREEPER_DEATH;
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/tnt_creeper");
	}

	public int lastActiveTime;
	private int timeSinceIgnited;
	private int fuseTime = 30;
	private int explosionRadius = 3;

	private void spawnLingeringCloud() {
		Collection<PotionEffect> collection = this.getActivePotionEffects();

		if (!collection.isEmpty()) {
			EntityAreaEffectCloud entityareaeffectcloud = new EntityAreaEffectCloud(this.world, this.posX, this.posY,
					this.posZ);
			entityareaeffectcloud.setRadius(2.5F);
			entityareaeffectcloud.setRadiusOnUse(-0.5F);
			entityareaeffectcloud.setWaitTime(10);
			entityareaeffectcloud.setDuration(entityareaeffectcloud.getDuration() / 2);
			entityareaeffectcloud
					.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float) entityareaeffectcloud.getDuration());

			for (PotionEffect potioneffect : collection) {
				entityareaeffectcloud.addEffect(new PotionEffect(potioneffect));
			}

			this.world.spawnEntity(entityareaeffectcloud);
		}
	}

	private void explodeNew() {
		if (!this.world.isRemote) {
			boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this);
			float f = this.getPowered() ? 6.0F : 3.0F;
			this.dead = true;
			this.world.createExplosion(this, this.posX, this.posY, this.posZ, (float) this.explosionRadius * f, flag);
			this.setDead();
			spawnLingeringCloud();
		}
	}

	@Override
	public void onUpdate() {
		if (this.isEntityAlive()) {
			this.lastActiveTime = this.timeSinceIgnited;
			if (this.hasIgnited()) {
				this.setCreeperState(1);
			}
			int i = this.getCreeperState();
			if (i > 0 && this.timeSinceIgnited == 0) {
				this.playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 1.0F, 0.5F);
			}
			this.timeSinceIgnited += i;
			if (this.timeSinceIgnited < 0) {
				this.timeSinceIgnited = 0;
			}
			if (this.timeSinceIgnited >= this.fuseTime) {
				this.timeSinceIgnited = this.fuseTime;
				this.explodeNew();
			}
		}
		super.onUpdate();
	}
}