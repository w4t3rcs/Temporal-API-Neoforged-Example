package net.temporal.example.registry;

import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import com.temporal.api.core.registry.factory.extension.item.ArmorExtension;
import com.temporal.api.core.registry.factory.extension.item.BowExtension;
import com.temporal.api.core.registry.factory.extension.item.CrossbowExtension;
import com.temporal.api.core.registry.factory.extension.item.SwordExtension;

@Injected
public final class ExampleItemFactory extends ItemFactory implements SwordExtension, BowExtension, CrossbowExtension, ArmorExtension {
}
