package net.thep2wking.weirdthings.util.render.chickenghast;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelGhast;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelChickenGhast extends ModelGhast {
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer rightLeg;
    public ModelRenderer leftLeg;
    public ModelRenderer rightWing;
    public ModelRenderer leftWing;
    public ModelRenderer bill;
    public ModelRenderer chin;

    public ModelChickenGhast() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        int b0 = 16;
        this.head = new ModelRenderer((ModelBase) this, 0, 0);
        this.head.addBox(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.head.setRotationPoint(0.0f, (float) (-1 + b0), -4.0f);
        this.bill = new ModelRenderer((ModelBase) this, 14, 0);
        this.bill.addBox(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.bill.setRotationPoint(0.0f, (float) (-1 + b0), -4.0f);
        this.chin = new ModelRenderer((ModelBase) this, 14, 4);
        this.chin.addBox(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.chin.setRotationPoint(0.0f, (float) (-1 + b0), -4.0f);
        this.body = new ModelRenderer((ModelBase) this, 0, 9);
        this.body.addBox(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.body.setRotationPoint(0.0f, (float) b0, 0.0f);
        this.rightLeg = new ModelRenderer((ModelBase) this, 26, 0);
        this.rightLeg.addBox(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.rightLeg.setRotationPoint(-2.0f, (float) (3 + b0), 1.0f);
        this.leftLeg = new ModelRenderer((ModelBase) this, 26, 0);
        this.leftLeg.addBox(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.leftLeg.setRotationPoint(1.0f, (float) (3 + b0), 1.0f);
        this.rightWing = new ModelRenderer((ModelBase) this, 24, 13);
        this.rightWing.addBox(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.rightWing.setRotationPoint(-4.0f, (float) (-3 + b0), 0.0f);
        this.leftWing = new ModelRenderer((ModelBase) this, 24, 13);
        this.leftWing.addBox(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.leftWing.setRotationPoint(4.0f, (float) (-3 + b0), 0.0f);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float) 0.0f, (float) (5.0f * f5), (float) (2.0f * f5));
            this.head.render(f5);
            this.bill.render(f5);
            this.chin.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float) (1.0f / f6), (float) (1.0f / f6), (float) (1.0f / f6));
            GL11.glTranslatef((float) 0.0f, (float) (24.0f * f5), (float) 0.0f);
            this.body.render(f5);
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.rightWing.render(f5);
            this.leftWing.render(f5);
            GL11.glPopMatrix();
        } else {
            this.head.render(f5);
            this.bill.render(f5);
            this.chin.render(f5);
            this.body.render(f5);
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.rightWing.render(f5);
            this.leftWing.render(f5);
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
        this.bill.rotateAngleX = this.head.rotateAngleX;
        this.bill.rotateAngleY = this.head.rotateAngleY;
        this.chin.rotateAngleX = this.head.rotateAngleX;
        this.chin.rotateAngleY = this.head.rotateAngleY;
        this.body.rotateAngleX = 1.5707964f;
        this.rightLeg.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.leftLeg.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f + (float) Math.PI)) * 1.4f * par2;
        this.rightWing.rotateAngleZ = par3;
        this.leftWing.rotateAngleZ = -par3;
    }
}