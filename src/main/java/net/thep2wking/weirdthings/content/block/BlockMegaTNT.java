package net.thep2wking.weirdthings.content.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.tnt.ModBlockTNTBase;
import net.thep2wking.oedldoedlcore.api.tnt.ModEntityTNTBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.weirdthings.content.entity.misc.EntityMegaTNT;

public class BlockMegaTNT extends ModBlockTNTBase {
	public BlockMegaTNT(String modid, String name, CreativeTabs tab, Material material, SoundType sound,
			MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance,
			int lightLevel) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
	}

	@Override
	public ModEntityTNTBase createTNTEntity(World world, double x, double y, double z, EntityLivingBase ignitor) {
		return new EntityMegaTNT(world, x, y, z, ignitor);
	}
}