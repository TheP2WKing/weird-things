package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityVillagerChicken;
import net.thep2wking.weirdthings.content.model.ModelVillagerChicken;

@SideOnly(Side.CLIENT)
public class RenderVillagerChicken extends RenderLiving<EntityVillagerChicken> {
	public RenderVillagerChicken(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillagerChicken(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVillagerChicken entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_chicken.png");
	}

	@Override
	public float handleRotationFloat(EntityVillagerChicken livingBase, float partialTicks) {
		float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
		float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
		return (MathHelper.sin(f) + 1.0F) * f1;
	}

	public static final RenderVillagerChicken.Factory FACTORY = new RenderVillagerChicken.Factory();

	public static class Factory implements IRenderFactory<EntityVillagerChicken> {
		@Override
		public Render<? super EntityVillagerChicken> createRenderFor(RenderManager manager) {
			return new RenderVillagerChicken(manager);
		}
	}
}