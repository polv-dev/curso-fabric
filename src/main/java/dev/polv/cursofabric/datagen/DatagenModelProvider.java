package dev.polv.cursofabric.datagen;

import dev.polv.cursofabric.blocks.ModBlocks;
import dev.polv.cursofabric.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class DatagenModelProvider extends FabricModelProvider {

    public DatagenModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK.getLeft());
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.URANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_HOE, Models.HANDHELD);
    }
}
