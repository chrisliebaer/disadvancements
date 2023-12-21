package de.chrisliebaer.disadvancements;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Disadvancements.MODID)
public class Disadvancements {
	
	public static final String MODID = "disadvancements";
	private static final Logger LOGGER = LogUtils.getLogger();
	
	
	public Disadvancements() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::commonSetup);
	}
	
	private void commonSetup(FMLCommonSetupEvent event) {
		LOGGER.info("Loaded Disadvancements - for staying behind");
	}
}
