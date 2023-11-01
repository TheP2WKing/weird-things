package net.thep2wking.weirdthings.util.render;

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
import net.thep2wking.weirdthings.content.entity.EntityCookieMonster;

@SideOnly(Side.CLIENT)
public class RenderCookieMonster extends RenderLiving<EntityCookieMonster> {
	public RenderCookieMonster(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPlayer(0f, false), 0.5f);
		this.addLayer(new LayerHeldItem(this));
        this.addLayer(new LayerBipedArmor(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityCookieMonster entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/cookie_monster.png");
	}

	public static final RenderCookieMonster.Factory FACTORY = new RenderCookieMonster.Factory();

	public static class Factory implements IRenderFactory<EntityCookieMonster> {
		@Override
		public Render<? super EntityCookieMonster> createRenderFor(RenderManager manager) {
			return new RenderCookieMonster(manager);
		}
	}
}