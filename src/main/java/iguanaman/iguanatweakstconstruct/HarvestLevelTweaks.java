package iguanaman.iguanatweakstconstruct;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import tconstruct.common.TContent;
import tconstruct.library.TConstructRegistry;

public class HarvestLevelTweaks {

	public static int boostMod = 0;

	// HarvestLevels
	public static String[][] oreDictLevels = {
		{IguanaHarvestLevelConfig.harvestLevel00oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel00oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel01oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel01oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel02oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel02oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel03oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel03oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel04oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel04oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel05oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel05oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel06oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel06oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel07oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel07oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel08oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel08oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel09oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel09oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel10oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel10oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel11oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel11oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel12oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel12oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel13oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel13oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel14oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel14oreDict.get(15)},
		{IguanaHarvestLevelConfig.harvestLevel15oreDict.get(0), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(1), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(2), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(3), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(4), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(5), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(6), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(7), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(8), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(9), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(10), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(11), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(12), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(13), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(14), IguanaHarvestLevelConfig.harvestLevel15oreDict.get(15)}
	};

	public static void init()
	{
		// TOOLS
		IguanaLog.log("Modifying harvest levels of tools");
		ForgeHooks hooks = new ForgeHooks();
		Field f = null;
		try {
			f = ForgeHooks.class.getDeclaredField("toolClasses");
		} catch (NoSuchFieldException e) {
			throw new RuntimeException("Could not access toolClasses field, report please");
		}

		f.setAccessible(true);
		HashMap<Item, List> toolClasses = null;
		try {
			toolClasses = (HashMap<Item, List>) f.get(hooks);
		} catch (IllegalAccessException e) {
			throw new RuntimeException("Could not access toolClasses field, report please");
		}

		Iterator<Map.Entry<Item, List>> it = toolClasses.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<Item, List> entry = it.next();
			Item item = entry.getKey();
			List info = entry.getValue();

			Object[] tmp = info.toArray();
			String toolClass = (String)tmp[0];
			int harvestLevel = (Integer)tmp[1];
			int newHarvestLevel = harvestLevel;

			if (item != null && toolClass.equals("pickaxe"))
			{

				if (IguanaConfig.pickaxeOverrides.containsKey(item.itemID))
					harvestLevel = IguanaConfig.pickaxeOverrides.get(item.itemID);

				switch (harvestLevel)
				{
				case 0: newHarvestLevel = IguanaHarvestLevelConfig.level0; break;
				case 1: newHarvestLevel = IguanaHarvestLevelConfig.level1; break;
				case 2: newHarvestLevel = IguanaHarvestLevelConfig.level2; break;
				case 3: newHarvestLevel = IguanaHarvestLevelConfig.level3; break;
				case 4: newHarvestLevel = IguanaHarvestLevelConfig.level4; break;
				case 5: newHarvestLevel = IguanaHarvestLevelConfig.level5; break;
				case 6: newHarvestLevel = IguanaHarvestLevelConfig.level6; break;
				case 7: newHarvestLevel = IguanaHarvestLevelConfig.level7; break;
				case 8: newHarvestLevel = IguanaHarvestLevelConfig.level8; break;
				case 9: newHarvestLevel = IguanaHarvestLevelConfig.level9; break;
				default: newHarvestLevel = harvestLevel + 2;
				}

				if (harvestLevel != newHarvestLevel)
				{
					if (IguanaConfig.logMiningLevelChanges) IguanaLog.log("Changing mining level of " + entry.getKey().getUnlocalizedName() + " from " + harvestLevel + " to " + newHarvestLevel);
					entry.setValue(Arrays.asList(toolClass, newHarvestLevel));
				}

			}
		}


		//BLOCKS
		if (IguanaConfig.pickaxeBoostRequired) boostMod = 1;

		int harvestLevel1 = 1 + boostMod;
		int harvestLevel2 = 2 + boostMod;
		int harvestLevel3 = 3 + boostMod;
		int harvestLevel4 = 4 + boostMod;
		int harvestLevel5 = 5 + boostMod;
		int harvestLevel6 = 6 + boostMod;
		int harvestLevel7 = 7 + boostMod;
		int harvestLevel8 = 8 + boostMod;
		int harvestLevel9 = 9 + boostMod;
		int harvestLevel10 = 10 + boostMod;
		int harvestLevel11 = 11 + boostMod;
		int harvestLevel12 = 12 + boostMod;
		int harvestLevel13 = 13 + boostMod;
		int harvestLevel14 = 14 + boostMod;
		int harvestLevel15 = 15 + boostMod;

