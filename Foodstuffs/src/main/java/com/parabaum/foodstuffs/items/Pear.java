package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pear extends Item{
        public Pear() {
            super(new Item.Properties()
                    .group(Foodstuffs.TAB)
                    .food(new Food.Builder()
                            .hunger(4)
                            .saturation(2.4f)
                            .build())
                    );
                }
}
