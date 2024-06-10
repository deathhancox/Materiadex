package net.deathhancox.materiadex.datagen.loot;

import java.util.Set;

import net.deathhancox.materiadex.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.FACSIMILE_SUBSTANTIATER.get());
        this.dropSelf(ModBlocks.SUBZERO_CHAMBER.get());
        this.dropSelf(ModBlocks.LIZALITE.get());
        this.dropSelf(ModBlocks.POLISHED_LIZALITE.get());
        this.dropSelf(ModBlocks.SUPERPOSITION_STONE.get());
        this.dropSelf(ModBlocks.LIZALITE_STAIRS.get());
        this.dropSelf(ModBlocks.LIZALITE_WALL.get());
        this.dropSelf(ModBlocks.LIZALITE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LIZALITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIZALITE_BUTTON.get());
        
        this.add(ModBlocks.LIZALITE_SLAB.get(), 
            block -> createSlabItemTable(ModBlocks.LIZALITE_SLAB.get()));
        this.add(ModBlocks.POLISHED_LIZALITE_SLAB.get(), 
            block -> createSlabItemTable(ModBlocks.POLISHED_LIZALITE_SLAB.get()));
        this.add(ModBlocks.LIZALITE_DOOR.get(), 
            block -> createDoorTable(ModBlocks.LIZALITE_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}