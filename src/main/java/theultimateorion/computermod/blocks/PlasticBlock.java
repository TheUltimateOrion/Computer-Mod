package theultimateorion.computermod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import theultimateorion.computermod.Main;

public class PlasticBlock extends BlockBase 
{

	public PlasticBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1.0F);
		setCreativeTab(Main.cptab);
	}
}
