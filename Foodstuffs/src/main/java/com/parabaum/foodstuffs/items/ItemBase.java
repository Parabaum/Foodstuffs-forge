package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(Foodstuffs.TAB));
    }
}
