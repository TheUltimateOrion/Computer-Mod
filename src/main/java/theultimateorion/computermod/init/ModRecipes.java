package theultimateorion.computermod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(ModItems.PLASTIC_INGOT, 3), 2.0F);
	}
}
