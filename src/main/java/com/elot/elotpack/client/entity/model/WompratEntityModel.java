package com.elot.elotpack.client.entity.model;

// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.elot.elotpack.entities.Womprat;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class WompratEntityModel<T extends Womprat> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer Legs;
    private final ModelRenderer Back;
    private final ModelRenderer LeftBack;
    private final ModelRenderer RightBack;
    private final ModelRenderer Front;
    private final ModelRenderer LeftFront;
    private final ModelRenderer RightFront;
    private final ModelRenderer Head;

    public WompratEntityModel() {
        textureWidth = 32;
        textureHeight = 32;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 24.0F, -2.0F);
        Body.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 3.0F, 8.0F, 0.0F, false);
        Body.setTextureOffset(16, 0).addBox(-0.5F, -2.0F, 7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        Legs = new ModelRenderer(this);
        Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Legs);


        Back = new ModelRenderer(this);
        Back.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Back);


        LeftBack = new ModelRenderer(this);
        LeftBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        Back.addChild(LeftBack);
        LeftBack.setTextureOffset(10, 11).addBox(2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        LeftBack.setTextureOffset(0, 0).addBox(2.0F, -4.0F, 3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        RightBack = new ModelRenderer(this);
        RightBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        Back.addChild(RightBack);
        RightBack.setTextureOffset(0, 16).addBox(-3.0F, -1.0F, 2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        RightBack.setTextureOffset(10, 16).addBox(-3.0F, -4.0F, 3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        Front = new ModelRenderer(this);
        Front.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Front);


        LeftFront = new ModelRenderer(this);
        LeftFront.setRotationPoint(4.0F, -1.0F, -5.0F);
        Front.addChild(LeftFront);
        LeftFront.setTextureOffset(0, 21).addBox(-2.0F, -2.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        LeftFront.setTextureOffset(16, 4).addBox(-2.0F, 0.0F, 3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        RightFront = new ModelRenderer(this);
        RightFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        Front.addChild(RightFront);
        RightFront.setTextureOffset(18, 18).addBox(-3.0F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        RightFront.setTextureOffset(16, 11).addBox(-3.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(3.0F, -2.0F, -12.0F);
        Body.addChild(Head);
        Head.setTextureOffset(0, 11).addBox(-4.0F, -1.0F, 7.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
        Head.setTextureOffset(0, 11).addBox(-4.0F, -1.0F, 10.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 6).addBox(-3.5F, 0.0F, 6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 16).addBox(-4.5F, -2.0F, 9.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(7, 11).addBox(-2.5F, -2.0F, 9.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public ModelRenderer getBody() {
        return Body;
    }

    public ModelRenderer getHead() {
        return Head;
    }

}
