package com.elot.elotpack.world.gen;

import com.elot.elotpack.ElotPack;
import com.elot.elotpack.util.RegistryHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen {

    public static void generateOre(){
        for (Biome biome : ForgeRegistries.BIOMES) {
            //onyx ore
            ConfiguredPlacement onyxConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 1, 1, 64));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_ONYX.get().getDefaultState(), 4))
                    .withPlacement(onyxConfig));
            //silver ore
            ConfiguredPlacement silverConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 5, 5, 53));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_SILVER.get().getDefaultState(), 8))
                    .withPlacement(silverConfig));
            //mithril ore
            ConfiguredPlacement mithrilConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(6, 1, 1, 27));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ORE_MITHRIL.get().getDefaultState(), 7))
                    .withPlacement(mithrilConfig));
        }
    }

}
