package net.thep2wking.weirdthings.content.entity;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;

public class EntityVillagerWither extends EntityWither {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(WeirdThings.MODID,
			"entities/villager_wither");
	public static final int EXPERIENCE_VALUE = 100;

	private final BossInfoServer bossInfoNew = (BossInfoServer) (new BossInfoServer(this.getDisplayName(),
			BossInfo.Color.GREEN, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
	private final int[] nextHeadUpdate = new int[2];
	private final int[] idleHeadUpdates = new int[2];
	/** Time before the Wither tries to break blocks */
	private int blockBreakCounter;
	private static final Predicate<Entity> NOT_UNDEAD = new Predicate<Entity>() {
		public boolean apply(@Nullable Entity p_apply_1_) {
			return p_apply_1_ instanceof EntityLivingBase
					&& ((EntityLivingBase) p_apply_1_).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD
					&& ((EntityLivingBase) p_apply_1_).attackable();
		}
	};

	public EntityVillagerWither(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 3.75F);
		this.experienceValue = EXPERIENCE_VALUE;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300);
	}

	@Override
	@SuppressWarnings("all")
	public void initEntityAI() {
		this.tasks.addTask(0, new EntityVillagerWither.AIDoNothing());
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackRanged(this, 1.0D, 40, 20.0F));
		this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2,
				new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false, NOT_UNDEAD));
	}

	@Override
	public void updateAITasks() {
		if (this.getInvulTime() > 0) {
			int j1 = this.getInvulTime() - 1;
			if (j1 <= 0) {
				this.world.newExplosion(this, this.posX, this.posY + (double) this.getEyeHeight(), this.posZ, 7.0F,
						false, net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this));
				this.world.playBroadcastSound(1023, new BlockPos(this), 0);
			}
			this.setInvulTime(j1);
			if (this.ticksExisted % 10 == 0) {
				this.heal(10.0F);
			}
		} else {
			for (int i = 1; i < 3; ++i) {
				if (this.ticksExisted >= this.nextHeadUpdate[i - 1]) {
					this.nextHeadUpdate[i - 1] = this.ticksExisted + 10 + this.rand.nextInt(10);
					if (this.world.getDifficulty() == EnumDifficulty.NORMAL
							|| this.world.getDifficulty() == EnumDifficulty.HARD) {
						int j3 = i - 1;
						int k3 = this.idleHeadUpdates[i - 1];
						this.idleHeadUpdates[j3] = this.idleHeadUpdates[i - 1] + 1;
						if (k3 > 15) {
							double d0 = MathHelper.nextDouble(this.rand, this.posX - 10.0D, this.posX + 10.0D);
							double d1 = MathHelper.nextDouble(this.rand, this.posY - 5.0D, this.posY + 5.0D);
							double d2 = MathHelper.nextDouble(this.rand, this.posZ - 10.0D, this.posZ + 10.0D);
							this.launchWitherSkullToCoords(i + 1, d0, d1, d2, true);
							this.idleHeadUpdates[i - 1] = 0;
						}
					}
					int k1 = this.getWatchedTargetId(i);
					if (k1 > 0) {
						Entity entity = this.world.getEntityByID(k1);
						if (entity != null && entity.isEntityAlive() && this.getDistanceSq(entity) <= 900.0D
								&& this.canEntityBeSeen(entity)) {
							if (entity instanceof EntityPlayer && ((EntityPlayer) entity).capabilities.disableDamage) {
								this.updateWatchedTargetId(i, 0);
							} else {
								this.launchWitherSkullToEntity(i + 1, (EntityLivingBase) entity);
								this.nextHeadUpdate[i - 1] = this.ticksExisted + 40 + this.rand.nextInt(20);
								this.idleHeadUpdates[i - 1] = 0;
							}
						} else {
							this.updateWatchedTargetId(i, 0);
						}
					} else {
						List<EntityLivingBase> list = this.world.<EntityLivingBase>getEntitiesWithinAABB(
								EntityLivingBase.class, this.getEntityBoundingBox().grow(20.0D, 8.0D, 20.0D),
								Predicates.and(NOT_UNDEAD, EntitySelectors.NOT_SPECTATING));
						for (int j2 = 0; j2 < 10 && !list.isEmpty(); ++j2) {
							EntityLivingBase entitylivingbase = list.get(this.rand.nextInt(list.size()));

							if (entitylivingbase != this && entitylivingbase.isEntityAlive()
									&& this.canEntityBeSeen(entitylivingbase)) {
								if (entitylivingbase instanceof EntityPlayer) {
									if (!((EntityPlayer) entitylivingbase).capabilities.disableDamage) {
										this.updateWatchedTargetId(i, entitylivingbase.getEntityId());
									}
								} else {
									this.updateWatchedTargetId(i, entitylivingbase.getEntityId());
								}
								break;
							}
							list.remove(entitylivingbase);
						}
					}
				}
			}
			if (this.getAttackTarget() != null) {
				this.updateWatchedTargetId(0, this.getAttackTarget().getEntityId());
			} else {
				this.updateWatchedTargetId(0, 0);
			}
			if (this.blockBreakCounter > 0) {
				--this.blockBreakCounter;
				if (this.blockBreakCounter == 0
						&& net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this)) {
					int i1 = MathHelper.floor(this.posY);
					int l1 = MathHelper.floor(this.posX);
					int i2 = MathHelper.floor(this.posZ);
					boolean flag = false;
					for (int k2 = -1; k2 <= 1; ++k2) {
						for (int l2 = -1; l2 <= 1; ++l2) {
							for (int j = 0; j <= 3; ++j) {
								int i3 = l1 + k2;
								int k = i1 + j;
								int l = i2 + l2;
								BlockPos blockpos = new BlockPos(i3, k, l);
								IBlockState iblockstate = this.world.getBlockState(blockpos);
								Block block = iblockstate.getBlock();

								if (!block.isAir(iblockstate, this.world, blockpos)
										&& block.canEntityDestroy(iblockstate, world, blockpos, this)
										&& net.minecraftforge.event.ForgeEventFactory.onEntityDestroyBlock(this,
												blockpos, iblockstate)) {
									flag = this.world.destroyBlock(blockpos, true) || flag;
								}
							}
						}
					}
					if (flag) {
						this.world.playEvent((EntityPlayer) null, 1022, new BlockPos(this), 0);
					}
				}
			}
			if (this.ticksExisted % 20 == 0) {
				this.heal(1.0F);
			}
			this.bossInfoNew.setPercent(this.getHealth() / this.getMaxHealth());
		}
	}

	private double getHeadX(int p_82214_1_) {
		if (p_82214_1_ <= 0) {
			return this.posX;
		} else {
			float f = (this.renderYawOffset + (float) (180 * (p_82214_1_ - 1))) * 0.017453292F;
			float f1 = MathHelper.cos(f);
			return this.posX + (double) f1 * 1.3D;
		}
	}

	private double getHeadY(int p_82208_1_) {
		return p_82208_1_ <= 0 ? this.posY + 3.0D : this.posY + 2.2D;
	}

	private double getHeadZ(int p_82213_1_) {
		if (p_82213_1_ <= 0) {
			return this.posZ;
		} else {
			float f = (this.renderYawOffset + (float) (180 * (p_82213_1_ - 1))) * 0.017453292F;
			float f1 = MathHelper.sin(f);
			return this.posZ + (double) f1 * 1.3D;
		}
	}

	public void launchWitherSkullToEntity(int p_82216_1_, EntityLivingBase p_82216_2_) {
		this.launchWitherSkullToCoords(p_82216_1_, p_82216_2_.posX,
				p_82216_2_.posY + (double) p_82216_2_.getEyeHeight() * 0.5D, p_82216_2_.posZ,
				p_82216_1_ == 0 && this.rand.nextFloat() < 0.001F);
	}

	public void launchWitherSkullToCoords(int p_82209_1_, double x, double y, double z, boolean invulnerable) {
		this.world.playEvent((EntityPlayer) null, 1024, new BlockPos(this), 0);
		double d0 = this.getHeadX(p_82209_1_);
		double d1 = this.getHeadY(p_82209_1_);
		double d2 = this.getHeadZ(p_82209_1_);
		double d3 = x - d0;
		double d4 = y - d1;
		double d5 = z - d2;
		EntityWitherSkull entitywitherskull = new EntityWitherSkull(this.world, this, d3, d4, d5);

		if (invulnerable) {
			entitywitherskull.setInvulnerable(true);
		}

		entitywitherskull.posY = d1;
		entitywitherskull.posX = d0;
		entitywitherskull.posZ = d2;
		this.world.spawnEntity(entitywitherskull);
	}

	@Override
	public void setCustomNameTag(String name) {
		this.bossInfoNew.setName(this.getDisplayName());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		this.setInvulTime(compound.getInteger("Invul"));

		if (this.hasCustomName()) {
			this.bossInfoNew.setName(this.getDisplayName());
		}
	}

	@Override
	public void addTrackingPlayer(EntityPlayerMP player) {
		this.bossInfoNew.addPlayer(player);
	}

	@Override
	public void removeTrackingPlayer(EntityPlayerMP player) {
		this.bossInfoNew.removePlayer(player);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_WITHER_AMBIENT;
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
		return EnumCreatureAttribute.UNDEAD;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		return LOOT_TABLE;
	}

	@Override
	public float getEyeHeight() {
		return 3.0F;
	}

	class AIDoNothing extends EntityAIBase {
		public AIDoNothing() {
			this.setMutexBits(7);
		}

		@Override
		public boolean shouldExecute() {
			return EntityVillagerWither.this.getInvulTime() > 0;
		}
	}
}