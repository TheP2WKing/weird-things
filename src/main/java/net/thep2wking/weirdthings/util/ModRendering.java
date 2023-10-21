package net.thep2wking.weirdthings.util;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityCookieMonster;
import net.thep2wking.weirdthings.util.render.RenderCookieMonster;

public class ModRendering {
	@SideOnly(Side.CLIENT)
	public static void registerEntityRender() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCookieMonster.class, RenderCookieMonster.FACTORY);
	}
}