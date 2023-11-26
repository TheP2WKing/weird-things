package net.thep2wking.weirdthings.util.layer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityBattleSheep;
import net.thep2wking.weirdthings.content.model.ModelBattleSheep1;
import net.thep2wking.weirdthings.util.render.RenderBattleSheep;

@SideOnly(Side.CLIENT)
public class LayerBattleSheepWool implements LayerRenderer<EntityBattleSheep> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(WeirdThings.MODID, "textures/entity/battle_sheep_fur.png");
    private final RenderBattleSheep sheepRenderer;
    private final ModelBattleSheep1 sheepModel = new ModelBattleSheep1();

    public LayerBattleSheepWool(RenderBattleSheep sheepRendererIn) {
        this.sheepRenderer = sheepRendererIn;
    }

    @Override
    public void doRenderLayer(EntityBattleSheep entitylivingbaseIn, float limbSwing, float limbSwingAmount,
            float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (!entitylivingbaseIn.isInvisible()) {
            this.sheepRenderer.bindTexture(TEXTURE);
                int i = entitylivingbaseIn.ticksExisted / 25 + entitylivingbaseIn.getEntityId();
                int j = EnumDyeColor.values().length;
                int k = i % j;
                int l = (i + 1) % j;
                float f = ((float) (entitylivingbaseIn.ticksExisted % 25) + partialTicks) / 25.0F;
                float[] afloat1 = EntityBattleSheep.getDyeRgb(EnumDyeColor.byMetadata(k));
                float[] afloat2 = EntityBattleSheep.getDyeRgb(EnumDyeColor.byMetadata(l));
                GlStateManager.color(afloat1[0] * (1.0F - f) + afloat2[0] * f, afloat1[1] * (1.0F - f) + afloat2[1] * f,
                        afloat1[2] * (1.0F - f) + afloat2[2] * f);
            // } else {
            //     float[] afloat = EntityBattleSheep.getDyeRgb(entitylivingbaseIn.getFleeceColor());
            //     GlStateManager.color(afloat[0], afloat[1], afloat[2]);
            // }
            this.sheepModel.setModelAttributes(this.sheepRenderer.getMainModel());
            this.sheepModel.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
            this.sheepModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,
                    scale);
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
}