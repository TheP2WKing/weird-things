package net.thep2wking.weirdthings.content.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelVillagerPig extends ModelPig {
    ModelRenderer head;
    ModelRenderer nose;
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer leg4;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public ModelVillagerPig() {
        super();
        textureWidth = 64;
        textureHeight = 64;
        this.head = new ModelRenderer((ModelBase) this, 0, 32);
        this.head.addBox(-4.0F, -6.0F, -8.0F, 8, 10, 8);
        this.head.setRotationPoint(0.0F, (float) (18 - 6), -6.0F);
        this.nose = new ModelRenderer((ModelBase) this, 24, 32);
        this.nose.addBox(-1.0f, 1.0f, -10.0f, 2, 4, 2);
        this.nose.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.head.addChild(this.nose);
        this.body = new ModelRenderer(this, 28, 8);
        this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, 0);
        this.body.setRotationPoint(0.0F, (float) (17 - 6), 2.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0);
        this.leg1.setRotationPoint(-3.0F, (float) (24 - 6), 7.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0);
        this.leg2.setRotationPoint(3.0F, (float) (24 - 6), 7.0F);
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0);
        this.leg3.setRotationPoint(-3.0F, (float) (24 - 6), -5.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0);
        this.leg4.setRotationPoint(3.0F, (float) (24 - 6), -5.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 4 * f5, this.childZOffset * f5);
            this.head.render(f5);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
            this.body.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.leg3.render(f5);
            this.leg4.render(f5);
            GlStateManager.popMatrix();
        } else {
            this.head.render(f5);
            this.body.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.leg3.render(f5);
            this.leg4.render(f5);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
            float headPitch, float f5Factor, Entity entityIn) {
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.body.rotateAngleX = ((float) Math.PI / 2F);
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}