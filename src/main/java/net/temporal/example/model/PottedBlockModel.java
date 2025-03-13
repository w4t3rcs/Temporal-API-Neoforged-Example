package net.temporal.example.model;

import com.temporal.api.core.event.data.model.block.BlockModelProviderStrategy;
import com.temporal.api.core.event.data.model.block.CrossBlockModelProviderStrategy;
import com.temporal.api.core.util.other.RegistryUtils;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

public class PottedBlockModel implements BlockModelProviderStrategy {
    @Override
    public void registerBlockModel(DeferredBlock<?> deferredBlock, BlockModelGenerators blockModels) {
        Block block = deferredBlock.get();
        String id = RegistryUtils.getIdFromBlock(block);
        Block pottedBlock = RegistryUtils.getBlockById("potted_" + id);
        BlockModelGenerators.PlantType plantType = BlockModelGenerators.PlantType.NOT_TINTED;
        CrossBlockModelProviderStrategy crossProvider = new CrossBlockModelProviderStrategy();
        crossProvider.registerBlockModel(deferredBlock, blockModels);
        TextureMapping texturemapping = plantType.getPlantTextureMapping(block);
        ResourceLocation resourcelocation = plantType.getCrossPot().create(pottedBlock, texturemapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(pottedBlock, resourcelocation));
    }
}
