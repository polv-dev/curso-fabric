package dev.polv.cursofabric.datagen;

import dev.polv.cursofabric.blocks.ModBlocks;
import dev.polv.cursofabric.custom.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class DatagenBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public DatagenBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.URANIUM_BLOCK.getLeft());

        getOrCreateTagBuilder(ModTags.Blocks.RADIOACTIVE_BLOCK_TAG)
                .add(ModBlocks.URANIUM_BLOCK.getLeft());
    }

}
