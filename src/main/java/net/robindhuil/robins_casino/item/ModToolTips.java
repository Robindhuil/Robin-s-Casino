package net.robindhuil.robins_casino.item;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class ModToolTips {
    public static void registerToolTip(Item item, String defaultTooltip, String shiftTooltip) {
        ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {
            if (itemStack.isOf(item)) {
                boolean shiftDown =
                        InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)
                                || InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow(), GLFW.GLFW_KEY_RIGHT_SHIFT);

                if (shiftDown && shiftTooltip != null && !shiftTooltip.isEmpty()) {
                    list.add(Text.translatable(shiftTooltip));
                } else {
                    list.add(Text.translatable(defaultTooltip));
                }
            }
        });
    }
}
