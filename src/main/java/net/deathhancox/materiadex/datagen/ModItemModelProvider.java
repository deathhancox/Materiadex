package net.deathhancox.materiadex.datagen;

import org.openjdk.nashorn.internal.ir.Block;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.deathhancox.materiadex.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MateriadexMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.GOLD_FACSIMILE);
        simpleItem(ModItems.MATRIX_CORE);
        simpleItem(ModItems.SUPERPOSITION_INGOT);
        simpleItem(ModItems.ZERO_VECTOR_SHARD);
        simpleItem(ModItems.MATRIX_MUNCHIES);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), 
            new ResourceLocation("item/generated")).texture("layer0", 
                new ResourceLocation(MateriadexMod.MOD_ID, "item/" + item.getId().getPath())
            );
    }
}