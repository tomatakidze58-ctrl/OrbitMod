# Orbit Client 2.2

Orbit Client is an all-in-one, highly customizable Fabric client for **Minecraft 1.21.11**. Everything is controlled from Orbit's own space-themed module dashboard.

## Controls

- **Right Shift** — Orbit module menu
- **Right Ctrl** — drag-and-drop HUD editor
- **C (hold)** — Zoom
- **Quick Swap** — choose X / G / R / V / B inside the Quick Swap module

## Integrated client features

Orbit includes its own implementations of the useful client ideas requested for the project. No uploaded third-party JARs are bundled into this source.

- Auto Sprint and Toggle Sprint / Sneak
- Advanced Crosshair with multiple shapes, dynamic spread, outlines, center dot and hit color
- Keystrokes, CPS, Armor HUD, Potion Effects, Durability, Totems and PvP item counters
- Numeric Ping and live Ping Graph
- Hunger + Saturation and held-food nutrition preview
- Chat Heads HUD for the latest player message
- Searchable Right Shift module dashboard
- Quick Swap with an Orbit-configurable key
- Low Shield, Low Fire and shield-only first-person positioning
- Held Shulker / container preview
- Skin Layers controls
- Custom Sky / time presets
- Local Tier Tag display
- Waypoint coordinates, distance and direction
- Distant Chunks client-view setting
- Client Optimizer, Dynamic FPS, particles, FPS cap, render/entity distance controls
- Screenshot manager, chat timestamps and notifications

## Fullbright

Fullbright is designed to be **uniform**, not just a normal gamma boost. While the module is enabled, Orbit forces the lightmap brightness helpers to maximum and removes extra sky darkness, so nearby torches, shadows and block-light levels do not change the apparent brightness. Vanilla gamma is restored when the module is disabled.

## Module customization

HUD modules can be moved in the HUD editor and expose per-module background, opacity, text color, accent color and shadow settings. Other modules expose their own sliders, modes, colors and toggles from **Right Shift**. The menu also has a search box.

## Safety / gameplay scope

Orbit intentionally stays a legit client. It does not include aim assist, reach changes, velocity changes, autoclicking, ESP, x-ray, packet exploits or other cheat modules.

## Building

Requires **Java 21**. A GitHub Actions build is included.

```bash
gradle build
```

The JAR is created in `build/libs/`.

## Project identity

This source contains Orbit-owned implementations and Orbit UI/assets. It does not bundle the uploaded third-party mod JARs.
