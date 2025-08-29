package ca.desitos.tutorialmod;

/*

    My funny little intro to Fabric :]
    Following a neat tutorial by Kaupenjoe
    Full tutorial can be found here:
    https://www.youtube.com/playlist?list=PLKGarocXCE1H_HxOYihQMq0mlpqiUJj4L

 */

import ca.desitos.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}