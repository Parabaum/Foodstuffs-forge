package com.parabaum.foodstuffs.util;

import com.parabaum.foodstuffs.Foodstuffs;
import com.parabaum.foodstuffs.blocks.BlockItemBase;
import com.parabaum.foodstuffs.blocks.SaltBlock;
import com.parabaum.foodstuffs.blocks.SaltOreBlock;
import com.parabaum.foodstuffs.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Foodstuffs.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Foodstuffs.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> SALT_CHUNK = ITEMS.register("salt_chunk", ItemBase::new);
    public static final RegistryObject<SweetBread> SWEET_BREAD = ITEMS.register("sweet_bread", SweetBread::new);
    public static final RegistryObject<Pretzel> PRETZEL = ITEMS.register("pretzel", Pretzel::new);
    public static final RegistryObject<BerryPie> BERRY_PIE = ITEMS.register("berry_pie", BerryPie::new);
    public static final RegistryObject<HoneyPie> HONEY_PIE = ITEMS.register("honey_pie", HoneyPie::new);
    public static final RegistryObject<HoneyMelon> HONEY_MELON = ITEMS.register("honey_melon", HoneyMelon::new);
    public static final RegistryObject<Pear> PEAR = ITEMS.register("pear", Pear::new);
    public static final RegistryObject<SilverPear> SILVER_PEAR = ITEMS.register("silver_pear", SilverPear::new);
    public static final RegistryObject<Item> JAR = ITEMS.register("jar", ItemBase::new);
    public static final RegistryObject<SweetberryJam> SWEETBERRY_JAM = ITEMS.register("sweetberry_jam", SweetberryJam::new);
    public static final RegistryObject<PickledCarrot> PICKLED_CARROT = ITEMS.register("pickled_carrot", PickledCarrot::new);
    public static final RegistryObject<Stockfish> STOCKFISH = ITEMS.register("stockfish", Stockfish::new);
    public static final RegistryObject<ApplePie> APPLE_PIE = ITEMS.register("apple_pie", ApplePie::new);



    //Blocks
    public static final RegistryObject<Block> SALT_ORE_BLOCK = BLOCKS.register("salt_ore_block", SaltOreBlock::new);
    public static final RegistryObject<Block> SALT_BLOCK = BLOCKS.register("salt_block", SaltBlock::new);

    //Block Items
    public static final RegistryObject<Item> SALT_ORE_BLOCK_ITEM = ITEMS.register("salt_ore_block", ()->new BlockItemBase(SALT_ORE_BLOCK.get()));
    public static final RegistryObject<Item> SALT_BLOCK_ITEM = ITEMS.register("salt_block", ()->new BlockItemBase(SALT_BLOCK.get()));
}