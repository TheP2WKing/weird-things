package net.thep2wking.weirdthings.util.render.battlesheep;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBattleSheep1 extends ModelBase {
	public float field_78153_i;
	public float headRotationAngleX;
	public ModelRenderer[] blazeSticks = new ModelRenderer[4];
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;

	public ModelBattleSheep1() {
		super();
		float f = 0.5f;
		for (int i = 0; i < this.blazeSticks.length; ++i) {
			this.blazeSticks[i] = new ModelRenderer((ModelBase) this, 0, 16);
			this.blazeSticks[i].addBox(-2.0f, -5.0f, 5.0f, 4, 12, 4, f);
			this.setRotation(this.blazeSticks[i], -1.570796f, 0.0f, 0.0f);
		}
		this.head = new ModelRenderer((ModelBase) this, 0, 0);
		this.head.addBox(-3.0f, -4.0f, -4.0f, 6, 6, 6, 0.6f);
		this.head.setRotationPoint(0.0f, 6.0f, -8.0f);
		this.body = new ModelRenderer((ModelBase) this, 28, 8);
		this.body.addBox(-4.0f, -10.0f, -7.0f, 8, 16, 6, 1.75f);
		this.body.setRotationPoint(0.0f, 5.0f, 2.0f);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.head.render(f5);
		this.body.render(f5);
		for (int i = 0; i < this.blazeSticks.length; ++i) {
			this.blazeSticks[i].render(f5);
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
		float f6 = par3 * (float) Math.PI * -0.1f;
		this.body.rotateAngleX = 1.5707964f;
		for (int i = 0; i < 4; ++i) {
			this.blazeSticks[i].rotationPointY = 4.0f + MathHelper.cos((float) (((float) (i * 2) + par3) * 0.25f));
			this.blazeSticks[i].rotationPointX = MathHelper.cos((float) f6) * 9.0f;
			this.blazeSticks[i].rotationPointZ = MathHelper.sin((float) f6) * 9.0f;
			f6 += 1.0f;
		}
		this.head.rotateAngleX = this.field_78153_i;
	}
}