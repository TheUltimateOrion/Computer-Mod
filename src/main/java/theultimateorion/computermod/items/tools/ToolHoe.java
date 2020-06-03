package theultimateorion.computermod.items.tools;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import theultimateorion.computermod.Main;
import theultimateorion.computermod.init.ModItems;
import theultimateorion.computermod.util.IHasModel;

public class ToolHoe extends ItemHoe implements IHasModel {
	public ToolHoe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.cptab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
