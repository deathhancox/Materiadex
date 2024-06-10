package net.deathhancox.materiadex.screen.subzero_chamber;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SubzeroChamberResultSlot extends SlotItemHandler {
    public SubzeroChamberResultSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(ItemStack pStack) {
        return false;
    }
}
