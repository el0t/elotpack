package com.elot.elotpack.util;

import com.elot.elotpack.ElotPack;
import com.elot.elotpack.blocks.BlockBase;
import com.elot.elotpack.blocks.ModCrop;
import com.elot.elotpack.blocks.OreBlockBase;
import com.elot.elotpack.items.BlockItemBase;
import com.elot.elotpack.items.ItemBase;
import com.elot.elotpack.items.ModArmorMaterial;
import com.elot.elotpack.items.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ElotPack.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ElotPack.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    // Blocks and Block Items
    public static final RegistryObject<Block> ORE_ONYX = BLOCKS.register("ore_onyx", () -> new OreBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)));
    public static final RegistryObject<Item> ORE_ONYX_ITEM = ITEMS.register("ore_onyx", () -> new BlockItemBase(ORE_ONYX.get()));
    public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", () -> new BlockBase(Block.Properties.create(Material.IRON, MaterialColor.BLACK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setBeaconBase());
    public static final RegistryObject<Item> ONYX_BLOCK_ITEM = ITEMS.register("onyx_block", () -> new BlockItemBase(ONYX_BLOCK.get()));
    public static final RegistryObject<Block> ORE_SILVER = BLOCKS.register("ore_silver", () -> new OreBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)));
    public static final RegistryObject<Item> ORE_SILVER_ITEM = ITEMS.register("ore_silver", () -> new BlockItemBase(ORE_SILVER.get()));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new BlockBase(Block.Properties.create(Material.IRON, MaterialColor.IRON).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setBeaconBase());
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItemBase(SILVER_BLOCK.get()));
    public static final RegistryObject<Block> ORE_MITHRIL = BLOCKS.register("ore_mithril", () -> new OreBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F,3.0F)));
    public static final RegistryObject<Item> ORE_MITHRIL_ITEM = ITEMS.register("ore_mithril", () -> new BlockItemBase(ORE_MITHRIL.get()));
    public static final RegistryObject<Block> MITHRIL_BLOCK = BLOCKS.register("mithril_block", () -> new BlockBase(Block.Properties.create(Material.IRON, MaterialColor.BLUE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setBeaconBase());
    public static final RegistryObject<Item> MITHRIL_BLOCK_ITEM = ITEMS.register("mithril_block", () -> new BlockItemBase(MITHRIL_BLOCK.get()));
    public static final RegistryObject<Block> CORELLIAN_CORN = BLOCKS.register("corellian_corn", () -> new ModCrop(Block.Properties.from(Blocks.WHEAT)));
    public static final RegistryObject<Item> CORELLIAN_SEED = ITEMS.register("corellian_seed", () -> new BlockItemBase(CORELLIAN_CORN.get()));

    // Items
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", () -> new ItemBase().setBeaconPayment());
    public static final RegistryObject<Item> INGOT_SILVER = ITEMS.register("ingot_silver", ItemBase::new);
    public static final RegistryObject<Item> INGOT_MITHRIL = ITEMS.register("ingot_mithril", ItemBase::new);
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModItemTier.MITHRIL, 3, -2.4F, new Item.Properties().group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModItemTier.MITHRIL, 1, -2.8F, new Item.Properties().group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModItemTier.MITHRIL, 1.5F, -3.0F, new Item.Properties().group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModItemTier.MITHRIL, 5.0F, -3.0F, new Item.Properties().group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModItemTier.MITHRIL, 0.0F, new Item.Properties().group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.HEAD, (new Item.Properties()).group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.CHEST, (new Item.Properties()).group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.LEGS, (new Item.Properties()).group(ElotPack.TAB)));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.FEET, (new Item.Properties()).group(ElotPack.TAB)));
    public static final RegistryObject<Item> CORELLIAN_CORNCOB = ITEMS.register("corellian_corncob", ItemBase::new);

}
