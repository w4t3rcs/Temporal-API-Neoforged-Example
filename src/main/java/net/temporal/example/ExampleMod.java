package net.temporal.example;

import com.temporal.api.ApiMod;
import com.temporal.api.core.compat.SimpleDependencyProcessBuilder;
import com.temporal.api.core.engine.TemporalEngine;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
    public static final String MOD_ID = "example";

    public ExampleMod(IEventBus modEventBus, ModContainer modContainer) {
        TemporalEngine.run(ExampleMod.class, modEventBus, modContainer);
        SimpleDependencyProcessBuilder.create("temporalapi")
                .addProcess(() -> ApiMod.LOGGER.debug("hello"))
                .addProcess(() -> ApiMod.LOGGER.debug("world :D"))
                .build();
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
