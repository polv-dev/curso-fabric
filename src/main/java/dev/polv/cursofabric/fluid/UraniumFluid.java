package dev.polv.cursofabric.fluid;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class UraniumFluid extends ModFluid {

    @Override
    public Fluid getStill() {
        return ModFluids.URANIUM_FLUID.staticFluid();
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.URANIUM_FLUID.flowingFluid();
    }

    @Override
    public Item getBucketItem() {
        return ModFluids.URANIUM_FLUID.fluidBucket();
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return ModFluids.URANIUM_FLUID_BLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends UraniumFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends UraniumFluid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }

}
