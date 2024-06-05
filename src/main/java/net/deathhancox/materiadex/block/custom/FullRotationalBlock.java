package net.deathhancox.materiadex.block.custom;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;

public class FullRotationalBlock extends DirectionalBlock {
    public FullRotationalBlock(Properties properties) {
        super(properties);
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getNearestLookingDirection().getOpposite());
    }

    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }
}