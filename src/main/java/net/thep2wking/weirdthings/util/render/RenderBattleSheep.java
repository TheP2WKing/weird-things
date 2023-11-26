package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityBattleSheep;
import net.thep2wking.weirdthings.content.model.ModelBattleSheep2;
import net.thep2wking.weirdthings.util.layer.LayerBattleSheepWool;

@SideOnly(Side.CLIENT)
public class RenderBattleSheep extends RenderLiving<EntityBattleSheep> {
	public RenderBattleSheep(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelBattleSheep2(), 0.7f);
		this.addLayer(new LayerBattleSheepWool(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityBattleSheep entity) {
		return new ResourceLocation("minecraft", "textures/entity/sheep/sheep.png");
	}

	public static final RenderBattleSheep.Factory FACTORY = new RenderBattleSheep.Factory();

	public static class Factory implements IRenderFactory<EntityBattleSheep> {
		@Override
		public Render<? super EntityBattleSheep> createRenderFor(RenderManager manager) {
			return new RenderBattleSheep(manager);
		}
	}
}