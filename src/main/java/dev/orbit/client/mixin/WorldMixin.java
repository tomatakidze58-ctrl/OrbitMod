package dev.orbit.client.mixin;

import dev.orbit.client.OrbitClient;
import dev.orbit.client.module.VisualModules.CustomSky;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public class WorldMixin {
    @Inject(method = "getSkyAngle", at = @At("RETURN"), cancellable = true, require = 0)
    private void orbit$sky(CallbackInfoReturnable<Float> cir) {
        if (!((Object) this instanceof ClientWorld)) return;
        CustomSky module = OrbitClient.mod(CustomSky.class);
        if (module == null || !module.enabled) return;
        float angle = module.angle();
        if (angle >= 0.0f) cir.setReturnValue(angle);
    }
}
