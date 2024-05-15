package dev.polv.cursofabric.blocks;

import dev.polv.cursofabric.CursoFabric;
import dev.polv.cursofabric.blocks.custom.UraniumBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

public class ModBlocks {

    public static final Pair<Block, Item> URANIUM_BLOCK = registerBlock("uranium_block", new UraniumBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    private static Pair<Block, Item> registerBlock(String name, Block block) {
        return new Pair<>(
                Registry.register(Registries.BLOCK, new Identifier(CursoFabric.MODID, name), block),
                Registry.register(Registries.ITEM, new Identifier(CursoFabric.MODID, name), new BlockItem(block, new Item.Settings()))
        );
    }

    public static void registerBlocks() {
        CursoFabric.LOGGER.info("Registrando bloques...");
    }

}
