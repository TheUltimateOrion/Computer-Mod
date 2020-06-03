package theultimateorion.computermod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import theultimateorion.computermod.init.ModItems;
import theultimateorion.computermod.util.Reference;

public class ComputerModTab extends CreativeTabs {

	public ComputerModTab(String label) {
		super("cptab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RAM);
	}

}
