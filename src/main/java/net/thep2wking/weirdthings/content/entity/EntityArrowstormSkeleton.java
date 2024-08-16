package net.thep2wking.weirdthings.content.entity;

import java.util.Calendar;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBow;
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

public class EntityArrowstormSkeleton extends EntitySkeleton {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(WeirdThings.MODID,
			"entities/arrowstorm_skeleton");
	public static final int EXPERIENCE_VALUE = 10;

	private final EntityAIArrowstormAttack<EntityArrowstormSkeleton> aiArrowstormAttack = new EntityAIArrowstormAttack<EntityArrowstormSkeleton>(
			this, 1.0D, -1, 15.0F);
	private final EntityAIAttackMelee aiAttackOnCollide = new EntityAIAttackMelee(this, 1.2D, false);

	public EntityArrowstormSkeleton(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.99F);
		this.experienceValue = EXPERIENCE_VALUE;
		setNewCombatTask();
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SKELETON_AMBIENT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_SKELETON_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SKELETON_DEATH;
	}

	@Override
	public SoundEvent getStepSound() {
		return SoundEvents.ENTITY_SKELETON_STEP;
	}

	@Override
	public void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(this.getStepSound(), 0.15F, 1.0F);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return LOOT_TABLE;
	}

	@Override
	public float getEyeHeight() {
		return 1.74F;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIRestrictSun(this));
        this.tasks.addTask(3, new EntityAIFleeSun(this, 1.0D));
		this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityCreeper.class, 6.0F, 1.0D, 1.2D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
	}

	@Nullable
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setEquipmentBasedOnDifficulty(difficulty);
		this.setEnchantmentBasedOnDifficulty(difficulty);
		setNewCombatTask();
		this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F * difficulty.getClampedAdditionalDifficulty());
		if (this.getItemStackFromSlot(EntityEquipmentSlot.HEAD).isEmpty()) {
			Calendar calendar = this.world.getCurrentDate();
			if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31 && this.rand.nextFloat() < 0.25F) {
				this.setItemStackToSlot(EntityEquipmentSlot.HEAD,
						new ItemStack(this.rand.nextFloat() < 0.1F ? Blocks.LIT_PUMPKIN : Blocks.PUMPKIN));
				this.inventoryArmorDropChances[EntityEquipmentSlot.HEAD.getIndex()] = 0.0F;
			}
		}
		return livingdata;
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		setNewCombatTask();
	}

	@Override
	public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack) {
		super.setItemStackToSlot(slotIn, stack);
		if (!this.world.isRemote && slotIn == EntityEquipmentSlot.MAINHAND) {
			setNewCombatTask();
		}
	}

	@Override
	public void setCombatTask() {
	}

	public void setNewCombatTask() {
		if (this.world != null && !this.world.isRemote) {
			this.tasks.removeTask(this.aiAttackOnCollide);
			this.tasks.removeTask(this.aiArrowstormAttack);
			ItemStack itemstack = this.getHeldItemMainhand();
			if (itemstack.getItem() instanceof ItemBow) {
				int i = -1;
				if (this.world.getDifficulty() != EnumDifficulty.HARD) {
					i = -1;
				}
				this.aiArrowstormAttack.setAttackCooldown(i);
				this.tasks.addTask(4, this.aiArrowstormAttack);
			} else {
				this.tasks.addTask(4, this.aiAttackOnCollide);
			}
		}
	}

	public class EntityAIArrowstormAttack<T extends EntityMob & IRangedAttackMob> extends EntityAIBase {
		private final T entity;
		private final double moveSpeedAmp;
		private int attackCooldown;
		private final float maxAttackDistance;
		private int attackTime = -1;
		private int seeTime;
		private boolean strafingClockwise;
		private boolean strafingBackwards;
		private int strafingTime = -1;

		public EntityAIArrowstormAttack(T entity, double moveSpeedAmp, int attackCooldown, float maxAttackDistance) {
			this.entity = entity;
			this.moveSpeedAmp = moveSpeedAmp;
			this.attackCooldown = attackCooldown;
			this.maxAttackDistance = maxAttackDistance * maxAttackDistance;
			this.setMutexBits(3);
		}

		public void setAttackCooldown(int attackCooldown) {
			this.attackCooldown = attackCooldown;
		}

		public boolean shouldExecute() {
			return this.entity.getAttackTarget() == null ? false : this.isBowInMainhand();
		}

		public boolean isBowInMainhand() {
			return !this.entity.getHeldItemMainhand().isEmpty()
					&& this.entity.getHeldItemMainhand().getItem() instanceof ItemBow;
		}

		public boolean shouldContinueExecuting() {
			return (this.shouldExecute() || !this.entity.getNavigator().noPath()) && this.isBowInMainhand();
		}

		public void startExecuting() {
			super.startExecuting();
			((IRangedAttackMob) this.entity).setSwingingArms(true);
		}

		public void resetTask() {
			super.resetTask();
			((IRangedAttackMob) this.entity).setSwingingArms(false);
			this.seeTime = 0;
			this.attackTime = -1;
			this.entity.resetActiveHand();
		}

		public void updateTask() {
			EntityLivingBase entitylivingbase = this.entity.getAttackTarget();

			if (entitylivingbase != null) {
				double d0 = this.entity.getDistanceSq(entitylivingbase.posX,
						entitylivingbase.getEntityBoundingBox().minY,
						entitylivingbase.posZ);
				boolean flag = this.entity.getEntitySenses().canSee(entitylivingbase);
				boolean flag1 = this.seeTime > 0;
				if (flag != flag1) {
					this.seeTime = 0;
				}
				if (flag) {
					++this.seeTime;
				} else {
					--this.seeTime;
				}
				if (d0 <= (double) this.maxAttackDistance && this.seeTime >= 20) {
					this.entity.getNavigator().clearPath();
					++this.strafingTime;
				} else {
					this.entity.getNavigator().tryMoveToEntityLiving(entitylivingbase, this.moveSpeedAmp);
					this.strafingTime = -1;
				}
				if (this.strafingTime >= 20) {
					if ((double) this.entity.getRNG().nextFloat() < 0.3D) {
						this.strafingClockwise = !this.strafingClockwise;
					}
					if ((double) this.entity.getRNG().nextFloat() < 0.3D) {
						this.strafingBackwards = !this.strafingBackwards;
					}
					this.strafingTime = 0;
				}
				if (this.strafingTime > -1) {
					if (d0 > (double) (this.maxAttackDistance * 0.75F)) {
						this.strafingBackwards = false;
					} else if (d0 < (double) (this.maxAttackDistance * 0.25F)) {
						this.strafingBackwards = true;
					}
					this.entity.getMoveHelper().strafe(this.strafingBackwards ? -0.5F : 0.5F,
							this.strafingClockwise ? 0.5F : -0.5F);
					this.entity.faceEntity(entitylivingbase, 30.0F, 30.0F);
				} else {
					this.entity.getLookHelper().setLookPositionWithEntity(entitylivingbase, 30.0F, 30.0F);
				}
				if (this.entity.isHandActive()) {
					if (!flag && this.seeTime < -60) {
						this.entity.resetActiveHand();
					} else if (flag) {
						int i = this.entity.getItemInUseMaxCount();
						if (i >= 0) {
							this.entity.resetActiveHand();
							((IRangedAttackMob) this.entity).attackEntityWithRangedAttack(entitylivingbase,
									ItemBow.getArrowVelocity(i));
							this.attackTime = this.attackCooldown;
						}
					}
				} else if (--this.attackTime <= 0 && this.seeTime >= -60) {
					this.entity.setActiveHand(EnumHand.MAIN_HAND);
				}
			}
		}
	}
}