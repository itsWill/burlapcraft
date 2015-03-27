package com.kcaluru.burlapbot;

import com.kcaluru.burlapbot.items.ItemBurlapWand;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BurlapMod.MODID, version = BurlapMod.VERSION)
public class BurlapMod
{
	// mod information
    public static final String MODID = "burlapmod";
    public static final String VERSION = "1.0";
    
    // dungeon generation variable
    public static boolean structCreated = false;
    
    // items
    public static Item wand;
    
    // event handlers
    BurlapEventHandler handler = new BurlapEventHandler();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	wand = new ItemBurlapWand();
    	
    	// make sure minecraft knows
    	GameRegistry.registerItem(wand, "burlapwand");
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
}
