package net.temporal.example.registry;

import com.temporal.api.core.engine.io.metadata.annotation.data.language.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.data.model.ItemModel;
import com.temporal.api.core.engine.io.metadata.annotation.data.properties.Compostable;
import com.temporal.api.core.engine.io.metadata.annotation.data.properties.FurnaceFuel;
import com.temporal.api.core.engine.io.metadata.annotation.data.tag.ItemTagComponent;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Registry;
import com.temporal.api.core.engine.io.metadata.constant.ItemModelType;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredItem;

@Injected(false)
public class ExampleItems {
    @Registry
    public static final ExampleItemFactory ITEM_FACTORY = new ExampleItemFactory();

    @ItemModel
    @ItemTagComponent("repairs_example_armor")
    @EnglishTranslation("Example Ingot")
    public static final DeferredItem<?> EXAMPLE_INGOT = ITEM_FACTORY.create("example_ingot");

    @ItemModel(ItemModelType.HANDHELD)
    @EnglishTranslation("Example Sword")
    public static final DeferredItem<?> EXAMPLE_SWORD = ITEM_FACTORY.createSword("example_sword", ToolMaterial.NETHERITE, 4, -2.6F);

    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @ItemTagComponent("trimmable_armor")
    @EnglishTranslation("Example Helmet")
    public static final DeferredItem<?> EXAMPLE_HELMET = ITEM_FACTORY.createArmor("example_helmet", ExampleArmorMaterials.EXAMPLE_ARMOR_MATERIAL, ArmorType.HELMET);

    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @ItemTagComponent("trimmable_armor")
    @EnglishTranslation("Example Chestplate")
    public static final DeferredItem<?> EXAMPLE_CHESTPLATE = ITEM_FACTORY.createArmor("example_chestplate", ExampleArmorMaterials.EXAMPLE_ARMOR_MATERIAL, ArmorType.CHESTPLATE);

    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @ItemTagComponent("trimmable_armor")
    @EnglishTranslation("Example Leggings")
    public static final DeferredItem<?> EXAMPLE_LEGGINGS = ITEM_FACTORY.createArmor("example_leggings", ExampleArmorMaterials.EXAMPLE_ARMOR_MATERIAL, ArmorType.LEGGINGS);

    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @ItemTagComponent("trimmable_armor")
    @EnglishTranslation("Example Boots")
    public static final DeferredItem<?> EXAMPLE_BOOTS = ITEM_FACTORY.createArmor("example_boots", ExampleArmorMaterials.EXAMPLE_ARMOR_MATERIAL, ArmorType.BOOTS);

    @ItemModel(ItemModelType.BOW)
    @EnglishTranslation("Example Bow")
    public static final DeferredItem<?> EXAMPLE_BOW = ITEM_FACTORY.createBow("example_bow");

    @ItemModel(ItemModelType.CROSSBOW)
    @EnglishTranslation("Example Crossbow")
    public static final DeferredItem<?> EXAMPLE_CROSSBOW = ITEM_FACTORY.createCrossbow("example_crossbow");

    @ItemModel
    @FurnaceFuel(burnTime = 1000)
    @EnglishTranslation("Example Fuel")
    public static final DeferredItem<?> EXAMPLE_FUEL = ITEM_FACTORY.create("example_fuel");

    @ItemModel
    @Compostable(chance = 1)
    @EnglishTranslation("Example Compostable Item")
    public static final DeferredItem<?> EXAMPLE_COMPOSTABLE_ITEM = ITEM_FACTORY.create("example_compostable_item");
}