package net.deathhancox.materiadex.gui;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.RecipeBookMenu;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;

public class SubzeroMenu extends RecipeBookMenu<Container> {

    public SubzeroMenu(int containerId, Inventory playerInventory) {
        super(ModMenus.SUBZERO_CHAMBER.get(), containerId);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fillCraftSlotsStackedContents(StackedContents pItemHelper) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fillCraftSlotsStackedContents'");
    }

    @Override
    public void clearCraftingContent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearCraftingContent'");
    }

    @Override
    public boolean recipeMatches(Recipe<? super Container> pRecipe) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recipeMatches'");
    }

    @Override
    public int getResultSlotIndex() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResultSlotIndex'");
    }

    @Override
    public int getGridWidth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGridWidth'");
    }

    @Override
    public int getGridHeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGridHeight'");
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

    @Override
    public RecipeBookType getRecipeBookType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecipeBookType'");
    }

    @Override
    public boolean shouldMoveToInventory(int pSlotIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shouldMoveToInventory'");
    }

    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quickMoveStack'");
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stillValid'");
    }
    
}
