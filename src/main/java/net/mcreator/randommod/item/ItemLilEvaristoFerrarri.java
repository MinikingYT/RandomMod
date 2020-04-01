
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
public class ItemLilEvaristoFerrarri extends ElementsRandomMod.ModElement {
	@GameRegistry.ObjectHolder("randommod:lilevaristoferrarri")
	public static final Item block = null;
	public ItemLilEvaristoFerrarri(ElementsRandomMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("randommod:lilevaristoferrarri", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("lilevaristoferrarri", ElementsRandomMod.sounds.get(new ResourceLocation("randommod:lilevatistoferrarri")));
			setUnlocalizedName("lilevaristoferrarri");
			setRegistryName("lilevaristoferrarri");
			setCreativeTab(TabRandomMisc.tab);
		}
	}
}
