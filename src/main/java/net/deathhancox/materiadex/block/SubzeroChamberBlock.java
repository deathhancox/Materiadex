package net.deathhancox.materiadex.block;

import net.deathhancox.materiadex.block.entity.ModBlockEntities;
import net.deathhancox.materiadex.block.entity.SubzeroChamberEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
// import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SubzeroChamberBlock extends FurnaceBlock {
    public SubzeroChamberBlock(Properties pProperties) {
        super(pProperties);
    }
    
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new SubzeroChamberEntity(pPos, pState);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createFurnaceTicker(pLevel, pBlockEntityType, ModBlockEntities.SUBZERO_CHAMBER_BE.get());
    }

    @Override
    protected void openContainer(Level pLevel, BlockPos pPos, Player pPlayer) {
        BlockEntity blockentity = pLevel.getBlockEntity(pPos);
        if (blockentity instanceof SubzeroChamberEntity) {
            pPlayer.openMenu((MenuProvider)blockentity);
        }
    }
}

// @Nullable
// public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
//    return createFurnaceTicker(pLevel, pBlockEntityType, BlockEntityType.FURNACE);
// }

// /**
//  * Called to open this furnace's container.
//  * 
//  * @see #use
//  */
// protected void openContainer(Level pLevel, BlockPos pPos, Player pPlayer) {
//    BlockEntity blockentity = pLevel.getBlockEntity(pPos);
//    if (blockentity instanceof FurnaceBlockEntity) {
//       pPlayer.openMenu((MenuProvider)blockentity);
//       pPlayer.awardStat(Stats.INTERACT_WITH_FURNACE);
//    }

// }