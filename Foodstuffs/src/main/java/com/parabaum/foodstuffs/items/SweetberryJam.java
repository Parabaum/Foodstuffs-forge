package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;


public class SweetberryJam extends Item {
    public SweetberryJam() {
        super(new Item.Properties()
            .group(Foodstuffs.TAB)
            .maxStackSize(16)
            .food(new Food.Builder()
                    .hunger(8)
                    .saturation(5)
                    .build())
        );

    }
        @Override
        public UseAction getUseAction(ItemStack stack) {
            return UseAction.DRINK;

    }
}