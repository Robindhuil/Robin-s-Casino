package net.robindhuil.robins_casino.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.client.data.Models;
import net.minecraft.registry.RegistryWrapper;
import net.robindhuil.robins_casino.item.ModItems;
import net.robindhuil.robins_casino.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.CARD_ITEMS)

                .add(ModItems.CARD_2_CLUB)
                .add(ModItems.CARD_3_CLUB)
                .add(ModItems.CARD_4_CLUB)
                .add(ModItems.CARD_5_CLUB)
                .add(ModItems.CARD_6_CLUB)
                .add(ModItems.CARD_7_CLUB)
                .add(ModItems.CARD_8_CLUB)
                .add(ModItems.CARD_9_CLUB)
                .add(ModItems.CARD_10_CLUB)
                .add(ModItems.CARD_J_CLUB)
                .add(ModItems.CARD_Q_CLUB)
                .add(ModItems.CARD_K_CLUB)
                .add(ModItems.CARD_A_CLUB)

                .add(ModItems.CARD_2_HEART)
                .add(ModItems.CARD_3_HEART)
                .add(ModItems.CARD_4_HEART)
                .add(ModItems.CARD_5_HEART)
                .add(ModItems.CARD_6_HEART)
                .add(ModItems.CARD_7_HEART)
                .add(ModItems.CARD_8_HEART)
                .add(ModItems.CARD_9_HEART)
                .add(ModItems.CARD_10_HEART)
                .add(ModItems.CARD_J_HEART)
                .add(ModItems.CARD_Q_HEART)
                .add(ModItems.CARD_K_HEART)
                .add(ModItems.CARD_A_HEART)

                .add(ModItems.CARD_2_DIAMOND)
                .add(ModItems.CARD_3_DIAMOND)
                .add(ModItems.CARD_4_DIAMOND)
                .add(ModItems.CARD_5_DIAMOND)
                .add(ModItems.CARD_6_DIAMOND)
                .add(ModItems.CARD_7_DIAMOND)
                .add(ModItems.CARD_8_DIAMOND)
                .add(ModItems.CARD_9_DIAMOND)
                .add(ModItems.CARD_10_DIAMOND)
                .add(ModItems.CARD_J_DIAMOND)
                .add(ModItems.CARD_Q_DIAMOND)
                .add(ModItems.CARD_K_DIAMOND)
                .add(ModItems.CARD_A_DIAMOND)

                .add(ModItems.CARD_2_SPADE)
                .add(ModItems.CARD_3_SPADE)
                .add(ModItems.CARD_4_SPADE)
                .add(ModItems.CARD_5_SPADE)
                .add(ModItems.CARD_6_SPADE)
                .add(ModItems.CARD_7_SPADE)
                .add(ModItems.CARD_8_SPADE)
                .add(ModItems.CARD_9_SPADE)
                .add(ModItems.CARD_10_SPADE)
                .add(ModItems.CARD_J_SPADE)
                .add(ModItems.CARD_Q_SPADE)
                .add(ModItems.CARD_K_SPADE)
                .add(ModItems.CARD_A_SPADE);
    }
}
