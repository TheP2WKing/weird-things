package net.thep2wking.weirdthings.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.thep2wking.reloadedlib.api.tool.ModToolMaterialBase;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.init.ModItems;

public class ModToolMaterial {
	public static final ToolMaterial FLAME = ModToolMaterialBase.addToolMaterial(WeirdThings.MODID, "flame", 2048, 1, 1f, 1f, 10, ModItems.FIN_BRICK, 0);
	public static final ToolMaterial CROSSY = ModToolMaterialBase.addToolMaterial(WeirdThings.MODID, "crossy", 2048, 1, 1f, 10f, 20, ModItems.RAINBOW_EGG, 0);

	public static final ToolMaterial DIRT = ModToolMaterialBase.addToolMaterial(WeirdThings.MODID, "dirt", 1, 0, 1f, 0f, 4, Blocks.DIRT, 0);
	public static final ToolMaterial COOKIE = ModToolMaterialBase.addToolMaterial(WeirdThings.MODID, "cookie", 256, 1, 4f, 2f, 10, Items.COOKIE, 0);
	public static final ToolMaterial VILLAGER = ModToolMaterialBase.addToolMaterial(WeirdThings.MODID, "villager", 512, 2, 6f, 3f, 12, Items.EMERALD, 0);
}
