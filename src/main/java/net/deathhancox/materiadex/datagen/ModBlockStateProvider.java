package net.deathhancox.materiadex.datagen;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
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
        blockWithItem(ModBlocks.POLISHED_LIZALITE);
        blockWithItem(ModBlocks.SUPERPOSITION_STONE);
        blockItem(ModBlocks.FACSIMILE_SUBSTANTIATER);
        blockItem(ModBlocks.SUBZERO_CHAMBER);

        stairsBlock(((StairBlock) ModBlocks.LIZALITE_STAIRS.get()), blockTexture(ModBlocks.LIZALITE.get()));
        slabBlock(((SlabBlock) ModBlocks.LIZALITE_SLAB.get()), blockTexture(ModBlocks.LIZALITE.get()), blockTexture(ModBlocks.LIZALITE.get()));
        wallBlock(((WallBlock) ModBlocks.LIZALITE_WALL.get()), blockTexture(ModBlocks.LIZALITE.get()));

        doorBlockWithRenderType((DoorBlock) ModBlocks.LIZALITE_DOOR.get(), modLoc("block/lizalite_door_bottom"), modLoc("block/lizalite_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.LIZALITE_TRAPDOOR.get()), modLoc("block/lizalite_trapdoor"), true, "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ExistingModelFile(blockTexture(blockRegistryObject.get()), this.existingFileHelper));
    }
}