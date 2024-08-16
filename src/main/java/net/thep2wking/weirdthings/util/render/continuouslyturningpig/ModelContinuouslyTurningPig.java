package net.thep2wking.weirdthings.util.render.continuouslyturningpig;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelContinuouslyTurningPig extends ModelPig {
    public ModelContinuouslyTurningPig() {
        super();
        this.textureWidth = 64;
        this.textureHeight = 32;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    public void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,
            Entity par7Entity) {
        // super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        this.head.rotateAngleX = par3;
        this.body.rotateAngleX = par3;
        this.leg1.rotateAngleX = par3;
        this.leg2.rotateAngleX = par3;
        this.leg3.rotateAngleX = par3;
        this.leg4.rotateAngleX = par3;
        this.head.rotateAngleY = par3;
        this.body.rotateAngleY = par3;
        this.leg1.rotateAngleY = par3;
        this.leg2.rotateAngleY = par3;
        this.leg3.rotateAngleY = par3;
        this.leg4.rotateAngleY = par3;
        this.head.rotateAngleZ = par3;
        this.body.rotateAngleZ = par3;
        this.leg1.rotateAngleZ = par3;
        this.leg2.rotateAngleZ = par3;
        this.leg3.rotateAngleZ = par3;
        this.leg4.rotateAngleZ = par3;
    }
}