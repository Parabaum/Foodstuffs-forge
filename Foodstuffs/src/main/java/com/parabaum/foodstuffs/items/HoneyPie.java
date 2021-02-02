package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class HoneyPie extends Item {
    public HoneyPie() {
        super(new Item.Properties()
                .group(Foodstuffs.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(7)
                        .build())
        );
    }
}
