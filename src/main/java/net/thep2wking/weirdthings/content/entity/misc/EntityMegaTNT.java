package net.thep2wking.weirdthings.content.entity.misc;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.tnt.ModEntityTNTBase;
import net.thep2wking.oedldoedlcore.api.tnt.ModExplosionBase;

public class EntityMegaTNT extends ModEntityTNTBase {
	public EntityMegaTNT(World world, double x, double y, double z, EntityLivingBase igniter, int fuse,
			float explosionStrength, boolean spawnFire, boolean blockDamage, boolean dropBlocks, int smoothness) {
		super(world, x, y, z, igniter, fuse, explosionStrength, spawnFire, blockDamage, dropBlocks, smoothness);
	}

	public EntityMegaTNT(World world, double x, double y, double z, EntityLivingBase igniter) {
		super(world, x, y, z, igniter);
		this.setFuse(120);
	}

	public EntityMegaTNT(World world) {
		super(world);
		this.setFuse(120);
	}

	@Override
	public ModExplosionBase createTNTExplosion(double x, double y, double z) {
		return new ModExplosionBase(world, ignitor, x, y, z, 20.0f, false, true, true, 32);
	}
}