		IguanaLog.log("Modifying required harvest levels of blocks");
		try {
			f = ForgeHooks.class.getDeclaredField("toolHarvestLevels");
		} catch (NoSuchFieldException e) {
			throw new RuntimeException("Could not access toolHarvestLevels field, report please");
		}

		f.setAccessible(true);
		HashMap<List, Integer> toolHarvestLevels = null;
		try {
			toolHarvestLevels = (HashMap<List, Integer>) f.get(hooks);
		} catch (IllegalAccessException e) {
			throw new RuntimeException("Could not access toolHarvestLevels field, report please");
		}

		Iterator<Map.Entry<List, Integer>> it2 = toolHarvestLevels.entrySet().iterator();
		while (it2.hasNext())
		{
			Map.Entry<List, Integer> entry = it2.next();

			List key = entry.getKey();

			Object[] tmp = key.toArray();
			Block block = (Block)tmp[0];
			int metadata = (Integer)tmp[1];
			String toolClass = (String)tmp[2];

			if (toolClass.equals("pickaxe"))
			{

				int requiredHarvestLevel = entry.getValue();
				int newRequiredHarvestLevel = requiredHarvestLevel;

				switch (requiredHarvestLevel)
				{
				case 0: newRequiredHarvestLevel = 0; break;
				case 1: newRequiredHarvestLevel = harvestLevel1; break;
				case 2: newRequiredHarvestLevel = harvestLevel2; break;
				case 3: newRequiredHarvestLevel = harvestLevel3; break;
				case 4: newRequiredHarvestLevel = harvestLevel4; break;
				case 5: newRequiredHarvestLevel = harvestLevel5; break;
				case 6: newRequiredHarvestLevel = harvestLevel6; break;
				case 7: newRequiredHarvestLevel = harvestLevel7; break;
				case 8: newRequiredHarvestLevel = harvestLevel8; break;
				case 9: newRequiredHarvestLevel = harvestLevel9; break;
				case 10: newRequiredHarvestLevel = harvestLevel10; break;
				case 11: newRequiredHarvestLevel = harvestLevel11; break;
				case 12: newRequiredHarvestLevel = harvestLevel12; break;
				case 13: newRequiredHarvestLevel = harvestLevel13; break;
				case 14: newRequiredHarvestLevel = harvestLevel14; break;
				case 15: newRequiredHarvestLevel = harvestLevel15; break;
				default: newRequiredHarvestLevel = requiredHarvestLevel;
				}

				if (requiredHarvestLevel != newRequiredHarvestLevel)
				{
					if (IguanaConfig.logHarvestLevelChanges) IguanaLog.log("Changing required harvest level of " + block.getUnlocalizedName() + ":" + metadata + " from " + requiredHarvestLevel + " to " + newRequiredHarvestLevel);
					entry.setValue(newRequiredHarvestLevel);
				}

			}
		}

		for (int i = 0; i < oreDictLevels.length; ++i)
		{
			int level = i;
			if (i > 1) level += boostMod;

			for (String materialName : oreDictLevels[i]) {
				for (ItemStack oreStack : OreDictionary.getOres("ore" + materialName)) SetHarvestLevel(oreStack, level);
				for (ItemStack oreStack : OreDictionary.getOres("oreNether" + materialName)) SetHarvestLevel(oreStack, level);
				for (ItemStack oreStack : OreDictionary.getOres("block" + materialName)) SetHarvestLevel(oreStack, level);
				for (ItemStack oreStack : OreDictionary.getOres("stone" + materialName)) SetHarvestLevel(oreStack, level);
			}
		}

		IguanaLog.log("Modifying required harvest levels of vanilla blocks not in the Ore Dictionary");
		MinecraftForge.setBlockHarvestLevel(Block.obsidian,     "pickaxe", (MinecraftForge.getBlockHarvestLevel(Block.oreDiamond, 0, "pickaxe") + 1));
//		MinecraftForge.setBlockHarvestLevel(Block.oreDiamond, "pickaxe", harvestLevelBronze);
//		MinecraftForge.setBlockHarvestLevel(Block.blockDiamond, "pickaxe", harvestLevelBronze);
//		MinecraftForge.setBlockHarvestLevel(Block.blockGold,    "pickaxe", harvestLevelIron);
//		MinecraftForge.setBlockHarvestLevel(Block.blockIron,   "pickaxe", harvestLevelCopper);
		MinecraftForge.setBlockHarvestLevel(Block.fenceIron,   "pickaxe", MinecraftForge.getBlockHarvestLevel(Block.oreIron, 0, "pickaxe"));
		MinecraftForge.setBlockHarvestLevel(Block.blockLapis,   "pickaxe",  MinecraftForge.getBlockHarvestLevel(Block.oreGold, 0, "pickaxe"));
//		MinecraftForge.setBlockHarvestLevel(Block.oreRedstone, "pickaxe", harvestLevelBronze);
//		MinecraftForge.setBlockHarvestLevel(Block.oreRedstoneGlowing, "pickaxe", harvestLevelBronze);

