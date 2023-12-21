package de.chrisliebaer.disadvancements.mixin;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementList;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.Set;

/**
 * Patch AdvancementList to never return or add any advancements.
 */
@Mixin(AdvancementList.class)
public class MixinAdvancementList {

	@Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/advancements/Advancement;)V", cancellable = true)
	private void remove(Advancement advancement, CallbackInfo ci) {
		ci.cancel();
	}
	
	@Inject(at = @At("HEAD"), method = "remove(Ljava/util/Set;)V", cancellable = true)
	private void remove(Set<ResourceLocation> set, CallbackInfo ci) {
		ci.cancel();
	}
	
	@Inject(at = @At("HEAD"), method = "add(Ljava/util/Map;)V", cancellable = true)
	private void add(Map<ResourceLocation, Advancement.Builder> map, CallbackInfo ci) {
		ci.cancel();
	}
}
