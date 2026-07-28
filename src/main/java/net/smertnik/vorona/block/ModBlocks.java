package net.smertnik.vorona.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.smertnik.vorona.Vorona;

import java.util.function.Function;

public class ModBlocks {

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toregister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Vorona.MOD_ID, name))));
        registerBlockItem(name, toregister);
        return  Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Vorona.MOD_ID, name),toregister)
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Vorona.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Vorona.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Vorona.LOGGER.info("Registering Mod Blocks for" + Vorona.MOD_ID);
    }



}
