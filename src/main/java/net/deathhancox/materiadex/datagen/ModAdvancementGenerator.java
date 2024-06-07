package net.deathhancox.materiadex.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.deathhancox.materiadex.datagen.advancements.ModMainStoryAdvancments;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

public class ModAdvancementGenerator extends ForgeAdvancementProvider {
    protected ExistingFileHelper existingFileHelper;

    public ModAdvancementGenerator(PackOutput output, CompletableFuture<Provider> registries,
            ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new ModMainStoryAdvancments()));
    }
}
