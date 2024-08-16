package net.thep2wking.weirdthings.util.render.villagerghast;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelGhast;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelVillagerGhast extends ModelGhast {
	ModelRenderer head;
	ModelRenderer nose;
	ModelRenderer[] tentaclesNew = new ModelRenderer[9];

	public ModelVillagerGhast() {
		textureWidth = 64;
		textureHeight = 64;

		this.head = new ModelRenderer((ModelBase) this, 0, 0);
		this.head.addBox(-8.0f, -20.0f, -8.0f, 16, 20, 16);
		this.head.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.head.setTextureSize(64, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		this.nose = new ModelRenderer((ModelBase) this, 48, 0);
		this.nose.addBox(-2.0f, -6.0f, -12.0f, 4, 8, 4);
		this.nose.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.nose.setTextureSize(64, 64);
		this.nose.mirror = true;
		this.setRotation(this.nose, 0.0f, 0.0f, 0.0f);
		int b0 = -16;
		this.head = new ModelRenderer((ModelBase) this, 0, 0);
		this.head.addBox(-8.0f, -12.0f, -8.0f, 16, 20, 16);
		this.head.rotationPointY += (float) (24 + b0);
		this.nose = new ModelRenderer((ModelBase) this, 48, 0);
		this.nose.addBox(-2.0f, 2.0f, -12.0f, 4, 8, 4);
		this.nose.rotationPointY += (float) (24 + b0);
		Random random = new Random(1660L);
		for (int i = 0; i < this.tentaclesNew.length; ++i) {
			this.tentaclesNew[i] = new ModelRenderer((ModelBase) this, 0, 0);
			float f = (((float) (i % 3) - (float) (i / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
			float f1 = ((float) (i / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
			int j = random.nextInt(7) + 8;
			this.tentaclesNew[i].addBox(-1.0f, 0.0f, -1.0f, 2, j, 2);
			this.tentaclesNew[i].rotationPointX = f;
			this.tentaclesNew[i].rotationPointZ = f1;
			this.tentaclesNew[i].rotationPointY = 31 + b0;
		}
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		GlStateManager.pushMatrix();
		GlStateManager.translate(0.0F, 0.6F, 0.0F);
		this.head.render(f5);
		this.nose.render(f5);
		for (ModelRenderer modelrenderer : this.tentaclesNew) {
			modelrenderer.render(f5);
		}
		GlStateManager.popMatrix();
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
		for (int i = 0; i < this.tentaclesNew.length; ++i) {
			this.tentaclesNew[i].rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F + (float) i) + 0.4F;
		}
	}
}