package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Stockfish extends Item {
    public Stockfish() {
        super(new Item.Properties()
            .group(Foodstuffs.TAB)
            .food(new Food.Builder()
                    .hunger(6)
                    .saturation(4)
                    .build())
        );
    }
}