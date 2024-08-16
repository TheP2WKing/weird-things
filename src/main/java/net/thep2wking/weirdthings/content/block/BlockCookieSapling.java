package net.thep2wking.weirdthings.content.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.thep2wking.oedldoedlcore.api.block.ModBlockSaplingBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.weirdthings.init.ModBiomes;

public class BlockCookieSapling extends ModBlockSaplingBase {
	public BlockCookieSapling(String modid, String name, CreativeTabs tab, Material material, SoundType sound,
			MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance,
			int lightLevel) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
	}

	@Override
	public WorldGenerator createTreeGenerator() {
		return ModBiomes.COOKIE_TREE;
	}
}