package net.deathhancox.materiadex.recipe;

import net.deathhancox.materiadex.MateriadexMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =     
        DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MateriadexMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SubzeroChamberRecipe>> SUBZERO_CHAMBER_SERIALIZER =
        SERIALIZERS.register("subzero_cooling", ()-> SubzeroChamberRecipe.Serializer.INSTANCE);
    
    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
