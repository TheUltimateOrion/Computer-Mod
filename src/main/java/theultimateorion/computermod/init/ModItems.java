package theultimateorion.computermod.init;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import theultimateorion.computermod.items.ItemBase;
import theultimateorion.computermod.items.armor.ArmorBase;
import theultimateorion.computermod.items.tools.ToolAxe;
import theultimateorion.computermod.items.tools.ToolHoe;
import theultimateorion.computermod.items.tools.ToolPickaxe;
import theultimateorion.computermod.items.tools.ToolShovel;
import theultimateorion.computermod.items.tools.ToolSword;
import theultimateorion.computermod.util.Reference;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_PLASTIC = EnumHelper.addToolMaterial("material_plastic", 1, 70, 2.0F, 1.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_PLASTIC = EnumHelper.addArmorMaterial("armor_material_plastic", 
			Reference.MOD_ID + ":plastic", 8, new int[] {1, 2, 4, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item RAM = new ItemBase("ram");
	public static final Item PLASTIC_INGOT = new ItemBase("plastic_ingot");
	
	
	//Tools
	public static final ItemSword PLASTIC_SWORD = new ToolSword("plastic_sword", MATERIAL_PLASTIC);
	public static final ItemSpade PLASTIC_SHOVEL = new ToolShovel("plastic_shovel", MATERIAL_PLASTIC);
	public static final ItemPickaxe PLASTIC_PICKAXE = new ToolPickaxe("plastic_pickaxe", MATERIAL_PLASTIC);
	public static final ItemAxe PLASTIC_AXE = new ToolAxe("plastic_axe", MATERIAL_PLASTIC);
	public static final ItemHoe PLASTIC_HOE = new ToolHoe("plastic_hoe", MATERIAL_PLASTIC);
	
	//Armor
	public static final Item PLASTIC_HELMET = new ArmorBase("plastic_helmet", ARMOR_MATERIAL_PLASTIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLASTIC_CHESTPLATE = new ArmorBase("plastic_chestplate", ARMOR_MATERIAL_PLASTIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLASTIC_LEGGINGS = new ArmorBase("plastic_leggings", ARMOR_MATERIAL_PLASTIC, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLASTIC_BOOTS = new ArmorBase("plastic_boots", ARMOR_MATERIAL_PLASTIC, 1, EntityEquipmentSlot.FEET);
	
}
