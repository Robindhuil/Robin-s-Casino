package net.robindhuil.robins_casino.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.robindhuil.robins_casino.RobinsCasino;

public class ModTags {

    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RobinsCasino.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CARD_ITEMS = createTag("card_items");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RobinsCasino.MOD_ID, name));
        }
    }
}
