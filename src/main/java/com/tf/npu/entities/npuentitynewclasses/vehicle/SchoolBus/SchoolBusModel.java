package com.tf.npu.entities.npuentitynewclasses.vehicle.SchoolBus;

import com.tf.npu.util.Reference;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;


public class SchoolBusModel extends GeoModel<SchoolBus> {
    private final ResourceLocation model = ResourceLocation.fromNamespaceAndPath(Reference.MODID, "school_bus");
    private final ResourceLocation animations = ResourceLocation.fromNamespaceAndPath(Reference.MODID, "school_bus");
    private final ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(Reference.MODID, "textures/entity/s/school_bus.png");

    @Override
    public ResourceLocation getModelResource(GeoRenderState geoRenderState) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(GeoRenderState geoRenderState) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(SchoolBus schoolBus) {
        return this.animations;
    }
}