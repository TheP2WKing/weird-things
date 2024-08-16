package net.thep2wking.weirdthings.util.render.cookieconnoisseur;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityCookieConnoisseur;

@SideOnly(Side.CLIENT)
public class RenderCookieConnoisseur extends RenderLiving<EntityCookieConnoisseur> {
	public RenderCookieConnoisseur(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPlayer(0f, false), 0.5f);
		this.addLayer(new LayerHeldItem(this));
        this.addLayer(new LayerBipedArmor(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityCookieConnoisseur entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/cookie_connoisseur.png");
	}

	public static final RenderCookieConnoisseur.Factory FACTORY = new RenderCookieConnoisseur.Factory();

	public static class Factory implements IRenderFactory<EntityCookieConnoisseur> {
		@Override
		public Render<? super EntityCookieConnoisseur> createRenderFor(RenderManager manager) {
			return new RenderCookieConnoisseur(manager);
		}
	}
}