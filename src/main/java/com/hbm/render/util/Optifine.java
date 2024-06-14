package com.hbm.render.util;

import net.minecraft.launchwrapper.Launch;
import shadersmod.client.Shaders;

import java.io.IOException;

public class Optifine {

    /**
    * Why hasn't anyone made compatibility with shaders and modified skyboxes yet?
    * Oh, that's right, it's impossible (to make it look normal),
    * but hey, we always have it... WORKAROUND
    */

    private static final boolean IS_SHADERS_MOD_PRESENT;
    static {
        boolean shadersModPresent = false;
        try {
            shadersModPresent = Launch.classLoader.getClassBytes("shadersmod.client.Shaders") != null;
        } catch (IOException ignored) {
        }
        IS_SHADERS_MOD_PRESENT = shadersModPresent;
    }

    public static boolean shadersEnabled() {
        return IS_SHADERS_MOD_PRESENT && shaderPackLoaded();
    }
    public static boolean shaderPackLoaded() {
        return Shaders.shaderPackLoaded;
    }
}
