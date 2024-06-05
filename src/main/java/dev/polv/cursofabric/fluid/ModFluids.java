package dev.polv.cursofabric.fluid;

import dev.polv.cursofabric.CursoFabric;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {

    public static final RegisteredFluid URANIUM_FLUID = registeredFluid(
            "uranium",
            new UraniumFluid.Still(),
            new UraniumFluid.Flowing()
    );

    public static final FluidBlock URANIUM_FLUID_BLOCK = registeredFluidBlock(
            "uranium",
            URANIUM_FLUID.staticFluid()
    );

    public record RegisteredFluid(Fluid staticFluid, Fluid flowingFluid, BucketItem fluidBucket) {}

    private static RegisteredFluid registeredFluid(String fluidId, Fluid staticFluid, Fluid flowingFluid) {
        Fluid registeredStaticFluid = Registry.register(Registries.FLUID, new Identifier(CursoFabric.MODID, "static_" + fluidId), staticFluid);
        Fluid registeredFlowingFluid = Registry.register(Registries.FLUID, new Identifier(CursoFabric.MODID, "flowing_" + fluidId), flowingFluid);
        BucketItem bucketItem = Registry.register(Registries.ITEM, new Identifier(CursoFabric.MODID, fluidId + "_bucket"), new BucketItem(registeredStaticFluid, new Item.Settings().maxCount(1)));

        return new RegisteredFluid(registeredStaticFluid, registeredFlowingFluid, bucketItem);
    }

    private static FluidBlock registeredFluidBlock(String fluidId, Fluid staticFluid) {
        FluidBlock fluidBlock = Registry.register(
                Registries.BLOCK,
                new Identifier(CursoFabric.MODID, fluidId + "_liquid"),
                new FluidBlock((FlowableFluid) staticFluid, FabricBlockSettings.copy(Blocks.WATER))
        );

        return fluidBlock;
    }

    public static void registerFluids() {
        CursoFabric.LOGGER.info("Registrando fluidos...");
    }

}
