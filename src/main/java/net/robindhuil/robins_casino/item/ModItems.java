package net.robindhuil.robins_casino.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.robindhuil.robins_casino.RobinsCasino;

public class ModItems {

    public static final Item CHIP10=registerItem("chip_10",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RobinsCasino.MOD_ID,"chip_10")))));
    public static final Item CHIP20=registerItem("chip_20",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RobinsCasino.MOD_ID,"chip_20")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RobinsCasino.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RobinsCasino.LOGGER.info("Registering Mod items for" + RobinsCasino.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHIP10);
            entries.add(CHIP20);
        });
    }
}
