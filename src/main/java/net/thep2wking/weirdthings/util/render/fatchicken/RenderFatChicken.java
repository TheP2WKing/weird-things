package net.thep2wking.weirdthings.util.render.fatchicken;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityFatChicken;

@SideOnly(Side.CLIENT)
public class RenderFatChicken extends RenderLiving<EntityFatChicken> {
	public RenderFatChicken(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelFatChicken(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityFatChicken entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/fat_chicken.png");
	}

	@Override
	public float handleRotationFloat(EntityFatChicken livingBase, float partialTicks) {
		float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
		float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
		return (MathHelper.sin(f) + 1.0F) * f1;
	}

	public static final RenderFatChicken.Factory FACTORY = new RenderFatChicken.Factory();

	public static class Factory implements IRenderFactory<EntityFatChicken> {
		@Override
		public Render<? super EntityFatChicken> createRenderFor(RenderManager manager) {
			return new RenderFatChicken(manager);
		}
	}
}