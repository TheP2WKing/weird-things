package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityPigVillager;
import net.thep2wking.weirdthings.content.model.ModelPigVillager;

@SideOnly(Side.CLIENT)
public class RenderPigVillager extends RenderLiving<EntityPigVillager> {
	public RenderPigVillager(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPigVillager(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityPigVillager entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/pig_villager.png");
	}

	public static final RenderPigVillager.Factory FACTORY = new RenderPigVillager.Factory();

	public static class Factory implements IRenderFactory<EntityPigVillager> {
		@Override
		public Render<? super EntityPigVillager> createRenderFor(RenderManager manager) {
			return new RenderPigVillager(manager);
		}
	}
}