package dev.polv.cursofabric.blocks.custom;

import dev.polv.cursofabric.custom.ModDamageTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UraniumBlock extends Block {

    public UraniumBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.damage(ModDamageTypes.of(world, ModDamageTypes.RADIATION_DAMAGE_TYPE), 0.5f);
        }
    }
}
