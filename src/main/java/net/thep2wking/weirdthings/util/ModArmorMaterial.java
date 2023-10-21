package net.thep2wking.weirdthings.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.thep2wking.reloadedlib.api.armor.ModArmorMaterialBase;
import net.thep2wking.weirdthings.WeirdThings;

public class ModArmorMaterial {
	public static final ArmorMaterial DIRT = ModArmorMaterialBase.addArmorMaterial(WeirdThings.MODID, "dirt", 4, new int[] { 1, 1, 1, 1 }, 0f, 4, SoundEvents.BLOCK_GRAVEL_PLACE, Blocks.DIRT, 0);
	public static final ArmorMaterial COOKIE = ModArmorMaterialBase.addArmorMaterial(WeirdThings.MODID, "cookie", 10, new int[] { 2, 4, 3, 1 }, 0f, 10, SoundEvents.ENTITY_PLAYER_BURP, Items.COOKIE, 0);
	public static final ArmorMaterial VILLAGER = ModArmorMaterialBase.addArmorMaterial(WeirdThings.MODID, "villager", 18, new int[] { 3, 5, 4, 2 }, 0f, 12, SoundEvents.ENTITY_VILLAGER_YES, Items.EMERALD, 0);

}