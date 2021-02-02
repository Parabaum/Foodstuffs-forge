package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class BerryPie extends Item {
    public BerryPie() {
        super(new Item.Properties()
                .group(Foodstuffs.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(5)
                        .build())
        );
    }
}
