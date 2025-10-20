package net.robindhuil.robins_casino.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.robindhuil.robins_casino.blocks.ModBlocks;
import net.robindhuil.robins_casino.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHIP_10_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHIP_20_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHIP10, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHIP20, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHISKEY_BOTTLE,Models.GENERATED);

        itemModelGenerator.register(ModItems.CARD_2_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_3_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_4_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_5_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_6_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_7_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_8_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_9_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_10_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_J_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_Q_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_K_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_A_CLUB, Models.GENERATED);

        itemModelGenerator.register(ModItems.CARD_2_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_3_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_4_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_5_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_6_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_7_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_8_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_9_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_10_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_J_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_Q_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_K_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_A_HEART, Models.GENERATED);

        itemModelGenerator.register(ModItems.CARD_2_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_3_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_4_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_5_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_6_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_7_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_8_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_9_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_10_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_J_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_Q_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_K_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_A_DIAMOND, Models.GENERATED);

        itemModelGenerator.register(ModItems.CARD_2_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_3_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_4_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_5_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_6_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_7_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_8_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_9_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_10_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_J_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_Q_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_K_SPADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARD_A_SPADE, Models.GENERATED);
    }
}
