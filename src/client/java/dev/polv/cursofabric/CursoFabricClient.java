package dev.polv.cursofabric;

import dev.polv.cursofabric.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class CursoFabricClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.URANIUM_FLUID.staticFluid(), ModFluids.URANIUM_FLUID.flowingFluid(), new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0x00ff00
		));

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.URANIUM_FLUID.staticFluid(), ModFluids.URANIUM_FLUID.flowingFluid());
	}

}