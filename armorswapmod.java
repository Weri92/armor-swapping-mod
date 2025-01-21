package com.example.armorswapmod;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.CreativeModeTabBuildingEvent;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.input.InputEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLServerStartingEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@Mod("armorswapmod")
public class ArmorSwapMod {
    public ArmorSwapMod() {
        IEventBus eventBus = MinecraftForge.EVENT_BUS;
        // Register setup methods for common and client setup
        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);
        
        // Setup keybinding here, if needed
    }
    private void setup(final FMLCommonSetupEvent event) {
        // Common setup code
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        // Client-side setup code, including keybindings
        registerKeyBindings();
    }
}
