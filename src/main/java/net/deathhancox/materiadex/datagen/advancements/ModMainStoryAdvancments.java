package net.deathhancox.materiadex.datagen.advancements;

import java.util.function.Consumer;

import net.deathhancox.materiadex.block.ModBlocks;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider.AdvancementGenerator;

public class ModMainStoryAdvancments implements AdvancementGenerator {
    @Override
    public void generate(Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement.Builder.advancement()
            .display(
                ModBlocks.LIZALITE.get(), 
                Component.translatable("advancements.main_story.collect_lizalite"), 
                Component.translatable("advancements.main_story.collect_lizalite.description"), 
                new ResourceLocation("materiadex", "textures/block/lizalite.png"), 
                FrameType.CHALLENGE, 
                true, 
                true, 
                false
            )
            .addCriterion("", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.LIZALITE.get()))
            .save(saver, new ResourceLocation("materiadex", "story/discover_lizalite"), existingFileHelper);
    }
    
}
