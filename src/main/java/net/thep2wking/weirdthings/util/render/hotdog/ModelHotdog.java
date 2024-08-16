package net.thep2wking.weirdthings.util.render.hotdog;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import net.thep2wking.weirdthings.content.entity.EntityHotdog;

public class ModelHotdog extends ModelWolf {
    private ModelRenderer WolfHead;
    private ModelRenderer Breadpiece1;
    private ModelRenderer Leg1;
    private ModelRenderer Leg2;
    private ModelRenderer Leg3;
    private ModelRenderer Leg4;
    private ModelRenderer Ear1;
    private ModelRenderer Ear2;
    private ModelRenderer Nose;
    private ModelRenderer RightBreadPiece;
    private ModelRenderer LeftBreadPiece;
    private ModelRenderer Hotdog;
    private ModelRenderer wolfTail;

    public ModelHotdog() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.WolfHead = new ModelRenderer((ModelBase)this, 0, 0);
        this.WolfHead.addBox(-3.0f, -3.0f, -2.0f, 4, 4, 4);
        this.WolfHead.setRotationPoint(0.0f, 14f, -7.0f);
        this.WolfHead.setTextureSize(128, 128);
        this.WolfHead.mirror = true;
        this.setRotation(this.WolfHead, 0.0f, 0.0f, 0.0f);
        this.Breadpiece1 = new ModelRenderer((ModelBase)this, 21, 17);
        this.Breadpiece1.addBox(-3.0f, -7.0f, -1.5f, 6, 14, 3);
        this.Breadpiece1.setRotationPoint(-2.0f, 16.0f, 2.0f);
        this.Breadpiece1.setTextureSize(128, 128);
        this.Breadpiece1.mirror = true;
        this.setRotation(this.Breadpiece1, 1.570796f, 0.0f, 0.0f);
        this.Leg1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg1.addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
        this.Leg1.setRotationPoint(-2.5f, 16.0f, 7.0f);
        this.Leg1.setTextureSize(128, 128);
        this.Leg1.mirror = true;
        this.setRotation(this.Leg1, 0.0f, 0.0f, 0.0f);
        this.Leg2 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg2.addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
        this.Leg2.setRotationPoint(0.5f, 16.0f, 7.0f);
        this.Leg2.setTextureSize(128, 128);
        this.Leg2.mirror = true;
        this.setRotation(this.Leg2, 0.0f, 0.0f, 0.0f);
        this.Leg3 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg3.addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
        this.Leg3.setRotationPoint(-2.5f, 16.0f, -4.0f);
        this.Leg3.setTextureSize(128, 128);
        this.Leg3.mirror = true;
        this.setRotation(this.Leg3, 0.0f, 0.0f, 0.0f);
        this.Leg4 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Leg4.addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
        this.Leg4.setRotationPoint(0.5f, 16.0f, -4.0f);
        this.Leg4.setTextureSize(128, 128);
        this.Leg4.mirror = true;
        this.setRotation(this.Leg4, 0.0f, 0.0f, 0.0f);
        this.Ear1 = new ModelRenderer((ModelBase)this, 16, 14);
        this.Ear1.addBox(-3.0f, -2.0f, -1.5f, 1, 3, 3);
            this.Ear1.setRotationPoint(-1f, -1f, 0f);
        this.Ear1.setTextureSize(128, 128);
        this.Ear1.mirror = true;
        // this.setRotation(this.Ear1, 0.0f, 0.0f, 0.0f);
        this.Ear2 = new ModelRenderer((ModelBase)this, 16, 14);
        this.Ear2.addBox(2.0f, -2.0f, -1.5f, 1, 3, 3);
            this.Ear2.setRotationPoint(-1f, -1f, 0f);
        this.Ear2.setTextureSize(128, 128);
        this.Ear2.mirror = true;
        this.setRotation(this.Ear2, 0.0f, 0.0f, 0.0f);
        this.Nose = new ModelRenderer((ModelBase)this, 0, 8);
        this.Nose.addBox(-2.0f, 0.0f, -4.0f, 2, 2, 2);
        this.Nose.setRotationPoint(0.0f, -1f, 0f);
        this.Nose.setTextureSize(128, 128);
        this.Nose.mirror = true;
        this.setRotation(this.Nose, 0.0f, 0.0f, 0.0f);
        this.RightBreadPiece = new ModelRenderer((ModelBase)this, 0, 50);
        this.RightBreadPiece.addBox(1.0f, -7.0f, 1.5f, 2, 14, 2);
        this.RightBreadPiece.setTextureSize(128, 128);
        this.RightBreadPiece.mirror = true;
        this.LeftBreadPiece = new ModelRenderer((ModelBase)this, 0, 34);
        this.LeftBreadPiece.addBox(-3.0f, -7.0f, 1.5f, 2, 14, 2);
        this.LeftBreadPiece.setTextureSize(128, 128);
        this.LeftBreadPiece.mirror = true;
        this.Hotdog = new ModelRenderer((ModelBase)this, 0, 66);
        this.Hotdog.addBox(-1.0f, -7.0f, 2.0f, 2, 14, 2, 0.5f);
        this.Hotdog.setTextureSize(128, 128);
        this.Hotdog.mirror = true;
        this.wolfTail = new ModelRenderer(this, 9, 18);
        this.wolfTail.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.wolfTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
        this.Breadpiece1.addChild(this.RightBreadPiece);
        this.Breadpiece1.addChild(this.LeftBreadPiece);
        this.Breadpiece1.addChild(this.Hotdog);
        this.WolfHead.addChild(this.Ear1);
        this.WolfHead.addChild(this.Ear2);
        this.WolfHead.addChild(this.Nose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(5.0f * f5), (float)(2.0f * f5));
            this.WolfHead.render(f5);
            // this.Ear1.render(f5);
            // this.Ear2.render(f5);
            // this.Nose.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f5), (float)0.0f);
            this.Breadpiece1.render(f5);
            this.Leg1.render(f5);
            this.Leg2.render(f5);
            this.Leg3.render(f5);
            this.Leg4.render(f5);
            this.wolfTail.renderWithRotation(f5);
            GL11.glPopMatrix();
        } else {
            this.WolfHead.render(f5);
            // this.Ear1.render(f5);
            // this.Ear2.render(f5);
            // this.Nose.render(f5);
            this.Breadpiece1.render(f5);
            this.Leg1.render(f5);
            this.Leg2.render(f5);
            this.Leg3.render(f5);
            this.Leg4.render(f5);
            this.wolfTail.renderWithRotation(f5);
        }
    }

    public void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount,
            float partialTickTime) {
                EntityHotdog entitywolf = (EntityHotdog)entitylivingbaseIn;
                if (entitywolf.isAngry())
                {
                    this.wolfTail.rotateAngleY = 0.0F;
                }
                else
                {
                    this.wolfTail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
                }        
                if (entitywolf.isSitting()) {
                    this.Breadpiece1.setRotationPoint(-1.0f, 19f, 0.0f);
                    this.Breadpiece1.rotateAngleX = 0.7853982f;
                    this.wolfTail.setRotationPoint(-2.0F, 21.0F, 7.0F);
                    this.Leg1.setRotationPoint(-2.5f, 23f, 2.0f);
                    this.Leg1.rotateAngleX = 4.712389f;
                    this.Leg2.setRotationPoint(0.5f, 23f, 2.0f);
                    this.Leg2.rotateAngleX = 4.712389f;
                    this.Leg3.setRotationPoint(-2.5f, 16.5f, -4.0f);
                    this.Leg3.rotateAngleX = 5.811947f;
                    this.Leg4.setRotationPoint(0.5f, 16.5f, -4.0f);
                    this.Leg4.rotateAngleX = 5.811947f;
                } else {
                    this.Breadpiece1.setRotationPoint(-1.0f, 14.5f, 2.0f);
                    this.Breadpiece1.rotateAngleX = 1.5707964f;
                    this.wolfTail.setRotationPoint(-2.0F, 11.5F, 8.5F);
                    this.Leg1.setRotationPoint(-2.5f, 16.0f, 7.0f);
                    this.Leg2.setRotationPoint(0.5f, 16.0f, 7.0f);
                    this.Leg3.setRotationPoint(-2.5f, 16f, -4.0f);
                    this.Leg4.setRotationPoint(0.5f, 16.0f, -4.0f);
                    this.Leg1.rotateAngleX = MathHelper.cos((float)(limbSwing * 0.6662f)) * 1.4f * limbSwingAmount;
                    this.Leg2.rotateAngleX = MathHelper.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * 1.4f * limbSwingAmount;
                    this.Leg3.rotateAngleX = MathHelper.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * 1.4f * limbSwingAmount;
                    this.Leg4.rotateAngleX = MathHelper.cos((float)(limbSwing * 0.6662f)) * 1.4f * limbSwingAmount;
                }
                // this.Nose.rotateAngleZ = this.WolfHead.rotateAngleZ = entitywolf.getInterestedAngle(partialTickTime) + entitywolf.getShakeAngle(partialTickTime, 0.0f);
                this.Breadpiece1.rotateAngleZ = entitywolf.getShakeAngle(partialTickTime, -0.16f);
                this.wolfTail.rotateAngleZ = entitywolf.getShakeAngle(partialTickTime, -0.2F);
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,
            Entity par7Entity) {
                this.WolfHead.rotateAngleX = par5 / 57.295776f;
                this.WolfHead.rotateAngleY = par4 / 57.295776f;
                // this.Nose.rotateAngleX = this.WolfHead.rotateAngleX;
                // this.Nose.rotateAngleY = this.WolfHead.rotateAngleY;
                this.wolfTail.rotateAngleX = par3;
    }
}