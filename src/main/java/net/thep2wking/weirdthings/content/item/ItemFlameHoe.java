package net.thep2wking.weirdthings.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.thep2wking.reloadedlib.api.tool.ModItemHoeBase;

public class ItemFlameHoe extends ModItemHoeBase {
	public ItemFlameHoe(String modid, String name, CreativeTabs tab, ToolMaterial material, float attackDamage,
			float attackSpeed, EnumRarity rarity, boolean hasEffect, int tooltipLines) {
		super(modid, name, tab, material, attackDamage, attackSpeed, rarity, hasEffect, tooltipLines);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if(entity.isEntityAlive()) {
			entity.setFire(5);
		}
		return super.onLeftClickEntity(stack, player, entity);
	}
}