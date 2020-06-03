package theultimateorion.computermod.items.tools;


import net.minecraft.item.ItemSword;
import theultimateorion.computermod.Main;
import theultimateorion.computermod.init.ModItems;
import theultimateorion.computermod.util.IHasModel;

public class ToolSword extends ItemSword implements IHasModel {
	
	public ToolSword(String name, ToolMaterial material) 
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
