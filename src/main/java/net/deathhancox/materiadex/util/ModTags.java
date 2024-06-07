package net.deathhancox.materiadex.util;

import net.deathhancox.materiadex.MateriadexMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MACHINES = tag("materiadex_machines");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MateriadexMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CONSUMABLES = tag("consumables");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MateriadexMod.MOD_ID, name));
        }
    }
}
