package com.elot.elotpack.client.entity.render;

import com.elot.elotpack.ElotPack;
import com.elot.elotpack.client.entity.model.BanthaEntityModel;
import com.elot.elotpack.entities.Bantha;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BanthaRender extends MobRenderer<Bantha, BanthaEntityModel<Bantha>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElotPack.MOD_ID, "textures/entity/bantha.png");

    public BanthaRender(EntityRendererManager rendererManager) {
        super(rendererManager, new BanthaEntityModel<Bantha>(), 2.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(Bantha entity) {
        return TEXTURE;
    }
}
