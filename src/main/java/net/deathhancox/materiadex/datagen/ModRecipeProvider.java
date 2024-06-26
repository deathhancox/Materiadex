package net.deathhancox.materiadex.datagen;

import java.util.List;
import java.util.function.Consumer;
import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.deathhancox.materiadex.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, List.of(Items.QUARTZ), RecipeCategory.MISC, ModItems.ZERO_VECTOR_SHARD.get(), 0.25f, 200, "misc");
        oreSmelting(pWriter, List.of(ModItems.ZERO_VECTOR_SHARD.get()), RecipeCategory.MISC, ModItems.MATRIX_CORE.get(), 0.25f, 200, "misc");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FACSIMILE_SUBSTANTIATER.get())
                .pattern("LZL")
                .pattern("ZCZ")
                .pattern("LZL")

                .define('L', ModBlocks.LIZALITE.get())
                .define('Z', ModItems.ZERO_VECTOR_SHARD.get())
                .define('C', ModItems.MATRIX_CORE.get())

                .unlockedBy(getHasName(ModItems.MATRIX_CORE.get()), has(ModItems.MATRIX_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MATRIX_MUNCHIES.get())
                .pattern(" CC")
                .pattern("  C")
                .define('C', ModItems.MATRIX_CORE.get())

                .unlockedBy(getHasName(ModItems.MATRIX_CORE.get()), has(ModItems.MATRIX_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZERO_VECTOR_DUST.get())
                .pattern("   ")
                .pattern("SSS")
                .define('S', ModItems.ZERO_VECTOR_SHARD.get())

                .unlockedBy(getHasName(ModItems.MATRIX_CORE.get()), has(ModItems.MATRIX_CORE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUPERPOSITION_INGOT.get())
                .pattern(" N ")
                .pattern("G I")
                .pattern(" C ")

                .define('N', Items.NETHERITE_INGOT)
                .define('I', Items.IRON_INGOT)
                .define('G', Items.GOLD_INGOT)
                .define('C', Items.COPPER_INGOT)

                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
            List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
            float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients,
                pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
            RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
            List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
            float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder
                    .generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, MateriadexMod.MOD_ID + ":" + getItemName(pResult)
                            + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
