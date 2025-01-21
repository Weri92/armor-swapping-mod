package com.example.armorswapmod.items;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
public class ArmorSwapItem extends Item {
    public ArmorSwapItem() {
        super(new Item.Properties().stacksTo(1));
    }
    @Override
    public InteractionResult useOn(ItemUseContext context) {
        // Logic to open selection wheel for armor stands
        Player player = context.getPlayer();
        if (!player.level.isClientSide()) {
            // Send message or open a GUI for selection
            player.sendSystemMessage(Component.literal("Select an armor stand."));
            // Open a GUI or a selection mechanic here
        }
        return InteractionResult.SUCCESS;
    }
}
