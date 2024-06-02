package net.deathhancox.materiadex.items;

import net.deathhancox.materiadex.MateriadexMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MateriadexMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MATERIADEX_TAB = CREATIVE_MODE_TABS.register("materiadex_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLD_FACSIMILE.get()))
            .title(Component.translatable("creativetab.materiadex_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.GOLD_FACSIMILE.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
