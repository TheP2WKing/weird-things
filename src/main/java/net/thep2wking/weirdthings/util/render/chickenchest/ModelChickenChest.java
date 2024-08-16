package net.thep2wking.weirdthings.util.render.chickenchest;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelChickenChest extends ModelChest {
    public ModelRenderer chestLid = new ModelRenderer((ModelBase) this, 0, 0).setTextureSize(64, 64);
    public ModelRenderer chestcrystal = new ModelRenderer((ModelBase) this, 0, 4).setTextureSize(64, 64);
    public ModelRenderer chestBelow;
    public ModelRenderer chestKnob = new ModelRenderer((ModelBase) this, 0, 0).setTextureSize(64, 64);
    public ModelRenderer chin = new ModelRenderer((ModelBase) this, 0, 4).setTextureSize(64, 64);

    public ModelChickenChest() {
        this.chestLid.addBox(0.0f, -5.0f, -14.0f, 14, 5, 14, 0.0f);
        this.chestLid.rotationPointX = 1.0f;
        this.chestLid.rotationPointY = 7.0f;
        this.chestLid.rotationPointZ = 15.0f;
        this.chestKnob.addBox(-2.0f, -2.0f, -15.0f, 4, 2, 2, 0.0f);
        this.chestKnob.rotationPointX = 8.0f;
        this.chestKnob.rotationPointY = 7.0f;
        this.chestKnob.rotationPointZ = 14.0f;
        this.chin.addBox(-1.0f, -1.0f, -16.0f, 2, 2, 2, 0.0f);
        this.chin.rotationPointX = 8.0f;
        this.chin.rotationPointY = 8.0f;
        this.chin.rotationPointZ = 16.0f;
        this.chestBelow = new ModelRenderer((ModelBase) this, 0, 19).setTextureSize(64, 64);
        this.chestBelow.addBox(0.0f, 0.0f, 0.0f, 14, 10, 14, 0.0f);
        this.chestBelow.rotationPointX = 1.0f;
        this.chestBelow.rotationPointY = 6.0f;
        this.chestBelow.rotationPointZ = 1.0f;
    }

    @Override
    public void renderAll() {
        this.chestKnob.rotateAngleX = this.chestLid.rotateAngleX;
        this.chin.rotateAngleX = this.chestLid.rotateAngleX;
        this.chestLid.render(0.0625f);
        this.chestKnob.render(0.0625f);
        this.chin.render(0.0625f);
        this.chestBelow.render(0.0625f);
    }
}