package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pretzel extends Item {
    public Pretzel() {
        super(new Item.Properties()
            .group(Foodstuffs.TAB)
            .food(new Food.Builder()
                    .hunger(6)
                    .saturation(5f)
                    .build())

        );
    }
}
