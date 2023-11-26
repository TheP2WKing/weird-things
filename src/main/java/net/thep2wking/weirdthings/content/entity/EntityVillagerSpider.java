package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityVillagerSpider extends EntitySpider {
	public EntityVillagerSpider(World worldIn) {
		super(worldIn);
		this.setSize(1.4F, 0.9F);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16);
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
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/villager_spider");
	}

	@Override
	public float getEyeHeight() {
		return this.height;
	}
}