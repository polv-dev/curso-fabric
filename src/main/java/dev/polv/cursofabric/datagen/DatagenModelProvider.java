package dev.polv.cursofabric.datagen;

import dev.polv.cursofabric.blocks.ModBlocks;
import dev.polv.cursofabric.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class DatagenModelProvider extends FabricModelProvider {

    public DatagenModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool uraniumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.URANIUM_BLOCK.getLeft());
        uraniumTexturePool.stairs(ModBlocks.URANIUM_STAIRS.getLeft());
        uraniumTexturePool.slab(ModBlocks.URANIUM_SLAB.getLeft());
        uraniumTexturePool.button(ModBlocks.URANIUM_BUTTON.getLeft());
        uraniumTexturePool.pressurePlate(ModBlocks.URANIUM_PRESSURE_PLATE.getLeft());
        uraniumTexturePool.fence(ModBlocks.URANIUM_FENCE.getLeft());
        uraniumTexturePool.fenceGate(ModBlocks.URANIUM_FENCE_GATE.getLeft());
        uraniumTexturePool.wall(ModBlocks.URANIUM_WALL.getLeft());

        blockStateModelGenerator.registerDoor(ModBlocks.URANIUM_DOOR.getLeft());
        blockStateModelGenerator.registerTrapdoor(ModBlocks.URANIUM_TRAPDOOR.getLeft());
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.URANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.URANIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.URANIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.URANIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.URANIUM_BOOTS);
    }
}
