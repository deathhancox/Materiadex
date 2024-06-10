package net.deathhancox.materiadex.commons;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.deathhancox.materiadex.items.ModItems;
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
                pOutput.accept(ModItems.ZERO_VECTOR_SHARD.get());
                pOutput.accept(ModItems.SUPERPOSITION_INGOT.get());
                pOutput.accept(ModItems.MATRIX_CORE.get());
                pOutput.accept(ModItems.MATRIX_MUNCHIES.get());

                pOutput.accept(ModBlocks.FACSIMILE_SUBSTANTIATER.get());
                pOutput.accept(ModBlocks.SUBZERO_CHAMBER.get());
                pOutput.accept(ModBlocks.LIZALITE.get());
                pOutput.accept(ModBlocks.POLISHED_LIZALITE.get());
                pOutput.accept(ModBlocks.LIZALITE_STAIRS.get());
                pOutput.accept(ModBlocks.LIZALITE_SLAB.get());
                pOutput.accept(ModBlocks.LIZALITE_WALL.get());
                pOutput.accept(ModBlocks.LIZALITE_DOOR.get());
                pOutput.accept(ModBlocks.LIZALITE_TRAPDOOR.get());
                pOutput.accept(ModBlocks.SUPERPOSITION_STONE.get());
            })
            .build());
            
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
