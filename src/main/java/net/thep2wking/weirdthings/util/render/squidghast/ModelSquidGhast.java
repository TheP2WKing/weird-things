package net.thep2wking.weirdthings.util.render.squidghast;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelGhast;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSquidGhast extends ModelGhast {
    ModelRenderer head;
    ModelRenderer[] squidTentacles = new ModelRenderer[8];

	public ModelSquidGhast() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        int b0 = -16;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-6.0f, -9.0f, -6.0f, 12, 16, 12);
        this.head.rotationPointY += (float)(24 + b0);
        for (int i = 0; i < this.squidTentacles.length; ++i) {
            this.squidTentacles[i] = new ModelRenderer((ModelBase)this, 48, 0);
            double d0 = (double)i * Math.PI * 2.0 / (double)this.squidTentacles.length;
            float f = (float)Math.cos(d0) * 5.0f;
            float f1 = (float)Math.sin(d0) * 5.0f;
            this.squidTentacles[i].addBox(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.squidTentacles[i].setRotationPoint(0.0f, 4.0f, 0.0f);
            this.squidTentacles[i].rotationPointX = f;
            this.squidTentacles[i].rotationPointZ = f1;
            this.squidTentacles[i].rotationPointY = 31 + b0;
            d0 = (double)i * Math.PI * -2.0 / (double)this.squidTentacles.length + 1.5707963267948966;
            this.squidTentacles[i].rotateAngleY = (float)d0;
        }
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f);
        this.head.render(f5);
        for (ModelRenderer modelrenderer : this.squidTentacles) {
            modelrenderer.render(f5);
        }
        GL11.glPopMatrix();
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
        for (int i = 0; i < this.squidTentacles.length; ++i) {
            this.squidTentacles[i].rotateAngleX = 0.2f * MathHelper.sin((float)(par3 * 0.3f + (float)i)) + 0.4f;
        }
	}
}