package com.parabaum.foodstuffs.items;

import com.parabaum.foodstuffs.Foodstuffs;
import com.parabaum.foodstuffs.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;


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