package net.thep2wking.weirdthings.content.entity.misc;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityCrossyRoadChicken;
import net.thep2wking.weirdthings.init.ModItems;

public class EntityRainbowEgg extends EntityThrowable {
	public EntityRainbowEgg(World worldIn) {
		super(worldIn);
	}

	public EntityRainbowEgg(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	public EntityRainbowEgg(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void handleStatusUpdate(byte id) {
		if (id == 3) {
			for (int i = 0; i < 8; ++i) {
				this.world.spawnParticle(EnumParticleTypes.ITEM_CRACK, this.posX, this.posY, this.posZ, 0.0D, 0.0D,
						0.0D, Item.getIdFromItem(ModItems.RAINBOW_EGG));
			}
		}
	}

	@Override
	public void onImpact(RayTraceResult result) {
		if (result.entityHit != null) {
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0.0F);
		}
		if (!this.world.isRemote) {
			if (this.rand.nextInt(8) == 0) {
				int i = 1;
				if (this.rand.nextInt(32) == 0) {
					i = 4;
				}
				for (int j = 0; j < i; ++j) {
					EntityCrossyRoadChicken entitychicken = new EntityCrossyRoadChicken(this.world);
					entitychicken.setGrowingAge(-24000);
					entitychicken.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
					this.world.spawnEntity(entitychicken);
				}
			}
			this.world.setEntityState(this, (byte) 3);
			this.setDead();
		}
	}
}