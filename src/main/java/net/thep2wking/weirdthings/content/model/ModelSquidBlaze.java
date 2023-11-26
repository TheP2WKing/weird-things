package net.thep2wking.weirdthings.content.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSquidBlaze extends ModelBlaze {
    private ModelRenderer[] blazeSticks = new ModelRenderer[12];
    private ModelRenderer blazeHead;

	public ModelSquidBlaze() {
		textureWidth = 64;
		textureHeight = 32;

        for (int i = 0; i < this.blazeSticks.length; ++i) {
            this.blazeSticks[i] = new ModelRenderer((ModelBase)this, 0, 16);
            this.blazeSticks[i].addBox(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.blazeHead = new ModelRenderer((ModelBase)this, 16, 0);
        this.blazeHead.addBox(-6.0f, -7f, -6.0f, 12, 16, 12);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.scale(0.8, 0.8, 0.8);
        this.blazeHead.render(f5);
        GlStateManager.popMatrix();
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
        int i;
        float f6 = par3 * (float)Math.PI * -0.1f;
        for (i = 0; i < 4; ++i) {
            this.blazeSticks[i].rotationPointY = -2.0f + MathHelper.cos((float)(((float)(i * 2) + par3) * 0.25f));
            this.blazeSticks[i].rotationPointX = MathHelper.cos((float)f6) * 9.0f;
            this.blazeSticks[i].rotationPointZ = MathHelper.sin((float)f6) * 9.0f;
            f6 += 1.0f;
        }
        f6 = 0.7853982f + par3 * (float)Math.PI * 0.03f;
        for (i = 4; i < 8; ++i) {
            this.blazeSticks[i].rotationPointY = 2.0f + MathHelper.cos((float)(((float)(i * 2) + par3) * 0.25f));
            this.blazeSticks[i].rotationPointX = MathHelper.cos((float)f6) * 7.0f;
            this.blazeSticks[i].rotationPointZ = MathHelper.sin((float)f6) * 7.0f;
            f6 += 1.0f;
        }
        f6 = 0.47123894f + par3 * (float)Math.PI * -0.05f;
        for (i = 8; i < 12; ++i) {
            this.blazeSticks[i].rotationPointY = 11.0f + MathHelper.cos((float)(((float)i * 1.5f + par3) * 0.5f));
            this.blazeSticks[i].rotationPointX = MathHelper.cos((float)f6) * 5.0f;
            this.blazeSticks[i].rotationPointZ = MathHelper.sin((float)f6) * 5.0f;
            f6 += 1.0f;
        }
        this.blazeHead.rotateAngleY = par4 / 57.295776f;
        this.blazeHead.rotateAngleX = par5 / 57.295776f;
	}
}