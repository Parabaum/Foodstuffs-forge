package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ApplePie extends Item {
    public ApplePie() {
        super(new Item.Properties()
            .group(Foodstuffs.TAB)
            .food(new Food.Builder()
                .hunger(8)
                .saturation(5)
                .build())

        );
    }
}
