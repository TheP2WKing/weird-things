package net.thep2wking.weirdthings.util.render.endermanchicken;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEndermanChicken extends ModelEnderman {
    ModelRenderer Mouth;
    ModelRenderer Mouth2;

	public ModelEndermanChicken() {
        super(0.0f);
        this.Mouth = new ModelRenderer((ModelBase)this, 32, 0);
        this.Mouth.addBox(-4.0f, -8.0f, -4.0f, 4, 2, 2);
        this.Mouth.setRotationPoint(2.0f, 5.0f, -1.5f);
        this.Mouth.setTextureSize(96, 32);
        this.setRotation(this.Mouth, 0.0f, 0.0f, 0.0f);
        this.Mouth2 = new ModelRenderer((ModelBase)this, 32, 4);
        this.Mouth2.addBox(-4.0f, -8.0f, -4.0f, 2, 2, 2);
        this.Mouth2.setRotationPoint(3.0f, 6.0f, -1.0f);
        this.Mouth2.setTextureSize(96, 32);
        this.setRotation(this.Mouth2, 0.0f, 0.0f, 0.0f);
        this.bipedHead.addChild(Mouth);
        this.bipedHead.addChild(Mouth2);
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
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	}
}