package net.deathhancox.materiadex.datagen;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.deathhancox.materiadex.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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

        simpleBlockItem(ModBlocks.LIZALITE_DOOR);
        evenSimplerBlockItem(ModBlocks.LIZALITE_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIZALITE_SLAB);
        trapdoorItem(ModBlocks.LIZALITE_TRAPDOOR);
        wallItem(ModBlocks.LIZALITE_WALL, ModBlocks.LIZALITE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), 
            new ResourceLocation("item/generated")).texture("layer0", 
                new ResourceLocation(MateriadexMod.MOD_ID, "item/" + item.getId().getPath())
            );
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
            .texture("wall", new ResourceLocation(MateriadexMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(), 
        new ResourceLocation("item/generated")).texture("layer0", 
        new ResourceLocation(MateriadexMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(MateriadexMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}