package net.robindhuil.robins_casino.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.robindhuil.robins_casino.RobinsCasino;
import net.robindhuil.robins_casino.blocks.ModBlocks;

public class ModItemsGroup {
    public static final ItemGroup ROBINS_CASINO_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(RobinsCasino.MOD_ID,
                    "robins_casino_group"), FabricItemGroup.builder().icon(() ->new ItemStack(ModItems.CHIP10))
            .displayName(Text.translatable("itemgroup.robins_casino.robins_casino_group"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.CHIP10);
                entries.add(ModItems.CHIP20);
                entries.add(ModItems.RED_DIAMOND);
                entries.add(ModBlocks.CHIP_10_BLOCK);
                entries.add(ModBlocks.CHIP_20_BLOCK);
                entries.add(ModBlocks.RED_DIAMOND_ORE);
            }).build());


    public static void registerItemGroups() {
        RobinsCasino.LOGGER.info("Registering Item Groups for " + RobinsCasino.MOD_ID);
    }
}
