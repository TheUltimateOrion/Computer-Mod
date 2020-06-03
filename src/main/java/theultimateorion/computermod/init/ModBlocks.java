package theultimateorion.computermod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import theultimateorion.computermod.blocks.BlockBase;
import theultimateorion.computermod.blocks.PlasticBlock;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PLASTIC_BLOCK = new PlasticBlock("plastic_block", Material.IRON);
	
}
