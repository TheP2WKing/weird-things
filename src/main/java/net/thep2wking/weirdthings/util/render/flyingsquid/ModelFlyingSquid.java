package net.thep2wking.weirdthings.util.render.flyingsquid;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSquid;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelFlyingSquid extends ModelSquid {
	ModelRenderer squidBody;
	ModelRenderer[] squidTentacles = new ModelRenderer[8];

	public ModelFlyingSquid() {
		this.squidBody = new ModelRenderer(this, 0, 0);
		this.squidBody.addBox(-6.0F, -8.0F, -6.0F, 12, 16, 12);
		this.squidBody.rotationPointY += 8.0F;
		for (int j = 0; j < this.squidTentacles.length; ++j) {
			this.squidTentacles[j] = new ModelRenderer(this, 48, 0);
			double d0 = (double) j * Math.PI * 2.0D / (double) this.squidTentacles.length;
			float f = (float) Math.cos(d0) * 5.0F;
			float f1 = (float) Math.sin(d0) * 5.0F;
			this.squidTentacles[j].addBox(-1.0F, 0.0F, -1.0F, 2, 18, 2);
			this.squidTentacles[j].rotationPointX = f;
			this.squidTentacles[j].rotationPointZ = f1;
			this.squidTentacles[j].rotationPointY = 15.0F;
			d0 = (double) j * Math.PI * -2.0D / (double) this.squidTentacles.length + (Math.PI / 2D);
			this.squidTentacles[j].rotateAngleY = (float) d0;
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		for (int i = 0; i < this.squidTentacles.length; ++i) {
			this.squidTentacles[i].rotateAngleX = 0.2f * MathHelper.sin((float) (ageInTicks * 0.3f + (float) i)) + 0.4f;
		}
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		this.squidBody.render(scale);
		for (ModelRenderer modelrenderer : this.squidTentacles) {
			modelrenderer.render(scale);
		}
	}
}