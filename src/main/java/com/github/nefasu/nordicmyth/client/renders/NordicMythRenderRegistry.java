package com.github.nefasu.nordicmyth.client.renders;

import com.github.nefasu.nordicmyth.entities.SvartalfEntity;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class NordicMythRenderRegistry {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(SvartalfEntity.class, 
				new SvartalfEntityRender.RenderFactory());
	}
}