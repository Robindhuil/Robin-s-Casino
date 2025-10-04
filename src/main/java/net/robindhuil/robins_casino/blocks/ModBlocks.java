package net.robindhuil.robins_casino.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.robindhuil.robins_casino.RobinsCasino;

public class ModBlocks {

    public static final Block CHIP_10_BLOCK = registerBlock("chip_10_block",
            AbstractBlock.Settings.create().strength(0.5f).requires().sounds(BlockSoundGroup.STONE));
    public static final Block CHIP_20_BLOCK = registerBlock("chip_20_block",
            AbstractBlock.Settings.create().strength(0.5f).requires().sounds(BlockSoundGroup.STONE));
    public static final Block RED_DIAMOND_ORE = registerExperienceBlock("red_diamond_ore",
            AbstractBlock.Settings.create().strength(4f).requiresTool().requires().sounds(BlockSoundGroup.AMETHYST_BLOCK));
    public static final Block RED_DIAMOND_BLOCK = registerBlock("red_diamond_block",
            AbstractBlock.Settings.create().strength(4f).requiresTool().requires().sounds(BlockSoundGroup.STONE));

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RobinsCasino.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static Block registerExperienceBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RobinsCasino.MOD_ID, name));
        Block block = new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }


    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RobinsCasino.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks() {
        RobinsCasino.LOGGER.info("Registering Mod Blocks for " + RobinsCasino.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(CHIP_10_BLOCK);
            entries.add(CHIP_20_BLOCK);
        });
    }
}
