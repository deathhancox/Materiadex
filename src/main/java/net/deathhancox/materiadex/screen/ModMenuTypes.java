package net.deathhancox.materiadex.screen;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.screen.subzero_chamber.SubzeroChamberMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = 
        DeferredRegister.create(ForgeRegistries.MENU_TYPES, MateriadexMod.MOD_ID);
    
    public static final RegistryObject<MenuType<SubzeroChamberMenu>> SUBZERO_CHAMBER_MENU = 
        registerMenuType("subzero_chamber_menu", SubzeroChamberMenu::new);
        

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, ()-> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
