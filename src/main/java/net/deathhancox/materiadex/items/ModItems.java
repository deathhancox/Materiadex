package net.deathhancox.materiadex.items;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.items.custom.FacsimileBase;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MateriadexMod.MOD_ID);

    public static final RegistryObject<Item> GOLD_FACSIMILE = ITEMS.register("gold_facsimile",
    //               You can replace this with Item
            () -> new FacsimileBase(new Item.Properties()));

    /**
     * Register these items into the EventBus
     * @param eventBus Forge's current EventBus
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
