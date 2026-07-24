package net.smertnik.vorona.creativemodetab;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.smertnik.vorona.Item.ModItems;
import net.smertnik.vorona.Vorona;

public class ModCreativeModeTabs {
public static final CreativeModeTab APPLE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(Vorona.MOD_ID, "mcvoron"),
        FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.APPLE_GREEN))
                .title(Component.translatable("Creative mode tail"))
                .displayItems((parameters, output) -> {
                    output.accept(ModItems.APPLE_GREEN);
                    output.accept(ModItems.CHAI);
                    output.accept(ModItems.SAMAGONI_APPARAT);
                }).build());
    public static void regiserModCreativeModeTabs() {
        Vorona.LOGGER.info("registering Creative Mode Tabs for" + Vorona.MOD_ID);
    }


}