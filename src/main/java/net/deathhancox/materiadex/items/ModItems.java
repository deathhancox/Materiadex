package net.deathhancox.materiadex.items;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.items.custom.FacsimileBase;
import net.deathhancox.materiadex.items.custom.descriptable.DescriptableItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MateriadexMod.MOD_ID);
    
    public static final RegistryObject<Item> MATRIX_CORE = ITEMS.register("matrix_core", 
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZERO_VECTOR_SHARD = ITEMS.register("zero_vector_shard", 
        () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MATRIX_MUNCHIES = ITEMS.register("matrix_munchies", 
        () -> new Item(new Item.Properties().food(ModFoods.MATRIX_MUNCHIES)));
    public static final RegistryObject<Item> SUPERPOSITION_INGOT = ITEMS.register("superposition_ingot", 
        () -> new DescriptableItem(new Item.Properties(), "tooltip.materiadex.more.superposition_ingot"));
    public static final RegistryObject<Item> GOLD_FACSIMILE = ITEMS.register("gold_facsimile",
    () -> new FacsimileBase(new Item.Properties()));
    

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
