package net.thep2wking.weirdthings.content.block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlcore.api.block.ModBlockBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.weirdthings.config.WeirdThingsConfig;
import net.thep2wking.weirdthings.content.entity.EntityVillagerDragon;

public class BlockRendium extends ModBlockBase {
	public BlockRendium(String modid, String name, CreativeTabs tab, Material material, SoundType sound,
			MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance,
			int lightLevel) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
		BlockPos abovePos = pos.up();
		IBlockState aboveState = world.getBlockState(abovePos);
		if (aboveState.getBlock() == Blocks.DRAGON_EGG && WeirdThingsConfig.MOBS.VILLAGER_DRAGON && !world.isRemote) {
			player.swingArm(hand);
			world.playEvent(2001, pos, 0);
			world.playEvent(2001, abovePos, 0);
			world.setBlockToAir(pos);
			world.setBlockToAir(abovePos);
			EntityLightningBolt firstLightningBolt = new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ(),
					true);
			world.addWeatherEffect(firstLightningBolt);
			Random rand = new Random();
			for (int i = 0; i < 5; i++) {
				int xOffset = rand.nextInt(7) - 3;
				int zOffset = rand.nextInt(7) - 3;
				BlockPos lightningPos = world.getHeight(pos.add(xOffset, 0, zOffset));
				EntityLightningBolt lightningBolt = new EntityLightningBolt(world, lightningPos.getX(),
						lightningPos.getY() + 8, lightningPos.getZ(), false);
				world.addWeatherEffect(lightningBolt);
			}
			world.newExplosion(null, pos.getX() + 0.5, pos.getY() + 8, pos.getZ() + 0.5, 4.0f, false, false);
			EntityVillagerDragon villagerDragon = new EntityVillagerDragon(world);
			villagerDragon.setPosition(pos.getX() + 0.5, pos.getY() + 8, pos.getZ() + 0.5);
			world.spawnEntity(villagerDragon);
		}
		return aboveState.getBlock() == Blocks.DRAGON_EGG && WeirdThingsConfig.MOBS.VILLAGER_DRAGON;
	}
}