package net.thep2wking.weirdthings.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.thep2wking.oedldoedlcore.api.tool.ModItemSwordBase;

public class ItemCrossySword extends ModItemSwordBase {
	public ItemCrossySword(String modid, String name, CreativeTabs tab, ToolMaterial material, float attackDamage,
			float attackSpeed, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, material, attackDamage, attackSpeed, rarity, hasEffect, tooltipLines, annotationLines);
	}
}