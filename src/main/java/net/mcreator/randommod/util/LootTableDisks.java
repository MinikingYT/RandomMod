
package net.mcreator.randommod.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.randommod.ElementsRandomMod;

@ElementsRandomMod.ModElement.Tag
public class LootTableDisks extends ElementsRandomMod.ModElement {
	public LootTableDisks(ElementsRandomMod instance) {
		super(instance, 4);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("randommod", "disks"));
	}
}
