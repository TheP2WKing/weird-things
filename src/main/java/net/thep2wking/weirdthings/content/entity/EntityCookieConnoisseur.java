package net.thep2wking.weirdthings.content.entity;

import java.util.UUID;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.init.ModItems;

public class EntityCookieConnoisseur extends EntityZombie {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(WeirdThings.MODID,
			"entities/cookie_connoisseur");
	public static final int EXPERIENCE_VALUE = 10;

	private static final UUID ATTACK_SPEED_BOOST_MODIFIER_UUID = UUID
			.fromString("ea4283d4-c5fc-4453-8e1a-1a82db1dd3eb");
	private static final AttributeModifier ATTACK_SPEED_BOOST_MODIFIER = (new AttributeModifier(
			ATTACK_SPEED_BOOST_MODIFIER_UUID, "Attacking speed boost", 0.05D, 0)).setSaved(false);
	private int angerLevel;
	private int randomSoundDelay;
	private UUID angerTargetUUID;

	public EntityCookieConnoisseur(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.95F);
		this.experienceValue = EXPERIENCE_VALUE;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(6);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
	}

	@Override
	public void applyEntityAI() {
		this.targetTasks.addTask(1, new EntityCookieConnoisseur.AIHurtByAggressor(this));
		this.targetTasks.addTask(2, new EntityCookieConnoisseur.AITargetAggressor(this));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_VILLAGER_YES;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_PLAYER_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_PLAYER_DEATH;
	}

	@Override
	public SoundEvent getStepSound() {
		return SoundEvents.ENTITY_ZOMBIE_STEP;
	}

	@Override
	public void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(this.getStepSound(), 0.15F, 1.0F);
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
	public void setRevengeTarget(@Nullable EntityLivingBase livingBase) {
		super.setRevengeTarget(livingBase);
		if (livingBase != null) {
			this.angerTargetUUID = livingBase.getUniqueID();
		}
	}

	@Override
	public boolean shouldBurnInDay() {
		return false;
	}

	@Override
	public void updateAITasks() {
		IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
		if (this.isAngry()) {
			if (!this.isChild() && !iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER)) {
				iattributeinstance.applyModifier(ATTACK_SPEED_BOOST_MODIFIER);
			}
			--this.angerLevel;
		} else if (iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER)) {
			iattributeinstance.removeModifier(ATTACK_SPEED_BOOST_MODIFIER);
		}
		if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0) {
			this.playSound(SoundEvents.ENTITY_VILLAGER_NO, this.getSoundVolume() * 2.0F,
					((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 1.8F);
		}
		if (this.angerLevel > 0 && this.angerTargetUUID != null && this.getRevengeTarget() == null) {
			EntityPlayer entityplayer = this.world.getPlayerEntityByUUID(this.angerTargetUUID);
			this.setRevengeTarget(entityplayer);
			this.attackingPlayer = entityplayer;
			this.recentlyHit = this.getRevengeTimer();
		}
		super.updateAITasks();
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
	}

	@Override
	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this)
				&& this.world.getCollisionBoxes(this, this.getEntityBoundingBox()).isEmpty()
				&& !this.world.containsAnyLiquid(this.getEntityBoundingBox());
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setShort("Anger", (short) this.angerLevel);
		if (this.angerTargetUUID != null) {
			compound.setString("HurtBy", this.angerTargetUUID.toString());
		} else {
			compound.setString("HurtBy", "");
		}
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.angerLevel = compound.getShort("Anger");
		String s = compound.getString("HurtBy");
		if (!s.isEmpty()) {
			this.angerTargetUUID = UUID.fromString(s);
			EntityPlayer entityplayer = this.world.getPlayerEntityByUUID(this.angerTargetUUID);
			this.setRevengeTarget(entityplayer);
			if (entityplayer != null) {
				this.attackingPlayer = entityplayer;
				this.recentlyHit = this.getRevengeTimer();
			}
		}
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (this.isEntityInvulnerable(source)) {
			return false;
		} else {
			Entity entity = source.getTrueSource();
			if (entity instanceof EntityPlayer) {
				this.becomeAngryAt(entity);
			}
			return super.attackEntityFrom(source, amount);
		}
	}

	public void becomeAngryAt(Entity entity) {
		this.angerLevel = 400 + this.rand.nextInt(400);
		this.randomSoundDelay = this.rand.nextInt(40);
		if (entity instanceof EntityLivingBase) {
			this.setRevengeTarget((EntityLivingBase) entity);
		}
	}

	public boolean isAngry() {
		return this.angerLevel > 0;
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		return false;
	}

	@Override
	public void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(ModItems.COOKIE_SWORD));
	}

	@Override
	public ItemStack getSkullDrop() {
		return ItemStack.EMPTY;
	}

	@Override
	public boolean isPreventingPlayerRest(EntityPlayer playerIn) {
		return this.isAngry();
	}

	@Override
	public float getEyeHeight() {
		float f = 1.74F;
		if (this.isChild()) {
			f = (float) ((double) f - 0.81D);
		}
		return f;
	}

	static class AIHurtByAggressor extends EntityAIHurtByTarget {
		public AIHurtByAggressor(EntityCookieConnoisseur p_i45828_1_) {
			super(p_i45828_1_, true);
		}

		protected void setEntityAttackTarget(EntityCreature creatureIn, EntityLivingBase entityLivingBaseIn) {
			super.setEntityAttackTarget(creatureIn, entityLivingBaseIn);

			if (creatureIn instanceof EntityCookieConnoisseur) {
				((EntityCookieConnoisseur) creatureIn).becomeAngryAt(entityLivingBaseIn);
			}
		}
	}

	static class AITargetAggressor extends EntityAINearestAttackableTarget<EntityPlayer> {
		public AITargetAggressor(EntityCookieConnoisseur p_i45829_1_) {
			super(p_i45829_1_, EntityPlayer.class, true);
		}

		public boolean shouldExecute() {
			return ((EntityCookieConnoisseur) this.taskOwner).isAngry() && super.shouldExecute();
		}
	}
}