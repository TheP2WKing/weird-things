package net.thep2wking.weirdthings.content.entity;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityDirtGolem extends EntityIronGolem {
	public EntityDirtGolem(World worldIn) {
		super(worldIn);
        this.setSize(1.4F, 2.7F);
	}
	
	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_IRONGOLEM_HURT;
	}


	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_IRONGOLEM_DEATH;
	}

	@Override
	public void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(SoundEvents.ENTITY_IRONGOLEM_STEP, 1F, 1.1F);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/dirt_golem");
	}
}