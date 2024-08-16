package net.thep2wking.weirdthings.util.render.villagerspider;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelVillagerSpider extends ModelSpider {
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer Left_Leg;
    ModelRenderer Body;
    ModelRenderer Right_Leg;
    ModelRenderer neck;
    ModelRenderer Left_Leg2;
    ModelRenderer Left_Leg3;
    ModelRenderer Right_Leg2;
    ModelRenderer Right_Leg3;
    ModelRenderer Right_Leg4;
    ModelRenderer neck2;
    ModelRenderer Left_Leg4;

    public ModelVillagerSpider() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.head = new ModelRenderer((ModelBase) this, 0, 0);
        this.head.addBox(-4.0f, -10.0f, -4.0f, 8, 10, 8);
        this.head.setRotationPoint(0.0f, 13.0f, -11.0f);
        this.head.setTextureSize(64, 64);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.nose = new ModelRenderer((ModelBase) this, 24, 0);
        this.nose.addBox(-1.0f, -3.0f, -6.0f, 2, 4, 2);
        this.nose.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.nose.setTextureSize(64, 64);
        this.nose.mirror = true;
        this.setRotation(this.nose, 0.0f, 0.0f, 0.0f);
        this.Left_Leg = new ModelRenderer((ModelBase) this, 0, 22);
        this.Left_Leg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Left_Leg.setRotationPoint(3.0f, 16.0f, -4.0f);
        this.Left_Leg.setTextureSize(64, 64);
        this.setRotation(this.Left_Leg, 0.0f, 0.0f, -1.047198f);
        this.Left_Leg.mirror = false;
        this.Body = new ModelRenderer((ModelBase) this, 16, 20);
        this.Body.addBox(-4.0f, -6.0f, -3.0f, 8, 12, 6);
        this.Body.setRotationPoint(0.0f, 15.0f, 0.0f);
        this.Body.setTextureSize(64, 64);
        this.Body.setTextureOffset(0, 38).addBox(-4.0f, -6.0f, -3.0f, 8, 18, 6, 0.5f);
        this.setRotation(this.Body, 1.570796f, 0.0f, 0.0f);
        this.Right_Leg = new ModelRenderer((ModelBase) this, 0, 22);
        this.Right_Leg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Right_Leg.setRotationPoint(-3.0f, 16.0f, -4.0f);
        this.Right_Leg.setTextureSize(64, 64);
        this.Right_Leg.mirror = true;
        this.setRotation(this.Right_Leg, 0.0f, 0.0f, 1.047198f);
        this.neck = new ModelRenderer((ModelBase) this, 16, 10);
        this.neck.addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4);
        this.neck.setRotationPoint(0.0f, 15.0f, -8.0f);
        this.neck.setTextureSize(64, 64);
        this.neck.mirror = true;
        this.setRotation(this.neck, 0.0f, 0.0f, 0.0f);
        this.Left_Leg2 = new ModelRenderer((ModelBase) this, 0, 22);
        this.Left_Leg2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Left_Leg2.setRotationPoint(3.0f, 15.0f, 0.5f);
        this.Left_Leg2.setTextureSize(64, 64);
        this.Left_Leg2.mirror = true;
        this.setRotation(this.Left_Leg2, 0.0f, 0.0f, -1.047198f);
        this.Left_Leg3 = new ModelRenderer((ModelBase) this, 0, 22);
        this.Left_Leg3.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Left_Leg3.setRotationPoint(3.0f, 15.0f, 5.0f);
        this.Left_Leg3.setTextureSize(64, 64);
        this.Left_Leg3.mirror = true;
        this.setRotation(this.Left_Leg3, 0.0f, 0.0f, -1.047198f);
        this.Right_Leg2 = new ModelRenderer((ModelBase) this, 0, 22);
        this.Right_Leg2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Right_Leg2.setRotationPoint(-3.0f, 15.0f, 0.5f);
        this.Right_Leg2.setTextureSize(64, 64);
        this.Right_Leg2.mirror = true;
        this.setRotation(this.Right_Leg2, 0.0f, 0.0f, 1.047198f);
        this.Right_Leg3 = new ModelRenderer((ModelBase) this, 0, 22);
        this.Right_Leg3.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Right_Leg3.setRotationPoint(-3.0f, 15.0f, 5.0f);
        this.Right_Leg3.setTextureSize(64, 64);
        this.Right_Leg3.mirror = true;
        this.setRotation(this.Right_Leg3, 0.0f, 0.0f, 1.047198f);
        this.Right_Leg4 = new ModelRenderer((ModelBase) this, 0, 22);
        this.Right_Leg4.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Right_Leg4.setRotationPoint(-3.0f, 16.0f, 9.5f);
        this.Right_Leg4.setTextureSize(64, 64);
        this.Right_Leg4.mirror = true;
        this.setRotation(this.Right_Leg4, 0.0f, 0.0f, 1.047198f);
        this.neck2 = new ModelRenderer((ModelBase) this, 16, 10);
        this.neck2.addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4);
        this.neck2.setRotationPoint(0.0f, 15.0f, -12.0f);
        this.neck2.setTextureSize(64, 64);
        this.neck2.mirror = true;
        this.setRotation(this.neck2, 0.0f, 0.0f, 0.0f);
        this.Left_Leg4 = new ModelRenderer((ModelBase) this, 0, 22);
        this.Left_Leg4.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
        this.Left_Leg4.setRotationPoint(3.0f, 16.0f, 9.5f);
        this.Left_Leg4.setTextureSize(64, 64);
        this.Left_Leg4.mirror = true;
        this.setRotation(this.Left_Leg4, 0.0f, 0.0f, -1.047198f);
        this.head.addChild(this.nose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.head.render(f5);
        this.Left_Leg.render(f5);
        this.Body.render(f5);
        this.Right_Leg.render(f5);
        this.Left_Leg2.render(f5);
        this.Left_Leg3.render(f5);
        this.Right_Leg2.render(f5);
        this.Right_Leg3.render(f5);
        this.Right_Leg4.render(f5);
        this.Left_Leg4.render(f5);
        this.neck.render(f5);
        this.neck2.render(f5);
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
        this.Right_Leg.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Left_Leg.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Right_Leg.rotateAngleY = 0.0f;
        this.Left_Leg.rotateAngleY = 0.0f;
        this.Right_Leg2.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Left_Leg2.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Right_Leg2.rotateAngleY = 0.0f;
        this.Left_Leg2.rotateAngleY = 0.0f;
        this.Right_Leg3.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Left_Leg3.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Right_Leg3.rotateAngleY = 0.0f;
        this.Left_Leg3.rotateAngleY = 0.0f;
        this.Right_Leg4.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Left_Leg4.rotateAngleX = MathHelper.cos((float) (par1 * 0.6662f)) * 1.4f * par2;
        this.Right_Leg4.rotateAngleY = 0.0f;
        this.Left_Leg4.rotateAngleY = 0.0f;
    }
}