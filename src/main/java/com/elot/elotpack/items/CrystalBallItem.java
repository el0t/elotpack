package com.elot.elotpack.items;

import com.elot.elotpack.ElotPack;
import com.elot.elotpack.util.RegistryHandler;
import com.elot.elotpack.util.helpers.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockStateMatcher;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Stream;

public class CrystalBallItem extends Item {
    private int detectionRadius;
    private float nearbyCount;

    public CrystalBallItem(Properties properties, int radius) {
        super(properties);
        this.detectionRadius = radius;
    }

    public Block getTargetBlock(ItemStack stack){
        int k = this.getDamage(stack);
        return targetBlocks[k];
    }
    public void setDetectionRadius(int radiusIn){
        this.detectionRadius = radiusIn;
    }
    public int getDetectionRadius(){
        return detectionRadius;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return false;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        ITextComponent glowsWhen = new StringTextComponent("Glows when ").applyTextStyles(TextFormatting.GRAY);
        ITextComponent isNearby = new StringTextComponent(" is nearby.").applyTextStyles(TextFormatting.GRAY);
        ITextComponent targetName = getTargetBlock(stack).getNameTextComponent().applyTextStyle(TextFormatting.YELLOW);
        if (KeyboardHelper.isHoldingShift()){
                tooltip.add(glowsWhen.appendSibling(targetName).appendSibling(isNearby));
        } else {
                tooltip.add(new StringTextComponent("Hold Shift to see details.").applyTextStyles(TextFormatting.GRAY, TextFormatting.ITALIC));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        nearbyCount = 0;
        stack.getOrCreateTag().putFloat("nearbyCount", 0);
        if (entityIn instanceof PlayerEntity) {
            Block b = getTargetBlock(stack);
            streamNearbyBlockPos(entityIn).forEach(blockPos -> {
                BlockState ifbs = worldIn.getBlockState(blockPos);
                if (BlockStateMatcher.forBlock(b).test(ifbs) && stack.getTag().getFloat("nearbyCount") < 1.0) {
                    stack.getOrCreateTag().putFloat("nearbyCount", stack.getTag().getFloat("nearbyCount") + 0.25f);
                }
            });
        }
        this.addPropertyOverride(new ResourceLocation(ElotPack.MOD_ID, "nearby"), new IItemPropertyGetter() {
            @OnlyIn(Dist.CLIENT)
            @Override
            public float call(ItemStack stack, @Nullable World worldIn, @Nullable LivingEntity entityIn) {
                return stack.getTag().getFloat("nearbyCount");
            }
        });

        super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
    }

    public float getNearbyCount() {
        return nearbyCount;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public Stream<BlockPos> streamNearbyBlockPos(Entity playerIn) {
        BlockPos blockPos = playerIn.getPosition();
            int minBoundX = blockPos.getX() - detectionRadius;
            int minBoundY = blockPos.getY() - detectionRadius;
            int minBoundZ = blockPos.getZ() - detectionRadius;
            int maxBoundX = blockPos.getX() + detectionRadius;
            int maxBoundY = blockPos.getY() + detectionRadius;
            int maxBoundZ = blockPos.getZ() + detectionRadius;
        return BlockPos.getAllInBox(new MutableBoundingBox(minBoundX, minBoundY, minBoundZ, maxBoundX, maxBoundY, maxBoundZ));
    }


    @Override
    public double getDurabilityForDisplay(ItemStack stack) {
        return 0;
    }


    @Override
    public int getMaxDamage(ItemStack stack) {
        return targetBlocks.length + 1;
    }

    private Block[] targetBlocks = {Blocks.COAL_ORE, Blocks.IRON_ORE, Blocks.GOLD_ORE, Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE,
            Blocks.REDSTONE_ORE, Blocks.LAPIS_ORE, RegistryHandler.ORE_ONYX.get(), RegistryHandler.ORE_SILVER.get(), RegistryHandler.ORE_MITHRIL.get()};
    private Item[] sourceItems = {Items.COAL, Items.IRON_INGOT, Items.GOLD_INGOT, Items.DIAMOND, Items.EMERALD,
            Items.REDSTONE, Items.LAPIS_LAZULI, RegistryHandler.ONYX.get(), RegistryHandler.INGOT_SILVER.get(), RegistryHandler.INGOT_MITHRIL.get()};


}
