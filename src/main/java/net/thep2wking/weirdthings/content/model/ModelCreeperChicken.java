package net.thep2wking.weirdthings.content.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCreeperChicken extends ModelCreeper {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer Mouth;
    ModelRenderer Mouth2;
    ModelRenderer field_78133_b;

	public ModelCreeperChicken(float p_i1147_1_) {
		textureWidth = 64;
		textureHeight = 32;

		int b0 = 6;
        this.field_78133_b = new ModelRenderer((ModelBase)this, 32, 0);
        this.field_78133_b.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, p_i1147_1_ + 0.5f);
        this.field_78133_b.setRotationPoint(0.0f, (float)b0, 0.0f);
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, p_i1147_1_);
        this.head.setRotationPoint(0.0f, 6.0f, 0.0f);
        this.head.setTextureSize(64, 32);
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.addBox(-4.0f, -6.0f, -2.0f, 8, 12, 4, p_i1147_1_);
        this.body.setRotationPoint(0.0f, 12.0f, 0.0f);
        this.body.setTextureSize(64, 32);
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.leg3 = new ModelRenderer((ModelBase)this, 33, 0);
        this.leg3.addBox(-1.5f, 0.0f, -3.0f, 3, 6, 3, p_i1147_1_);
        this.leg3.setRotationPoint(-2.5f, 18.0f, -2.0f);
        this.leg3.setTextureSize(64, 32);
        this.setRotation(this.leg3, 0.0f, 0.0f, 0.0f);
        this.leg4 = new ModelRenderer((ModelBase)this, 33, 0);
        this.leg4.addBox(-1.5f, 0.0f, -3.0f, 3, 6, 3, p_i1147_1_);
        this.leg4.setRotationPoint(2.5f, 18.0f, -2.0f);
        this.leg4.setTextureSize(64, 32);
        this.setRotation(this.leg4, 0.0f, 0.0f, 0.0f);
        this.leg1 = new ModelRenderer((ModelBase)this, 52, 0);
        this.leg1.addBox(-1.5f, -1.0f, 0.0f, 3, 6, 3, p_i1147_1_);
        this.leg1.setRotationPoint(-2.5f, 18.0f, 2.0f);
        this.leg1.setTextureSize(64, 32);
        this.setRotation(this.leg1, 0.0f, 0.0f, 0.0f);
        this.leg2 = new ModelRenderer((ModelBase)this, 52, 0);
        this.leg2.addBox(-1.5f, 0.0f, 0.0f, 3, 6, 3, p_i1147_1_);
        this.leg2.setRotationPoint(2.5f, 18.0f, 2.0f);
        this.leg2.setTextureSize(64, 32);
        this.setRotation(this.leg2, 0.0f, 0.0f, 0.0f);
        this.Mouth = new ModelRenderer((ModelBase)this, 40, 24);
        this.Mouth.addBox(-4.0f, -8.0f, -4.0f, 4, 2, 2, p_i1147_1_);
        this.Mouth.setRotationPoint(2.0f, 4.0f, -2.0f);
        this.Mouth.setTextureSize(64, 32);
        this.setRotation(this.Mouth, 0.0f, 0.0f, 0.0f);
        this.Mouth2 = new ModelRenderer((ModelBase)this, 40, 28);
        this.Mouth2.addBox(-4.0f, -8.0f, -4.0f, 2, 2, 2, p_i1147_1_);
        this.Mouth2.setRotationPoint(3.0f, 5.0f, -1.0f);
        this.Mouth2.setTextureSize(64, 32);
        this.setRotation(this.Mouth2, 0.0f, 0.0f, 0.0f);
        this.head.addChild(this.Mouth);
        this.head.addChild(this.Mouth2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.head.render(f5);
        this.body.render(f5);
        this.leg3.render(f5);
        this.leg4.render(f5);
        this.leg1.render(f5);
        this.leg2.render(f5);
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
        this.leg1.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leg2.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        this.leg3.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        this.leg4.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
	}
}