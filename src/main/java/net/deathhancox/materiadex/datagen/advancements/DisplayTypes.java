package net.deathhancox.materiadex.datagen.advancements;

import org.jetbrains.annotations.Nullable;

import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class DisplayTypes {
    public static class DisplayBase extends DisplayInfo {
        public DisplayBase(
            ItemLike pIcon, String pTitleKey, String pDescripitionKey, @Nullable ResourceLocation background, 
            FrameType frameType, boolean showToast, boolean announce, boolean hidden) {

            super(
                new ItemStack(pIcon.asItem()), 
                Component.translatable(pTitleKey), 
                Component.translatable(pDescripitionKey), 
                background, 
                frameType, showToast, announce, hidden);
        }

        public DisplayBase(ItemLike pIcon, String pTitleKey, String pDescripitionKey, ResourceLocation background, FrameType frameType) {
            this(
                pIcon, 
                pTitleKey, 
                pDescripitionKey, 
                background, 
                frameType, true, true, false);
        }

        public DisplayBase(ItemLike pIcon, String pTitleKey, String pDescripitionKey, FrameType frameType) {
            this(
                pIcon, 
                pTitleKey, 
                pDescripitionKey, 
                (ResourceLocation)null, 
                frameType, true, true, false);
        }
    }

    public static class DisplayTask extends DisplayBase {
        public DisplayTask(
            ItemLike pIcon, 
            String pTitleKey, 
            String pDescriptionKey) {
            
            super(pIcon, pTitleKey, pDescriptionKey, FrameType.TASK);
        }
    }

    public static class DisplayGoal extends DisplayBase {
        public DisplayGoal(
            ItemLike pIcon, 
            String pTitleKey, 
            String pDescriptionKey) {
            
            super(pIcon, pTitleKey, pDescriptionKey, FrameType.GOAL);
        }
    }
        
    public static class DisplayChallenge extends DisplayBase {
        public DisplayChallenge(
            ItemLike pIcon, 
            String pTitleKey, 
            String pDescriptionKey) {
            
            super(pIcon, pTitleKey, pDescriptionKey, FrameType.CHALLENGE);
        }
    }

    public static class DisplayTaskRoot extends DisplayBase {
        public DisplayTaskRoot(
            ItemLike pIcon, 
            String pTitleKey, 
            String pDescriptionKey,
            ResourceLocation resource) {
            
            super(pIcon, pTitleKey, pDescriptionKey, resource, FrameType.TASK);
        }
    }

    public static class DisplayGoalRoot extends DisplayBase {
        public DisplayGoalRoot(
            ItemLike pIcon, 
            String pTitleKey, 
            String pDescriptionKey,
            ResourceLocation resource) {
            
            super(pIcon, pTitleKey, pDescriptionKey, resource, FrameType.GOAL);
        }
    }
        
    public static class DisplayChallengeRoot extends DisplayBase {
        public DisplayChallengeRoot(
            ItemLike pIcon, 
            String pTitleKey, 
            String pDescriptionKey,
            ResourceLocation resource) {
            
            super(pIcon, pTitleKey, pDescriptionKey, resource, FrameType.CHALLENGE);
        }
    }
}
