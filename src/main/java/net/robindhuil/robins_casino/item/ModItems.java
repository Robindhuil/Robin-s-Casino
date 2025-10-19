package net.robindhuil.robins_casino.item;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.robindhuil.robins_casino.RobinsCasino;
import static net.robindhuil.robins_casino.item.ModToolTips.registerToolTip;


public class ModItems {
    public static final Item WHISKEY_BOTTLE = registerItem(
            "whiskey_bottle",
            new Item.Settings()
                    .rarity(Rarity.RARE)
                    .food(ModFoodComponents.WHISKEY_BOTTLE, ModConsumableComponents.WHISKEY_BOTTLE)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true));
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
    public static final Item CARD_2_CLUB =registerItem("card_2_club",new Item.Settings());
    public static final Item CARD_3_CLUB =registerItem("card_3_club",new Item.Settings());
    public static final Item CARD_4_CLUB =registerItem("card_4_club",new Item.Settings());
    public static final Item CARD_5_CLUB =registerItem("card_5_club",new Item.Settings());
    public static final Item CARD_6_CLUB =registerItem("card_6_club",new Item.Settings());
    public static final Item CARD_7_CLUB =registerItem("card_7_club",new Item.Settings());
    public static final Item CARD_8_CLUB =registerItem("card_8_club",new Item.Settings());
    public static final Item CARD_9_CLUB =registerItem("card_9_club",new Item.Settings());
    public static final Item CARD_10_CLUB =registerItem("card_10_club",new Item.Settings());
    public static final Item CARD_J_CLUB =registerItem("card_j_club",new Item.Settings());
    public static final Item CARD_Q_CLUB =registerItem("card_q_club",new Item.Settings());
    public static final Item CARD_K_CLUB =registerItem("card_k_club",new Item.Settings());
    public static final Item CARD_A_CLUB =registerItem("card_a_club",new Item.Settings());

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

        RobinsCasino.LOGGER.info("Registering Mod item tooltips for" + RobinsCasino.MOD_ID);
        registerToolTips();
    }

    public static void registerToolTips() {
        registerToolTip(WHISKEY_BOTTLE, "tooltip.robins-casino.whiskey_bottle", "tooltip.robins-casino.whiskey_bottle.shift_down");
    }


}
