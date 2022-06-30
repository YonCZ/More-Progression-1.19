package yoncz.more.progression;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yoncz.more.progression.item.ModBlocks;
import yoncz.more.progression.item.ModItems;

public class MoreProgression implements ModInitializer {

	public static final String MOD_ID = "moreprogression";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
