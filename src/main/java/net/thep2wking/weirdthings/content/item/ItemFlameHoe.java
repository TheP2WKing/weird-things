package net.thep2wking.weirdthings.content.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.tool.ModItemHoeBase;

public class ItemFlameHoe extends ModItemHoeBase {
	public ItemFlameHoe(String modid, String name, CreativeTabs tab, ToolMaterial material, float attackDamage,
			float attackSpeed, EnumRarity rarity, boolean hasEffect, int tooltipLines, int annotationLines) {
		super(modid, name, tab, material, attackDamage, attackSpeed, rarity, hasEffect, tooltipLines, annotationLines);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (entity instanceof EntityLivingBase) {
			entity.setFire(5);
		}
		return super.onLeftClickEntity(stack, player, entity);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!player.isSneaking()) {
			if (!worldIn.isRemote) {
				for (int i = 0; i < 10; i++) {
					EntityLightningBolt lightningBolt = new EntityLightningBolt(worldIn, pos.getX() + Math.random(),
							pos.getY(), pos.getZ() + Math.random(), false);
					worldIn.addWeatherEffect(lightningBolt);
				}
				ItemStack stack = player.getHeldItem(hand);
				stack.damageItem(1, player);
			}
			return EnumActionResult.SUCCESS;
		}
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}