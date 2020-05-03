package com.elot.elotpack.client.entity.model;

import com.elot.elotpack.entities.Bantha;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class BanthaEntityModel<T extends Bantha> extends AgeableModel<T> {
        private final ModelRenderer Body;
        private final ModelRenderer Hair;
        private final ModelRenderer LeftFlank;
        private final ModelRenderer RightFlank;
        private final ModelRenderer Back;
        private final ModelRenderer Head;
        private final ModelRenderer Horns;
        private final ModelRenderer LeftHorn;
        private final ModelRenderer LeftHorn1;
        private final ModelRenderer LeftHorn2;
        private final ModelRenderer LeftHorn3;
        private final ModelRenderer LeftHorn4;
        private final ModelRenderer LeftHorn5;
        private final ModelRenderer LeftHorn6;
        private final ModelRenderer LeftHorn7;
        private final ModelRenderer LeftHorn8;
        private final ModelRenderer LeftHorn9;
        private final ModelRenderer LeftHorn10;
        private final ModelRenderer LeftHorn11;
        private final ModelRenderer LeftHorn12;
        private final ModelRenderer LeftHorn13;
        private final ModelRenderer LeftHorn14;
        private final ModelRenderer LeftHorn15;
        private final ModelRenderer LeftHorn16;
        private final ModelRenderer LeftHorn17;
        private final ModelRenderer LeftHorn18;
        private final ModelRenderer LeftHorn19;
        private final ModelRenderer LeftHorn20;
        private final ModelRenderer LeftHorn21;
        private final ModelRenderer LeftHorn22;
        private final ModelRenderer LeftHorn23;
        private final ModelRenderer LeftHorn24;
        private final ModelRenderer LeftHorn25;
        private final ModelRenderer LeftHorn26;
        private final ModelRenderer RightHorn;
        private final ModelRenderer RightHorn20;
        private final ModelRenderer RightHorn21;
        private final ModelRenderer RightHorn22;
        private final ModelRenderer RightHorn23;
        private final ModelRenderer RightHorn24;
        private final ModelRenderer RightHorn25;
        private final ModelRenderer RightHorn26;
        private final ModelRenderer RightHorn10;
        private final ModelRenderer RightHorn11;
        private final ModelRenderer RightHorn12;
        private final ModelRenderer RightHorn13;
        private final ModelRenderer RightHorn14;
        private final ModelRenderer RightHorn15;
        private final ModelRenderer RightHorn16;
        private final ModelRenderer RightHorn17;
        private final ModelRenderer RightHorn18;
        private final ModelRenderer RightHorn19;
        private final ModelRenderer RightHorn1;
        private final ModelRenderer RightHorn2;
        private final ModelRenderer RightHorn3;
        private final ModelRenderer RightHorn4;
        private final ModelRenderer RightHorn5;
        private final ModelRenderer RightHorn6;
        private final ModelRenderer RightHorn7;
        private final ModelRenderer RightHorn8;
        private final ModelRenderer RightHorn9;
        private final ModelRenderer Torso;
        private final ModelRenderer Legs;
        private final ModelRenderer Left;
        private final ModelRenderer LeftFront;
        private final ModelRenderer LeftBack;
        private final ModelRenderer Right;
        private final ModelRenderer RightFront;
        private final ModelRenderer RightBack;
        private final ModelRenderer Tail;

        public BanthaEntityModel() {
            textureWidth = 256;
            textureHeight = 256;

            Body = new ModelRenderer(this);
            Body.setRotationPoint(0.0F, 24.0F, -17.0F);


            Hair = new ModelRenderer(this);
            Hair.setRotationPoint(0.0F, -31.0F, 0.0F);
            Body.addChild(Hair);
            setRotationAngle(Hair, 0.0F, 0.0F, -0.0873F);


            LeftFlank = new ModelRenderer(this);
            LeftFlank.setRotationPoint(10.0F, 27.5F, 28.0F);
            Hair.addChild(LeftFlank);
            LeftFlank.setTextureOffset(0, 57).addBox(5.0F, -33.0F, -26.0F, 8.0F, 31.0F, 47.0F, 0.0F, false);

            RightFlank = new ModelRenderer(this);
            RightFlank.setRotationPoint(0.0F, 0.0F, 0.0F);
            Hair.addChild(RightFlank);
            setRotationAngle(RightFlank, 0.0F, 0.0F, 0.1745F);
            RightFlank.setTextureOffset(85, 10).addBox(-23.0F, -5.5F, 2.0F, 8.0F, 31.0F, 47.0F, 0.0F, false);

            Back = new ModelRenderer(this);
            Back.setRotationPoint(-0.2615F, 2.9886F, -2.0F);
            Hair.addChild(Back);
            setRotationAngle(Back, 0.0873F, 0.0F, 0.0873F);
            Back.setTextureOffset(0, 135).addBox(-21.0F, -5.5F, 49.0F, 42.0F, 31.0F, 7.0F, 0.0F, false);

            Head = new ModelRenderer(this);
            Head.setRotationPoint(0.0F, -30.375F, -9.375F);
            //Body.addChild(Head);
            Head.setTextureOffset(148, 0).addBox(-16.0F, -14.625F, -7.625F, 32.0F, 28.0F, 12.0F, 0.0F, false);
            Head.setTextureOffset(172, 172).addBox(-13.5F, -12.625F, -12.625F, 27.0F, 26.0F, 5.0F, 0.0F, false);
            Head.setTextureOffset(63, 88).addBox(-11.5F, 0.375F, -16.625F, 23.0F, 11.0F, 4.0F, 0.0F, false);

            Horns = new ModelRenderer(this);
            Horns.setRotationPoint(0.0F, 32.375F, 8.375F);
            Head.addChild(Horns);


            LeftHorn = new ModelRenderer(this);
            LeftHorn.setRotationPoint(2.0F, 0.0F, 0.0F);
            Horns.addChild(LeftHorn);
            LeftHorn.setTextureOffset(195, 54).addBox(5.0F, -52.0F, -13.0F, 10.0F, 5.0F, 9.0F, 0.0F, false);

            LeftHorn1 = new ModelRenderer(this);
            LeftHorn1.setRotationPoint(10.5F, -51.5F, -10.5F);
            LeftHorn.addChild(LeftHorn1);
            setRotationAngle(LeftHorn1, -0.2618F, 0.0F, 0.0F);
            LeftHorn1.setTextureOffset(202, 92).addBox(-4.5F, -3.5F, -1.5F, 9.0F, 5.0F, 8.0F, 0.0F, false);

            LeftHorn2 = new ModelRenderer(this);
            LeftHorn2.setRotationPoint(10.5F, -54.7865F, -8.725F);
            LeftHorn.addChild(LeftHorn2);
            setRotationAngle(LeftHorn2, -0.5236F, 0.0F, 0.0F);
            LeftHorn2.setTextureOffset(173, 203).addBox(-3.5F, -2.2183F, -0.5977F, 9.0F, 4.0F, 7.0F, 0.0F, false);

            LeftHorn3 = new ModelRenderer(this);
            LeftHorn3.setRotationPoint(10.5F, -54.7865F, -8.725F);
            LeftHorn.addChild(LeftHorn3);
            setRotationAngle(LeftHorn3, -0.7854F, 0.0F, 0.0F);
            LeftHorn3.setTextureOffset(66, 173).addBox(-2.5F, -5.4503F, 1.0004F, 9.0F, 4.0F, 7.0F, 0.0F, false);

            LeftHorn4 = new ModelRenderer(this);
            LeftHorn4.setRotationPoint(11.5F, -54.7865F, -5.725F);
            LeftHorn.addChild(LeftHorn4);
            setRotationAngle(LeftHorn4, -1.0472F, 0.0F, 0.0F);
            LeftHorn4.setTextureOffset(170, 214).addBox(-2.5F, -5.4503F, 1.0004F, 9.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn5 = new ModelRenderer(this);
            LeftHorn5.setRotationPoint(13.5F, -56.2369F, -1.7246F);
            LeftHorn.addChild(LeftHorn5);
            setRotationAngle(LeftHorn5, -1.309F, 0.0F, 0.0F);
            LeftHorn5.setTextureOffset(210, 105).addBox(-3.5F, -3.4824F, 1.9319F, 9.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn6 = new ModelRenderer(this);
            LeftHorn6.setRotationPoint(15.5F, -53.7192F, -0.7927F);
            LeftHorn.addChild(LeftHorn6);
            setRotationAngle(LeftHorn6, -1.4835F, 0.0F, 0.0F);
            LeftHorn6.setTextureOffset(103, 0).addBox(-4.5F, -4.0F, 0.0F, 9.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn7 = new ModelRenderer(this);
            LeftHorn7.setRotationPoint(16.5F, -52.7192F, 0.2073F);
            LeftHorn.addChild(LeftHorn7);
            setRotationAngle(LeftHorn7, -1.6581F, 0.0F, 0.0F);
            LeftHorn7.setTextureOffset(200, 215).addBox(-4.5F, -4.0F, 0.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn8 = new ModelRenderer(this);
            LeftHorn8.setRotationPoint(48.5F, -51.7192F, 1.2073F);
            LeftHorn.addChild(LeftHorn8);
            setRotationAngle(LeftHorn8, -1.9199F, 0.0F, 0.0F);
            LeftHorn8.setTextureOffset(103, 10).addBox(-35.5F, -4.0F, 0.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn9 = new ModelRenderer(this);
            LeftHorn9.setRotationPoint(18.0F, -50.4375F, 1.6096F);
            LeftHorn.addChild(LeftHorn9);
            setRotationAngle(LeftHorn9, -2.1817F, 0.0F, 0.0F);
            LeftHorn9.setTextureOffset(0, 10).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn10 = new ModelRenderer(this);
            LeftHorn10.setRotationPoint(18.0F, -48.551F, 2.3126F);
            LeftHorn.addChild(LeftHorn10);
            setRotationAngle(LeftHorn10, -2.3562F, 0.0F, 0.0F);
            LeftHorn10.setTextureOffset(222, 222).addBox(-3.0F, -4.0F, 0.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn11 = new ModelRenderer(this);
            LeftHorn11.setRotationPoint(-24.0F, -46.551F, 2.3126F);
            LeftHorn.addChild(LeftHorn11);
            setRotationAngle(LeftHorn11, -2.618F, 0.0F, 0.0F);
            LeftHorn11.setTextureOffset(146, 218).addBox(40.0F, -4.0F, 0.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn12 = new ModelRenderer(this);
            LeftHorn12.setRotationPoint(-23.0F, -44.551F, 1.3126F);
            LeftHorn.addChild(LeftHorn12);
            setRotationAngle(LeftHorn12, -2.8798F, 0.0F, 0.0F);
            LeftHorn12.setTextureOffset(0, 216).addBox(40.0F, -4.0F, 0.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn13 = new ModelRenderer(this);
            LeftHorn13.setRotationPoint(-23.0F, -43.551F, 1.3126F);
            LeftHorn.addChild(LeftHorn13);
            setRotationAngle(LeftHorn13, -3.0543F, 0.0F, 0.0F);
            LeftHorn13.setTextureOffset(27, 173).addBox(41.0F, -4.0F, 1.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

            LeftHorn14 = new ModelRenderer(this);
            LeftHorn14.setRotationPoint(24.0F, -43.551F, 1.3126F);
            LeftHorn.addChild(LeftHorn14);
            setRotationAngle(LeftHorn14, 2.9671F, 0.0F, 0.0F);
            LeftHorn14.setTextureOffset(20, 225).addBox(-5.0F, -4.9924F, 1.1743F, 6.0F, 3.0F, 6.0F, 0.0F, false);

            LeftHorn15 = new ModelRenderer(this);
            LeftHorn15.setRotationPoint(25.0F, -42.551F, 0.3126F);
            LeftHorn.addChild(LeftHorn15);
            setRotationAngle(LeftHorn15, 2.7925F, 0.0F, 0.0F);
            LeftHorn15.setTextureOffset(224, 0).addBox(-6.0F, -4.9924F, 1.1743F, 6.0F, 3.0F, 6.0F, 0.0F, false);

            LeftHorn16 = new ModelRenderer(this);
            LeftHorn16.setRotationPoint(25.0F, -40.551F, -0.6874F);
            LeftHorn.addChild(LeftHorn16);
            setRotationAngle(LeftHorn16, 2.5307F, 0.0F, 0.0F);
            LeftHorn16.setTextureOffset(103, 20).addBox(-6.0F, -4.9924F, 1.1743F, 6.0F, 3.0F, 6.0F, 0.0F, false);

            LeftHorn17 = new ModelRenderer(this);
            LeftHorn17.setRotationPoint(25.0F, -38.551F, -1.6874F);
            LeftHorn.addChild(LeftHorn17);
            setRotationAngle(LeftHorn17, 2.1817F, 0.0F, 0.0F);
            LeftHorn17.setTextureOffset(179, 40).addBox(-6.0F, -4.9924F, 2.1743F, 6.0F, 3.0F, 5.0F, 0.0F, false);

            LeftHorn18 = new ModelRenderer(this);
            LeftHorn18.setRotationPoint(25.0F, -36.551F, -3.6874F);
            LeftHorn.addChild(LeftHorn18);
            setRotationAngle(LeftHorn18, 1.9199F, 0.0F, 0.0F);
            LeftHorn18.setTextureOffset(63, 71).addBox(-6.0F, -4.6504F, 3.114F, 6.0F, 3.0F, 5.0F, 0.0F, false);

            LeftHorn19 = new ModelRenderer(this);
            LeftHorn19.setRotationPoint(25.0F, -36.551F, -5.6874F);
            LeftHorn.addChild(LeftHorn19);
            setRotationAngle(LeftHorn19, 1.6581F, 0.0F, 0.0F);
            LeftHorn19.setTextureOffset(91, 135).addBox(-6.0F, -4.6504F, 3.114F, 5.0F, 3.0F, 4.0F, 0.0F, false);

            LeftHorn20 = new ModelRenderer(this);
            LeftHorn20.setRotationPoint(25.0F, -35.551F, -7.6874F);
            LeftHorn.addChild(LeftHorn20);
            setRotationAngle(LeftHorn20, 1.4835F, 0.0F, 0.0F);
            LeftHorn20.setTextureOffset(110, 110).addBox(-6.0F, -4.7375F, 4.1102F, 5.0F, 3.0F, 4.0F, 0.0F, false);

            LeftHorn21 = new ModelRenderer(this);
            LeftHorn21.setRotationPoint(25.0F, -35.551F, -9.6874F);
            LeftHorn.addChild(LeftHorn21);
            setRotationAngle(LeftHorn21, 1.2217F, 0.0F, 0.0F);
            LeftHorn21.setTextureOffset(104, 190).addBox(-6.0F, -4.7375F, 5.1102F, 4.0F, 3.0F, 3.0F, 0.0F, false);

            LeftHorn22 = new ModelRenderer(this);
            LeftHorn22.setRotationPoint(25.0F, -36.551F, -11.6874F);
            LeftHorn.addChild(LeftHorn22);
            setRotationAngle(LeftHorn22, 0.9599F, 0.0F, 0.0F);
            LeftHorn22.setTextureOffset(78, 184).addBox(-6.0F, -4.7375F, 5.1102F, 4.0F, 3.0F, 3.0F, 0.0F, false);

            LeftHorn23 = new ModelRenderer(this);
            LeftHorn23.setRotationPoint(25.0F, -38.551F, -13.6874F);
            LeftHorn.addChild(LeftHorn23);
            setRotationAngle(LeftHorn23, 0.6109F, 0.0F, 0.0F);
            LeftHorn23.setTextureOffset(27, 64).addBox(-6.0F, -4.7375F, 5.1102F, 4.0F, 3.0F, 3.0F, 0.0F, false);

            LeftHorn24 = new ModelRenderer(this);
            LeftHorn24.setRotationPoint(25.0F, -40.551F, -14.6874F);
            LeftHorn.addChild(LeftHorn24);
            setRotationAngle(LeftHorn24, 0.3491F, 0.0F, 0.0F);
            LeftHorn24.setTextureOffset(0, 63).addBox(-6.0F, -4.7375F, 5.1102F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            LeftHorn25 = new ModelRenderer(this);
            LeftHorn25.setRotationPoint(25.0F, -42.551F, -14.6874F);
            LeftHorn.addChild(LeftHorn25);
            setRotationAngle(LeftHorn25, 0.1745F, 0.0F, 0.0F);
            LeftHorn25.setTextureOffset(121, 20).addBox(-6.0F, -4.7375F, 5.1102F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            LeftHorn26 = new ModelRenderer(this);
            LeftHorn26.setRotationPoint(25.0F, -44.551F, -14.6874F);
            LeftHorn.addChild(LeftHorn26);
            setRotationAngle(LeftHorn26, -0.0873F, 0.0F, 0.0F);
            LeftHorn26.setTextureOffset(38, 98).addBox(-6.0F, -4.7375F, 5.1102F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            RightHorn = new ModelRenderer(this);
            RightHorn.setRotationPoint(-3.0F, 0.0F, 0.0F);
            Horns.addChild(RightHorn);
            RightHorn.setTextureOffset(192, 40).addBox(-14.0F, -52.0F, -13.0F, 10.0F, 5.0F, 9.0F, 0.0F, false);

            RightHorn20 = new ModelRenderer(this);
            RightHorn20.setRotationPoint(-17.0F, -35.551F, -7.6874F);
            RightHorn.addChild(RightHorn20);
            setRotationAngle(RightHorn20, 1.4835F, 0.0F, 0.0F);
            RightHorn20.setTextureOffset(27, 57).addBox(-6.0F, -4.7375F, 4.1102F, 5.0F, 3.0F, 4.0F, 0.0F, false);

            RightHorn21 = new ModelRenderer(this);
            RightHorn21.setRotationPoint(-16.0F, -35.551F, -9.6874F);
            RightHorn.addChild(RightHorn21);
            setRotationAngle(RightHorn21, 1.2217F, 0.0F, 0.0F);
            RightHorn21.setTextureOffset(188, 92).addBox(-6.0F, -4.7375F, 5.1102F, 4.0F, 3.0F, 3.0F, 0.0F, false);

            RightHorn22 = new ModelRenderer(this);
            RightHorn22.setRotationPoint(-16.0F, -36.551F, -11.6874F);
            RightHorn.addChild(RightHorn22);
            setRotationAngle(RightHorn22, 0.9599F, 0.0F, 0.0F);
            RightHorn22.setTextureOffset(110, 124).addBox(-6.0F, -4.7375F, 5.1102F, 4.0F, 3.0F, 3.0F, 0.0F, false);

            RightHorn23 = new ModelRenderer(this);
            RightHorn23.setRotationPoint(-16.0F, -38.551F, -13.6874F);
            RightHorn.addChild(RightHorn23);
            setRotationAngle(RightHorn23, 0.6109F, 0.0F, 0.0F);
            RightHorn23.setTextureOffset(63, 57).addBox(-6.0F, -4.7375F, 5.1102F, 4.0F, 3.0F, 3.0F, 0.0F, false);

            RightHorn24 = new ModelRenderer(this);
            RightHorn24.setRotationPoint(-15.0F, -40.551F, -14.6874F);
            RightHorn.addChild(RightHorn24);
            setRotationAngle(RightHorn24, 0.3491F, 0.0F, 0.0F);
            RightHorn24.setTextureOffset(0, 57).addBox(-6.0F, -4.7375F, 5.1102F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            RightHorn25 = new ModelRenderer(this);
            RightHorn25.setRotationPoint(-15.0F, -42.551F, -14.6874F);
            RightHorn.addChild(RightHorn25);
            setRotationAngle(RightHorn25, 0.1745F, 0.0F, 0.0F);
            RightHorn25.setTextureOffset(18, 20).addBox(-6.0F, -4.7375F, 5.1102F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            RightHorn26 = new ModelRenderer(this);
            RightHorn26.setRotationPoint(-14.0F, -44.551F, -14.6874F);
            RightHorn.addChild(RightHorn26);
            setRotationAngle(RightHorn26, -0.0873F, 0.0F, 0.0F);
            RightHorn26.setTextureOffset(77, 57).addBox(-6.0F, -4.7375F, 5.1102F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            RightHorn10 = new ModelRenderer(this);
            RightHorn10.setRotationPoint(-18.0F, -48.551F, 2.3126F);
            RightHorn.addChild(RightHorn10);
            setRotationAngle(RightHorn10, -2.3562F, 0.0F, 0.0F);
            RightHorn10.setTextureOffset(219, 78).addBox(-3.0F, -4.0F, 0.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn11 = new ModelRenderer(this);
            RightHorn11.setRotationPoint(-19.0F, -46.551F, 2.3126F);
            RightHorn.addChild(RightHorn11);
            setRotationAngle(RightHorn11, -2.618F, 0.0F, 0.0F);
            RightHorn11.setTextureOffset(219, 68).addBox(-3.0F, -4.0F, 0.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn12 = new ModelRenderer(this);
            RightHorn12.setRotationPoint(-18.0F, -44.551F, 1.3126F);
            RightHorn.addChild(RightHorn12);
            setRotationAngle(RightHorn12, -2.8798F, 0.0F, 0.0F);
            RightHorn12.setTextureOffset(133, 0).addBox(-5.0F, -4.0F, 0.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn13 = new ModelRenderer(this);
            RightHorn13.setRotationPoint(-18.0F, -43.551F, 1.3126F);
            RightHorn.addChild(RightHorn13);
            setRotationAngle(RightHorn13, -3.0543F, 0.0F, 0.0F);
            RightHorn13.setTextureOffset(166, 224).addBox(-5.0F, -4.0F, 1.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn14 = new ModelRenderer(this);
            RightHorn14.setRotationPoint(-19.0F, -43.551F, 1.3126F);
            RightHorn.addChild(RightHorn14);
            setRotationAngle(RightHorn14, 2.9671F, 0.0F, 0.0F);
            RightHorn14.setTextureOffset(224, 49).addBox(-5.0F, -4.9924F, 1.1743F, 6.0F, 3.0F, 6.0F, 0.0F, false);

            RightHorn15 = new ModelRenderer(this);
            RightHorn15.setRotationPoint(-20.0F, -42.551F, 0.3126F);
            RightHorn.addChild(RightHorn15);
            setRotationAngle(RightHorn15, 2.7925F, 0.0F, 0.0F);
            RightHorn15.setTextureOffset(221, 40).addBox(-4.0F, -4.9924F, 1.1743F, 6.0F, 3.0F, 6.0F, 0.0F, false);

            RightHorn16 = new ModelRenderer(this);
            RightHorn16.setRotationPoint(-20.0F, -40.551F, -0.6874F);
            RightHorn.addChild(RightHorn16);
            setRotationAngle(RightHorn16, 2.5307F, 0.0F, 0.0F);
            RightHorn16.setTextureOffset(0, 20).addBox(-4.0F, -4.9924F, 1.1743F, 6.0F, 3.0F, 6.0F, 0.0F, false);

            RightHorn17 = new ModelRenderer(this);
            RightHorn17.setRotationPoint(-20.0F, -38.551F, -1.6874F);
            RightHorn.addChild(RightHorn17);
            setRotationAngle(RightHorn17, 2.1817F, 0.0F, 0.0F);
            RightHorn17.setTextureOffset(63, 79).addBox(-4.0F, -4.9924F, 2.1743F, 6.0F, 3.0F, 5.0F, 0.0F, false);

            RightHorn18 = new ModelRenderer(this);
            RightHorn18.setRotationPoint(-16.0F, -36.551F, -3.6874F);
            RightHorn.addChild(RightHorn18);
            setRotationAngle(RightHorn18, 1.9199F, 0.0F, 0.0F);
            RightHorn18.setTextureOffset(63, 63).addBox(-8.0F, -4.6504F, 3.114F, 6.0F, 3.0F, 5.0F, 0.0F, false);

            RightHorn19 = new ModelRenderer(this);
            RightHorn19.setRotationPoint(-17.0F, -36.551F, -5.6874F);
            RightHorn.addChild(RightHorn19);
            setRotationAngle(RightHorn19, 1.6581F, 0.0F, 0.0F);
            RightHorn19.setTextureOffset(110, 117).addBox(-6.0F, -4.6504F, 3.114F, 5.0F, 3.0F, 4.0F, 0.0F, false);

            RightHorn1 = new ModelRenderer(this);
            RightHorn1.setRotationPoint(-9.5F, -51.5F, -10.5F);
            RightHorn.addChild(RightHorn1);
            setRotationAngle(RightHorn1, -0.2618F, 0.0F, 0.0F);
            RightHorn1.setTextureOffset(146, 195).addBox(-4.5F, -3.5F, -1.5F, 9.0F, 5.0F, 8.0F, 0.0F, false);

            RightHorn2 = new ModelRenderer(this);
            RightHorn2.setRotationPoint(-9.5F, -54.7865F, -9.725F);
            RightHorn.addChild(RightHorn2);
            setRotationAngle(RightHorn2, -0.5236F, 0.0F, 0.0F);
            RightHorn2.setTextureOffset(204, 160).addBox(-5.5F, -2.5603F, 0.342F, 9.0F, 4.0F, 7.0F, 0.0F, false);

            RightHorn3 = new ModelRenderer(this);
            RightHorn3.setRotationPoint(-11.5F, -54.7865F, -8.725F);
            RightHorn.addChild(RightHorn3);
            setRotationAngle(RightHorn3, -0.7854F, 0.0F, 0.0F);
            RightHorn3.setTextureOffset(172, 160).addBox(-4.5F, -5.4503F, 1.0004F, 9.0F, 4.0F, 7.0F, 0.0F, false);

            RightHorn4 = new ModelRenderer(this);
            RightHorn4.setRotationPoint(-12.5F, -54.7865F, -5.725F);
            RightHorn.addChild(RightHorn4);
            setRotationAngle(RightHorn4, -1.0472F, 0.0F, 0.0F);
            RightHorn4.setTextureOffset(210, 115).addBox(-4.5F, -5.4503F, 1.0004F, 9.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn5 = new ModelRenderer(this);
            RightHorn5.setRotationPoint(-14.5F, -56.2369F, -1.7246F);
            RightHorn.addChild(RightHorn5);
            setRotationAngle(RightHorn5, -1.309F, 0.0F, 0.0F);
            RightHorn5.setTextureOffset(146, 208).addBox(-3.5F, -3.4824F, 1.9319F, 9.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn6 = new ModelRenderer(this);
            RightHorn6.setRotationPoint(-14.5F, -53.7192F, -0.7927F);
            RightHorn.addChild(RightHorn6);
            setRotationAngle(RightHorn6, -1.4835F, 0.0F, 0.0F);
            RightHorn6.setTextureOffset(205, 205).addBox(-4.5F, -4.0F, 0.0F, 9.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn7 = new ModelRenderer(this);
            RightHorn7.setRotationPoint(16.5F, -52.7192F, 0.2073F);
            RightHorn.addChild(RightHorn7);
            setRotationAngle(RightHorn7, -1.6581F, 0.0F, 0.0F);
            RightHorn7.setTextureOffset(34, 215).addBox(-35.5F, -4.0F, 0.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn8 = new ModelRenderer(this);
            RightHorn8.setRotationPoint(15.5F, -51.7192F, 1.2073F);
            RightHorn.addChild(RightHorn8);
            setRotationAngle(RightHorn8, -1.9199F, 0.0F, 0.0F);
            RightHorn8.setTextureOffset(142, 88).addBox(-35.5F, -4.0F, 0.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);

            RightHorn9 = new ModelRenderer(this);
            RightHorn9.setRotationPoint(23.0F, -50.4375F, 1.6096F);
            RightHorn.addChild(RightHorn9);
            setRotationAngle(RightHorn9, -2.1817F, 0.0F, 0.0F);
            RightHorn9.setTextureOffset(0, 0).addBox(-44.0F, -4.0F, 0.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);

            Torso = new ModelRenderer(this);
            Torso.setRotationPoint(0.0F, -30.0F, 49.0F);
            Body.addChild(Torso);
            Torso.setTextureOffset(98, 160).addBox(-16.0F, -12.0F, -54.0F, 32.0F, 25.0F, 5.0F, 0.0F, false);
            Torso.setTextureOffset(110, 110).addBox(-20.0F, -9.5F, -49.0F, 40.0F, 30.0F, 20.0F, 0.0F, false);
            Torso.setTextureOffset(0, 0).addBox(-18.5F, -7.5F, -29.0F, 37.0F, 28.0F, 29.0F, 0.0F, false);

            Legs = new ModelRenderer(this);
            Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
            Body.addChild(Legs);


            Left = new ModelRenderer(this);
            Left.setRotationPoint(0.0F, 0.0F, 0.0F);
            Legs.addChild(Left);


            LeftFront = new ModelRenderer(this);
            LeftFront.setRotationPoint(20.5F, -29.0F, 8.25F);
            Left.addChild(LeftFront);
            LeftFront.setTextureOffset(0, 173).addBox(-3.5F, -5.5F, -6.25F, 7.0F, 30.0F, 13.0F, 0.0F, false);
            LeftFront.setTextureOffset(156, 88).addBox(-4.5F, 24.5F, -7.25F, 9.0F, 4.0F, 14.0F, 0.0F, false);

            LeftBack = new ModelRenderer(this);
            LeftBack.setRotationPoint(20.5F, -29.0F, 38.75F);
            Left.addChild(LeftBack);
            LeftBack.setTextureOffset(40, 173).addBox(-3.5F, -5.5F, -5.75F, 7.0F, 30.0F, 12.0F, 0.0F, false);
            LeftBack.setTextureOffset(148, 40).addBox(-4.5F, 24.5F, -6.75F, 9.0F, 4.0F, 13.0F, 0.0F, false);

            Right = new ModelRenderer(this);
            Right.setRotationPoint(0.0F, 0.0F, 0.0F);
            Legs.addChild(Right);


            RightFront = new ModelRenderer(this);
            RightFront.setRotationPoint(-20.5F, -29.0F, 8.25F);
            Right.addChild(RightFront);
            RightFront.setTextureOffset(0, 57).addBox(-3.5F, -5.5F, -6.25F, 7.0F, 30.0F, 13.0F, 0.0F, false);
            RightFront.setTextureOffset(110, 89).addBox(-4.5F, 24.5F, -7.25F, 9.0F, 4.0F, 14.0F, 0.0F, false);

            RightBack = new ModelRenderer(this);
            RightBack.setRotationPoint(-20.5F, -29.0F, 38.75F);
            Right.addChild(RightBack);
            RightBack.setTextureOffset(78, 190).addBox(-3.5F, -5.5F, -5.75F, 7.0F, 30.0F, 12.0F, 0.0F, false);
            RightBack.setTextureOffset(188, 75).addBox(-4.5F, 24.5F, -6.75F, 9.0F, 4.0F, 13.0F, 0.0F, false);

            Tail = new ModelRenderer(this);
            Tail.setRotationPoint(0.0F, -32.0F, 46.0F);
            Body.addChild(Tail);
            setRotationAngle(Tail, 0.4363F, 0.0F, 0.0F);
            Tail.setTextureOffset(116, 190).addBox(-4.0F, -2.9623F, -1.5737F, 8.0F, 31.0F, 7.0F, 0.0F, false);
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.LeftFront.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount / 1.0F;
        this.LeftBack.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount / 1.0F;
        this.RightFront.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount / 1.0F;
        this.RightBack.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount / 1.0F;
    }
/*
    @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        }*/

    @Override
    protected Iterable<ModelRenderer> getHeadParts() {
        return ImmutableList.of(this.getHead());
    }

    @Override
    protected Iterable<ModelRenderer> getBodyParts() {
        return ImmutableList.of(this.getBody());
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }

    public ModelRenderer getHead() {
        if(this.isChild){
            Head.setRotationPoint(0,0,0);
            Horns.showModel = false;
        } else {
            Head.setRotationPoint(0, -5.0F, -25.0F);
            Horns.showModel = true;
        }
        return Head;
    }

    public ModelRenderer getBody() {
        return Body;
    }

    public ModelRenderer getHorns() {
        return Horns;
    }

    public ModelRenderer getLegs() {
        return Legs;
    }
}

