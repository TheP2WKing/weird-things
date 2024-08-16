package net.thep2wking.weirdthings.content.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.api.block.ModBlockLeavesBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.weirdthings.init.ModBlocks;
public class BlockCookieLeaves extends ModBlockLeavesBase {
	public BlockCookieLeaves(String modid, String name, CreativeTabs tab, Material material, SoundType sound,
			MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance,
			int lightLevel) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
	}

	@Override
	public ItemStack dropSapling() {
		return new ItemStack(ModBlocks.COOKIE_SAPLING, 1, 0);
	}

	@Override
	public ItemStack dropExtra() {
		return new ItemStack(Items.COOKIE, 1, 0);
	}
}