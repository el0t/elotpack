package com.elot.elotpack.client.entity.render;

import com.elot.elotpack.ElotPack;
import com.elot.elotpack.client.entity.model.WompratEntityModel;
import com.elot.elotpack.entities.Womprat;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WompratRender extends MobRenderer<Womprat, WompratEntityModel<Womprat>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElotPack.MOD_ID, "textures/entity/womprat.png");

    public WompratRender(EntityRendererManager rendererManager) {
        super(rendererManager, new WompratEntityModel<Womprat>(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(Womprat entity) {
        return TEXTURE;
    }
}
