package net.temporal.example.registry;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import com.temporal.api.core.registry.factory.extension.item.ArmorExtension;
import com.temporal.api.core.registry.factory.extension.item.BowExtension;
import com.temporal.api.core.registry.factory.extension.item.CrossbowExtension;
import com.temporal.api.core.registry.factory.extension.item.SwordExtension;

public class ExampleItemFactory extends ItemFactory implements SwordExtension, BowExtension, CrossbowExtension, ArmorExtension {
}
