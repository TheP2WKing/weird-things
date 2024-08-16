package net.thep2wking.weirdthings.util.render.crueatus;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCrueatus extends ModelBlaze {
	ModelRenderer head;
	private ModelRenderer[] blazeSticks = new ModelRenderer[24];
	protected float field_78145_g = 8.0f;
	protected float field_78151_h = 4.0f;

	public ModelCrueatus() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.head = new ModelRenderer((ModelBase) this, 0, 0);
		this.head.addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8);
		this.head.setRotationPoint(0.0f, 3.5f, 0.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, -0.7500029f, -0.7500029f, -0.7500029f);
		for (int i = 0; i < this.blazeSticks.length; ++i) {
			this.blazeSticks[i] = new ModelRenderer((ModelBase) this, 4, 16);
			this.blazeSticks[i].addBox(-0.5f, 0.0f, -0.5f, 1, 8, 1);
			this.blazeSticks[i].setRotationPoint(-6.0f, 16.0f, 2.0f);
			this.blazeSticks[i].setTextureSize(64, 32);
			this.blazeSticks[i].mirror = true;
			this.setRotation(this.blazeSticks[i], 0.0f, 0.0f, 0.0f);
		}
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
			this.head.render(f5);
			for (int i = 0; i < this.blazeSticks.length; ++i) {
				this.blazeSticks[i].render(f5);
			}
			GL11.glPopMatrix();
		} else {
			this.head.render(f5);
			for (int i = 0; i < this.blazeSticks.length; ++i) {
				this.blazeSticks[i].render(f5);
			}
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
		int i;
		this.head.rotateAngleX = par5 / 57.295776f;
		this.head.rotateAngleY = par4 / 57.295776f;
		float f6 = par3 * (float) Math.PI * -0.1f;
		for (i = 0; i < 4; ++i) {
			this.blazeSticks[i].rotationPointY = 4.0f + MathHelper.cos((float) (((float) (i * 2) + par3) * 0.25f));
			this.blazeSticks[i].rotationPointX = MathHelper.cos((float) f6) * 9.0f;
			this.blazeSticks[i].rotationPointZ = MathHelper.sin((float) f6) * 9.0f;
			f6 += 1.0f;
		}
		f6 = 0.7853982f + par3 * (float) Math.PI * 0.03f;
		for (i = 4; i < 8; ++i) {
			this.blazeSticks[i].rotationPointY = 2.0f + MathHelper.cos((float) (((float) (i * 2) + par3) * 0.25f));
			this.blazeSticks[i].rotationPointX = MathHelper.cos((float) f6) * 7.0f;
			this.blazeSticks[i].rotationPointZ = MathHelper.sin((float) f6) * 7.0f;
			f6 += 1.0f;
		}
		f6 = 0.47123894f + par3 * (float) Math.PI * -0.05f;
		for (i = 8; i < 12; ++i) {
			this.blazeSticks[i].rotationPointY = 11.0f + MathHelper.cos((float) (((float) i * 1.5f + par3) * 0.5f));
			this.blazeSticks[i].rotationPointX = MathHelper.cos((float) f6) * 5.0f;
			this.blazeSticks[i].rotationPointZ = MathHelper.sin((float) f6) * 5.0f;
			f6 += 1.0f;
		}
		for (i = 12; i < 16; ++i) {
			this.blazeSticks[i].rotationPointY = 11.0f + MathHelper.cos((float) (((float) i * 1.5f + par3) * 0.5f));
			this.blazeSticks[i].rotationPointX = MathHelper.cos((float) f6) * 3.0f;
			this.blazeSticks[i].rotationPointZ = MathHelper.sin((float) f6) * 3.0f;
			f6 += 1.0f;
		}
		for (i = 16; i < 20; ++i) {
			this.blazeSticks[i].rotationPointY = 11.0f + MathHelper.cos((float) (((float) i * 1.5f + par3) * 0.5f));
			this.blazeSticks[i].rotationPointX = MathHelper.cos((float) f6) * 1.0f;
			this.blazeSticks[i].rotationPointZ = MathHelper.sin((float) f6) * 1.0f;
			f6 += 1.0f;
		}
		for (i = 20; i < 24; ++i) {
			this.blazeSticks[i].rotationPointY = 11.0f + MathHelper.cos((float) (((float) i * 1.5f + par3) * 0.5f));
			this.blazeSticks[i].rotationPointX = MathHelper.cos((float) f6) * -2.0f;
			this.blazeSticks[i].rotationPointZ = MathHelper.sin((float) f6) * -2.0f;
			f6 += 1.0f;
		}
	}
}