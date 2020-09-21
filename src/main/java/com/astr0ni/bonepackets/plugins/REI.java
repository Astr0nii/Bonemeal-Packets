package com.astr0ni.bonepackets.plugins;

import me.shedaniel.rei.api.plugins.REIPluginV0;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class REI implements REIPluginV0 {
    @Override
    public Identifier getPluginIdentifier() {
        return new Identifier("bmpack:example_plugin");
    }
}
