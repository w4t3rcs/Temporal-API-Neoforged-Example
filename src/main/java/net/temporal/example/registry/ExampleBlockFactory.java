package net.temporal.example.registry;

import com.temporal.api.core.registry.factory.common.BlockFactory;
import com.temporal.api.core.registry.factory.extension.block.*;

public class ExampleBlockFactory extends BlockFactory implements FlowerExtension, PottedFlowerExtension,
        LeavesExtension, LogBlockExtension, SaplingExtension,
        SlabExtension, StairExtension,
        ButtonExtension, PressurePlateExtension,
        FenceExtension, FenceGateExtension,
        DoorExtension, TrapDoorExtension {
}