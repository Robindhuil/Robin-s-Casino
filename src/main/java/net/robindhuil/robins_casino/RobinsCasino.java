package net.robindhuil.robins_casino;

import net.fabricmc.api.ModInitializer;

import net.robindhuil.robins_casino.blocks.ModBlocks;
import net.robindhuil.robins_casino.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RobinsCasino implements ModInitializer {
	public static final String MOD_ID = "robins-casino";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}