package net.deathhancox.materiadex.block.entity;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = 
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MateriadexMod.MOD_ID);
    
    public static final RegistryObject<BlockEntityType<SubzeroChamberEntity>> SUBZERO_CHAMBER_BE = BLOCK_ENTITIES.register(
        "subzero_chamber_be", ()-> BlockEntityType.Builder.of(SubzeroChamberEntity::new, ModBlocks.SUBZERO_CHAMBER.get()).build(null)
    );

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
