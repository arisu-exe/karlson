package io.github.fallOut015.karlson.block;

import io.github.fallOut015.karlson.MainKarlson;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksKarlson {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainKarlson.MODID);



    public static final RegistryObject<Block> TILE_BLOCK = BLOCKS.register("tile_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(10.0f).noDrops().lightLevel(state -> 1)));
    public static final RegistryObject<Block> GLOWING_LIGHT = BLOCKS.register("glowing_light", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(10.0f).noDrops().lightLevel(state -> 1).emissiveRendering((state, world, pos) -> true)));



    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}