package net.deathhancox.materiadex.block;

import com.google.common.base.Supplier;

import net.deathhancox.materiadex.MateriadexMod;
import net.deathhancox.materiadex.block.custom.FullRotationalBlock;
import net.deathhancox.materiadex.block.custom.SubzeroChamberBlock;
import net.deathhancox.materiadex.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, MateriadexMod.MOD_ID);
    public static final RegistryObject<Block> FACSIMILE_SUBSTANTIATER = registerBlock("facsimile_substantiater",
        () -> new FullRotationalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> SUBZERO_CHAMBER = registerBlock("subzero_chamber", 
        () -> new SubzeroChamberBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIZALITE = registerBlock("lizalite", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
