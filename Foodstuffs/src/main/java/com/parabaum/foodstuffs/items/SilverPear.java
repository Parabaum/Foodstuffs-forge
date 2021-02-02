package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class SilverPear extends Item {
    public SilverPear() {
        super(new Item.Properties()
            .group(Foodstuffs.TAB)
            .food(new Food.Builder()
                .hunger(4)
                .effect(new EffectInstance(Effects.SPEED, 1200, 2), 1F)
                .effect(new EffectInstance(Effects.JUMP_BOOST, 1200, 2), 1F)
                .effect(new EffectInstance(Effects.REGENERATION, 400, 1), 1F)
                .saturation(2.4f)
                .build())
                );
    }
}
