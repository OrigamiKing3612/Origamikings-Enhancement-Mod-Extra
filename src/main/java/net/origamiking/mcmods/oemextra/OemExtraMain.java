package net.origamiking.mcmods.oemextra;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OemExtraMain implements ModInitializer {
	public static final String MOD_ID = "oem-extra";
	public static final Logger LOGGER = LoggerFactory.getLogger("oem-extra");

	@Override
	public void onInitialize() {
		OemExtraMain.LOGGER.info("Adding other things to OEM");
	}
}