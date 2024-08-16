package net.thep2wking.weirdthings.util.render.villagerwither;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelWither;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelVillagerWither extends ModelWither {
    private ModelRenderer[] field_82905_a;
    private ModelRenderer[] field_82904_b;

    public ModelVillagerWither(float p_i46302_1_) {
        super(p_i46302_1_);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.field_82905_a = new ModelRenderer[3];
        this.field_82905_a[0] = new ModelRenderer((ModelBase)this, 0, 18);
        this.field_82905_a[0].addBox(-10.0f, 3.9f, -0.5f, 20, 3, 3);
        this.field_82905_a[1] = new ModelRenderer((ModelBase)this).setTextureSize(this.textureWidth, this.textureHeight);
        this.field_82905_a[1].setRotationPoint(-2.0f, 6.9f, -0.5f);
        this.field_82905_a[1].setTextureOffset(0, 22).addBox(0.0f, 0.0f, 0.0f, 3, 10, 3);
        this.field_82905_a[1].setTextureOffset(24, 22).addBox(-4.0f, 1.5f, 0.5f, 11, 2, 2);
        this.field_82905_a[1].setTextureOffset(24, 22).addBox(-4.0f, 4.0f, 0.5f, 11, 2, 2);
        this.field_82905_a[1].setTextureOffset(24, 22).addBox(-4.0f, 6.5f, 0.5f, 11, 2, 2);
        this.field_82905_a[2] = new ModelRenderer((ModelBase)this, 12, 24);
        this.field_82905_a[2].addBox(0.0f, 0.0f, 0.0f, 3, 6, 3);
        this.field_82904_b = new ModelRenderer[3];
        this.field_82904_b[0] = new ModelRenderer((ModelBase)this, 0, 0);
        this.field_82904_b[0].addBox(-4.0f, -8.0f, -4.0f, 8, 10, 8);
        this.field_82904_b[0].setTextureOffset(24, 0).addBox(-1.0f, -1.0f, -6.0f, 2, 4, 2);
        this.field_82904_b[0].setRotationPoint(0.0f, 2.0f, 0.0f);
        this.field_82904_b[1] = new ModelRenderer((ModelBase)this, 32, 0);
        this.field_82904_b[1].addBox(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.field_82904_b[1].rotationPointX = -8.0f;
        this.field_82904_b[1].rotationPointY = 4.0f;
        this.field_82904_b[2] = new ModelRenderer((ModelBase)this, 32, 0);
        this.field_82904_b[2].addBox(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.field_82904_b[2].rotationPointX = 10.0f;
        this.field_82904_b[2].rotationPointY = 4.0f;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        for (ModelRenderer modelrenderer : this.field_82904_b) {
            modelrenderer.render(f5);
        }
        for (ModelRenderer modelrenderer : this.field_82905_a) {
            modelrenderer.render(f5);
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
                float f6 = MathHelper.cos((float)(par3 * 0.1f));
                this.field_82905_a[1].rotateAngleX = (0.065f + 0.05f * f6) * (float)Math.PI;
                this.field_82905_a[2].setRotationPoint(-2.0f, 6.9f + MathHelper.cos((float)this.field_82905_a[1].rotateAngleX) * 10.0f, -0.5f + MathHelper.sin((float)this.field_82905_a[1].rotateAngleX) * 10.0f);
                this.field_82905_a[2].rotateAngleX = (0.265f + 0.1f * f6) * (float)Math.PI;
                this.field_82904_b[0].rotateAngleY = par4 / 57.295776f;
                this.field_82904_b[0].rotateAngleX = par5 / 57.295776f;
    }
}