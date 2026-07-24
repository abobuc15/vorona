package net.smertnik.vorona.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.model.Model;
import net.smertnik.vorona.Item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
    itemModelGenerators.generateFlatItem(ModItems.APPLE_GREEN, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.CHAI, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.SAMAGONI_APPARAT, ModelTemplates.FLAT_ITEM);
    }
}
