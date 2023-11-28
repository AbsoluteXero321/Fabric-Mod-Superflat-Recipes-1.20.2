package net.xero.superflat.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xero.superflat.SuperflatRecipes;

import java.security.PublicKey;

public class ModItemGroups {
    public static final ItemGroup SUPERFLATRECIPES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SuperflatRecipes.MOD_ID, "end_string"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.superflatrecipes"))
                    .icon(() -> new ItemStack(ModItems.END_STRING)).entries((displayContext, entries) -> {
                        entries.add(ModItems.END_STRING);
                        entries.add(ModItems.BLANK_TEMPLATE);

    }).build());

    public static void registerItemGroups() {
        SuperflatRecipes.LOGGER.info("Registering Item Group for " + SuperflatRecipes.MOD_ID);
    }
}
