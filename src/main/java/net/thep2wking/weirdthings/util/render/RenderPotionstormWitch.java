package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityPotionstormWitch;
import net.thep2wking.weirdthings.util.layer.LayerHeldItemPotionstormWitch;

@SideOnly(Side.CLIENT)
public class RenderPotionstormWitch extends RenderLiving<EntityPotionstormWitch> {
	public RenderPotionstormWitch(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelWitch(0f), 0.5f);
		this.addLayer(new LayerHeldItemPotionstormWitch(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityPotionstormWitch entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/potionstorm_witch.png");
	}

	@Override
	public ModelWitch getMainModel() {
		return (ModelWitch) super.getMainModel();
	}

	@Override
	public void doRender(EntityPotionstormWitch entity, double x, double y, double z, float entityYaw,
			float partialTicks) {
		((ModelWitch) this.mainModel).holdingItem = !entity.getHeldItemMainhand().isEmpty();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	public void transformHeldFull3DItemLayer() {
		GlStateManager.translate(0.0F, 0.1875F, 0.0F);
	}

	@Override
	public void preRenderCallback(EntityPotionstormWitch entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.9375F, 0.9375F, 0.9375F);
	}

	public static final RenderPotionstormWitch.Factory FACTORY = new RenderPotionstormWitch.Factory();

	public static class Factory implements IRenderFactory<EntityPotionstormWitch> {
		@Override
		public Render<? super EntityPotionstormWitch> createRenderFor(RenderManager manager) {
			return new RenderPotionstormWitch(manager);
		}
	}
}