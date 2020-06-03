package theultimateorion.computermod.items.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import theultimateorion.computermod.Main;


import theultimateorion.computermod.init.ModItems;
import theultimateorion.computermod.util.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	public ToolAxe(String name, ToolMaterial material) 
	{
		super(material, 6.0F, -3.2F);
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
