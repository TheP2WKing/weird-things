package net.thep2wking.weirdthings.util.render.withergirl;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityWitherGirl;

@SideOnly(value=Side.CLIENT)
public class ModelWitherGirl
extends ModelBiped {
    public ModelRenderer supporter = new ModelRenderer((ModelBase)this, 0, 32);
    public ModelRenderer[] extraHeads;
    public ModelRenderer bipedBigBoobs;
    public ModelRenderer bipedBigPreg;
    public ModelRenderer bipedHair1;
    public ModelRenderer bipedHair2;
    public boolean isFlying;
    public boolean beingInnocent;
    public boolean isTreadingWater;

    public ModelWitherGirl() {
        this(0.0f);
    }

    public ModelWitherGirl(float p_i1148_1_) {
        this(p_i1148_1_, 0.0f, 64, 64);
    }

    public ModelWitherGirl(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_) {
        super(p_i1149_1_, 0.0f, 64, 64);
        this.supporter.addBox(-14.0f, -1.0f, 1.0f, 28, 2, 2, p_i1149_1_);
        this.supporter.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.extraHeads = new ModelRenderer[2];
        this.extraHeads[0] = new ModelRenderer((ModelBase)this, 0, 36);
        this.extraHeads[0].addBox(-3.0f, -3.0f, -3.0f, 6, 6, 6, p_i1149_1_);
        this.extraHeads[0].rotationPointX = -13.0f;
        this.extraHeads[0].rotationPointZ = 2.0f;
        this.extraHeads[1] = new ModelRenderer((ModelBase)this, 0, 36);
        this.extraHeads[1].addBox(-3.0f, -3.0f, -3.0f, 6, 6, 6, p_i1149_1_);
        this.extraHeads[1].rotationPointX = 14.0f;
        this.extraHeads[1].rotationPointZ = 2.0f;
        this.bipedBigBoobs = new ModelRenderer((ModelBase)this, 0, 48);
        this.bipedBigBoobs.addBox(-4.0f, 2.0f, -4.8f, 8, 4, 3, p_i1149_1_);
        this.bipedBigBoobs.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedBigPreg = new ModelRenderer((ModelBase)this, 20, 54);
        this.bipedBigPreg.addBox(-4.0f, 6.5f, -6.0f, 8, 6, 4, p_i1149_1_);
        this.bipedBigPreg.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedHair1 = new ModelRenderer((ModelBase)this, 40, 36);
        this.bipedHair1.addBox(-4.0f, -2.0f, 2.0f, 8, 10, 1, p_i1149_1_);
        this.bipedHair1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedHair2 = new ModelRenderer((ModelBase)this, 40, 36);
        this.bipedHair2.addBox(-4.0f, -1.0f, 3.0f, 8, 10, 1, p_i1149_1_);
        this.bipedHair2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedLeftArm.setRotationPoint(5.0f, 1.0f + MathHelper.cos((float)this.bipedBody.rotateAngleX) * 1.0f, 0.0f + MathHelper.sin((float)this.bipedBody.rotateAngleX) * 2.0f);
        this.bipedRightArm.setRotationPoint(-5.0f, 1.0f + MathHelper.cos((float)this.bipedBody.rotateAngleX) * 1.0f, 0.0f + MathHelper.sin((float)this.bipedBody.rotateAngleX) * 2.0f);
        this.bipedLeftLeg.setRotationPoint(2.0f, 12.0f + MathHelper.cos((float)this.bipedBody.rotateAngleX) * 12.0f, 0.0f + MathHelper.sin((float)this.bipedBody.rotateAngleX) * 12.0f);
        this.bipedRightLeg.setRotationPoint(-2.0f, 12.0f + MathHelper.cos((float)this.bipedBody.rotateAngleX) * 12.0f, 0.0f + MathHelper.sin((float)this.bipedBody.rotateAngleX) * 12.0f);
    }

    public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
        this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);
        GlStateManager.pushMatrix();
        if (this.isChild) {
            float f6 = 3.0f;
            GlStateManager.scale((float)(2.25f / f6), (float)(2.25f / f6), (float)(2.25f / f6));
            GlStateManager.translate((float)0.0f, (float)(22.0f * p_78088_7_), (float)0.0f);
            this.bipedHead.render(p_78088_7_);
            this.bipedHeadwear.render(p_78088_7_);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GlStateManager.translate((float)0.0f, (float)(48.0f * p_78088_7_), (float)0.0f);
            this.bipedBody.render(p_78088_7_);
            this.bipedRightArm.render(p_78088_7_);
            this.bipedLeftArm.render(p_78088_7_);
            this.bipedRightLeg.render(p_78088_7_);
            this.bipedLeftLeg.render(p_78088_7_);
        } else {
            if (p_78088_1_.isSneaking()) {
                GlStateManager.translate((float)0.0f, (float)0.2f, (float)0.0f);
            }
            this.bipedHead.render(p_78088_7_);
            this.bipedBody.render(p_78088_7_);
            this.bipedRightArm.render(p_78088_7_);
            this.bipedLeftArm.render(p_78088_7_);
            this.bipedRightLeg.render(p_78088_7_);
            this.bipedLeftLeg.render(p_78088_7_);
            this.bipedBigBoobs.render(p_78088_7_);
            this.bipedHair1.render(p_78088_7_);
            this.bipedHair2.render(p_78088_7_);
            this.bipedHeadwear.render(p_78088_7_);
            this.supporter.render(p_78088_7_);
            for (ModelRenderer modelrenderer : this.extraHeads) {
                modelrenderer.render(p_78088_7_);
            }
            if (this.isSneak) {
                this.bipedBigPreg.render(p_78088_7_);
            }
        }
        GlStateManager.popMatrix();
    }

	@SuppressWarnings("deprecation")
    public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_) {
        EntityWitherGirl entitywither = (EntityWitherGirl)p_78086_1_;
        Block block1 = entitywither.world.getBlockState(new BlockPos(entitywither.posX, entitywither.posY - 0.25, entitywither.posZ)).getBlock();
        Block block2 = entitywither.world.getBlockState(new BlockPos(entitywither.posX, entitywither.posY - 0.75, entitywither.posZ)).getBlock();
        this.isFlying = !entitywither.onGround && !block1.getMaterial(block1.getDefaultState()).isLiquid() && !block2.getMaterial(block2.getDefaultState()).isLiquid() && entitywither.getRidingEntity() == null;
        this.isRiding = entitywither.isRiding();
        this.isSneak = entitywither.isSneaking();
        // this.aimedBow = block1.getMaterial().isLiquid() && block2.getMaterial().isLiquid();
        this.isTreadingWater = (double)entitywither.limbSwingAmount < 0.001 && !this.isSneak && !this.isRiding;
        this.swingProgress = entitywither.getSwingProgress(p_78086_4_);
        // this.beingInnocent = entitywither.isBeingOffered;
        // this.extraHeads[0].rotateAngleY = (entitywither.func_82207_a(0) - p_78086_1_.renderYawOffset) / 57.295776f;
        // this.extraHeads[0].rotateAngleX = entitywither.func_82210_r(0) / 57.295776f;
        // this.extraHeads[1].rotateAngleY = (entitywither.func_82207_a(1) - p_78086_1_.renderYawOffset) / 57.295776f;
        // this.extraHeads[1].rotateAngleX = entitywither.func_82210_r(1) / 57.295776f;
    }

    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
        super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
        ModelWitherGirl.copyModelAngles((ModelRenderer)this.bipedHead, (ModelRenderer)this.bipedHeadwear);
        ModelWitherGirl.copyModelAngles((ModelRenderer)this.bipedBody, (ModelRenderer)this.bipedBigPreg);
        float fl = MathHelper.cos((float)(p_78087_3_ * 0.122857146f));
        this.bipedHair1.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHair1.rotateAngleX = this.bipedHead.rotateAngleX / 3.0f;
        this.bipedHair2.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHair2.rotateAngleX = this.bipedHead.rotateAngleX / 2.0f;
        this.bipedHair1.rotateAngleZ = this.bipedHead.rotateAngleZ;
        this.bipedHair2.rotateAngleZ = this.bipedHead.rotateAngleZ;
        this.bipedBigBoobs.rotateAngleX = this.bipedBody.rotateAngleX;
        this.bipedBigPreg.rotateAngleX = this.bipedBody.rotateAngleX;
        this.bipedBigBoobs.rotateAngleX = MathHelper.cos((float)(p_78087_1_ * 0.8f)) * -0.2f * p_78087_2_;
        this.bipedBigBoobs.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.06662f)) * 0.025f;
        if (this.isFlying) {
            this.bipedBigBoobs.rotateAngleX = this.bipedBody.rotateAngleX;
            this.bipedBigPreg.rotateAngleX = this.bipedBody.rotateAngleX;
            this.bipedLeftLeg.rotateAngleX = (0.15f + 0.15f * fl) * (float)Math.PI;
            this.bipedRightLeg.rotateAngleX = (0.15f + 0.15f * fl) * (float)Math.PI;
            this.bipedLeftLeg.rotateAngleZ = (-0.05f + 0.05f * fl) * (float)Math.PI;
            this.bipedRightLeg.rotateAngleZ = (0.05f + -0.05f * fl) * (float)Math.PI;
            this.bipedLeftLeg.rotateAngleY = (-0.05f + 0.05f * fl) * (float)Math.PI;
            this.bipedRightLeg.rotateAngleY = (0.05f + -0.05f * fl) * (float)Math.PI;
            this.bipedRightArm.rotateAngleX = (0.1f + 0.2f * fl) * (float)Math.PI;
            this.bipedLeftArm.rotateAngleX = (0.1f + 0.2f * fl) * (float)Math.PI;
            this.bipedRightArm.rotateAngleY = (0.1f + -0.15f * fl) * (float)Math.PI;
            this.bipedLeftArm.rotateAngleY = (-0.1f + 0.15f * fl) * (float)Math.PI;
            this.bipedLeftArm.rotateAngleZ = (-0.075f + 0.05f * fl) * (float)Math.PI;
            this.bipedRightArm.rotateAngleZ = (0.075f + -0.05f * fl) * (float)Math.PI;
        } else {
            float f7;
            float f6;
            this.bipedRightArm.rotateAngleZ = 0.0f;
            this.bipedLeftArm.rotateAngleZ = 0.0f;
            this.bipedRightLeg.rotateAngleZ = 0.0f;
            this.bipedLeftLeg.rotateAngleZ = 0.0f;
            this.bipedRightArm.rotateAngleX = MathHelper.cos((float)(p_78087_1_ * 0.6662f + (float)Math.PI)) * 2.0f * p_78087_2_ * 0.5f;
            this.bipedLeftArm.rotateAngleX = MathHelper.cos((float)(p_78087_1_ * 0.6662f)) * 2.0f * p_78087_2_ * 0.5f;
            this.bipedRightArm.rotateAngleZ = 0.0f;
            this.bipedLeftArm.rotateAngleZ = 0.0f;
            this.bipedRightLeg.rotateAngleX = MathHelper.cos((float)(p_78087_1_ * 0.6662f)) * 1.4f * p_78087_2_;
            this.bipedLeftLeg.rotateAngleX = MathHelper.cos((float)(p_78087_1_ * 0.6662f + (float)Math.PI)) * 1.4f * p_78087_2_;
            this.bipedRightLeg.rotateAngleZ = 0.0f;
            this.bipedLeftLeg.rotateAngleZ = 0.0f;
            this.bipedRightArm.rotateAngleY = 0.0f;
            this.bipedLeftArm.rotateAngleY = 0.0f;
            this.bipedRightLeg.rotateAngleY = 0.0f;
            this.bipedLeftLeg.rotateAngleY = 0.0f;
            if (this.isRiding) {
                this.bipedHead.rotateAngleX -= 0.75f;
                this.bipedHeadwear.rotateAngleX -= 0.75f;
                this.bipedHair1.rotateAngleX -= 0.75f;
                this.bipedHair2.rotateAngleX -= 0.75f;
                if (this.isSneak) {
                    this.bipedBigBoobs.rotateAngleX -= 0.25f;
                    this.bipedHead.rotateAngleX += 0.75f;
                    this.bipedHeadwear.rotateAngleX += 0.75f;
                    this.bipedHair1.rotateAngleX += 0.75f;
                    this.bipedHair2.rotateAngleX += 0.75f;
                    this.bipedRightArm.rotateAngleX = -1.75f;
                    this.bipedLeftArm.rotateAngleX = -1.75f;
                    this.bipedRightLeg.rotateAngleX = -1.75f;
                    this.bipedLeftLeg.rotateAngleX = -1.75f;
                    this.bipedRightLeg.rotateAngleY = 0.3926991f;
                    this.bipedLeftLeg.rotateAngleY = -0.3926991f;
                    this.bipedRightArm.rotateAngleY -= 0.1f;
                    this.bipedLeftArm.rotateAngleY += 0.1f;
                    this.bipedBody.rotateAngleX = -0.6f;
                    this.bipedBigPreg.rotateAngleX = -0.6f;
                    this.bipedRightLeg.rotationPointZ = -6.0f;
                    this.bipedLeftLeg.rotationPointZ = -6.0f;
                    this.bipedRightLeg.rotationPointY = 10.0f;
                    this.bipedLeftLeg.rotationPointY = 10.0f;
                    this.bipedBigBoobs.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.9993f)) * 0.05f;
                    this.bipedHead.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.9993f)) * 0.05f;
                    this.bipedHeadwear.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.9993f)) * 0.05f;
                } else {
                    this.bipedRightLeg.rotationPointY = 12.0f;
                    this.bipedLeftLeg.rotationPointY = 12.0f;
                    this.bipedRightArm.rotateAngleX += -0.62831855f;
                    this.bipedLeftArm.rotateAngleX += -0.62831855f;
                    this.bipedRightLeg.rotateAngleX = -1.2566371f;
                    this.bipedLeftLeg.rotateAngleX = -1.2566371f;
                    this.bipedRightLeg.rotateAngleY = 0.31415927f;
                    this.bipedLeftLeg.rotateAngleY = -0.31415927f;
                    if (this.isChild) {
                        this.bipedHead.rotateAngleX += 0.5f;
                        this.bipedHeadwear.rotateAngleX += 0.5f;
                        this.bipedRightArm.rotateAngleX = -1.75f;
                        this.bipedLeftArm.rotateAngleX = -1.75f;
                        this.bipedRightLeg.rotateAngleX = -1.75f;
                        this.bipedLeftLeg.rotateAngleX = -1.75f;
                        this.bipedRightLeg.rotateAngleY = 0.3926991f;
                        this.bipedLeftLeg.rotateAngleY = -0.3926991f;
                        this.bipedRightArm.rotateAngleY += 0.2f;
                        this.bipedLeftArm.rotateAngleY -= 0.2f;
                        this.bipedBody.rotateAngleX = -0.6f;
                        this.bipedRightLeg.rotationPointZ = -6.0f;
                        this.bipedLeftLeg.rotationPointZ = -6.0f;
                        this.bipedRightLeg.rotationPointY = 10.0f;
                        this.bipedLeftLeg.rotationPointY = 10.0f;
                    }
                }
            } else if (this.isSneak) {
                this.bipedBody.rotateAngleX = -0.6f;
                this.bipedBigPreg.rotateAngleX = -0.6f;
                this.bipedBigBoobs.rotateAngleX -= 0.5f;
                this.bipedRightArm.rotateAngleX += 0.2f;
                this.bipedLeftArm.rotateAngleX += 0.2f;
                this.bipedRightArm.rotateAngleY += 0.15f;
                this.bipedLeftArm.rotateAngleY -= 0.15f;
                this.bipedRightLeg.rotateAngleX = -1.5707964f;
                this.bipedLeftLeg.rotateAngleX = -1.5707964f;
                this.bipedRightLeg.rotateAngleZ -= 0.2f;
                this.bipedLeftLeg.rotateAngleZ += 0.2f;
                this.bipedRightLeg.rotateAngleY += 0.3f;
                this.bipedLeftLeg.rotateAngleY -= 0.3f;
                this.bipedRightLeg.rotationPointZ = -6.0f;
                this.bipedLeftLeg.rotationPointZ = -6.0f;
                this.bipedRightLeg.rotationPointY = 10.0f;
                this.bipedLeftLeg.rotationPointY = 10.0f;
                this.bipedBody.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.1f)) * 0.025f;
                this.bipedBigPreg.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.1f)) * 0.025f;
                this.bipedBigBoobs.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.1f)) * 0.05f;
                this.bipedHead.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.1f)) * 0.05f;
                this.bipedHeadwear.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.1f)) * 0.05f;
            }
            this.bipedHead.rotateAngleZ = 0.0f;
            // if (this.) {
            //     this.bipedHead.rotateAngleX -= 0.5f + MathHelper.cos((float)(p_78087_3_ * 0.15f)) * 0.15f;
            //     this.bipedHeadwear.rotateAngleX -= 0.5f + MathHelper.cos((float)(p_78087_3_ * 0.15f)) * 0.15f;
            //     this.bipedRightArm.rotateAngleX -= 1.75f;
            //     this.bipedLeftArm.rotateAngleX -= 1.75f;
            //     this.bipedRightLeg.rotateAngleX += 0.75f;
            //     this.bipedLeftLeg.rotateAngleX += 0.75f;
            //     this.bipedRightLeg.rotateAngleX *= 0.5f;
            //     this.bipedLeftLeg.rotateAngleX *= 0.5f;
            //     this.bipedRightArm.rotateAngleZ -= 0.5f;
            //     this.bipedLeftArm.rotateAngleZ += 0.5f;
            //     this.bipedRightLeg.rotateAngleZ += 0.5f;
            //     this.bipedLeftLeg.rotateAngleZ -= 0.5f;
            //     if (this.isTreadingWater && !this.isSneak) {
            //         this.bipedRightLeg.rotateAngleX += MathHelper.cos((float)(p_78087_3_ * 0.2f)) * 0.75f;
            //         this.bipedLeftLeg.rotateAngleX -= MathHelper.cos((float)(p_78087_3_ * 0.2f)) * 0.75f;
            //         this.bipedRightArm.rotateAngleY += MathHelper.cos((float)(p_78087_3_ * 0.15f)) * 0.5f;
            //         this.bipedLeftArm.rotateAngleY -= MathHelper.cos((float)(p_78087_3_ * 0.15f)) * 0.5f;
            //     } else {
            //         this.bipedHead.rotateAngleX -= 0.5f;
            //         this.bipedHeadwear.rotateAngleX -= 0.5f;
            //         this.bipedRightArm.rotateAngleX -= 1.25f;
            //         this.bipedLeftArm.rotateAngleX -= 1.25f;
            //         this.bipedRightLeg.rotateAngleX -= 0.25f;
            //         this.bipedLeftLeg.rotateAngleX -= 0.25f;
            //     }
            // }
            // if (this.heldItemLeft != 0) {
            //     this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemLeft;
            // }
            this.bipedRightArm.rotateAngleY = 0.0f;
            this.bipedRightArm.rotateAngleZ = 0.0f;
            // switch (this.heldItemRight) {
            //     default: {
            //         break;
            //     }
            //     case 1: {
            //         this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemRight;
            //         break;
            //     }
            //     case 3: {
            //         this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemRight;
            //         this.bipedRightArm.rotateAngleY = -0.5235988f;
            //     }
            // }
            if (this.swingProgress > -9990.0f) {
                f6 = this.swingProgress;
                this.bipedBody.rotateAngleY = MathHelper.sin((float)(MathHelper.sqrt((float)f6) * (float)Math.PI * 2.0f)) * 0.2f;
                this.bipedRightArm.rotationPointZ = MathHelper.sin((float)this.bipedBody.rotateAngleY) * 5.0f;
                this.bipedRightArm.rotationPointX = -MathHelper.cos((float)this.bipedBody.rotateAngleY) * 5.0f;
                this.bipedLeftArm.rotationPointZ = -MathHelper.sin((float)this.bipedBody.rotateAngleY) * 5.0f;
                this.bipedLeftArm.rotationPointX = MathHelper.cos((float)this.bipedBody.rotateAngleY) * 5.0f;
                this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
                this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
                this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
                f6 = 1.0f - this.swingProgress;
                f6 *= f6;
                f6 *= f6;
                f6 = 1.0f - f6;
                f7 = MathHelper.sin((float)(f6 * (float)Math.PI));
                float f8 = MathHelper.sin((float)(this.swingProgress * (float)Math.PI)) * -(this.bipedHead.rotateAngleX - 0.7f) * 0.75f;
                this.bipedRightArm.rotateAngleX = (float)((double)this.bipedRightArm.rotateAngleX - ((double)f7 * 1.2 + (double)f8));
                this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0f;
                this.bipedRightArm.rotateAngleZ += MathHelper.sin((float)(this.swingProgress * (float)Math.PI)) * -0.4f;
            }
            if (this.beingInnocent) {
                f6 = 0.0f;
                f7 = 0.0f;
                this.bipedRightArm.rotateAngleZ = 0.0f;
                this.bipedLeftArm.rotateAngleZ = 0.0f;
                this.bipedRightArm.rotateAngleY = -(0.1f - f6 * 0.6f) + this.bipedHead.rotateAngleY - 0.4f;
                this.bipedLeftArm.rotateAngleY = 0.1f - f6 * 0.6f + this.bipedHead.rotateAngleY + 0.4f;
                this.bipedRightArm.rotateAngleX = -0.62831855f + this.bipedHead.rotateAngleX;
                this.bipedLeftArm.rotateAngleX = -0.62831855f + this.bipedHead.rotateAngleX;
                this.bipedRightArm.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.bipedLeftArm.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
                this.bipedRightArm.rotateAngleZ += MathHelper.cos((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
                this.bipedLeftArm.rotateAngleZ -= MathHelper.cos((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
                this.bipedRightArm.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.067f)) * 0.05f;
                this.bipedLeftArm.rotateAngleX -= MathHelper.sin((float)(p_78087_3_ * 0.067f)) * 0.05f;
                this.bipedHead.rotateAngleZ = 0.3f;
            } else {
                this.bipedHead.rotateAngleZ = 0.0f;
            }
        }
        if (!this.isSneak) {
            this.bipedRightArm.rotateAngleZ += MathHelper.cos((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
            this.bipedLeftArm.rotateAngleZ -= MathHelper.cos((float)(p_78087_3_ * 0.09f)) * 0.05f + 0.05f;
            this.bipedRightArm.rotateAngleX += MathHelper.sin((float)(p_78087_3_ * 0.067f)) * 0.05f;
            this.bipedLeftArm.rotateAngleX -= MathHelper.sin((float)(p_78087_3_ * 0.067f)) * 0.05f;
        }
    }

    public void setModelAttributes(ModelBase p_178686_1_) {
        super.setModelAttributes(p_178686_1_);
        if (p_178686_1_ instanceof ModelWitherGirl) {
            ModelWitherGirl modelbiped = (ModelWitherGirl)p_178686_1_;
            this.isFlying = modelbiped.isFlying;
            this.beingInnocent = modelbiped.beingInnocent;
            this.isTreadingWater = modelbiped.isTreadingWater;
        }
    }
}

