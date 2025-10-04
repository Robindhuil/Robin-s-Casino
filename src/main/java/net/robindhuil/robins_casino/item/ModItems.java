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

    public static final Item CHIP10=registerItem("chip_10",new Item.Settings());
    public static final Item CHIP20=registerItem("chip_20",new Item.Settings());
    public static final Item RED_DIAMOND=registerItem("red_diamond",new Item.Settings());
    public static final Item CARD_2_HEART =registerItem("card_2_heart",new Item.Settings());
    public static final Item CARD_3_HEART =registerItem("card_3_heart",new Item.Settings());
    public static final Item CARD_4_HEART =registerItem("card_4_heart",new Item.Settings());
    public static final Item CARD_5_HEART =registerItem("card_5_heart",new Item.Settings());
    public static final Item CARD_6_HEART =registerItem("card_6_heart",new Item.Settings());
    public static final Item CARD_7_HEART =registerItem("card_7_heart",new Item.Settings());
    public static final Item CARD_8_HEART =registerItem("card_8_heart",new Item.Settings());
    public static final Item CARD_9_HEART =registerItem("card_9_heart",new Item.Settings());
    public static final Item CARD_10_HEART =registerItem("card_10_heart",new Item.Settings());
    public static final Item CARD_J_HEART =registerItem("card_j_heart",new Item.Settings());
    public static final Item CARD_Q_HEART =registerItem("card_q_heart",new Item.Settings());
    public static final Item CARD_K_HEART =registerItem("card_k_heart",new Item.Settings());
    public static final Item CARD_A_HEART =registerItem("card_a_heart",new Item.Settings());


    private static Item registerItem(String name, Item.Settings itemSettings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RobinsCasino.MOD_ID, name));
        Item item = new Item(itemSettings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModItems() {
        RobinsCasino.LOGGER.info("Registering Mod items for" + RobinsCasino.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHIP10);
            entries.add(CHIP20);
        });
    }
}
