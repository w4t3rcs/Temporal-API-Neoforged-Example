package net.temporal.example.registry;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.data.language.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.data.model.BlockModel;
import com.temporal.api.core.engine.io.metadata.annotation.data.other.BlockLootTable;
import com.temporal.api.core.engine.io.metadata.annotation.data.tag.BlockTagComponent;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Registry;
import com.temporal.api.core.engine.io.metadata.constant.BlockLootTableType;
import com.temporal.api.core.engine.io.metadata.constant.BlockModelType;
import com.temporal.api.core.registry.factory.other.BlockPropertiesFactory;
import net.minecraft.world.effect.MobEffects;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.temporal.example.worldgen.ExampleConfiguredFeatures;

@Injected(false)
public final class ExampleBlocks {
    @Registry
    private static final ExampleBlockFactory BLOCK_FACTORY = InjectionContext.getFromInstance(ExampleBlockFactory.class);

    @BlockModel
    @BlockLootTable
    @EnglishTranslation("Example Block")
    public static final DeferredBlock<?> EXAMPLE_BLOCK = BLOCK_FACTORY.create("example_block", BlockPropertiesFactory.empty());

    @BlockModel
    @BlockTagComponent({"mineable/pickaxe", "needs_diamond_tool"})
    @BlockLootTable(value = BlockLootTableType.OTHER, itemId = "example_ingot")
    @EnglishTranslation("Example Ore")
    public static final DeferredBlock<?> EXAMPLE_ORE = BLOCK_FACTORY.create("example_ore", BlockPropertiesFactory.stone());

    @BlockModel(BlockModelType.CROSS)
    @BlockLootTable(BlockLootTableType.SILK_TOUCH)
    @EnglishTranslation("Example Grass")
    public static final DeferredBlock<?> EXAMPLE_GRASS = BLOCK_FACTORY.createFlower("example_grass", BlockPropertiesFactory.shortGrass(), MobEffects.DAMAGE_RESISTANCE, 1);

    @BlockModel(BlockModelType.FLOWER)
    @BlockLootTable(BlockLootTableType.SILK_TOUCH)
    @EnglishTranslation("Example Flower")
    public static final DeferredBlock<?> EXAMPLE_FLOWER = BLOCK_FACTORY.createFlower("example_flower", MobEffects.DAMAGE_RESISTANCE, 1);

    @BlockLootTable(BlockLootTableType.POTTED_CONTENT)
    @EnglishTranslation("Potted Example Flower")
    public static final DeferredBlock<?> POTTED_EXAMPLE_FLOWER = BLOCK_FACTORY.createPottedFlower("potted_example_flower", EXAMPLE_FLOWER);

    @BlockModel(BlockModelType.CUTOUT_CUBED)
    @BlockLootTable(BlockLootTableType.SILK_TOUCH)
    @EnglishTranslation("Example Leaves")
    public static final DeferredBlock<?> EXAMPLE_LEAVES = BLOCK_FACTORY.createLeaves("example_leaves");

    @BlockModel(BlockModelType.LOG)
    @BlockLootTable(BlockLootTableType.SILK_TOUCH)
    @EnglishTranslation("Example Stripped Log")
    public static final DeferredBlock<?> EXAMPLE_STRIPPED_LOG = BLOCK_FACTORY.createLog("example_stripped_log");

    @BlockModel(BlockModelType.LOG)
    @BlockLootTable
    @EnglishTranslation("Example Log")
    public static final DeferredBlock<?> EXAMPLE_LOG = BLOCK_FACTORY.createStrippableLog("example_log", EXAMPLE_STRIPPED_LOG);

    @BlockModel(BlockModelType.CROSS)
    @BlockLootTable
    @EnglishTranslation("Example Sapling")
    public static final DeferredBlock<?> EXAMPLE_SAPLING = BLOCK_FACTORY.createSapling("example_sapling", ExampleConfiguredFeatures.EXAMPLE_TREE_FEATURE);

    @BlockModel
    @BlockLootTable
    @EnglishTranslation("Example Planks")
    public static final DeferredBlock<?> EXAMPLE_PLANKS = BLOCK_FACTORY.create("example_planks", BlockPropertiesFactory.planks());

    @BlockModel(BlockModelType.PLANKS_SLAB)
    @BlockLootTable
    @EnglishTranslation("Example Slab")
    public static final DeferredBlock<?> EXAMPLE_SLAB = BLOCK_FACTORY.createSlab("example_slab", BlockPropertiesFactory.planks());

    @BlockModel(BlockModelType.PLANKS_STAIRS)
    @BlockLootTable
    @EnglishTranslation("Example Stairs")
    public static final DeferredBlock<?> EXAMPLE_STAIRS = BLOCK_FACTORY.createStair("example_stairs", BlockPropertiesFactory.planks());

    @BlockModel(BlockModelType.PLANKS_BUTTON)
    @BlockLootTable
    @EnglishTranslation("Example Button")
    public static final DeferredBlock<?> EXAMPLE_BUTTON = BLOCK_FACTORY.createButton("example_button");

    @BlockModel(BlockModelType.PLANKS_PRESSURE_PLATE)
    @BlockLootTable
    @EnglishTranslation("Example Pressure Plate")
    public static final DeferredBlock<?> EXAMPLE_PRESSURE_PLATE = BLOCK_FACTORY.createPressurePlate("example_pressure_plate");

    @BlockTagComponent("fences")
    @BlockModel(BlockModelType.PLANKS_FENCE)
    @BlockLootTable
    @EnglishTranslation("Example Fence")
    public static final DeferredBlock<?> EXAMPLE_FENCE = BLOCK_FACTORY.createFence("example_fence");

    @BlockTagComponent("fence_gates")
    @BlockModel(BlockModelType.PLANKS_FENCE_GATE)
    @BlockLootTable
    @EnglishTranslation("Example Fence Gate")
    public static final DeferredBlock<?> EXAMPLE_FENCE_GATE = BLOCK_FACTORY.createFenceGate("example_fence_gate");
}
