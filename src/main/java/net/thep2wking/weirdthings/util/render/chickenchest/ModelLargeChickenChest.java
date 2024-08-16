package net.thep2wking.weirdthings.util.render.chickenchest;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelLargeChickenChest extends ModelChickenChest {
    public ModelLargeChickenChest() {
        this.chestLid = new ModelRenderer((ModelBase) this, 0, 0).setTextureSize(128, 64);
        this.chestLid.addBox(0.0f, -5.0f, -14.0f, 30, 5, 14, 0.0f);
        this.chestLid.rotationPointX = 1.0f;
        this.chestLid.rotationPointY = 7.0f;
        this.chestLid.rotationPointZ = 15.0f;
        this.chestKnob = new ModelRenderer((ModelBase) this, 0, 0).setTextureSize(128, 64);
        this.chestKnob.addBox(-2.0f, -2.0f, -16.0f, 4, 2, 2, 0.0f);
        this.chestKnob.rotationPointX = 16.0f;
        this.chestKnob.rotationPointY = 7.0f;
        this.chestKnob.rotationPointZ = 15.0f;
        this.chin = new ModelRenderer((ModelBase) this, 0, 4).setTextureSize(128, 64);
        this.chin.addBox(-2.0f, -2.0f, -16.0f, 2, 2, 2, 0.0f);
        this.chin.rotationPointX = 17.0f;
        this.chin.rotationPointY = 9.0f;
        this.chin.rotationPointZ = 16.0f;
        this.chestBelow = new ModelRenderer((ModelBase) this, 0, 19).setTextureSize(128, 64);
        this.chestBelow.addBox(0.0f, 0.0f, 0.0f, 30, 10, 14, 0.0f);
        this.chestBelow.rotationPointX = 1.0f;
        this.chestBelow.rotationPointY = 6.0f;
        this.chestBelow.rotationPointZ = 1.0f;
    }
}