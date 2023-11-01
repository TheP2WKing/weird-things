package net.thep2wking.weirdthings.content.entity;

import java.util.Calendar;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.ai.EntityAIArrowstormAttack;

public class EntityArrowstormSkeleton extends EntitySkeleton {
	private final EntityAIArrowstormAttack<EntityArrowstormSkeleton> aiArrowstormAttack = new EntityAIArrowstormAttack<EntityArrowstormSkeleton>(
			this, 1.0D, -1, 15.0F);
	private final EntityAIAttackMelee aiAttackOnCollide = new EntityAIAttackMelee(this, 1.2D, false);

	public EntityArrowstormSkeleton(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 1.99F);
		setNewCombatTask();
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
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
		return new ResourceLocation(WeirdThings.MODID, "entities/arrowstorm_skeleton");
	}

	@Override
	public float getEyeHeight() {
		return 1.74F;
	}

	@Override
	@SuppressWarnings("all")
	protected void initEntityAI() {
		this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityCreeper.class, 6.0F, 1.0D, 1.2D));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, true));
		super.initEntityAI();
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
}