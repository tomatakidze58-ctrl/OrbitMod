package dev.orbit.client.util;

import dev.orbit.client.OrbitClient;
import dev.orbit.client.module.UtilityModules.*;
import net.minecraft.text.Text;

public final class ChatHooks {
    private ChatHooks() {}
    public static Text process(Text t) {
        ChatState.capture(t.getString());
        if (OrbitClient.modules == null) return t;
        try {
            ChatNotifications cn = OrbitClient.mod(ChatNotifications.class);
            if (cn != null && cn.enabled) cn.inspect(t.getString());
            ChatTimestamps ts = OrbitClient.mod(ChatTimestamps.class);
            if (ts != null && ts.enabled) return ts.stamp(t);
        } catch (Throwable ignored) {}
        return t;
    }
}
