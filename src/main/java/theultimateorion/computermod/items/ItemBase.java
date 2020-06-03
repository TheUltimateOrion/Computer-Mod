package theultimateorion.computermod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import theultimateorion.computermod.Main;

import theultimateorion.computermod.init.ModItems;
import theultimateorion.computermod.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) 
	{
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
