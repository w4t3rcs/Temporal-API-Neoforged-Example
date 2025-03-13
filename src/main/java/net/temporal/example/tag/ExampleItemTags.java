package net.temporal.example.tag;

import com.temporal.api.core.engine.io.metadata.annotation.data.tag.TagContainer;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.engine.io.metadata.constant.TagContainerType;
import com.temporal.api.core.tag.factory.ItemTagFactory;
import com.temporal.api.core.tag.factory.TagFactory;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

@TagContainer(TagContainerType.ITEM)
@Injected(false)
public class ExampleItemTags {
    public static final TagFactory<Item> ITEM_TAG_FACTORY = new ItemTagFactory();

    public static final TagKey<Item> REPAIRS_EXAMPLE_ARMOR = ITEM_TAG_FACTORY.createTag("repairs_example_armor");
}
