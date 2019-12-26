package com.github.nefasu.nordicmyth;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.nefasu.nordicmyth.client.renders.NordicMythRenderRegistry;
import com.github.nefasu.nordicmyth.config.Config;
import com.github.nefasu.nordicmyth.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("nordicmyth")
public class NordicMyth {
	public static NordicMyth instance;
	public static final String MODID = "nordicmyth";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final ItemGroup NORDICITEMGROUP = new NordicMythItemGroup();
	
	public NordicMyth() {
		instance = this;

		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

		Config.LoadConfig(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("nordicmyth-server.toml").toString());
		Config.LoadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("nordicmyth-client.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		OreGeneration.SetupOreGeneration();
		LOGGER.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		NordicMythRenderRegistry.registerEntityRenders();
		LOGGER.info("Client registries method registered.");
	}
}
