package net.thep2wking.weirdthings.util.render.crossyroadchicken;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCrossyRoadChicken extends ModelChicken {
    ModelRenderer head;
    ModelRenderer hair;
    ModelRenderer mouth1;
    ModelRenderer mouth2;
    ModelRenderer body;
    ModelRenderer butt;
    ModelRenderer rleg;
    ModelRenderer rfeet;
    ModelRenderer lfeet;
    ModelRenderer lleg;
    ModelRenderer rtoe1;
    ModelRenderer rtoe2;
    ModelRenderer ltoe1;
    ModelRenderer ltoe2;
    ModelRenderer leftchickenwing;
    ModelRenderer rightchickenwing;
    protected float field_78145_g = 8.0f;
    protected float field_78151_h = 4.0f;

    public ModelCrossyRoadChicken() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer((ModelBase)this, 0, 1);
        this.head.addBox(-3.0f, -8.0f, -3.0f, 6, 8, 6);
        this.head.setRotationPoint(0.0f, 14.0f, -1.0f);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.hair = new ModelRenderer((ModelBase)this, 20, 0);
        this.hair.addBox(-1.0f, -1.0f, -2.0f, 2, 2, 4);
        this.hair.setRotationPoint(0.0f, 5.0f, -1.5f);
        this.hair.setTextureSize(64, 32);
        this.hair.mirror = true;
        this.setRotation(this.hair, 0.0f, 0.0f, 0.0f);
        this.mouth1 = new ModelRenderer((ModelBase)this, 24, 10);
        this.mouth1.addBox(-1.0f, -1.0f, -1.5f, 2, 2, 3);
        this.mouth1.setRotationPoint(0.0f, 9.0f, -5.0f);
        this.mouth1.setTextureSize(64, 32);
        this.mouth1.mirror = true;
        this.setRotation(this.mouth1, 0.0f, 0.0f, 0.0f);
        this.mouth2 = new ModelRenderer((ModelBase)this, 22, 2);
        this.mouth2.addBox(-1.0f, -1.0f, -1.0f, 2, 2, 2);
        this.mouth2.setRotationPoint(0.0f, 11.0f, -5.0f);
        this.mouth2.setTextureSize(64, 32);
        this.mouth2.mirror = true;
        this.setRotation(this.mouth2, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 0, 18);
        this.body.addBox(-3.0f, -2.0f, -4.0f, 6, 5, 9);
        this.body.setRotationPoint(0.0f, 16.0f, 0.0f);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.butt = new ModelRenderer((ModelBase)this, 21, 18);
        this.butt.addBox(-2.0f, -1.5f, 5.0f, 4, 5, 1);
        this.butt.setRotationPoint(0.0f, 15.5f, 0.0f);
        this.butt.setTextureSize(64, 32);
        this.butt.mirror = true;
        this.setRotation(this.butt, 0.0f, 0.0f, 0.0f);
        this.rleg = new ModelRenderer((ModelBase)this, 44, 0);
        this.rleg.addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.rleg.setRotationPoint(-3.0f, 19.0f, -1.0f);
        this.rleg.setTextureSize(64, 32);
        this.rleg.mirror = true;
        this.setRotation(this.rleg, 0.0f, 0.0f, 0.0f);
        this.rfeet = new ModelRenderer((ModelBase)this, 44, 0);
        this.rfeet.addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.rfeet.setRotationPoint(-1.0f, 4.0f, -2.0f);
        this.rfeet.setTextureSize(64, 32);
        this.rfeet.mirror = true;
        this.setRotation(this.rfeet, 0.0f, 0.0f, 0.0f);
        this.lfeet = new ModelRenderer((ModelBase)this, 44, 0);
        this.lfeet.addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.lfeet.setRotationPoint(-1.0f, 4.0f, -2.0f);
        this.lfeet.setTextureSize(64, 32);
        this.lfeet.mirror = true;
        this.setRotation(this.lfeet, 0.0f, 0.0f, 0.0f);
        this.lleg = new ModelRenderer((ModelBase)this, 44, 0);
        this.lleg.addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
        this.lleg.setRotationPoint(2.0f, 19.0f, -1.0f);
        this.lleg.setTextureSize(64, 32);
        this.lleg.mirror = true;
        this.setRotation(this.lleg, 0.0f, 0.0f, 0.0f);
        this.rtoe1 = new ModelRenderer((ModelBase)this, 44, 0);
        this.rtoe1.addBox(0.0f, 0.0f, -2.0f, 1, 1, 2);
        this.rtoe1.setRotationPoint(-1.0f, 4.0f, -2.0f);
        this.rtoe1.setTextureSize(64, 32);
        this.rtoe1.mirror = true;
        this.setRotation(this.rtoe1, 0.0f, 0.0f, 0.0f);
        this.rtoe2 = new ModelRenderer((ModelBase)this, 44, 0);
        this.rtoe2.addBox(0.0f, 0.0f, -2.0f, 1, 1, 2);
        this.rtoe2.setRotationPoint(1.0f, 4.0f, -2.0f);
        this.rtoe2.setTextureSize(64, 32);
        this.rtoe2.mirror = true;
        this.setRotation(this.rtoe2, 0.0f, 0.0f, 0.0f);
        this.ltoe1 = new ModelRenderer((ModelBase)this, 44, 0);
        this.ltoe1.addBox(0.0f, 0.0f, -2.0f, 1, 1, 2);
        this.ltoe1.setRotationPoint(-1.0f, 4.0f, -2.0f);
        this.ltoe1.setTextureSize(64, 32);
        this.ltoe1.mirror = true;
        this.setRotation(this.ltoe1, 0.0f, 0.0f, 0.0f);
        this.ltoe2 = new ModelRenderer((ModelBase)this, 44, 0);
        this.ltoe2.addBox(0.0f, 0.0f, -2.0f, 1, 1, 2);
        this.ltoe2.setRotationPoint(1.0f, 4.0f, -2.0f);
        this.ltoe2.setTextureSize(64, 32);
        this.ltoe2.mirror = true;
        this.setRotation(this.ltoe2, 0.0f, 0.0f, 0.0f);
        this.leftchickenwing = new ModelRenderer((ModelBase)this, 5, 22);
        this.leftchickenwing.addBox(0.0f, 0.0f, -2.5f, 2, 3, 5);
        this.leftchickenwing.setRotationPoint(3.0f, 15.0f, 0.0f);
        this.leftchickenwing.setTextureSize(64, 32);
        this.leftchickenwing.mirror = true;
        this.setRotation(this.leftchickenwing, 0.0f, 0.0f, 0.0f);
        this.rightchickenwing = new ModelRenderer((ModelBase)this, 5, 22);
        this.rightchickenwing.addBox(-2.0f, 0.0f, -2.5f, 2, 3, 5);
        this.rightchickenwing.setRotationPoint(-3.0f, 15.0f, 0.0f);
        this.rightchickenwing.setTextureSize(64, 32);
        this.rightchickenwing.mirror = true;
        this.setRotation(this.rightchickenwing, 0.0f, 0.0f, 0.0f);
        rleg.addChild(rtoe1);
        rleg.addChild(rtoe2);
        rleg.addChild(rfeet);

        lleg.addChild(ltoe1);
        lleg.addChild(ltoe2);
        lleg.addChild(lfeet);
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
            this.head.render(f5);
            this.hair.render(f5);
            this.mouth1.render(f5);
            this.mouth2.render(f5);
            this.body.render(f5);
            this.butt.render(f5);
            this.rleg.render(f5);
            // this.rfeet.render(f5);
            // this.lfeet.render(f5);
            this.lleg.render(f5);
            // this.rtoe1.render(f5);
            // this.rtoe2.render(f5);
            // this.ltoe1.render(f5);
            // this.ltoe2.render(f5);
            this.leftchickenwing.render(f5);
            this.rightchickenwing.render(f5);
            GL11.glPopMatrix();
        } else {
            this.head.render(f5);
            this.hair.render(f5);
            this.mouth1.render(f5);
            this.mouth2.render(f5);
            this.body.render(f5);
            this.butt.render(f5);
            this.rleg.render(f5);
            // this.rfeet.render(f5);
            // this.lfeet.render(f5);
            this.lleg.render(f5);
            // this.rtoe1.render(f5);
            // this.rtoe2.render(f5);
            // this.ltoe1.render(f5);
            // this.ltoe2.render(f5);
            this.leftchickenwing.render(f5);
            this.rightchickenwing.render(f5);
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
                this.rleg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
                this.lleg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
                this.rightchickenwing.rotateAngleZ = par3;
                this.leftchickenwing.rotateAngleZ = -par3;
    }
}