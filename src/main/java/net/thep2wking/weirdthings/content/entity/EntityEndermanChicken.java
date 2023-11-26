package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityEndermanChicken extends EntityEnderman {
	public EntityEndermanChicken(World worldIn) {
		super(worldIn);
        this.setSize(0.6F, 2.9F);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_ENDERMEN_AMBIENT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_ENDERMEN_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_ENDERMEN_DEATH;
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/enderman_chicken");
	}
}