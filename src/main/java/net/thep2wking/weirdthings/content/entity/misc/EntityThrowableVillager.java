package net.thep2wking.weirdthings.content.entity.misc;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.init.ModItems;

public class EntityThrowableVillager extends EntityThrowable {
	public EntityThrowableVillager(World worldIn) {
		super(worldIn);
	}

	public EntityThrowableVillager(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	public EntityThrowableVillager(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void handleStatusUpdate(byte id) {
		if (id == 3) {
			for (int i = 0; i < 8; ++i) {
				this.world.spawnParticle(EnumParticleTypes.ITEM_CRACK, this.posX, this.posY, this.posZ, 0.0D, 0.0D,
						0.0D, Item.getIdFromItem(ModItems.THROWABLE_VILLAGER));
			}
		}
	}

	@Override
	public void onImpact(RayTraceResult result) {
		int random = new Random().nextInt(20) + 1;
		if (result.entityHit != null && !this.world.isRemote) {
			world.newExplosion(null, result.entityHit.getPosition().getX(), result.entityHit.getPosition().getY(),
					result.entityHit.getPosition().getZ(), random, false, true);
		}
		if (!this.world.isRemote) {
			this.world.setEntityState(this, (byte) 3);
			this.world.newExplosion(null, this.getPosition().getX(), this.getPosition().getY(),
					this.getPosition().getZ(), random, false, true);
			this.setDead();
		}
	}
}