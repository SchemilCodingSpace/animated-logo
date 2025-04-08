package com.cyao.animatedLogo;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimatedLogo implements ModInitializer {
    public static final String MOD_ID = "animated-logo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static SoundEvent LOAD;

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing mod");
        LOAD = Registry.register(Registries.SOUND_EVENT, Identifier.of(MOD_ID, "load"),
                SoundEvent.of(Identifier.of(MOD_ID, "load")));
    }
}
