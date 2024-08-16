package net.thep2wking.weirdthings.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.thep2wking.oedldoedlcore.api.armor.ModArmorMaterialBase;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.init.ModItems;

public class ModArmorMaterial {
	public static final ArmorMaterial DIRT = ModArmorMaterialBase.addArmorMaterial(WeirdThings.MODID, "dirt", 4, new int[] { 1, 1, 1, 1 }, 0f, 4, SoundEvents.BLOCK_GRAVEL_PLACE, Blocks.DIRT, 0);
	public static final ArmorMaterial COOKIE = ModArmorMaterialBase.addArmorMaterial(WeirdThings.MODID, "cookie", 12, new int[] { 2, 4, 3, 1 }, 0f, 10, SoundEvents.ENTITY_PLAYER_BURP, ModItems.COOKIE_INGOT, 0);
	public static final ArmorMaterial VILLAGER = ModArmorMaterialBase.addArmorMaterial(WeirdThings.MODID, "villager", 22, new int[] { 3, 5, 4, 2 }, 0f, 12, SoundEvents.ENTITY_VILLAGER_YES, ModItems.RUBY, 0);

}