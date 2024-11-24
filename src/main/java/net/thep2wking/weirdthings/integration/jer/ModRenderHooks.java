package net.thep2wking.weirdthings.integration.jer;

import jeresources.api.render.IMobRenderHook;
import net.minecraft.client.renderer.GlStateManager;

@SuppressWarnings("rawtypes")
public class ModRenderHooks {
	public static final IMobRenderHook FLYING_MOB = (renderInfo, entity) -> {
		renderInfo.pitch = renderInfo.pitch;
		renderInfo.yaw = -renderInfo.yaw;
		return renderInfo;
	};

	public static final IMobRenderHook VILLAGER_DRAGON = (renderInfo, entity) -> {
		GlStateManager.rotate(20.0F, 1.0F, 0.0F, 0.0F);
		GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
		renderInfo.pitch = -renderInfo.pitch - 80.0F;
		GlStateManager.rotate(renderInfo.yaw < 90.0F ? (renderInfo.yaw < -90.0F ? 90.0F : -renderInfo.yaw) : -90.0F,
				0.0F, 1.0F, 0.0F);
		return renderInfo;
	};

	public static final IMobRenderHook CHICKEN_GHAST = (renderInfo, entity) -> {
		GlStateManager.translate(0, -1.5, 0);
		return renderInfo;
	};

	public static final IMobRenderHook SKELEPIG = (renderInfo, entity) -> {
		GlStateManager.translate(0, 0.25, 0);
		return renderInfo;
	};

	public static final IMobRenderHook FAT_CHICKEN = (renderInfo, entity) -> {
		GlStateManager.scale(0.8, 0.8, 0.8);
		return renderInfo;
	};

	public static final IMobRenderHook VERY_WEIRD_PIG = (renderInfo, entity) -> {
		GlStateManager.scale(0.7, 0.7, 0.7);
		return renderInfo;
	};
}