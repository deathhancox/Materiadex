package net.deathhancox.materiadex.datagen;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile.ExistingModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider{
    protected ExistingFileHelper existingFileHelper;

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MateriadexMod.MOD_ID, exFileHelper);
        this.existingFileHelper = exFileHelper; 
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LIZALITE);
        blockItem(ModBlocks.FACSIMILE_SUBSTANTIATER);
        blockItem(ModBlocks.SUBZERO_CHAMBER);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ExistingModelFile(blockTexture(blockRegistryObject.get()), this.existingFileHelper));
    }
}