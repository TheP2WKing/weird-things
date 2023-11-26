package net.thep2wking.weirdthings.content.entity;

import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityCrueatus extends EntityPig {
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.BLAZE_ROD);

	public EntityCrueatus(World worldIn) {
		super(worldIn);
		this.setSize(0.6f, 1.75f);
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12);
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
		this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.BLAZE_ROD, false));
		this.tasks.addTask(4, new EntityAITempt(this, 1.2D, false, TEMPTATION_ITEMS));
		this.tasks.addTask(5, new EntityAIFollowParent(this, 1.1D));
		this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_BLAZE_AMBIENT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_BLAZE_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_BLAZE_DEATH;
	}

	@Override
	public void playStepSound(BlockPos pos, Block blockIn) {
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(WeirdThings.MODID, "entities/crueatus");
	}

	@Override
	public float getEyeHeight() {
		return this.isChild() ? 0.68F : 1.38F;
	}

	@Override
	public EntityCrueatus createChild(EntityAgeable ageable) {
		return new EntityCrueatus(this.world);
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return TEMPTATION_ITEMS.contains(stack.getItem());
	}

	@Override
	public boolean canBeSteered() {
		Entity entity = this.getControllingPassenger();
		if (!(entity instanceof EntityPlayer)) {
			return false;
		} else {
			EntityPlayer entityplayer = (EntityPlayer) entity;
			return entityplayer.getHeldItemMainhand().getItem() == Items.BLAZE_ROD
					|| entityplayer.getHeldItemOffhand().getItem() == Items.BLAZE_ROD;
		}
	}
}