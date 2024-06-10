package net.deathhancox.materiadex.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.deathhancox.materiadex.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider{
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MateriadexMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.MACHINES)
            .add(
                ModBlocks.FACSIMILE_SUBSTANTIATER.get(),
                ModBlocks.SUBZERO_CHAMBER.get()
            );

        
        this.tag(BlockTags.NEEDS_STONE_TOOL)
            .add(
                ModBlocks.FACSIMILE_SUBSTANTIATER.get(),
                ModBlocks.SUBZERO_CHAMBER.get(),
                ModBlocks.LIZALITE.get()
            );
        
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(
                ModBlocks.FACSIMILE_SUBSTANTIATER.get(),
                ModBlocks.SUBZERO_CHAMBER.get(),
                ModBlocks.LIZALITE.get()
            );
        
        this.tag(BlockTags.WALLS)
            .add(
                ModBlocks.LIZALITE_WALL.get(),
                ModBlocks.POLISHED_LIZALITE_WALL.get()
        );
    }
    
}
