package net.thep2wking.weirdthings.util.render.chickow;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelChickow extends ModelCow {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer horn1;
	ModelRenderer horn2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer mouth;
	ModelRenderer chin;
	protected float field_78145_g = 8.0f;
	protected float field_78151_h = 4.0f;

	public ModelChickow() {
		super();
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.head = new ModelRenderer((ModelBase) this, 0, 0);
		this.head.addBox(-4.0f, -4.0f, -6.0f, 8, 8, 6);
		this.head.setRotationPoint(0.0f, -6.0f, -5.0f);
		this.head.setTextureSize(64, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		this.body = new ModelRenderer((ModelBase) this, 18, 4);
		this.body.addBox(-6.0f, -10.0f, -7.0f, 12, 18, 10);
		this.body.setRotationPoint(0.0f, 4.0f, 2.0f);
		this.body.setTextureSize(64, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		this.leg1 = new ModelRenderer((ModelBase) this, 0, 16);
		this.leg1.addBox(-3.0f, 0.0f, -2.0f, 4, 12, 4);
		this.leg1.setRotationPoint(-3.0f, 12.0f, 3.0f);
		this.leg1.setTextureSize(64, 64);
		this.leg1.mirror = true;
		this.setRotation(this.leg1, 0.0f, 0.0f, 0.0f);
		this.leg2 = new ModelRenderer((ModelBase) this, 0, 16);
		this.leg2.addBox(-1.0f, 0.0f, -2.0f, 4, 12, 4);
		this.leg2.setRotationPoint(3.0f, 12.0f, 3.0f);
		this.leg2.setTextureSize(64, 64);
		this.leg2.mirror = true;
		this.setRotation(this.leg2, 0.0f, 0.0f, 0.0f);
		this.horn1 = new ModelRenderer((ModelBase) this, 22, 0);
		this.horn1.addBox(-5.0f, -4.0f, -4.0f, 1, 3, 1);
		this.horn1.setRotationPoint(0.0f, -7.0f, -4.0f);
		this.horn1.setTextureSize(64, 64);
		this.horn1.mirror = true;
		this.setRotation(this.horn1, 0.0f, 0.0f, 0.0f);
		this.horn2 = new ModelRenderer((ModelBase) this, 22, 0);
		this.horn2.addBox(4.0f, -4.0f, -4.0f, 1, 3, 1);
		this.horn2.setRotationPoint(0.0f, -7.0f, -4.0f);
		this.horn2.setTextureSize(64, 64);
		this.horn2.mirror = true;
		this.setRotation(this.horn2, 0.0f, 0.0f, 0.0f);
		this.leg3 = new ModelRenderer((ModelBase) this, 0, 32);
		this.leg3.addBox(-3.0f, 0.0f, -2.0f, 4, 12, 4);
		this.leg3.setRotationPoint(-6.0f, -1.0f, 0.0f);
		this.leg3.setTextureSize(64, 64);
		this.leg3.mirror = true;
		this.setRotation(this.leg3, 0.0f, 0.0f, 0.0f);
		this.leg4 = new ModelRenderer((ModelBase) this, 0, 32);
		this.leg4.addBox(-1.0f, 0.0f, -2.0f, 4, 12, 4);
		this.leg4.setRotationPoint(6.0f, -1.0f, 0.0f);
		this.leg4.setTextureSize(64, 64);
		this.leg4.mirror = true;
		this.setRotation(this.leg4, 0.0f, 0.0f, 0.0f);
		this.mouth = new ModelRenderer((ModelBase) this, 16, 32);
		this.mouth.addBox(-2.0f, -1.0f, -1.0f, 4, 2, 2);
		this.mouth.setRotationPoint(0.0f, -4.0f, -12.0f);
		this.mouth.setTextureSize(64, 64);
		this.mouth.mirror = true;
		this.setRotation(this.mouth, 0.0f, 0.0f, 0.0f);
		this.chin = new ModelRenderer((ModelBase) this, 16, 36);
		this.chin.addBox(-1.0f, -1.0f, -1.0f, 2, 2, 2);
		this.chin.setRotationPoint(0.0f, -2.0f, -11.0f);
		this.chin.setTextureSize(64, 64);
		this.chin.mirror = true;
		this.setRotation(this.chin, 0.0f, 0.0f, 0.0f);
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
			this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
			this.head.render(f5);
			this.body.render(f5);
			this.leg1.render(f5);
			this.leg2.render(f5);
			this.horn1.render(f5);
			this.horn2.render(f5);
			this.leg3.render(f5);
			this.leg4.render(f5);
			this.mouth.render(f5);
			this.chin.render(f5);
			GL11.glPopMatrix();
		} else {
			this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
			this.head.render(f5);
			this.body.render(f5);
			this.leg1.render(f5);
			this.leg2.render(f5);
			this.horn1.render(f5);
			this.horn2.render(f5);
			this.leg3.render(f5);
			this.leg4.render(f5);
			this.mouth.render(f5);
			this.chin.render(f5);
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
		this.leg3.rotateAngleX = par3;
		this.leg4.rotateAngleX = par3;
		this.leg1.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
		this.leg2.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f + (float) Math.PI)) * 1.4f * par2;
		this.leg1.rotateAngleY = 0.0f;
		this.leg2.rotateAngleY = 0.0f;
	}
}