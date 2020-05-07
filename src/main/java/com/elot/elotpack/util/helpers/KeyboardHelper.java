package com.elot.elotpack.util.helpers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

public class KeyboardHelper
{
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingShift(){
        return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)
                || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_RIGHT_SHIFT);
    }
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingCtrl(){
        return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_CONTROL)
                || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_RIGHT_CONTROL);
    }
}
