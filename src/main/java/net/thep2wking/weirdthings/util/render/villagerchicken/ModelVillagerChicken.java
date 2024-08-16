package net.thep2wking.weirdthings.util.render.villagerchicken;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelVillagerChicken extends ModelChicken {
    ModelRenderer rightLeg;
    ModelRenderer leftLeg;
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer rightWing;
    ModelRenderer leftWing;
    ModelRenderer nose;

	public ModelVillagerChicken() {
		this.textureWidth = 64;
        this.textureHeight = 32;
        this.rightLeg = new ModelRenderer((ModelBase)this, 52, 0);
        this.rightLeg.addBox(0.0f, 0.0f, 0.0f, 3, 5, 3);
        this.rightLeg.setRotationPoint(-3.0f, 19.0f, 1.0f);
        this.rightLeg.setTextureSize(64, 32);
        this.setRotation(this.rightLeg, 0.0f, 0.0f, 0.0f);
        this.leftLeg = new ModelRenderer((ModelBase)this, 52, 0);
        this.leftLeg.addBox(0.0f, 0.0f, 0.0f, 3, 5, 3);
        this.leftLeg.setRotationPoint(0.0f, 19.0f, 1.0f);
        this.leftLeg.setTextureSize(64, 32);
        this.setRotation(this.leftLeg, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 0, 18);
        this.body.addBox(0.0f, 0.0f, 0.0f, 6, 8, 6);
        this.body.setRotationPoint(-3.0f, 19.0f, -4.0f);
        this.body.setTextureSize(64, 32);
        this.setRotation(this.body, -1.570796f, 0.0f, 0.0f);
        this.rightWing = new ModelRenderer((ModelBase)this, 24, 22);
        this.rightWing.addBox(0.0f, 0.0f, 0.0f, 1, 4, 6);
        this.rightWing.setRotationPoint(-4.0f, 13.0f, -3.0f);
        this.rightWing.setTextureSize(64, 32);
        this.setRotation(this.rightWing, 0.0f, 0.0f, 0.0f);
        this.leftWing = new ModelRenderer((ModelBase)this, 24, 22);
        this.leftWing.addBox(0.0f, 0.0f, 0.0f, 1, 4, 6);
        this.leftWing.setRotationPoint(3.0f, 13.0f, -3.0f);
        this.leftWing.setTextureSize(64, 32);
        this.setRotation(this.leftWing, 0.0f, 0.0f, 0.0f);
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -10.0f, -4.0f, 8, 10, 8);
        this.head.setRotationPoint(0.0f, 15.0f, -7.0f);
        this.head.setTextureSize(64, 32);
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.nose = new ModelRenderer((ModelBase)this, 24, 0);
        this.nose.addBox(-1.0f, -3.0f, -6.0f, 2, 4, 2);
        this.nose.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.nose.setTextureSize(64, 32);
        this.setRotation(this.nose, 0.0f, 0.0f, 0.0f);
        this.head.addChild(this.nose);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(5.0f * f5), (float)(2.0f * f5));
            this.head.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f5), (float)0.0f);
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.body.render(f5);
            this.rightWing.render(f5);
            this.leftWing.render(f5);
            GL11.glPopMatrix();
        } else {
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.body.render(f5);
            this.head.render(f5);
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
        this.head.rotateAngleX = par5 / 57.295776f;
        this.head.rotateAngleY = par3 / 57.295776f;
        this.body.rotateAngleX = 1.5707964f;
        this.rightLeg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leftLeg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        this.rightWing.rotateAngleZ = par3;
        this.leftWing.rotateAngleZ = -par3;
	}
}