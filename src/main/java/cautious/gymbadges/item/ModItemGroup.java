package cautious.gymbadges.item;

import cautious.gymbadges.GymBadges;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GYMBADGES = FabricItemGroupBuilder.build(
            new Identifier(GymBadges.MOD_ID, "gym_badges"), () -> new ItemStack(ModItems.FAIRY_BADGE));
}
