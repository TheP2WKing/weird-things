package net.thep2wking.weirdthings.util.render.rapig;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRabbit;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class ModelRapig extends ModelRabbit {
    public float field_178701_m = 0.0f;
    ModelRenderer rabbitLeftFoot;
    ModelRenderer rabbitRightFoot;
    ModelRenderer rabbitLeftThigh;
    ModelRenderer rabbitRightThigh;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer head;
    ModelRenderer nose;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public ModelRapig() {
        super();
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rabbitLeftFoot = new ModelRenderer((ModelBase) this, 0, 35);
        this.rabbitLeftFoot.addBox(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.rabbitLeftFoot.setRotationPoint(3.0f, 17.5f, 3.7f);
        this.rabbitLeftFoot.setTextureSize(128, 64);
        this.rabbitLeftFoot.mirror = true;
        this.setRotation(this.rabbitLeftFoot, 0.0f, 0.0f, 0.0f);
        this.rabbitRightFoot = new ModelRenderer((ModelBase) this, 0, 35);
        this.rabbitRightFoot.addBox(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.rabbitRightFoot.setRotationPoint(-3.0f, 17.5f, 3.7f);
        this.rabbitRightFoot.setTextureSize(128, 64);
        this.setRotation(this.rabbitRightFoot, 0.0f, 0.0f, 0.0f);
        this.rabbitRightFoot.mirror = true;
        this.rabbitLeftThigh = new ModelRenderer((ModelBase) this, 0, 26);
        this.rabbitLeftThigh.addBox(-1.0f, -1.0f, 0.0f, 2, 4, 5);
        this.rabbitLeftThigh.setRotationPoint(-3.0f, 17.5f, 3.7f);
        this.rabbitLeftThigh.setTextureSize(128, 64);
        this.rabbitLeftThigh.mirror = true;
        this.setRotation(this.rabbitLeftThigh, -0.3490659f, 0.0f, 0.0f);
        this.rabbitRightThigh = new ModelRenderer((ModelBase) this, 0, 26);
        this.rabbitRightThigh.addBox(-1.0f, -1.0f, 0.0f, 2, 4, 5);
        this.rabbitRightThigh.setRotationPoint(3.0f, 17.5f, 3.7f);
        this.rabbitRightThigh.setTextureSize(128, 64);
        this.rabbitRightThigh.mirror = true;
        this.setRotation(this.rabbitRightThigh, -0.3490659f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase) this, 28, 8);
        this.body.addBox(-5.0f, -10.0f, -7.0f, 10, 16, 8);
        this.body.setRotationPoint(0.0f, 10.5f, 5.2f);
        this.body.setTextureSize(128, 64);
        this.body.mirror = true;
        this.setRotation(this.body, 1.22173f, 0.0f, 0.0f);
        this.leg1 = new ModelRenderer((ModelBase) this, 0, 16);
        this.leg1.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
        this.leg1.setRotationPoint(-3.0f, 14.3f, -4.6f);
        this.leg1.setTextureSize(128, 64);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, -0.3490659f, 0.0f, 0.0f);
        this.leg2 = new ModelRenderer((ModelBase) this, 0, 16);
        this.leg2.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
        this.leg2.setRotationPoint(3.0f, 14.3f, -4.6f);
        this.leg2.setTextureSize(128, 64);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, -0.3490659f, 0.0f, 0.0f);
        this.head = new ModelRenderer((ModelBase) this, 0, 0);
        this.head.addBox(-4.0f, -4.0f, -8.0f, 8, 8, 8);
        this.head.setRotationPoint(0.0f, 7.0f, -3.0f);
        this.head.setTextureSize(128, 64);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.nose = new ModelRenderer((ModelBase) this, 16, 16);
        this.nose.addBox(-2.0f, -1.5f, -1.0f, 4, 3, 1);
        this.nose.setRotationPoint(0.0f, 1.5f, -8.0f);
        this.nose.setTextureSize(128, 64);
        this.nose.mirror = true;
        this.setRotation(this.nose, 0.0f, 0.0f, 0.0f);
        this.head.addChild(this.nose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.56666666F, 0.56666666F, 0.56666666F);
            GlStateManager.translate(0.0F, 1.35, 0.0F);
            this.rabbitLeftThigh.render(f5);
            this.rabbitRightThigh.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.head.render(f5);
            this.body.render(f5);
            GlStateManager.popMatrix();
        } else {
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 3.35F * f5, 0.0F);
            this.rabbitLeftThigh.render(f5);
            this.rabbitRightThigh.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.head.render(f5);
            this.body.render(f5);
            GlStateManager.popMatrix();
        }
    }

    public void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,
            Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        this.head.rotateAngleX = par5 / 57.295776f;
        this.head.rotateAngleY = par4 / 57.295776f;
        this.leg1.rotateAngleX = MathHelper.cos((float) (par2 * 0.6662f)) * 1.4f * par2;
        this.leg2.rotateAngleX = MathHelper.cos((float) (par2 * 0.6662f)) * 1.4f * par2;
        this.rabbitLeftThigh.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.rabbitRightThigh.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount,
            float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
    }
}