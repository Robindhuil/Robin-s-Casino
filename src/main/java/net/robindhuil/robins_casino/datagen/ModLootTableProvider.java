package net.robindhuil.robins_casino.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.robindhuil.robins_casino.blocks.ModBlocks;
import net.robindhuil.robins_casino.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHIP_10_BLOCK);
        addDrop(ModBlocks.CHIP_20_BLOCK);
        addDrop(ModBlocks.RED_DIAMOND_BLOCK);


        addDrop(ModBlocks.RED_DIAMOND_ORE, oreDrops(ModBlocks.RED_DIAMOND_ORE, ModItems.RED_DIAMOND));


    }
}
