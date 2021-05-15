package io.github.fallOut015.karlson.item;

import io.github.fallOut015.karlson.MainKarlson;
import io.github.fallOut015.karlson.block.BlocksKarlson;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsKarlson {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainKarlson.MODID);



    public static final RegistryObject<Item> TILE_BLOCK = ITEMS.register("tile_block", () -> new BlockItem(BlocksKarlson.TILE_BLOCK.get(), new Item.Properties().tab(ItemGroupKarlson.TAB_KARLSON)));
    public static final RegistryObject<Item> GLOWING_LIGHT = ITEMS.register("glowing_light", () -> new BlockItem(BlocksKarlson.GLOWING_LIGHT.get(), new Item.Properties().tab(ItemGroupKarlson.TAB_KARLSON)));

    public static final RegistryObject<Item> SHOTGUN = ITEMS.register("shotgun", () -> new ShotgunItem(new Item.Properties().tab(ItemGroupKarlson.TAB_KARLSON).stacksTo(1)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
