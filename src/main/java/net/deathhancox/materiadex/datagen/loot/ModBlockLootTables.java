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
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}