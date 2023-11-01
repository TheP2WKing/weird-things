package net.thep2wking.weirdthings.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.thep2wking.reloadedlib.api.item.ModItemBase;

public class ItemRainbowEgg extends ModItemBase {
	public ItemRainbowEgg(String modid, String name, CreativeTabs tab, EnumRarity rarity, boolean hasEffect,
			int tooltipLines) {
		super(modid, name, tab, rarity, hasEffect, tooltipLines);
		setMaxStackSize(16);
	}
}