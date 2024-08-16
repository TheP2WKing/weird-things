package net.thep2wking.weirdthings.util.render.armedcreeper;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelArmedCreeper extends ModelZombie {
	public ModelRenderer body;
	public ModelRenderer leg1;
	public ModelRenderer leg2;
	public ModelRenderer leg3;
	public ModelRenderer leg4;
	public ModelRenderer field_78133_b;
	public ModelRenderer head;
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedLeftArm;
	public boolean aimedBow;
	public int heldItemRight;

	public ModelArmedCreeper(float p_i1156_1_, boolean p_i1168_2_) {
		textureWidth = 64;
		textureHeight = 32;

		int b0 = 6;
		this.bipedRightArm = new ModelRenderer((ModelBase) this, 40, 16);
		this.bipedRightArm.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, p_i1156_1_);
		this.bipedRightArm.setRotationPoint(-5.0f, 5.0f + p_i1156_1_ + 3, 0.0f);
		this.bipedLeftArm = new ModelRenderer((ModelBase) this, 40, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, p_i1156_1_);
		this.bipedLeftArm.setRotationPoint(5.0f, 5.0f + p_i1156_1_ + 3, 0.0f);
		this.field_78133_b = new ModelRenderer((ModelBase) this, 32, 0);
		this.field_78133_b.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, p_i1156_1_ + 0.5f);
		this.field_78133_b.setRotationPoint(0.0f, (float) b0, 0.0f);
		this.body = new ModelRenderer((ModelBase) this, 16, 16);
		this.body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, p_i1156_1_);
		this.body.setRotationPoint(0.0f, (float) b0, 0.0f);
		this.leg1 = new ModelRenderer((ModelBase) this, 0, 16);
		this.leg1.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, p_i1156_1_);
		this.leg1.setRotationPoint(-2.0f, (float) (12 + b0), 4.0f);
		this.leg2 = new ModelRenderer((ModelBase) this, 0, 16);
		this.leg2.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, p_i1156_1_);
		this.leg2.setRotationPoint(2.0f, (float) (12 + b0), 4.0f);
		this.leg3 = new ModelRenderer((ModelBase) this, 0, 16);
		this.leg3.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, p_i1156_1_);
		this.leg3.setRotationPoint(-2.0f, (float) (12 + b0), -4.0f);
		this.leg4 = new ModelRenderer((ModelBase) this, 0, 16);
		this.leg4.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, p_i1156_1_);
		this.leg4.setRotationPoint(2.0f, (float) (12 + b0), -4.0f);
		this.head = new ModelRenderer((ModelBase) this, 0, 0);
		this.head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, p_i1156_1_);
		this.head.setRotationPoint(0.0f, (float) b0, 0.0f);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.head.render(f5);
		this.body.render(f5);
		this.leg1.render(f5);
		this.leg2.render(f5);
		this.leg3.render(f5);
		this.leg4.render(f5);
		this.bipedLeftArm.render(f5);
		this.bipedRightArm.render(f5);
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
		this.head.rotateAngleY = par4 / 57.295776f;
		this.head.rotateAngleX = par5 / 57.295776f;
		this.leg1.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
		this.leg2.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f + (float) Math.PI)) * 1.4f * par2;
		this.leg3.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f + (float) Math.PI)) * 1.4f * par2;
		this.leg4.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
		float f6 = MathHelper.sin((float) (this.swingProgress * (float) Math.PI));
		float f7 = MathHelper
				.sin((float) ((1.0f - (1.0f - this.swingProgress) * (1.0f - this.swingProgress)) * (float) Math.PI));
		this.bipedRightArm.rotateAngleZ = 0.0f;
		this.bipedLeftArm.rotateAngleZ = 0.0f;
		this.bipedRightArm.rotateAngleY = -(0.1f - f6 * 0.6f);
		this.bipedLeftArm.rotateAngleY = 0.1f - f6 * 0.6f;
		this.bipedRightArm.rotateAngleX = -1.5707964f;
		this.bipedLeftArm.rotateAngleX = -1.5707964f;
		this.bipedRightArm.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
		this.bipedLeftArm.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
		this.bipedRightArm.rotateAngleZ += MathHelper.cos((float) (par3 * 0.09f)) * 0.05f + 0.05f;
		this.bipedLeftArm.rotateAngleZ -= MathHelper.cos((float) (par3 * 0.09f)) * 0.05f + 0.05f;
		this.bipedRightArm.rotateAngleX += MathHelper.sin((float) (par3 * 0.067f)) * 0.05f;
		this.bipedLeftArm.rotateAngleX -= MathHelper.sin((float) (par3 * 0.067f)) * 0.05f;
		if (this.aimedBow) {
			float f8 = 0.0f;
			float f9 = 0.0f;
			this.bipedRightArm.rotateAngleZ = 0.0f;
			this.bipedLeftArm.rotateAngleZ = 0.0f;
			this.bipedRightArm.rotateAngleY = -(0.1f - f8 * 0.6f) + this.head.rotateAngleY;
			this.bipedLeftArm.rotateAngleY = 0.1f - f6 * 0.6f + this.head.rotateAngleY + 0.4f;
			this.bipedRightArm.rotateAngleX = -1.5707964f + this.head.rotateAngleX;
			this.bipedLeftArm.rotateAngleX = -1.5707964f + this.head.rotateAngleX;
			this.bipedRightArm.rotateAngleX -= f8 * 1.2f - f9 * 0.4f;
			this.bipedLeftArm.rotateAngleX -= f8 * 1.2f - f9 * 0.4f;
			this.bipedRightArm.rotateAngleZ += MathHelper.cos((float) (par3 * 0.09f)) * 0.05f + 0.05f;
			this.bipedLeftArm.rotateAngleZ -= MathHelper.cos((float) (par3 * 0.09f)) * 0.05f + 0.05f;
			this.bipedRightArm.rotateAngleX += MathHelper.sin((float) (par3 * 0.067f)) * 0.05f;
			this.bipedLeftArm.rotateAngleX -= MathHelper.sin((float) (par3 * 0.067f)) * 0.05f;
		}
	}
}