package net.temporal.example.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.data.defined.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.event.data.recipe.holder.BaseSmithingTrimRecipeHolder;
import net.minecraft.world.level.ItemLike;
import net.temporal.example.registry.ExampleItems;

@DefinedRecipe
@Injected(false)
public class ExampleTrimmedHelmetRecipe implements BaseSmithingTrimRecipeHolder {
    @Override
    public ItemLike[] getBases() {
        return new ItemLike[]{
                ExampleItems.EXAMPLE_HELMET.get(),
                ExampleItems.EXAMPLE_CHESTPLATE.get(),
                ExampleItems.EXAMPLE_LEGGINGS.get(),
                ExampleItems.EXAMPLE_BOOTS.get()
        };
    }
}
