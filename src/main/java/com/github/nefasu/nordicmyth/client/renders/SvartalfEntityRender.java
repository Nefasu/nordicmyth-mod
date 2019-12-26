package com.github.nefasu.nordicmyth.client.renders;

import com.github.nefasu.nordicmyth.NordicMythRegistries;
import com.github.nefasu.nordicmyth.client.models.SvartalfEntityModel;
import com.github.nefasu.nordicmyth.entities.SvartalfEntity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class SvartalfEntityRender extends LivingRenderer<SvartalfEntity, SvartalfEntityModel>{

	public SvartalfEntityRender(EntityRendererManager manager) {
		super(manager, new SvartalfEntityModel(), 0f);
	}

	@Override
	protected ResourceLocation getEntityTexture(SvartalfEntity entity) {
		return NordicMythRegistries.location("textures/entity/svartalf_entity.png");
	}

	public static class RenderFactory implements IRenderFactory<SvartalfEntity> {
		@Override
		public EntityRenderer<? super SvartalfEntity> createRenderFor(EntityRendererManager manager) {
			return new SvartalfEntityRender(manager);
		}
	}
}
