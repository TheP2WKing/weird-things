package net.thep2wking.weirdthings.content.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelVeryWeirdPig extends ModelPig {
    private ModelRenderer body;
    private ModelRenderer rightArm;
    private ModelRenderer head;
    private ModelRenderer leftArm;
    private ModelRenderer np1;
    private ModelRenderer np2;
    private ModelRenderer np3;
    private ModelRenderer np4;
    private ModelRenderer np5;
    private ModelRenderer np6;
    private ModelRenderer rightLeg;
    private ModelRenderer leftLeg;
    private ModelRenderer leftLeg2;
    private ModelRenderer rightLeg2;
    private ModelRenderer rightLeg3;
    private ModelRenderer rightLeg4;
    private ModelRenderer leftLeg3;
    private ModelRenderer leftLeg4;
    protected float field_78145_g = 8.0f;
    protected float field_78151_h = 4.0f;

    public ModelVeryWeirdPig() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 24, 6);
        this.body.addBox(0.0f, 0.0f, 0.0f, 10, 16, 10);
        this.body.setRotationPoint(-5.0f, -8.0f, -6.0f);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.rightArm = new ModelRenderer(this, 0, 21);
        this.rightArm.addBox(-0.5f, -0.5f, -10.0f, 1, 1, 10);
        this.rightArm.setRotationPoint(-5.5f, -3.5f, -2.0f);
        this.rightArm.setTextureSize(64, 32);
        this.rightArm.mirror = true;
        this.setRotation(this.rightArm, 0.0f, 0.0f, 0.0f);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0f, -8.0f, -8.0f, 8, 8, 8);
        this.head.setRotationPoint(0.0f, -5.0f, -3.0f);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.leftArm = new ModelRenderer(this, 0, 21);
        this.leftArm.addBox(-0.5f, -0.5f, -10.0f, 1, 1, 10);
        this.leftArm.setRotationPoint(5.5f, -3.5f, -2.0f);
        this.leftArm.setTextureSize(64, 32);
        this.leftArm.mirror = true;
        this.setRotation(this.leftArm, 0.0f, 0.0f, 0.0f);
        this.np1 = new ModelRenderer(this, 0, 0);
        this.np1.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1);
        this.np1.setRotationPoint(-1.5f, -2.5f, -6.5f);
        this.np1.setTextureSize(64, 32);
        this.np1.mirror = true;
        this.setRotation(this.np1, 0.0f, 0.0f, 0.0f);
        this.np2 = new ModelRenderer(this, 4, 0);
        this.np2.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1);
        this.np2.setRotationPoint(1.5f, -2.5f, -6.5f);
        this.np2.setTextureSize(64, 32);
        this.np2.mirror = true;
        this.setRotation(this.np2, 0.0f, 0.0f, 0.0f);
        this.np3 = new ModelRenderer(this, 0, 2);
        this.np3.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1);
        this.np3.setRotationPoint(-1.5f, 0.5f, -6.5f);
        this.np3.setTextureSize(64, 32);
        this.np3.mirror = true;
        this.setRotation(this.np3, 0.0f, 0.0f, 0.0f);
        this.np4 = new ModelRenderer(this, 4, 2);
        this.np4.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1);
        this.np4.setRotationPoint(1.5f, 0.5f, -6.5f);
        this.np4.setTextureSize(64, 32);
        this.np4.mirror = true;
        this.setRotation(this.np4, 0.0f, 0.0f, 0.0f);
        this.np5 = new ModelRenderer(this, 0, 4);
        this.np5.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1);
        this.np5.setRotationPoint(-1.5f, 3.5f, -6.5f);
        this.np5.setTextureSize(64, 32);
        this.np5.mirror = true;
        this.setRotation(this.np5, 0.0f, 0.0f, 0.0f);
        this.np6 = new ModelRenderer(this, 4, 4);
        this.np6.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1);
        this.np6.setRotationPoint(1.5f, 3.5f, -6.5f);
        this.np6.setTextureSize(64, 32);
        this.np6.mirror = true;
        this.setRotation(this.np6, 0.0f, 0.0f, 0.0f);
        this.rightLeg = new ModelRenderer(this, 0, 16);
        this.rightLeg.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.rightLeg.setRotationPoint(-5.0f, 8.0f, -6.0f);
        this.rightLeg.setTextureSize(64, 32);
        this.rightLeg.mirror = true;
        this.setRotation(this.rightLeg, -0.6108652f, 0.0f, 0.6108652f);
        this.leftLeg = new ModelRenderer(this, 0, 16);
        this.leftLeg.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.leftLeg.setRotationPoint(4.0f, 8.0f, -6.0f);
        this.leftLeg.setTextureSize(64, 32);
        this.leftLeg.mirror = true;
        this.setRotation(this.leftLeg, -0.6108652f, 0.0f, -0.6108652f);
        this.leftLeg2 = new ModelRenderer(this, 0, 16);
        this.leftLeg2.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.leftLeg2.setRotationPoint(4.0f, 8.0f, 3.0f);
        this.leftLeg2.setTextureSize(64, 32);
        this.leftLeg2.mirror = true;
        this.setRotation(this.leftLeg2, 0.6108652f, 0.0f, -0.6108652f);
        this.rightLeg2 = new ModelRenderer(this, 0, 16);
        this.rightLeg2.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.rightLeg2.setRotationPoint(-5.0f, 8.0f, 3.0f);
        this.rightLeg2.setTextureSize(64, 32);
        this.rightLeg2.mirror = true;
        this.setRotation(this.rightLeg2, 0.6108652f, 0.0f, 0.6108652f);
        this.rightLeg3 = new ModelRenderer(this, 4, 16);
        this.rightLeg3.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.rightLeg3.setRotationPoint(-9.0f, 14.0f, -6.0f);
        this.rightLeg3.setTextureSize(64, 32);
        this.rightLeg3.mirror = true;
        this.setRotation(this.rightLeg3, -0.3054326f, 0.0f, 0.3054326f);
        this.rightLeg4 = new ModelRenderer(this, 4, 16);
        this.rightLeg4.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.rightLeg4.setRotationPoint(-9.0f, 14.0f, 3.0f);
        this.rightLeg4.setTextureSize(64, 32);
        this.rightLeg4.mirror = true;
        this.setRotation(this.rightLeg4, 0.3054326f, 0.0f, 0.3054326f);
        this.leftLeg3 = new ModelRenderer(this, 4, 16);
        this.leftLeg3.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.leftLeg3.setRotationPoint(8.0f, 14.0f, -6.0f);
        this.leftLeg3.setTextureSize(64, 32);
        this.leftLeg3.mirror = true;
        this.setRotation(this.leftLeg3, -0.3054326f, 0.0f, -0.3054326f);
        this.leftLeg4 = new ModelRenderer(this, 4, 16);
        this.leftLeg4.addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.leftLeg4.setRotationPoint(8.0f, 14.0f, 3.0f);
        this.leftLeg4.setTextureSize(64, 32);
        this.leftLeg4.mirror = true;
        this.setRotation(this.leftLeg4, 0.3054326f, 0.0f, -0.3054326f);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(this.field_78145_g * f5), (float)(this.field_78151_h * f5));
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f5), (float)0.0f);
            this.body.render(f5);
            this.rightArm.render(f5);
            this.head.render(f5);
            this.leftArm.render(f5);
            this.np1.render(f5);
            this.np2.render(f5);
            this.np3.render(f5);
            this.np4.render(f5);
            this.np5.render(f5);
            this.np6.render(f5);
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.leftLeg2.render(f5);
            this.rightLeg2.render(f5);
            this.rightLeg3.render(f5);
            this.rightLeg4.render(f5);
            this.leftLeg3.render(f5);
            this.leftLeg4.render(f5);
            GL11.glPopMatrix();
        } else {
            this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            this.body.render(f5);
            this.rightArm.render(f5);
            this.head.render(f5);
            this.leftArm.render(f5);
            this.np1.render(f5);
            this.np2.render(f5);
            this.np3.render(f5);
            this.np4.render(f5);
            this.np5.render(f5);
            this.np6.render(f5);
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.leftLeg2.render(f5);
            this.rightLeg2.render(f5);
            this.rightLeg3.render(f5);
            this.rightLeg4.render(f5);
            this.leftLeg3.render(f5);
            this.leftLeg4.render(f5);
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
        this.np1.rotateAngleX = 1.5707964f;
        this.np1.rotateAngleZ = par3;
        this.np2.rotateAngleX = 1.5707964f;
        this.np2.rotateAngleZ = par3;
        this.np3.rotateAngleX = 1.5707964f;
        this.np3.rotateAngleZ = par3;
        this.np4.rotateAngleX = 1.5707964f;
        this.np4.rotateAngleZ = par3;
        this.np5.rotateAngleX = 1.5707964f;
        this.np5.rotateAngleZ = par3;
        this.np6.rotateAngleX = 1.5707964f;
        this.np6.rotateAngleZ = par3;
        this.rightArm.rotateAngleX = par3;
        this.leftArm.rotateAngleX = par3;
        this.rightLeg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.rightLeg2.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.rightLeg3.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.rightLeg4.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leftLeg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leftLeg2.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leftLeg3.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leftLeg4.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
    }
}