package cautious.gymbadges.item;

import cautious.gymbadges.GymBadges;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FIRE_BADGE = registerItem("fire_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item BUG_BADGE = registerItem("bug_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item DARK_BADGE = registerItem("dark_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item DRAGON_BADGE = registerItem("dragon_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item ELECTRIC_BADGE = registerItem("electric_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item FAIRY_BADGE = registerItem("fairy_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item FIGHTING_BADGE = registerItem("fighting_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item FLYING_BADGE = registerItem("flying_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item GHOST_BADGE = registerItem("ghost_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item GRASS_BADGE = registerItem("grass_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item GROUND_BADGE = registerItem("ground_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item ICE_BADGE = registerItem("ice_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item NORMAL_BADGE = registerItem("normal_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item POISON_BADGE = registerItem("poison_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item PSYCHIC_BADGE = registerItem("psychic_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item ROCK_BADGE = registerItem("rock_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item STEEL_BADGE = registerItem("steel_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    public static final Item WATER_BADGE = registerItem("water_badge",
            new Item(new FabricItemSettings().group(ModItemGroup.GYMBADGES).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GymBadges.MOD_ID, name), item);
    }
    public static void registerModItems() {
        GymBadges.LOGGER.debug("Registering Mod Items for " +GymBadges.MOD_ID);
    }
}
