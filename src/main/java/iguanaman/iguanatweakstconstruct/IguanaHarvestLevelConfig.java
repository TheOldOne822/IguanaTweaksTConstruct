package iguanaman.iguanatweakstconstruct;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cpw.mods.fml.common.Loader;
import tconstruct.library.TConstructRegistry;
import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class IguanaHarvestLevelConfig {

	// harvest relevel
	public static String level0name;
	public static String level1name;
	public static String level2name;
	public static String level3name;
	public static String level4name;
	public static String level5name;
	public static String level6name;
	public static String level7name;
	public static String level8name;
	public static String level9name;
	public static String level10name;
	public static String level11name;
	public static String level12name;
	public static String level13name;
	public static String level14name;
	public static String level15name;

	// harvest relevel
	public static int level0;
	public static int level1;
	public static int level2;
	public static int level3;
	public static int level4;
	public static int level5;
	public static int level6;
	public static int level7;
	public static int level8;
	public static int level9;

	// Harvest Levels oreDict
	public static List<String> harvestLevel00oreDict = new ArrayList<String>();
	public static List<String> harvestLevel01oreDict = new ArrayList<String>();
	public static List<String> harvestLevel02oreDict = new ArrayList<String>();
	public static List<String> harvestLevel03oreDict = new ArrayList<String>();
	public static List<String> harvestLevel04oreDict = new ArrayList<String>();
	public static List<String> harvestLevel05oreDict = new ArrayList<String>();
	public static List<String> harvestLevel06oreDict = new ArrayList<String>();
	public static List<String> harvestLevel07oreDict = new ArrayList<String>();
	public static List<String> harvestLevel08oreDict = new ArrayList<String>();
	public static List<String> harvestLevel09oreDict = new ArrayList<String>();
	public static List<String> harvestLevel10oreDict = new ArrayList<String>();
	public static List<String> harvestLevel11oreDict = new ArrayList<String>();
	public static List<String> harvestLevel12oreDict = new ArrayList<String>();
	public static List<String> harvestLevel13oreDict = new ArrayList<String>();
	public static List<String> harvestLevel14oreDict = new ArrayList<String>();
	public static List<String> harvestLevel15oreDict = new ArrayList<String>();

	// Harvest Levels ID
	public static List<String> harvestLevel00Ids = new ArrayList<String>();
	public static List<String> harvestLevel01Ids = new ArrayList<String>();
	public static List<String> harvestLevel02Ids = new ArrayList<String>();
	public static List<String> harvestLevel03Ids = new ArrayList<String>();
	public static List<String> harvestLevel04Ids = new ArrayList<String>();
	public static List<String> harvestLevel05Ids = new ArrayList<String>();
	public static List<String> harvestLevel06Ids = new ArrayList<String>();
	public static List<String> harvestLevel07Ids = new ArrayList<String>();
	public static List<String> harvestLevel08Ids = new ArrayList<String>();
	public static List<String> harvestLevel09Ids = new ArrayList<String>();
	public static List<String> harvestLevel10Ids = new ArrayList<String>();
	public static List<String> harvestLevel11Ids = new ArrayList<String>();
	public static List<String> harvestLevel12Ids = new ArrayList<String>();
	public static List<String> harvestLevel13Ids = new ArrayList<String>();
	public static List<String> harvestLevel14Ids = new ArrayList<String>();
	public static List<String> harvestLevel15Ids = new ArrayList<String>();

	public static void init()
	{
		File installDir = new File("config");
		File configDir = new File(installDir, "TConstruct Tweaks");
		Configuration harvestconfig = new Configuration(new File(configDir, "Harvest Level Config.cfg"));
		harvestconfig.load();

		// harvest level name
		ConfigCategory levelnamesCategory = harvestconfig.getCategory("harvestlevelnames");
		levelnamesCategory.setComment("Change harvest level names.");

		Property level0nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel00name", "Stone");
		level0nameProperty.comment = "change name of wood (0) harvest level to";
		level0name = level0nameProperty.getString();
		level0nameProperty.set(level0name);

		Property level1nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel01name", "Copper");
		level1nameProperty.comment = "change name of stone (1) harvest level to";
		level1name = level1nameProperty.getString();
		level1nameProperty.set(level1name);

		Property level2nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel02name", "Iron");
		level2nameProperty.comment = "change name of Iron (2) harvest level to";
		level2name = level2nameProperty.getString();
		level2nameProperty.set(level2name);

		Property level3nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel03name", "Tin");
		level3nameProperty.comment = "change name of diamond (3) harvest level to";
		level3name = level3nameProperty.getString();
		level3nameProperty.set(level3name);

		Property level4nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel04name", "Diamond");
		level4nameProperty.comment = "change name of (4) harvest level to";
		level4name = level4nameProperty.getString();
		level4nameProperty.set(level4name);

		Property level5nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel05name", "Ardite");
		level5nameProperty.comment = "change name of (5) harvest level to";
		level5name = level5nameProperty.getString();
		level5nameProperty.set(level5name);

		Property level6nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel06name", "Cobalt");
		level6nameProperty.comment = "change name of (6) harvest level to";
		level6name = level6nameProperty.getString();
		level6nameProperty.set(level6name);

		Property level7nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel07name", "Manyullyn");
		level7nameProperty.comment = "change name of (7) harvest level to";
		level7name = level7nameProperty.getString();
		level7nameProperty.set(level7name);

		Property level8nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel08name", "8");
		level8nameProperty.comment = "change name of (8) harvest level to";
		level8name = level8nameProperty.getString();
		level8nameProperty.set(level8name);

		Property level9nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel09name", "9");
		level9nameProperty.comment = "change name of (9) harvest level to";
		level9name = level9nameProperty.getString();
		level9nameProperty.set(level9name);

		Property level10nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel10name", "10");
		level10nameProperty.comment = "change name of (10) harvest level to";
		level10name = level10nameProperty.getString();
		level10nameProperty.set(level10name);

		Property level11nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel11name", "11");
		level11nameProperty.comment = "change name of (11) harvest level to";
		level11name = level11nameProperty.getString();
		level11nameProperty.set(level11name);

		Property level12nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel12name", "12");
		level12nameProperty.comment = "change name of (12) harvest level to";
		level12name = level12nameProperty.getString();
		level12nameProperty.set(level12name);

		Property level13nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel13name", "13");
		level13nameProperty.comment = "change name of (13) harvest level to";
		level13name = level13nameProperty.getString();
		level13nameProperty.set(level13name);

		Property level14nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel14name", "14");
		level14nameProperty.comment = "change name of (14) harvest level to";
		level14name = level14nameProperty.getString();
		level14nameProperty.set(level14name);

		Property level15nameProperty = harvestconfig.get("harvestlevelnames", "HarvestLevel15name", "15");
		level15nameProperty.comment = "change name of (15) harvest level to";
		level15name = level15nameProperty.getString();
		level15nameProperty.set(level15name);
		
		
		// harvest relevel
		ConfigCategory relevelCategory = harvestconfig.getCategory("relevel");
		relevelCategory.setComment("How to change base tool harvest levels.");
		
		Property level0Property = harvestconfig.get("relevel", "HarvestLevel0", 0);
		level0Property.comment = "change all normal tools with wood (0) harvest level to";
		level0 = level0Property.getInt(0);
		level0Property.set(level0);

		Property level1Property = harvestconfig.get("relevel", "HarvestLevel1", 1);
		level1Property.comment = "change all tools with stone (1) harvest level to";
		level1 = level1Property.getInt(1);
		level1Property.set(level1);

		Property level2Property = harvestconfig.get("relevel", "HarvestLevel2", 3);
		level2Property.comment = "change all tools with iron (2) harvest level to";
		level2 = level2Property.getInt(3);
		level2Property.set(level2);

		Property level3Property = harvestconfig.get("relevel", "HarvestLevel3", 5);
		level3Property.comment = "change all tools with diamond (3) harvest level to";
		level3 = level3Property.getInt(5);
		level3Property.set(level3);

		Property level4Property = harvestconfig.get("relevel", "HarvestLevel4", 6);
		level4Property.comment = "change all tools with (4) harvest level to";
		level4 = level4Property.getInt(6);
		level4Property.set(level4);

		Property level5Property = harvestconfig.get("relevel", "HarvestLevel5", 7);
		level5Property.comment = "change all tools with (5) harvest level to";
		level5 = level5Property.getInt(7);
		level5Property.set(level5);

		Property level6Property = harvestconfig.get("relevel", "HarvestLevel6", 8);
		level6Property.comment = "change all tools with (6) harvest level to";
		level6 = level6Property.getInt(8);
		level6Property.set(level6);

		Property level7Property = harvestconfig.get("relevel", "HarvestLevel7", 9);
		level7Property.comment = "change all tools with (7) harvest level to";
		level7 = level7Property.getInt(9);
		level7Property.set(level7);

		Property level8Property = harvestconfig.get("relevel", "HarvestLevel8", 10);
		level8Property.comment = "change all tools with (8) harvest level to";
		level8 = level8Property.getInt(10);
		level8Property.set(level8);

		Property level9Property = harvestconfig.get("relevel", "HarvestLevel9", 11);
		level9Property.comment = "change all tools with (9) harvest level to";
		level9 = level9Property.getInt(11);
		level9Property.set(level9);
		
		// harvest oreDict
		ConfigCategory harvestoredictCategory = harvestconfig.getCategory("harvestoredict");
		harvestoredictCategory.setComment("Set harvest levels of blocks by Ore Dictionary name. Must be 16 or more in each list. Will only read the first 16 in each list.");

		Property harvestLevel0oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel00oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel0oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 0 (stone pick+)";
		for (String i : harvestLevel0oreDictProperty.getStringList()) harvestLevel00oreDict.add(i);

		Property harvestLevel1oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel01oreDict", new String[] {"Copper", "Coal", "Tetrahedrite", "Aluminum", "Aluminium", "NaturalAluminum", "AluminumBrass", "Shard", "Bauxite", "Zinc", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel1oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 1 (flint pick+)";
		for (String i : harvestLevel1oreDictProperty.getStringList()) harvestLevel01oreDict.add(i);

		Property harvestLevel2oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel02oreDict", new String[] {"Iron", "Pyrite", "Lead", "Silver", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel2oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 2 (copper pick+)";
		for (String i : harvestLevel2oreDictProperty.getStringList()) harvestLevel02oreDict.add(i);

		Property harvestLevel3oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel03oreDict", new String[] {"Tin", "Cassiterite", "Gold", "Lapis", "Steel", "Galena", "Nickel", "Invar", "Electrum", "Sphalerite", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel3oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 3 (iron pick+)";
		for (String i : harvestLevel3oreDictProperty.getStringList()) harvestLevel03oreDict.add(i);

		Property harvestLevel4oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel04oreDict", new String[] {"Diamond", "Emerald", "Redstone", "Ruby", "Sapphire", "Cinnabar", "Quartz", "Obsidian", "CertusQuartz", "Tungstate", "Sodalite", "GreenSapphire", "BlackGranite", "RedGranite", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel4oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 4 (bronze pick+)";
		for (String i : harvestLevel4oreDictProperty.getStringList()) harvestLevel04oreDict.add(i);

		Property harvestLevel5oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel05oreDict", new String[] {"Ardite", "Uranium", "Olivine", "Sheldonite", "Osmium", "Platinum", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel5oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 5 (alumite pick+)";
		for (String i : harvestLevel5oreDictProperty.getStringList()) harvestLevel05oreDict.add(i);

		Property harvestLevel6oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel06oreDict", new String[] {"Cobalt", "Iridium", "Cooperite", "Titanium", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel6oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 6 (ardite pick+)";
		for (String i : harvestLevel6oreDictProperty.getStringList()) harvestLevel06oreDict.add(i);

		Property harvestLevel7oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel07oreDict", new String[] {"Manyullyn", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel7oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 7 (cobalt pick+)";
		for (String i : harvestLevel7oreDictProperty.getStringList()) harvestLevel07oreDict.add(i);

		Property harvestLevel8oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel08oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel8oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 8";
		for (String i : harvestLevel8oreDictProperty.getStringList()) harvestLevel08oreDict.add(i);

		Property harvestLevel9oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel09oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel9oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 9";
		for (String i : harvestLevel9oreDictProperty.getStringList()) harvestLevel09oreDict.add(i);

		Property harvestLevel10oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel10oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel10oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 10";
		for (String i : harvestLevel10oreDictProperty.getStringList()) harvestLevel10oreDict.add(i);

		Property harvestLevel11oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel11oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel11oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 11";
		for (String i : harvestLevel11oreDictProperty.getStringList()) harvestLevel11oreDict.add(i);

		Property harvestLevel12oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel12oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel12oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 12";
		for (String i : harvestLevel12oreDictProperty.getStringList()) harvestLevel12oreDict.add(i);

		Property harvestLevel13oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel13oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel13oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 13";
		for (String i : harvestLevel13oreDictProperty.getStringList()) harvestLevel13oreDict.add(i);

		Property harvestLevel14oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel14oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel14oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 14";
		for (String i : harvestLevel14oreDictProperty.getStringList()) harvestLevel14oreDict.add(i);

		Property harvestLevel15oreDictProperty = harvestconfig.get("harvestoredict", "harvestLevel15oreDict", new String[] {"junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1", "junk1"});
		harvestLevel15oreDictProperty.comment = "Ore Dictionary name (each on seperate line) to be set to harvest level 15";
		for (String i : harvestLevel15oreDictProperty.getStringList()) harvestLevel15oreDict.add(i);
		

		// harvest ids
		ConfigCategory harvestidsCategory = harvestconfig.getCategory("harvestids");
		harvestidsCategory.setComment("Set harvest levels of blocks here (most should be modified by default, so check if needed first)");

		Property harvestLevel0IdsProperty = harvestconfig.get("harvestids", "harvestLevel00Ids", new String[] {});
		harvestLevel0IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 0 (stone pick+)";
		for (String i : harvestLevel0IdsProperty.getStringList()) harvestLevel00Ids.add(i);

		Property harvestLevel1IdsProperty = harvestconfig.get("harvestids", "harvestLevel01Ids", new String[] {});
		harvestLevel1IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 1 (flint pick+)";
		for (String i : harvestLevel1IdsProperty.getStringList()) harvestLevel01Ids.add(i);

		Property harvestLevel2IdsProperty = harvestconfig.get("harvestids", "harvestLevel02Ids", new String[] {});
		harvestLevel2IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 2 (copper pick+)";
		for (String i : harvestLevel2IdsProperty.getStringList()) harvestLevel02Ids.add(i);

		Property harvestLevel3IdsProperty = harvestconfig.get("harvestids", "harvestLevel03Ids", new String[] {});
		harvestLevel3IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 3 (iron pick+)";
		for (String i : harvestLevel3IdsProperty.getStringList()) harvestLevel03Ids.add(i);

		Property harvestLevel4IdsProperty = harvestconfig.get("harvestids", "harvestLevel04Ids", new String[] {});
		harvestLevel4IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 4 (bronze pick+)";
		for (String i : harvestLevel4IdsProperty.getStringList()) harvestLevel04Ids.add(i);

		Property harvestLevel5IdsProperty = harvestconfig.get("harvestids", "harvestLevel05Ids", new String[] {});
		harvestLevel5IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 5 (alumite pick+)";
		for (String i : harvestLevel5IdsProperty.getStringList()) harvestLevel05Ids.add(i);

		Property harvestLevel6IdsProperty = harvestconfig.get("harvestids", "harvestLevel06Ids", new String[] {});
		harvestLevel6IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 6 (ardite pick+)";
		for (String i : harvestLevel6IdsProperty.getStringList()) harvestLevel06Ids.add(i);

		Property harvestLevel7IdsProperty = harvestconfig.get("harvestids", "harvestLevel07Ids", new String[] {});
		harvestLevel7IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 7 (cobalt pick+)";
		for (String i : harvestLevel7IdsProperty.getStringList()) harvestLevel07Ids.add(i);

		Property harvestLevel8IdsProperty = harvestconfig.get("harvestids", "harvestLevel08Ids", new String[] {});
		harvestLevel8IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 8";
		for (String i : harvestLevel8IdsProperty.getStringList()) harvestLevel08Ids.add(i);

		Property harvestLevel9IdsProperty = harvestconfig.get("harvestids", "harvestLevel09Ids", new String[] {});
		harvestLevel9IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 9";
		for (String i : harvestLevel9IdsProperty.getStringList()) harvestLevel09Ids.add(i);

		Property harvestLevel10IdsProperty = harvestconfig.get("harvestids", "harvestLevel10Ids", new String[] {});
		harvestLevel10IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 10";
		for (String i : harvestLevel10IdsProperty.getStringList()) harvestLevel10Ids.add(i);

		Property harvestLevel11IdsProperty = harvestconfig.get("harvestids", "harvestLevel11Ids", new String[] {});
		harvestLevel11IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 11";
		for (String i : harvestLevel11IdsProperty.getStringList()) harvestLevel11Ids.add(i);

		Property harvestLevel12IdsProperty = harvestconfig.get("harvestids", "harvestLevel12Ids", new String[] {});
		harvestLevel12IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 12";
		for (String i : harvestLevel12IdsProperty.getStringList()) harvestLevel12Ids.add(i);

		Property harvestLevel13IdsProperty = harvestconfig.get("harvestids", "harvestLevel13Ids", new String[] {});
		harvestLevel13IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 13";
		for (String i : harvestLevel13IdsProperty.getStringList()) harvestLevel13Ids.add(i);

		Property harvestLevel14IdsProperty = harvestconfig.get("harvestids", "harvestLevel14Ids", new String[] {});
		harvestLevel14IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 14";
		for (String i : harvestLevel14IdsProperty.getStringList()) harvestLevel14Ids.add(i);

		Property harvestLevel15IdsProperty = harvestconfig.get("harvestids", "harvestLevel15Ids", new String[] {});
		harvestLevel15IdsProperty.comment = "Block ids (each on seperate line) for blocks to be set to harvest level 15";
		for (String i : harvestLevel15IdsProperty.getStringList()) harvestLevel15Ids.add(i);

		harvestconfig.save();
		
	}

}
