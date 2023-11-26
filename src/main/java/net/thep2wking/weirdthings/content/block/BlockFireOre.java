package net.thep2wking.weirdthings.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.thep2wking.reloadedlib.api.block.ModBlockOreBase;
import net.thep2wking.reloadedlib.util.ModToolTypes;
import net.thep2wking.weirdthings.init.ModItems;

public class BlockFireOre extends ModBlockOreBase {
	public BlockFireOre(String modid, String name, CreativeTabs tab, int minXp, int maxXp, Material material,
			SoundType sound, MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness,
			float resistance, int lightLevel) {
		super(modid, name, tab, minXp, maxXp, material, sound, mapColor, harvestLevel, toolType, hardness, resistance,
				lightLevel);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.FIRE;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}
}