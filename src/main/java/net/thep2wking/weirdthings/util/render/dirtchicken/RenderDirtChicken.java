package net.thep2wking.weirdthings.util.render.dirtchicken;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityDirtChicken;

@SideOnly(Side.CLIENT)
public class RenderDirtChicken extends RenderLiving<EntityDirtChicken> {
	public RenderDirtChicken(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelChicken(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityDirtChicken entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/dirt_chicken.png");
	}

	@Override
	public float handleRotationFloat(EntityDirtChicken livingBase, float partialTicks) {
		float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
		float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
		return (MathHelper.sin(f) + 1.0F) * f1;
	}

	public static final RenderDirtChicken.Factory FACTORY = new RenderDirtChicken.Factory();

	public static class Factory implements IRenderFactory<EntityDirtChicken> {
		@Override
		public Render<? super EntityDirtChicken> createRenderFor(RenderManager manager) {
			return new RenderDirtChicken(manager);
		}
	}
}