package com.parabaum.foodstuffs;

import com.parabaum.foodstuffs.util.RegistryHandler;
import com.parabaum.foodstuffs.world.gen.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("foodstuffs")
public class Foodstuffs
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "foodstuffs";

    public Foodstuffs() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        OreGeneration.registerOres();
    }
    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("FoodstuffsTab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.SWEET_BREAD.get());
        }
    };
}
