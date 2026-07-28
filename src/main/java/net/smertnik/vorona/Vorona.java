package net.smertnik.vorona;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.smertnik.vorona.Item.ModItems;
import net.smertnik.vorona.block.ModBlocks;
import net.smertnik.vorona.creativemodetab.ModCreativeModeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vorona implements ModInitializer {
	public static final String MOD_ID = "vorona";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.regiserModCreativeModeTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

}
