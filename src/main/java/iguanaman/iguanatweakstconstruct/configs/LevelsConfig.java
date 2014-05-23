package iguanaman.iguanatweakstconstruct.configs;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cpw.mods.fml.common.Loader;
import tconstruct.library.TConstructRegistry;
import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class LevelsConfig {

	public static boolean moss;
	public static boolean luck;
	public static boolean haste;
	public static boolean attack;
	public static boolean beheading;
	public static boolean fireaspect;
	public static boolean lifesteal;
	public static boolean smite;
	public static boolean baneofarthropods;
	public static boolean knockback;
	
	public static int maxlevel;
	public static int startingModifiers;

	public static float BattleSign = 1f;
	public static float Shortbow = 1f;
	public static float Broadsword = 1f;
	public static float Cleaver = 1f;
	public static float Cutlass = 1f;
	public static float Dagger = 1f;
	public static float FryingPan = 1f;
	public static float Longsword = 1f;
	public static float Rapier = 1f;
	public static float Scythe = 1.5f;

	public static float Battleaxe = 1f;
	public static float Excavator = 9f;
	public static float Hammer = 6f;
	public static float Hatchet = 0.5f;
	public static float LumberAxe = 3f;
	public static float Pickaxe = 1f;
	public static float Mattock = 2.5f;
	public static float Shovel = 2f;
	
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

	public static String level1finish;
	public static String level1finisha;
	public static String level2finish;
	public static String level2finisha;
	public static String level3finish;
	public static String level3finisha;
	public static String level4finish;
	public static String level4finisha;
	public static String level5finish;
	public static String level5finisha;
	public static String level6finish;
	public static String level6finisha;
	public static String level7finish;
	public static String level7finisha;
	public static String level8finish;
	public static String level8finisha;
	public static String level9finish;
	public static String level9finisha;
	public static String levelxfinish;
	public static String levelxfinisha;

	public static void init()
	{
		File installDir = new File("config");
		File configDir = new File(installDir, "TiC Tweaks");
		Configuration levelconfig = new Configuration(new File(configDir, "Level Config.cfg"));
		levelconfig.load();

		ConfigCategory bonusCategory = levelconfig.getCategory("levelbonus");
		bonusCategory.setComment("Disable specific random modifiers.");
		
		moss = levelconfig.get("levelbonus", "moss-Auto Repair", true).getBoolean(true);
		luck = levelconfig.get("levelbonus", "Lapis-luck", true).getBoolean(true);
		haste = levelconfig.get("levelbonus", "Redstone-haste", true).getBoolean(true);
		attack = levelconfig.get("levelbonus", "Quartz-attack", true).getBoolean(true);
		beheading = levelconfig.get("levelbonus", "beheading", true).getBoolean(true);
		fireaspect = levelconfig.get("levelbonus", "Blaze-fire aspect", true).getBoolean(true);
		lifesteal = levelconfig.get("levelbonus", "Necrotic-life steal", true).getBoolean(true);
		smite = levelconfig.get("levelbonus", "smite", true).getBoolean(true);
		baneofarthropods = levelconfig.get("levelbonus", "Anti Spider-bane of arthropods", true).getBoolean(true);
		knockback = levelconfig.get("levelbonus", "Piston-knockback", true).getBoolean(true);
		

		ConfigCategory countCategory = levelconfig.getCategory("levelchanges");
		countCategory.setComment("Setup basic level changes.");

		Property maxLevelProperty = levelconfig.get("levelchanges", "MaxLevel", 6);
		maxLevelProperty.comment = "sets the MAX number of levels a tool can reach. must be 1 or higher.";
		maxlevel = maxLevelProperty.getInt(6);
		if (maxlevel < 1)
			maxlevel = 1;
		maxLevelProperty.set(maxlevel);

		Property startingModifiersProperty = levelconfig.get("levelchanges", "startingModifiers", 0);
		startingModifiersProperty.comment = "sets the number of modifiers slots a tool starts with.";
		startingModifiers = startingModifiersProperty.getInt(0);
		if (startingModifiers < 0)
			startingModifiers = 0;
		startingModifiersProperty.set(startingModifiers);

		//level names
		ConfigCategory nameCategory = levelconfig.getCategory("levelnames");
		nameCategory.setComment("Setup level names.");

		Property level1nameProperty = levelconfig.get("levelnames", "Level01name", "Clumsy");
		level1nameProperty.comment = "change name of level 1 to";
		level1name = level1nameProperty.getString();
		level1nameProperty.set(level1name);

		Property level2nameProperty = levelconfig.get("levelnames", "Level02name", "Comfortable");
		level2nameProperty.comment = "change name of level 2 to";
		level2name = level2nameProperty.getString();
		level2nameProperty.set(level2name);

		Property level3nameProperty = levelconfig.get("levelnames", "Level03name", "Accustomed");
		level3nameProperty.comment = "change name of level 3 to";
		level3name = level3nameProperty.getString();
		level3nameProperty.set(level3name);

		Property level4nameProperty = levelconfig.get("levelnames", "Level04name", "Adept");
		level4nameProperty.comment = "change name of level 4 to";
		level4name = level4nameProperty.getString();
		level4nameProperty.set(level4name);

		Property level5nameProperty = levelconfig.get("levelnames", "Level05name", "Expert");
		level5nameProperty.comment = "change name level 5 to";
		level5name = level5nameProperty.getString();
		level5nameProperty.set(level5name);

		Property level6nameProperty = levelconfig.get("levelnames", "Level06name", "Master");
		level6nameProperty.comment = "change name of level 6 to";
		level6name = level6nameProperty.getString();
		level6nameProperty.set(level6name);

		Property level7nameProperty = levelconfig.get("levelnames", "Level07name", "Grand Master");
		level7nameProperty.comment = "change name of level 7 to";
		level7name = level7nameProperty.getString();
		level7nameProperty.set(level7name);

		Property level8nameProperty = levelconfig.get("levelnames", "Level08name", "Legend");
		level8nameProperty.comment = "change name of level 8 to";
		level8name = level8nameProperty.getString();
		level8nameProperty.set(level8name);

		Property level9nameProperty = levelconfig.get("levelnames", "Level09name", "9");
		level9nameProperty.comment = "change name of level 9 to";
		level9name = level9nameProperty.getString();
		level9nameProperty.set(level9name);

		Property level10nameProperty = levelconfig.get("levelnames", "Level10name", "10");
		level10nameProperty.comment = "change name of level 10 and higher to";
		level10name = level10nameProperty.getString();
		level10nameProperty.set(level10name);
		
		//leveling text
		ConfigCategory textCategory = levelconfig.getCategory("leveltext");
		textCategory.setComment("text shown when leving tools.");

		Property level1textaProperty = levelconfig.get("leveltext", "Level01texta", "You begin to feel comfortable handling the ");
		level1textaProperty.comment = "text shown before tool name when going from level 1 to 2";
		level1finish = level1textaProperty.getString();
		level1textaProperty.set(level1finish);

		Property level1textbProperty = levelconfig.get("leveltext", "Level01textb", "");
		level1textbProperty.comment = "text shown after tool name when going from level 1 to 2";
		level1finisha = level1textbProperty.getString();
		level1textbProperty.set(level1finisha);

		Property level2textaProperty = levelconfig.get("leveltext", "Level02texta", "You are now accustomed to the weight of the ");
		level2textaProperty.comment = "text shown before tool name when going from level 2 to 3";
		level2finish = level2textaProperty.getString();
		level2textaProperty.set(level2finish);

		Property level2textbProperty = levelconfig.get("leveltext", "Level02textb", "");
		level2textbProperty.comment = "text shown after tool name when going from level 2 to 3";
		level2finisha = level2textbProperty.getString();
		level2textbProperty.set(level2finisha);

		Property level3textaProperty = levelconfig.get("leveltext", "Level03texta", "You have become adept at handling the ");
		level3textaProperty.comment = "text shown before tool name when going from level 3 to 4";
		level3finish = level3textaProperty.getString();
		level3textaProperty.set(level3finish);

		Property level3textbProperty = levelconfig.get("leveltext", "Level03textb", "");
		level3textbProperty.comment = "text shown after tool name when going from level 3 to 4";
		level3finisha = level3textbProperty.getString();
		level3textbProperty.set(level3finisha);

		Property level4textaProperty = levelconfig.get("leveltext", "Level04texta", "You are now an expert at using the ");
		level4textaProperty.comment = "text shown before tool name when going from level 4 to 5";
		level4finish = level4textaProperty.getString();
		level4textaProperty.set(level4finish);

		Property level4textbProperty = levelconfig.get("leveltext", "Level04textb", "!");
		level4textbProperty.comment = "text shown after tool name when going from level 4 to 5";
		level4finisha = level4textbProperty.getString();
		level4textbProperty.set(level4finisha);

		Property level5textaProperty = levelconfig.get("leveltext", "Level05texta", "You have mastered the ");
		level5textaProperty.comment = "text shown before tool name when going from level 5 to 6";
		level5finish = level5textaProperty.getString();
		level5textaProperty.set(level5finish);

		Property level5textbProperty = levelconfig.get("leveltext", "Level05textb", "!");
		level5textbProperty.comment = "text shown after tool name when going from level 5 to 6";
		level5finisha = level5textbProperty.getString();
		level5textbProperty.set(level5finisha);

		Property level6textaProperty = levelconfig.get("leveltext", "Level06texta", "");
		level6textaProperty.comment = "text shown before tool name when going from level 6 to 7";
		level6finish = level6textaProperty.getString();
		level6textaProperty.set(level6finish);

		Property level6textbProperty = levelconfig.get("leveltext", "Level06textb", "");
		level6textbProperty.comment = "text shown after tool name when going from level 6 to 7";
		level6finisha = level6textbProperty.getString();
		level6textbProperty.set(level6finisha);

		Property level7textaProperty = levelconfig.get("leveltext", "Level07texta", "");
		level7textaProperty.comment = "text shown before tool name when going from level 7 to 8";
		level7finish = level7textaProperty.getString();
		level7textaProperty.set(level7finish);

		Property level7textbProperty = levelconfig.get("leveltext", "Level07textb", "");
		level7textbProperty.comment = "text shown after tool name when going from level 7 to 8";
		level7finisha = level7textbProperty.getString();
		level7textbProperty.set(level7finisha);

		Property level8textaProperty = levelconfig.get("leveltext", "Level08texta", "");
		level8textaProperty.comment = "text shown before tool name when going from level 8 to 9";
		level8finish = level1textaProperty.getString();
		level8textaProperty.set(level1finish);

		Property level8textbProperty = levelconfig.get("leveltext", "Level08textb", "");
		level8textbProperty.comment = "text shown after tool name when going from level 8 to 9";
		level8finisha = level8textbProperty.getString();
		level8textbProperty.set(level8finisha);

		Property level9textaProperty = levelconfig.get("leveltext", "Level09texta", "");
		level9textaProperty.comment = "text shown before tool name when going from level 9 to 10";
		level9finish = level9textaProperty.getString();
		level9textaProperty.set(level9finish);

		Property level9textbProperty = levelconfig.get("leveltext", "Level09textb", "");
		level9textbProperty.comment = "text shown after tool name when going from level 9 to 10";
		level9finisha = level9textbProperty.getString();
		level9textbProperty.set(level9finisha);

		Property levelxtextaProperty = levelconfig.get("leveltext", "Level10texta", "");
		levelxtextaProperty.comment = "text shown before tool name when you reach any level above 10";
		levelxfinish = levelxtextaProperty.getString();
		levelxtextaProperty.set(levelxfinish);

		Property levelxtextbProperty = levelconfig.get("leveltext", "Level10textb", "");
		levelxtextbProperty.comment = "text shown after tool name when you reach any level above 10";
		levelxfinisha = levelxtextbProperty.getString();
		levelxtextbProperty.set(levelxfinisha);

		//Weapon XP Balance
		ConfigCategory WeaponBalCategory = levelconfig.getCategory("WeaponXPBalance");
		WeaponBalCategory.setComment("Reltive XP needed for each weapon type.");
		
		Property BattleSignProperty = levelconfig.get("WeaponXPBalance", "BattleSign", 1.0);
		BattleSignProperty.comment = "XP requirement multiplyer for BattleSign";
		BattleSign = (float) BattleSignProperty.getDouble(1);
		BattleSignProperty.set(BattleSign);

		Property ShortbowProperty = levelconfig.get("WeaponXPBalance", "Shortbow", 1.0);
		ShortbowProperty.comment = "XP requirement multiplyer for Shortbow";
		Shortbow = (float) ShortbowProperty.getDouble(1);
		ShortbowProperty.set(Shortbow);

		Property BroadswordProperty = levelconfig.get("WeaponXPBalance", "Broadsword", 1.0);
		BroadswordProperty.comment = "XP requirement multiplyer for Broadsword";
		Broadsword = (float) BroadswordProperty.getDouble(1);
		BroadswordProperty.set(Broadsword);

		Property CleaverProperty = levelconfig.get("WeaponXPBalance", "Cleaver", 1.0);
		CleaverProperty.comment = "XP requirement multiplyer for Cleaver";
		Cleaver = (float) CleaverProperty.getDouble(1);
		CleaverProperty.set(Cleaver);

		Property CutlassProperty = levelconfig.get("WeaponXPBalance", "Cutlass", 1.0);
		CutlassProperty.comment = "XP requirement multiplyer for Cutlass";
		Cutlass = (float) CutlassProperty.getDouble(1);
		CutlassProperty.set(Cutlass);

		Property FryingPanProperty = levelconfig.get("WeaponXPBalance", "FryingPan", 1.0);
		FryingPanProperty.comment = "XP requirement multiplyer for FryingPan";
		FryingPan = (float) FryingPanProperty.getDouble(1);
		FryingPanProperty.set(FryingPan);

		Property DaggerProperty = levelconfig.get("WeaponXPBalance", "Dagger", 1.0);
		DaggerProperty.comment = "XP requirement multiplyer for Dagger";
		Dagger = (float) DaggerProperty.getDouble(1);
		DaggerProperty.set(Dagger);

		Property LongswordProperty = levelconfig.get("WeaponXPBalance", "Longsword", 1.0);
		LongswordProperty.comment = "XP requirement multiplyer for Longsword";
		Longsword = (float) LongswordProperty.getDouble(1);
		LongswordProperty.set(Longsword);

		Property RapierProperty = levelconfig.get("WeaponXPBalance", "Rapier", 1.0);
		RapierProperty.comment = "XP requirement multiplyer for Rapier";
		Rapier = (float) RapierProperty.getDouble(1);
		RapierProperty.set(Rapier);

		Property ScytheProperty = levelconfig.get("WeaponXPBalance", "Scythe", 1.5);
		ScytheProperty.comment = "XP requirement multiplyer for Scythe";
		Scythe = (float) ScytheProperty.getDouble(1.5);
		BattleSignProperty.set(Scythe);
		
		//Tool XP Balance
		ConfigCategory ToolBalCategory = levelconfig.getCategory("ToolXPBalance");
		ToolBalCategory.setComment("Reltive XP needed for each tool type.");
		
		Property BattleaxeProperty = levelconfig.get("ToolXPBalance", "Battleaxe", 1.0);
		BattleaxeProperty.comment = "XP requirement multiplyer for Battleaxe (yes it is listed as a tool)";
		Battleaxe = (float) BattleaxeProperty.getDouble(1);
		BattleaxeProperty.set(Battleaxe);

		Property ExcavatorProperty = levelconfig.get("ToolXPBalance", "Excavator", 9.0);
		ExcavatorProperty.comment = "XP requirement multiplyer for Excavator";
		Excavator = (float) ExcavatorProperty.getDouble(9);
		ExcavatorProperty.set(Excavator);

		Property HammerProperty = levelconfig.get("ToolXPBalance", "Hammer", 6.0);
		HammerProperty.comment = "XP requirement multiplyer for Hammer";
		Hammer = (float) HammerProperty.getDouble(6);
		HammerProperty.set(Hammer);

		Property HatchetProperty = levelconfig.get("ToolXPBalance", "Hatchet", 0.5);
		HatchetProperty.comment = "XP requirement multiplyer for Hatchet";
		Hatchet = (float) HatchetProperty.getDouble(0.5);
		HatchetProperty.set(Hatchet);

		Property LumberAxeProperty = levelconfig.get("ToolXPBalance", "LumberAxe", 3.0);
		LumberAxeProperty.comment = "XP requirement multiplyer for LumberAxe";
		LumberAxe = (float) LumberAxeProperty.getDouble(3);
		LumberAxeProperty.set(LumberAxe);

		Property PickaxeProperty = levelconfig.get("ToolXPBalance", "Pickaxe", 1.0);
		PickaxeProperty.comment = "XP requirement multiplyer for Pickaxe";
		Pickaxe = (float) PickaxeProperty.getDouble(1);
		PickaxeProperty.set(Pickaxe);

		Property MattockProperty = levelconfig.get("ToolXPBalance", "Mattock", 2.5);
		MattockProperty.comment = "XP requirement multiplyer for Mattock";
		Mattock = (float) MattockProperty.getDouble(2.5);
		MattockProperty.set(Mattock);

		Property ShovelProperty = levelconfig.get("ToolXPBalance", "Shovel", 2.0);
		ShovelProperty.comment = "XP requirement multiplyer for Shovel";
		Shovel = (float) ShovelProperty.getDouble(2);
		ShovelProperty.set(Shovel);
		
		levelconfig.save();
		
	}

}
