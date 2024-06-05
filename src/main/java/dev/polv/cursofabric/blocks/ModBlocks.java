package dev.polv.cursofabric.blocks;

import dev.polv.cursofabric.CursoFabric;
import dev.polv.cursofabric.blocks.custom.UraniumBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

public class ModBlocks {

    public static final Pair<Block, Item> URANIUM_BLOCK = registerBlock("uranium_block", new UraniumBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Pair<Block, Item> URANIUM_STAIRS = registerBlock(
            "uranium_stairs",
            new StairsBlock(URANIUM_BLOCK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );
    public static final Pair<Block, Item> URANIUM_SLAB = registerBlock(
            "uranium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );

    public static final Pair<Block, Item> URANIUM_BUTTON = registerBlock(
            "uranium_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );
    public static final Pair<Block, Item> URANIUM_PRESSURE_PLATE = registerBlock(
            "uranium_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );

    public static final Pair<Block, Item> URANIUM_FENCE = registerBlock(
            "uranium_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );
    public static final Pair<Block, Item> URANIUM_FENCE_GATE = registerBlock(
            "uranium_fence_gate",
            new FenceGateBlock(WoodType.WARPED, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );
    public static final Pair<Block, Item> URANIUM_WALL = registerBlock(
            "uranium_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );

    public static final Pair<Block, Item> URANIUM_DOOR = registerBlock(
            "uranium_door",
            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );
    public static final Pair<Block, Item> URANIUM_TRAPDOOR = registerBlock(
            "uranium_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK))
    );

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
