package net.deathhancox.materiadex.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SubzeroChamberEntity extends AbstractFurnaceBlockEntity {
    public SubzeroChamberEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.SUBZERO_CHAMBER_BE.get(), pPos, pBlockState, RecipeType.SMELTING);
    }

    @Override
    public Component getDefaultName() {
        return Component.translatable("container.subzero_chamber");
    }

    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory) {
        return new FurnaceMenu(pContainerId, pInventory, this, this.dataAccess);
    }
}
