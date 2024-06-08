package net.deathhancox.materiadex.gui;

import net.deathhancox.materiadex.MateriadexMod;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = 
        DeferredRegister.create(ForgeRegistries.MENU_TYPES, MateriadexMod.MOD_ID);
    
    public static final RegistryObject<MenuType<SubzeroMenu>> SUBZERO_CHAMBER = MENUS.register("subzero_chamber_ui", 
        ()-> new MenuType<SubzeroMenu>(SubzeroMenu::new, FeatureFlags.DEFAULT_FLAGS));
        

    public static void register(IEventBus eventBus) {
        eventBus.register(MENUS);
    }
}
