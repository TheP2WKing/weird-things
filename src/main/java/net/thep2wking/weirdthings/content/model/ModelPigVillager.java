package net.thep2wking.weirdthings.content.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPigVillager extends ModelVillager {
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leftArm;
    public ModelRenderer rightArm;
    public ModelRenderer nose;
    public int heldItemLeft;
    public int heldItemRight;
    public boolean isSneak;
    public boolean aimedBow;
    protected float field_78145_g = 8.0f;
    protected float field_78151_h = 4.0f;

	public ModelPigVillager() {
		super(0);
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head.setRotationPoint(0.0f, 2.0f, 1.0f);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.head.setTextureOffset(16, 16).addBox(-2.0f, -4.0f, -5.0f, 4, 3, 1);
        this.body = new ModelRenderer((ModelBase)this, 28, 8);
        this.body.addBox(-5.0f, -10.0f, -7.0f, 10, 16, 8);
        this.body.setRotationPoint(0.0f, 12.0f, 4.0f);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.leg1 = new ModelRenderer((ModelBase)this, 0, 16);
        this.leg1.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
        this.leg1.setRotationPoint(-3.0f, 18.0f, 1.0f);
        this.leg1.setTextureSize(64, 32);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, 0.0f, 0.0f, 0.0f);
        this.leg2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.leg2.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
        this.leg2.setRotationPoint(3.0f, 18.0f, 1.0f);
        this.leg2.setTextureSize(64, 32);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, 0.0f, 0.0f, 0.0f);
        this.leftArm = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftArm.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.leftArm.setRotationPoint(-7.0f, 2.0f, 0.0f);
        this.leftArm.setTextureSize(64, 32);
        this.leftArm.mirror = true;
        this.setRotation(this.leftArm, 0.0f, 0.0f, 0.0f);
        this.rightArm = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightArm.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.rightArm.setRotationPoint(7.0f, 2.0f, 0.0f);
        this.rightArm.setTextureSize(64, 32);
        this.rightArm.mirror = true;
        this.setRotation(this.rightArm, 0.0f, 0.0f, 0.0f);
        this.nose = new ModelRenderer((ModelBase)this, 16, 16);
        this.nose.addBox(-2.0f, -4.0f, -5.0f, 4, 3, 1);
        this.nose.setRotationPoint(0.0f, 2.0f, 1.0f);
        this.nose.setTextureSize(64, 32);
        this.nose.mirror = true;
        this.setRotation(this.nose, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(this.field_78145_g * f6), (float)(this.field_78151_h * f5));
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f5), (float)0.0f);
            this.body.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.leftArm.render(f5);
            this.rightArm.render(f5);
            this.nose.render(f5);
            this.head.render(f5);
            GL11.glPopMatrix();
        } else {
            this.head.render(f5);
            this.body.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.leftArm.render(f5);
            this.rightArm.render(f5);
            this.nose.render(f5);
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
        this.nose.rotateAngleX = par5 / 57.295776f;
        this.nose.rotateAngleY = par4 / 57.295776f;
        this.leg1.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leg2.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        this.leftArm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        this.rightArm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
	}
}