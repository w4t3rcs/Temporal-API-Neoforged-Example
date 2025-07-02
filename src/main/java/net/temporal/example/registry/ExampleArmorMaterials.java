package net.temporal.example.registry;

import com.temporal.api.core.engine.io.metadata.annotation.data.model.ArmorAsset;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.registry.factory.other.ArmorMaterialFactory;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.temporal.example.tag.ExampleItemTags;

import java.util.EnumMap;

@Injected(false)
public final class ExampleArmorMaterials {
    @ArmorAsset
    public static ArmorMaterial EXAMPLE_ARMOR_MATERIAL = ArmorMaterialFactory.create("example", Util.make(new EnumMap<>(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 4);
        map.put(ArmorType.LEGGINGS, 7);
        map.put(ArmorType.CHESTPLATE, 9);
        map.put(ArmorType.HELMET, 4);
        map.put(ArmorType.BODY, 12);
    }), 16, 4, 4F, 0.5F, ExampleItemTags.REPAIRS_EXAMPLE_ARMOR, SoundEvents.ARMOR_EQUIP_GENERIC, true);
}
