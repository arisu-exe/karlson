package io.github.fallOut015.karlson.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupKarlson {
    public static final ItemGroup TAB_KARLSON = new ItemGroup("karlson") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsKarlson.TILE_BLOCK.get());
        }
    };
}