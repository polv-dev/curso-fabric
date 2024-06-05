package dev.polv.cursofabric.datagen;

import dev.polv.cursofabric.blocks.ModBlocks;
import dev.polv.cursofabric.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DatagenLootTableProvider extends FabricBlockLootTableProvider {

    public DatagenLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.URANIUM_BLOCK.getLeft(), drops(ModItems.URANIUM));

        addDrop(ModBlocks.URANIUM_STAIRS.getLeft());
        addDrop(ModBlocks.URANIUM_BUTTON.getLeft());
        addDrop(ModBlocks.URANIUM_PRESSURE_PLATE.getLeft());
        addDrop(ModBlocks.URANIUM_FENCE.getLeft());
        addDrop(ModBlocks.URANIUM_FENCE_GATE.getLeft());
        addDrop(ModBlocks.URANIUM_WALL.getLeft());
        addDrop(ModBlocks.URANIUM_TRAPDOOR.getLeft());

        addDrop(ModBlocks.URANIUM_DOOR.getLeft(), doorDrops(ModBlocks.URANIUM_DOOR.getLeft()));
        addDrop(ModBlocks.URANIUM_SLAB.getLeft(), slabDrops(ModBlocks.URANIUM_SLAB.getLeft()));
    }

}
