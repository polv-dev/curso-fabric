package dev.polv.cursofabric.custom;

import dev.polv.cursofabric.CursoFabric;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> RADIOACTIVE_BLOCK_TAG = createTag("radioactive");

        private static TagKey<Block> createTag(String tagId) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(CursoFabric.MODID, tagId));
        }

    }

    public static class Items {

        public static final TagKey<Item> RADIOACTIVE_ITEM_TAG = createTag("radioactive");

        public static final TagKey<Item> RADIOACTIVE_ENCHANTABLE_ITEM = createTag("radioactive_enchantable");

        private static TagKey<Item> createTag(String tagId) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(CursoFabric.MODID, tagId));
        }

    }

}
