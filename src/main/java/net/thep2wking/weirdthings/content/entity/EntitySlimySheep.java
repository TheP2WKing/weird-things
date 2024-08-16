package net.thep2wking.weirdthings.content.entity;

import java.util.List;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;

public class EntitySlimySheep extends EntityAnimal implements IShearable {
	public static final ResourceLocation LOOT_TABLE = new ResourceLocation(WeirdThings.MODID, "entities/slimy_sheep");
	public static final ResourceLocation LOOT_TABLE_SHEARED = new ResourceLocation(WeirdThings.MODID,
			"entities/slimy_sheep_sheared");
	public static final int EXPERIENCE_VALUE = 0;

	private int sheepTimer;
	private EntityAIEatGrass entityAIEatGrass;
	private static final DataParameter<Byte> SLIME = EntityDataManager.<Byte>createKey(EntitySlimySheep.class,
			DataSerializers.BYTE);

	public EntitySlimySheep(World worldIn) {
		super(worldIn);
		this.setSize(0.9f, 1.3f);
		this.experienceValue = EXPERIENCE_VALUE;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SHEEP_AMBIENT;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_SHEEP_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SHEEP_DEATH;
	}

	@Override
	public void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound(SoundEvents.ENTITY_SHEEP_STEP, 0.15F, 1.0F);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Nullable
	@Override
	public ResourceLocation getLootTable() {
		if (this.getSheared()) {
			return LOOT_TABLE_SHEARED;
		} else {
			return LOOT_TABLE;
		}
	}

	@Override
	public void initEntityAI() {
		this.entityAIEatGrass = new EntityAIEatGrass(this);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.1D, Items.WHEAT, false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
		this.tasks.addTask(5, this.entityAIEatGrass);
		this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
	}

	@Override
	public void updateAITasks() {
		this.sheepTimer = this.entityAIEatGrass.getEatingGrassTimer();
		super.updateAITasks();
	}

	@Override
	public void onLivingUpdate() {
		if (this.world.isRemote) {
			this.sheepTimer = Math.max(0, this.sheepTimer - 1);
		}
		super.onLivingUpdate();
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
	}

	@Override
	public void entityInit() {
		super.entityInit();
		this.dataManager.register(SLIME, Byte.valueOf((byte) 0));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleStatusUpdate(byte id) {
		if (id == 10) {
			this.sheepTimer = 40;
		} else {
			super.handleStatusUpdate(id);
		}
	}

	@SuppressWarnings("unused")
	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack itemstack = player.getHeldItem(hand);
		if (false && itemstack.getItem() == Items.SHEARS && !this.getSheared() && !this.isChild()) {
			if (!this.world.isRemote) {
				this.setSheared(true);
				int i = 1 + this.rand.nextInt(3);
				for (int j = 0; j < i; ++j) {
					EntityItem entityitem = this
							.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.SLIME_BLOCK)), 1.0F);
					entityitem.motionY += (double) (this.rand.nextFloat() * 0.05F);
					entityitem.motionX += (double) ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F);
					entityitem.motionZ += (double) ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F);
				}
			}
			itemstack.damageItem(1, player);
			this.playSound(SoundEvents.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
		}
		return super.processInteract(player, hand);
	}

	@SideOnly(Side.CLIENT)
	public float getHeadRotationPointY(float p_70894_1_) {
		if (this.sheepTimer <= 0) {
			return 0.0F;
		} else if (this.sheepTimer >= 4 && this.sheepTimer <= 36) {
			return 1.0F;
		} else {
			return this.sheepTimer < 4 ? ((float) this.sheepTimer - p_70894_1_) / 4.0F
					: -((float) (this.sheepTimer - 40) - p_70894_1_) / 4.0F;
		}
	}

	@SideOnly(Side.CLIENT)
	public float getHeadRotationAngleX(float p_70890_1_) {
		if (this.sheepTimer > 4 && this.sheepTimer <= 36) {
			float f = ((float) (this.sheepTimer - 4) - p_70890_1_) / 32.0F;
			return ((float) Math.PI / 5F) + ((float) Math.PI * 7F / 100F) * MathHelper.sin(f * 28.7F);
		} else {
			return this.sheepTimer > 0 ? ((float) Math.PI / 5F) : this.rotationPitch * 0.017453292F;
		}
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setBoolean("Sheared", this.getSheared());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setSheared(compound.getBoolean("Sheared"));
	}

	public boolean getSheared() {
		return (((Byte) this.dataManager.get(SLIME)).byteValue() & 16) != 0;
	}

	public void setSheared(boolean sheared) {
		byte b0 = ((Byte) this.dataManager.get(SLIME)).byteValue();

		if (sheared) {
			this.dataManager.set(SLIME, Byte.valueOf((byte) (b0 | 16)));
		} else {
			this.dataManager.set(SLIME, Byte.valueOf((byte) (b0 & -17)));
		}
	}

	@Override
	public EntitySlimySheep createChild(EntityAgeable ageable) {
		return new EntitySlimySheep(this.world);
	}

	@Override
	public void eatGrassBonus() {
		this.setSheared(false);
		if (this.isChild()) {
			this.addGrowth(60);
		}
	}

	@Nullable
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		return livingdata;
	}

	@Override
	public boolean isShearable(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos) {
		return !this.getSheared() && !this.isChild();
	}

	@Override
	public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos,
			int fortune) {
		this.setSheared(true);
		int i = 1 + this.rand.nextInt(3);
		List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
		for (int j = 0; j < i; ++j)
			ret.add(new ItemStack(Item.getItemFromBlock(Blocks.SLIME_BLOCK)));
		this.playSound(SoundEvents.ENTITY_SLIME_SQUISH, 1.0F, 1.0F);
		return ret;
	}

	@Override
	public float getEyeHeight() {
		return 0.95F * this.height;
	}
}