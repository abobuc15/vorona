package net.smertnik.vorona.Item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.impl.client.creativetab.FabricCreativeGuiComponents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.Item;
import net.smertnik.vorona.Vorona;

import java.util.function.Function;

public class ModItems {
    public static final Item APPLE_GREEN = registerItem("appleg", Item::new);
    public static final Item CHAI = registerItem("chai", Item::new);
    public static final Item SAMAGONI_APPARAT = registerItem("samagoni_app", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Vorona.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vorona.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Vorona.LOGGER.info("Registering Mod Items for " + Vorona.MOD_ID);


        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output ->
                output.accept(APPLE_GREEN));
    }
}
