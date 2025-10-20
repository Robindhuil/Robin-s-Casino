package net.robindhuil.robins_casino.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.robindhuil.robins_casino.blocks.ModBlocks;
import net.robindhuil.robins_casino.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.CHIP10, RecipeCategory.DECORATIONS, ModBlocks.CHIP_10_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.CHIP20, RecipeCategory.DECORATIONS, ModBlocks.CHIP_20_BLOCK);


                ShapedRecipeJsonBuilder.create(itemLookup, RecipeCategory.DECORATIONS, ModBlocks.RED_DIAMOND_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.RED_DIAMOND)
                        .criterion(hasItem(ModItems.RED_DIAMOND), conditionsFromItem(ModItems.RED_DIAMOND))
                        .offerTo(exporter);

                ShapelessRecipeJsonBuilder.create(itemLookup, RecipeCategory.MISC, ModItems.RED_DIAMOND, 9)
                        .input(ModBlocks.RED_DIAMOND_BLOCK)
                        .criterion(hasItem(ModBlocks.RED_DIAMOND_BLOCK), conditionsFromItem(ModBlocks.RED_DIAMOND_BLOCK))
                        .offerTo(exporter);
            }
        };
        }

    @Override
    public String getName() {
        return "Mod recipe provider";
    }
}
