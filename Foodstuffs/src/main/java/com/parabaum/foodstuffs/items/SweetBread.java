package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SweetBread extends Item {
    public SweetBread() {
        super(new Item.Properties()
            .group(Foodstuffs.TAB)
            .food(new Food.Builder()
                    .hunger(6)
                    .saturation(4)
                    .build())




        );
    }
}
