package net.deathhancox.materiadex.screen;

import com.mojang.blaze3d.systems.RenderSystem;

import net.deathhancox.materiadex.MateriadexMod;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class SubzeroChamberScreen extends AbstractContainerScreen<SubzeroChamberMenu> {
    private static final ResourceLocation TEXTURE = 
        new ResourceLocation(MateriadexMod.MOD_ID, "textures/gui/subzero_chamber_gui.png");

    public SubzeroChamberScreen(SubzeroChamberMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        // this.inventoryLabelX
        // this.titleLabelX
    }

    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) /2;

        pGuiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressArrow(pGuiGraphics, x, y);
    }

    private void renderProgressArrow(GuiGraphics pGuiGraphics, int x, int y) {
        if (this.menu.isCrafting()) {
            // width of arrow -> 23
            pGuiGraphics.blit(TEXTURE, x+79, y+35, 176, 17, menu.getScaledProgress(23), 16);
        }
    }
    
    @Override
    public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pGuiGraphics);
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pGuiGraphics, pMouseX, pMouseY);
    }
}
