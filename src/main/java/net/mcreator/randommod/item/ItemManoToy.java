
package net.mcreator.randommod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.randommod.creativetab.TabRandomMisc;
import net.mcreator.randommod.ElementsRandomMod;

@ElementsRandomMod.ModElement.Tag
public class ItemManoToy extends ElementsRandomMod.ModElement {
	@GameRegistry.ObjectHolder("randommod:manotoy")
	public static final Item block = null;
	public ItemManoToy(ElementsRandomMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("randommod:manotoy", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("manotoy", ElementsRandomMod.sounds.get(new ResourceLocation("randommod:coracaotoy")));
			setUnlocalizedName("manotoy");
			setRegistryName("manotoy");
			setCreativeTab(TabRandomMisc.tab);
		}
	}
}
