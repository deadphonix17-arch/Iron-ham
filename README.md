# Overgeared Hammers Addon (Fabric 1.20.1)
- Iron Smithing Hammer Head: forged from 2 heated iron ingots -> Iron Smithing Hammer (head + stick)
- Steel Smithing Hammer: steel hammer head + stick (works for iron-tier and tier A recipes)
- Copper armor: forge-only from copper plates (vanilla-style recipe removed)

Build: push to GitHub -> Actions -> artifact `overgeared-hammers-addon`. Local: `gradle build` (Gradle 8.8, JDK 17).
Needs the base mod jar at `libs/overgeared.jar`.
Textures are recolored placeholders: replace PNGs in assets/overgeared_hammers/textures/item/.
- Copper armor item icons + worn armor layers use the 1.21.11 Copper Age textures
- Lava bucket no longer counts as a "hot item" (hot_items tag emptied), so it won't burn the player
