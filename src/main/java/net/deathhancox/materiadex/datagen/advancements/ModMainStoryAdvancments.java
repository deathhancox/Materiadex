package net.deathhancox.materiadex.datagen.advancements;

import java.util.function.Consumer;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.deathhancox.materiadex.items.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.critereon.ConsumeItemTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider.AdvancementGenerator;

public class ModMainStoryAdvancments implements AdvancementGenerator {
    public ResourceLocation advanceSaveLoc(String advName) {
        return new ResourceLocation(MateriadexMod.MOD_ID, "story/"+advName);
    }

    @Override
    public void generate(Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement superPositionAdvancement = Advancement.Builder.advancement()
            .display(
                new DisplayTypes.DisplayTaskRoot(
                    ModBlocks.SUPERPOSITION_STONE.get(), 
                    "advancements.materiadex.main_story.collect_super_stone", 
                    "advancements.materiadex.main_story.collect_super_stone.desc", 
                    new ResourceLocation(MateriadexMod.MOD_ID, "textures/block/lizalite.png"))
            )
            .addCriterion("", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SUPERPOSITION_STONE.get(), ModItems.SUPERPOSITION_INGOT.get()))
            .save(saver, advanceSaveLoc("discover_superposition_stone"), existingFileHelper);

        Advancement lizaliteAdvancement = Advancement.Builder.advancement()
            .display(
                new DisplayTypes.DisplayChallenge(
                    ModBlocks.LIZALITE.get(), 
                    "advancements.materiadex.main_story.collect_lizalite", 
                    "advancements.materiadex.main_story.collect_lizalite.desc"
                )
            )
            .parent(superPositionAdvancement)
            .addCriterion("", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.LIZALITE.get()))
            .save(saver, advanceSaveLoc("discover_lizalite"), existingFileHelper);

        Advancement subzeroAdvancement = Advancement.Builder.advancement()
            .display(
                new DisplayTypes.DisplayTask(
                    ModBlocks.SUBZERO_CHAMBER.get(),
                    "advancements.materiadex.main_story.make_subzero", 
                    "advancements.materiadex.main_story.make_subzero.desc"
                )
            )
            .parent(lizaliteAdvancement)
            .addCriterion("create", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SUBZERO_CHAMBER.get()))
            .save(saver, advanceSaveLoc("craft_subzero_chamber"), existingFileHelper);

        Advancement zeroVectorShardAdvancement = Advancement.Builder.advancement()
            .display(
                new DisplayTypes.DisplayTask(
                    ModItems.ZERO_VECTOR_SHARD.get(),
                    "advancements.materiadex.main_story.zero_vector", 
                    "advancements.materiadex.main_story.zero_vector.desc"
                )
            )
            .parent(subzeroAdvancement)
            .addCriterion("create", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ZERO_VECTOR_SHARD.get()))
            .save(saver, advanceSaveLoc("create_zero_vector_shard"), existingFileHelper);

        Advancement matrixCoreAdvancement = Advancement.Builder.advancement()
            .display(
                new DisplayTypes.DisplayTask(
                    ModItems.MATRIX_CORE.get(),
                    "advancements.materiadex.main_story.matrix_core", 
                    "advancements.materiadex.main_story.matrix_core.desc"
                )
            )
            .parent(zeroVectorShardAdvancement)
            .addCriterion("create", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MATRIX_CORE.get()))
            .save(saver, advanceSaveLoc("create_matrix_core"), existingFileHelper);

        @SuppressWarnings("unused")
        Advancement matrixMunchiesAdvancement = Advancement.Builder.advancement()
            .display(
                new DisplayTypes.DisplayGoal(
                    ModItems.MATRIX_MUNCHIES.get(),
                    "advancements.materiadex.main_story.matrix_munchies", 
                    "advancements.materiadex.main_story.matrix_munchies.desc"
                )
            )
            .parent(matrixCoreAdvancement)
            .addCriterion("eat", ConsumeItemTrigger.TriggerInstance.usedItem(ModItems.MATRIX_MUNCHIES.get()))
            .save(saver, advanceSaveLoc("eat_matrix_munchies"), existingFileHelper);

        @SuppressWarnings("unused")
        Advancement facsimileSubstantiaterAdvancement = Advancement.Builder.advancement()
            .display(
                new DisplayTypes.DisplayChallenge(
                    ModBlocks.FACSIMILE_SUBSTANTIATER.get(),
                    "advancements.materiadex.main_story.facsimile_substantiater", 
                    "advancements.materiadex.main_story.facsimile_substantiater.desc"
                )
            )
            .parent(matrixCoreAdvancement)
            .addCriterion("create", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.FACSIMILE_SUBSTANTIATER.get()))
            .save(saver, advanceSaveLoc("craft_facsimile_substantiater"), existingFileHelper);
    }
}
