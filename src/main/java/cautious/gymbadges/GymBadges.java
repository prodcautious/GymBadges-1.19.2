package cautious.gymbadges;

import cautious.gymbadges.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GymBadges implements ModInitializer {
	public static final String MOD_ID = "gymbadges";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}