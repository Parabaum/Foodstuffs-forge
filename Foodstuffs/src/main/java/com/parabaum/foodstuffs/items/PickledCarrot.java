package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import com.parabaum.foodstuffs.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PickledCarrot extends Item {
    public PickledCarrot() {
        super(new Item.Properties()
                .group(Foodstuffs.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(6f)
                        .build())
        );
    }
    
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        stack = super.onItemUseFinish(stack, worldIn, entityLiving);
        
        PlayerEntity playerentity = null;
        if (entityLiving instanceof PlayerEntity) playerentity = (PlayerEntity)entityLiving;
        
        if (playerentity == null || !playerentity.abilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(RegistryHandler.JAR.get());
            }
            
            if (playerentity != null) {
                playerentity.inventory.addItemStackToInventory(new ItemStack(RegistryHandler.JAR.get()));
            }
        }
        
        return stack;
    }
}
