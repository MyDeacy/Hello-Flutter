package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;

public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (!alreadyRegisteredWith(registry)) {
    }
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
