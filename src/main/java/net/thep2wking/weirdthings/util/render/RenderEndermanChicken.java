package net.thep2wking.weirdthings.util.render;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityEndermanChicken;
import net.thep2wking.weirdthings.content.model.ModelEndermanChicken;
import net.thep2wking.weirdthings.util.layer.LayerEndermanChickenEyes;
import net.thep2wking.weirdthings.util.layer.LayerEndermanChickenHeldBlock;

@SideOnly(Side.CLIENT)
public class RenderEndermanChicken extends RenderLiving<EntityEndermanChicken> {
	public RenderEndermanChicken(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelEndermanChicken(), 0.5f);
		this.addLayer(new LayerEndermanChickenEyes(this));
        this.addLayer(new LayerEndermanChickenHeldBlock(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityEndermanChicken entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/enderman_chicken.png");
	}

	public ModelEndermanChicken getMainModel() {
		return (ModelEndermanChicken) super.getMainModel();
	}

	@Override
	public void doRender(EntityEndermanChicken entity, double x, double y, double z, float entityYaw,
			float partialTicks) {
		Random rnd = new Random();
		IBlockState iblockstate = entity.getHeldBlockState();
		ModelEndermanChicken modelenderman = this.getMainModel();
		modelenderman.isCarrying = iblockstate != null;
		modelenderman.isAttacking = entity.isScreaming();
		if (entity.isScreaming()) {
			x += rnd.nextGaussian() * 0.02D;
			z += rnd.nextGaussian() * 0.02D;
		}
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	public static final RenderEndermanChicken.Factory FACTORY = new RenderEndermanChicken.Factory();

	public static class Factory implements IRenderFactory<EntityEndermanChicken> {
		@Override
		public Render<? super EntityEndermanChicken> createRenderFor(RenderManager manager) {
			return new RenderEndermanChicken(manager);
		}
	}
}