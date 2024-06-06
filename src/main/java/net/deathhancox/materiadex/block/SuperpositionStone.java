package net.deathhancox.materiadex.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.ConcretePowderBlock;

public class SuperpositionStone extends ConcretePowderBlock {
    public SuperpositionStone(Properties properties) {
        super(ModBlocks.LIZALITE.get(), properties.mapColor(DyeColor.BLUE));
    }
}