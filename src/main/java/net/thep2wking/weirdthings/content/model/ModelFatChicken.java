package net.thep2wking.weirdthings.content.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelFatChicken extends ModelChicken {
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer chin;
    ModelRenderer mouth;
    ModelRenderer rleg;
    ModelRenderer lleg;
    ModelRenderer lwing;
    ModelRenderer rwing;
    protected float field_78145_g = 8.0f;
    protected float field_78151_h = 4.0f;

    public ModelFatChicken() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new ModelRenderer((ModelBase) this, 0, 32);
        this.body.addBox(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.body.setRotationPoint(0.0f, 11.0f, 0.0f);
        this.body.setTextureSize(64, 64);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.head = new ModelRenderer((ModelBase) this, 0, 0);
        this.head.addBox(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.head.setRotationPoint(0.0f, 5.0f, -8.0f);
        this.mouth = new ModelRenderer((ModelBase) this, 14, 0);
        this.mouth.addBox(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.mouth.setRotationPoint(0.0f, 5.0f, -8.0f);
        this.chin = new ModelRenderer((ModelBase) this, 14, 4);
        this.chin.addBox(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.chin.setRotationPoint(0.0f, 5.0f, -8.0f);
        this.rleg = new ModelRenderer((ModelBase) this, 26, 0);
        this.rleg.addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
        this.rleg.setRotationPoint(-1.5f, 19.0f, 0.0f);
        this.rleg.setTextureSize(64, 64);
        this.rleg.mirror = true;
        this.setRotation(this.rleg, 0.0f, 0.0f, 0.0f);
        this.lleg = new ModelRenderer((ModelBase) this, 26, 0);
        this.lleg.addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
        this.lleg.setRotationPoint(1.5f, 19.0f, 0.0f);
        this.lleg.setTextureSize(64, 64);
        this.lleg.mirror = true;
        this.setRotation(this.lleg, 0.0f, 0.0f, 0.0f);
        this.lwing = new ModelRenderer((ModelBase) this, 0, 9);
        this.lwing.addBox(-0.5f, 0.0f, -3.0f, 1, 4, 6);
        this.lwing.setRotationPoint(8.5f, 3.0f, 0.0f);
        this.lwing.setTextureSize(64, 64);
        this.lwing.mirror = true;
        this.setRotation(this.lwing, 0.0f, 0.0f, 0.0f);
        this.rwing = new ModelRenderer((ModelBase) this, 0, 9);
        this.rwing.addBox(-0.5f, 0.0f, -3.0f, 1, 4, 6);
        this.rwing.setRotationPoint(-8.5f, 3.0f, 0.0f);
        this.rwing.setTextureSize(64, 64);
        this.rwing.mirror = true;
        this.setRotation(this.rwing, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float) 0.0f, (float) (this.field_78145_g * f5), (float) (this.field_78151_h * f5));
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float) (1.0f / f6), (float) (1.0f / f6), (float) (1.0f / f6));
            GL11.glTranslatef((float) 0.0f, (float) (24.0f * f5), (float) 0.0f);
            super.render(entity, f, f1, f2, f3, f4, f5);
            this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            this.body.render(f5);
            this.head.render(f5);
            this.chin.render(f5);
            this.mouth.render(f5);
            this.rleg.render(f5);
            this.lleg.render(f5);
            this.lwing.render(f5);
            this.rwing.render(f5);
            GL11.glPopMatrix();
        } else {
            this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            this.body.render(f5);
            this.head.render(f5);
            this.chin.render(f5);
            this.mouth.render(f5);
            this.rleg.render(f5);
            this.lleg.render(f5);
            this.lwing.render(f5);
            this.rwing.render(f5);
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
        this.rleg.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.lleg.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f + (float) Math.PI)) * 1.4f * par2;
        this.rwing.rotateAngleZ = par3;
        this.lwing.rotateAngleZ = -par3;
        this.head.rotateAngleX = par5 / 57.295776f;
        this.head.rotateAngleY = par4 / 57.295776f;
        this.mouth.rotateAngleX = this.head.rotateAngleX;
        this.mouth.rotateAngleY = this.head.rotateAngleY;
        this.chin.rotateAngleX = this.head.rotateAngleX;
        this.chin.rotateAngleY = this.head.rotateAngleY;
    }
}