		MinecraftForge.setBlockHarvestLevel(TContent.oreGravel, 0, "shovel", MinecraftForge.getBlockHarvestLevel(Block.oreIron, 0, "pickaxe"));
		MinecraftForge.setBlockHarvestLevel(TContent.oreGravel, 1, "shovel", MinecraftForge.getBlockHarvestLevel(Block.oreGold, 0, "pickaxe"));
		MinecraftForge.setBlockHarvestLevel(TContent.oreGravel, 2, "shovel", MinecraftForge.getBlockHarvestLevel(TContent.oreSlag, 3, "pickaxe"));
		MinecraftForge.setBlockHarvestLevel(TContent.oreGravel, 3, "shovel", MinecraftForge.getBlockHarvestLevel(TContent.oreSlag, 4, "pickaxe"));
		MinecraftForge.setBlockHarvestLevel(TContent.oreGravel, 4, "shovel", MinecraftForge.getBlockHarvestLevel(TContent.oreSlag, 5, "pickaxe"));
		MinecraftForge.setBlockHarvestLevel(TContent.oreGravel, 5, "shovel", MinecraftForge.getBlockHarvestLevel(TContent.oreSlag, 1, "pickaxe"));

		List[] harvestLevelIds = {
				IguanaHarvestLevelConfig.harvestLevel00Ids, IguanaHarvestLevelConfig.harvestLevel01Ids, IguanaHarvestLevelConfig.harvestLevel02Ids,
				IguanaHarvestLevelConfig.harvestLevel03Ids, IguanaHarvestLevelConfig.harvestLevel04Ids, IguanaHarvestLevelConfig.harvestLevel05Ids,
				IguanaHarvestLevelConfig.harvestLevel06Ids, IguanaHarvestLevelConfig.harvestLevel07Ids, IguanaHarvestLevelConfig.harvestLevel08Ids,
				IguanaHarvestLevelConfig.harvestLevel09Ids, IguanaHarvestLevelConfig.harvestLevel10Ids, IguanaHarvestLevelConfig.harvestLevel11Ids,
				IguanaHarvestLevelConfig.harvestLevel12Ids, IguanaHarvestLevelConfig.harvestLevel13Ids, IguanaHarvestLevelConfig.harvestLevel14Ids,
				IguanaHarvestLevelConfig.harvestLevel15Ids
		};

		for (int i = 0; i < oreDictLevels.length; ++i)
		{
			int level = i;
			if (i > 1) level += boostMod;

			for (String idline : (List<String>)harvestLevelIds[i])
			{
				int blockId = -1;
				int meta = OreDictionary.WILDCARD_VALUE;

				try {
					if (idline.contains(":"))
					{
						String[] idlinesplit = idline.split(":");
						blockId = Integer.parseInt(idlinesplit[0]);
						meta = Integer.parseInt(idlinesplit[1]);
					} else
						blockId = Integer.parseInt(idline);
				} catch (Exception e) {
					throw new RuntimeException("Config setting harvestLevel" + i + "Ids contains an invalid line (" + idline + ").  Each id must be on a separate line and in this format: id or id:meta");
				}

				SetHarvestLevel(new ItemStack(blockId, 1, meta), level);
			}
		}
	}

	public static void SetHarvestLevel(ItemStack oreStack, int level)
	{
		if (oreStack.getItemDamage() == OreDictionary.WILDCARD_VALUE)
			MinecraftForge.setBlockHarvestLevel(Block.blocksList[oreStack.itemID], "pickaxe", level);
		//FMLLog.warning("IguanaTweaksTConstruct: Setting required harvest level of " + oreStack.getUnlocalizedName() + " to " + level);
		else
			MinecraftForge.setBlockHarvestLevel(Block.blocksList[oreStack.itemID], oreStack.getItemDamage(), "pickaxe", level);
		//FMLLog.warning("IguanaTweaksTConstruct: Setting required harvest level of " + oreStack.getUnlocalizedName() + ":" + oreStack.getItemDamage() + " to " + level);
	
	}

}
