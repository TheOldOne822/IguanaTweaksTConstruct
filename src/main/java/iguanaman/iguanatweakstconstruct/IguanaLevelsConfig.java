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

public class IguanaLevelsConfig {


	public static int maxlevel;

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
	public static String level2finish;
	public static String level3finish;
	public static String level4finish;
	public static String level5finish;
	public static String level6finish;
	public static String level7finish;
	public static String level8finish;
	public static String level9finish;

	public static void init()
	{
		File installDir = new File("config");
		File configDir = new File(installDir, "TConstruct Tweaks");
		Configuration levelconfig = new Configuration(new File(configDir, "Level Config.cfg"));
		levelconfig.load();

		ConfigCategory countCategory = levelconfig.getCategory("levelcount");
		countCategory.setComment("Setup level changes.");

		Property maxLevelProperty = levelconfig.get("levelcount", "MaxLevel", 6);
		maxLevelProperty.comment = "sets the MAX number of levels a tool can reach. must be 1 or higher.";
		maxlevel = maxLevelProperty.getInt(6);
		if (maxlevel < 1)
			maxlevel = 1;
		maxLevelProperty.set(maxlevel);


		ConfigCategory nameCategory = levelconfig.getCategory("levelnames");
		nameCategory.setComment("Setup level names.");

		Property level1nameProperty = levelconfig.get("levelnames", "Level01name", "Clumsy");
		level1nameProperty.comment = "change name of stone (1) harvest level to";
		level1name = level1nameProperty.getString();
		level1nameProperty.set(level1name);

		Property level2nameProperty = levelconfig.get("levelnames", "Level02name", "Comfortable");
		level2nameProperty.comment = "change name of Iron (2) harvest level to";
		level2name = level2nameProperty.getString();
		level2nameProperty.set(level2name);

		Property level3nameProperty = levelconfig.get("levelnames", "Level03name", "Accustomed");
		level3nameProperty.comment = "change name of diamond (3) harvest level to";
		level3name = level3nameProperty.getString();
		level3nameProperty.set(level3name);

		Property level4nameProperty = levelconfig.get("levelnames", "Level04name", "Adept");
		level4nameProperty.comment = "change name of (4) harvest level to";
		level4name = level4nameProperty.getString();
		level4nameProperty.set(level4name);

		Property level5nameProperty = levelconfig.get("levelnames", "Level05name", "Expert");
		level5nameProperty.comment = "change name of (5) harvest level to";
		level5name = level5nameProperty.getString();
		level5nameProperty.set(level5name);

		Property level6nameProperty = levelconfig.get("levelnames", "Level06name", "Master");
		level6nameProperty.comment = "change name of (6) harvest level to";
		level6name = level6nameProperty.getString();
		level6nameProperty.set(level6name);

		Property level7nameProperty = levelconfig.get("levelnames", "Level07name", "Grand Master");
		level7nameProperty.comment = "change name of (7) harvest level to";
		level7name = level7nameProperty.getString();
		level7nameProperty.set(level7name);

		Property level8nameProperty = levelconfig.get("levelnames", "Level08name", "Legend");
		level8nameProperty.comment = "change name of (8) harvest level to";
		level8name = level8nameProperty.getString();
		level8nameProperty.set(level8name);

		Property level9nameProperty = levelconfig.get("levelnames", "Level09name", "9");
		level9nameProperty.comment = "change name of (9) harvest level to";
		level9name = level9nameProperty.getString();
		level9nameProperty.set(level9name);

		Property level10nameProperty = levelconfig.get("levelnames", "Level10name", "10");
		level10nameProperty.comment = "change name of (10) harvest level to";
		level10name = level10nameProperty.getString();
		level10nameProperty.set(level10name);
		
/*		// cactus
		ConfigCategory cactusCategory = minconfig.getCategory("cactus");
		cactusCategory.setComment("Setup base stats of cactus");

		Property cactusharvestLevelProperty = minconfig.get("cactus", "cactusLevel", 0);
		cactusharvestLevelProperty.comment = "sets the harvest level of cactus";
		cactusharvestLevel = cactusharvestLevelProperty.getInt(0);
		cactusharvestLevelProperty.set(cactusharvestLevel);

		Property cactusdurabilityProperty = minconfig.get("cactus", "cactusdurability", 150);
		cactusdurabilityProperty.comment = "sets the base durability of cactus";
		cactusdurability = cactusdurabilityProperty.getInt(150);
		cactusdurabilityProperty.set(cactusdurability);

		Property cactusminingspeedProperty = minconfig.get("cactus", "cactusminingspeed", 500);
		cactusminingspeedProperty.comment = "sets the mining speed of cactus";
		cactusminingspeed = cactusminingspeedProperty.getInt(500);
		cactusminingspeedProperty.set(cactusminingspeed);

		Property cactusattackProperty = minconfig.get("cactus", "cactusattack", 2);
		cactusattackProperty.comment = "sets the attack of cactus";
		cactusattack = cactusattackProperty.getInt(2);
		cactusattackProperty.set(cactusattack);

		Property cactushandleModifierProperty = minconfig.get("cactus", "cactushandleModifier", 1.0);
		cactushandleModifierProperty.comment = "sets the handle modifier of cactus";
		cactushandleModifier = (float) cactushandleModifierProperty.getDouble(1);
		cactushandleModifierProperty.set(cactushandleModifier);

		Property cactusreinforcedProperty = minconfig.get("cactus", "cactusreinforcedLevel", 0);
		cactusreinforcedProperty.comment = "sets the reinforced level of cactus";
		cactusreinforced = cactusreinforcedProperty.getInt(0);
		cactusreinforcedProperty.set(cactusreinforced);

		Property cactusstoneboundProperty = minconfig.get("cactus", "stonebound", -1);
		cactusstoneboundProperty.comment = "sets the stonebound level of cactus";
		cactusstonebound = (float) cactusstoneboundProperty.getDouble(-1);
		cactusstoneboundProperty.set(cactusstonebound);

		// Slime
		ConfigCategory slimeCategory = minconfig.getCategory("slime");
		slimeCategory.setComment("Setup base stats of slime");

		Property slimeharvestLevelProperty = minconfig.get("slime", "slimeLevel", 0);
		slimeharvestLevelProperty.comment = "sets the harvest level of slime";
		slimeharvestLevel = slimeharvestLevelProperty.getInt();
		slimeharvestLevelProperty.set(slimeharvestLevel);

		Property slimedurabilityProperty = minconfig.get("slime", "slimedurability", 500);
		slimedurabilityProperty.comment = "sets the base durability of slime";
		slimedurability = slimedurabilityProperty.getInt(500);
		slimedurabilityProperty.set(slimedurability);

		Property slimeminingspeedProperty = minconfig.get("slime", "slimeminingspeed", 100);
		slimeminingspeedProperty.comment = "sets the mining speed of slime";
		slimeminingspeed = slimeminingspeedProperty.getInt(100);
		slimeminingspeedProperty.set(slimeminingspeed);

		Property slimeattackProperty = minconfig.get("slime", "slimeattack", 1);
		slimeattackProperty.comment = "sets the attack of slime";
		slimeattack = slimeattackProperty.getInt();
		slimeattackProperty.set(slimeattack);

		Property slimehandleModifierProperty = minconfig.get("slime", "slimehandleModifier", 2.0);
		slimehandleModifierProperty.comment = "sets the handle modifier of slime";
		slimehandleModifier = (float) slimehandleModifierProperty.getDouble(2);
		slimehandleModifierProperty.set(slimehandleModifier);

		Property slimereinforcedProperty = minconfig.get("slime", "reinforcedLevel", 0);
		slimereinforcedProperty.comment = "sets the reinforced level of slime";
		slimereinforced = slimereinforcedProperty.getInt();
		slimereinforcedProperty.set(slimereinforced);

		Property slimestoneboundProperty = minconfig.get("slime", "slimestonebound", 0);
		slimestoneboundProperty.comment = "sets the stonebound level of slime";
		slimestonebound = (float) slimestoneboundProperty.getDouble(0);
		slimestoneboundProperty.set(slimestonebound);

		// BlueSlime
		ConfigCategory blueslimeCategory = minconfig.getCategory("blueslime");
		blueslimeCategory.setComment("Setup base stats of blueslime");

		Property blueslimeharvestLevelProperty = minconfig.get("blueslime", "blueslimeLevel", 0);
		blueslimeharvestLevelProperty.comment = "sets the harvest level of blueslime";
		blueslimeharvestLevel = blueslimeharvestLevelProperty.getInt();
		blueslimeharvestLevelProperty.set(blueslimeharvestLevel);

		Property blueslimedurabilityProperty = minconfig.get("blueslime", "blueslimedurability", 1200);
		blueslimedurabilityProperty.comment = "sets the base durability of blueslime";
		blueslimedurability = blueslimedurabilityProperty.getInt(1200);
		blueslimedurabilityProperty.set(blueslimedurability);

		Property blueslimeminingspeedProperty = minconfig.get("blueslime", "blueslimeminingspeed", 100);
		blueslimeminingspeedProperty.comment = "sets the mining speed of blueslime";
		blueslimeminingspeed = blueslimeminingspeedProperty.getInt(100);
		blueslimeminingspeedProperty.set(blueslimeminingspeed);

		Property blueslimeattackProperty = minconfig.get("blueslime", "blueslimeattack", 1);
		blueslimeattackProperty.comment = "sets the attack of blueslime";
		blueslimeattack = blueslimeattackProperty.getInt();
		blueslimeattackProperty.set(blueslimeattack);

		Property blueslimehandleModifierProperty = minconfig.get("blueslime", "blueslimehandleModifier", 1.5);
		blueslimehandleModifierProperty.comment = "sets the handle modifier of blueslime";
		blueslimehandleModifier = (float) blueslimehandleModifierProperty.getDouble(1.5);
		blueslimehandleModifierProperty.set(blueslimehandleModifier);

		Property blueslimereinforcedProperty = minconfig.get("blueslime", "blueslimereinforcedLevel", 0);
		blueslimereinforcedProperty.comment = "sets the reinforced level of blueslime";
		blueslimereinforced = blueslimereinforcedProperty.getInt();
		blueslimereinforcedProperty.set(blueslimereinforced);

		Property blueslimestoneboundProperty = minconfig.get("blueslime", "blueslimestonebound", 0);
		blueslimestoneboundProperty.comment = "sets the stonebound level of blueslime";
		blueslimestonebound = (float) blueslimestoneboundProperty.getDouble(0);
		blueslimestoneboundProperty.set(blueslimestonebound);

		// Paper
		ConfigCategory paperCategory = minconfig.getCategory("paper");
		paperCategory.setComment("Setup base stats of paper");

		Property paperharvestLevelProperty = minconfig.get("paper", "paperLevel", 0);
		paperharvestLevelProperty.comment = "sets the harvest level of paper";
		paperharvestLevel = paperharvestLevelProperty.getInt();
		paperharvestLevelProperty.set(paperharvestLevel);

		Property paperdurabilityProperty = minconfig.get("paper", "paperdurability", 30);
		paperdurabilityProperty.comment = "sets the base durability of paper";
		paperdurability = paperdurabilityProperty.getInt(30);
		paperdurabilityProperty.set(paperdurability);

		Property paperminingspeedProperty = minconfig.get("paper", "paperminingspeed", 100);
		paperminingspeedProperty.comment = "sets the mining speed of paper";
		paperminingspeed = paperminingspeedProperty.getInt(100);
		paperminingspeedProperty.set(paperminingspeed);

		Property paperattackProperty = minconfig.get("paper", "paperattack", 1);
		paperattackProperty.comment = "sets the attack of paper";
		paperattack = paperattackProperty.getInt();
		paperattackProperty.set(paperattack);

		Property paperhandleModifierProperty = minconfig.get("paper", "paperhandleModifier", 0.3);
		paperhandleModifierProperty.comment = "sets the handle modifier of paper";
		paperhandleModifier = (float) paperhandleModifierProperty.getDouble(0.3);
		paperhandleModifierProperty.set(paperhandleModifier);

		Property paperreinforcedProperty = minconfig.get("paper", "paperreinforcedLevel", 0);
		paperreinforcedProperty.comment = "sets the reinforced level of paper";
		paperreinforced = paperreinforcedProperty.getInt();
		paperreinforcedProperty.set(paperreinforced);

		Property paperstoneboundProperty = minconfig.get("paper", "paperstonebound", 0);
		paperstoneboundProperty.comment = "sets the stonebound level of paper";
		paperstonebound = (float) paperstoneboundProperty.getDouble(0);
		paperstoneboundProperty.set(paperstonebound);

		// Stone
		ConfigCategory stoneCategory = minconfig.getCategory("stone");
		stoneCategory.setComment("Setup base stats of stone");

		Property stoneharvestLevelProperty = minconfig.get("stone", "stoneLevel", 0);
		stoneharvestLevelProperty.comment = "sets the harvest level of stone";
		stoneharvestLevel = stoneharvestLevelProperty.getInt();
		stoneharvestLevelProperty.set(stoneharvestLevel);

		Property stonedurabilityProperty = minconfig.get("stone", "stonedurability", 131);
		stonedurabilityProperty.comment = "sets the base durability of stone";
		stonedurability = stonedurabilityProperty.getInt(131);
		stonedurabilityProperty.set(stonedurability);

		Property stoneminingspeedProperty = minconfig.get("stone", "stoneminingspeed", 300);
		stoneminingspeedProperty.comment = "sets the mining speed of ";
		stoneminingspeed = stoneminingspeedProperty.getInt(300);
		stoneminingspeedProperty.set(stoneminingspeed);

		Property stoneattackProperty = minconfig.get("stone", "stoneattack", 2);
		stoneattackProperty.comment = "sets the attack of stone";
		stoneattack = stoneattackProperty.getInt();
		stoneattackProperty.set(stoneattack);

		Property stonehandleModifierProperty = minconfig.get("stone", "stonehandleModifier", 0.5);
		stonehandleModifierProperty.comment = "sets the handle modifier of stone";
		stonehandleModifier = (float) stonehandleModifierProperty.getDouble(0.5);
		stonehandleModifierProperty.set(stonehandleModifier);

		Property stonereinforcedProperty = minconfig.get("stone", "stonereinforcedLevel", 0);
		stonereinforcedProperty.comment = "sets the reinforced level of stone";
		stonereinforced = stonereinforcedProperty.getInt();
		stonereinforcedProperty.set(stonereinforced);

		Property stonestoneboundProperty = minconfig.get("stone", "stonestonebound", 1);
		stonestoneboundProperty.comment = "sets the stonebound level of stone";
		stonestonebound = (float) stonestoneboundProperty.getDouble(1);
		stonestoneboundProperty.set(stonestonebound);

		// Flint
		ConfigCategory flintCategory = minconfig.getCategory("flint");
		flintCategory.setComment("Setup base stats of flint");

		Property flintharvestLevelProperty = minconfig.get("flint", "flintLevel", 1);
		flintharvestLevelProperty.comment = "sets the harvest level of flint";
		flintharvestLevel = flintharvestLevelProperty.getInt();
		flintharvestLevelProperty.set(flintharvestLevel);

		Property flintdurabilityProperty = minconfig.get("flint", "flintdurability", 171);
		flintdurabilityProperty.comment = "sets the base durability of flint";
		flintdurability = flintdurabilityProperty.getInt(171);
		flintdurabilityProperty.set(flintdurability);

		Property flintminingspeedProperty = minconfig.get("flint", "flintminingspeed", 400);
		flintminingspeedProperty.comment = "sets the mining speed of flint";
		flintminingspeed = flintminingspeedProperty.getInt(400);
		flintminingspeedProperty.set(flintminingspeed);

		Property flintattackProperty = minconfig.get("flint", "flintattack", 2);
		flintattackProperty.comment = "sets the attack of flint";
		flintattack = flintattackProperty.getInt();
		flintattackProperty.set(flintattack);

		Property flinthandleModifierProperty = minconfig.get("flint", "flinthandleModifier", 0.5);
		flinthandleModifierProperty.comment = "sets the handle modifier of flint";
		flinthandleModifier = (float) flinthandleModifierProperty.getDouble(0.5);
		flinthandleModifierProperty.set(flinthandleModifier);

		Property flintreinforcedProperty = minconfig.get("flint", "flintreinforcedLevel", 0);
		flintreinforcedProperty.comment = "sets the reinforced level of flint";
		flintreinforced = flintreinforcedProperty.getInt();
		flintreinforcedProperty.set(flintreinforced);

		Property flintstoneboundProperty = minconfig.get("flint", "flintstonebound", 0);
		flintstoneboundProperty.comment = "sets the stonebound level of flint";
		flintstonebound = (float) flintstoneboundProperty.getDouble(0);
		flintstoneboundProperty.set(flintstonebound);

		// Bone
		ConfigCategory boneCategory = minconfig.getCategory("bone");
		boneCategory.setComment("Setup base stats of bone");

		Property boneharvestLevelProperty = minconfig.get("bone", "boneLevel", 1);
		boneharvestLevelProperty.comment = "sets the harvest level of bone";
		boneharvestLevel = boneharvestLevelProperty.getInt();
		boneharvestLevelProperty.set(boneharvestLevel);

		Property bonedurabilityProperty = minconfig.get("bone", "bonedurability", 200);
		bonedurabilityProperty.comment = "sets the base durability of bone";
		bonedurability = bonedurabilityProperty.getInt();
		bonedurabilityProperty.set(bonedurability);

		Property boneminingspeedProperty = minconfig.get("bone", "boneminingspeed", 400);
		boneminingspeedProperty.comment = "sets the mining speed of bone";
		boneminingspeed = boneminingspeedProperty.getInt();
		boneminingspeedProperty.set(boneminingspeed);

		Property boneattackProperty = minconfig.get("bone", "boneattack", 2);
		boneattackProperty.comment = "sets the attack of bone";
		boneattack = boneattackProperty.getInt();
		boneattackProperty.set(boneattack);

		Property bonehandleModifierProperty = minconfig.get("bone", "bonehandleModifier", 1.0);
		bonehandleModifierProperty.comment = "sets the handle modifier of bone";
		bonehandleModifier = (float) bonehandleModifierProperty.getDouble(1);
		bonehandleModifierProperty.set(bonehandleModifier);

		Property bonereinforcedProperty = minconfig.get("bone", "bonereinforcedLevel", 0);
		bonereinforcedProperty.comment = "sets the reinforced level of bone";
		bonereinforced = bonereinforcedProperty.getInt();
		bonereinforcedProperty.set(bonereinforced);

		Property bonestoneboundProperty = minconfig.get("bone", "bonestonebound", 0.0);
		bonestoneboundProperty.comment = "sets the stonebound level of bone";
		bonestonebound = (float) bonestoneboundProperty.getDouble(0);
		bonestoneboundProperty.set(bonestonebound);

		// Netherrack
		ConfigCategory netherrackCategory = minconfig.getCategory("netherrack");
		netherrackCategory.setComment("Setup base stats of netherrack");

		Property netherrackharvestLevelProperty = minconfig.get("netherrack", "netherrackLevel", 0);
		netherrackharvestLevelProperty.comment = "sets the harvest level of netherrack";
		netherrackharvestLevel = netherrackharvestLevelProperty.getInt();
		netherrackharvestLevelProperty.set(netherrackharvestLevel);

		Property netherrackdurabilityProperty = minconfig.get("netherrack", "netherrackdurability", 131);
		netherrackdurabilityProperty.comment = "sets the base durability of netherrack";
		netherrackdurability = netherrackdurabilityProperty.getInt(131);
		netherrackdurabilityProperty.set(netherrackdurability);

		Property netherrackminingspeedProperty = minconfig.get("netherrack", "netherrackminingspeed", 400);
		netherrackminingspeedProperty.comment = "sets the mining speed of netherrack";
		netherrackminingspeed = netherrackminingspeedProperty.getInt(400);
		netherrackminingspeedProperty.set(netherrackminingspeed);

		Property netherrackattackProperty = minconfig.get("netherrack", "netherrackattack", 3);
		netherrackattackProperty.comment = "sets the attack of ";
		netherrackattack = netherrackattackProperty.getInt();
		netherrackattackProperty.set(netherrackattack);

		Property netherrackhandleModifierProperty = minconfig.get("netherrack", "netherrackhandleModifier", 1.2);
		netherrackhandleModifierProperty.comment = "sets the handle modifier of netherrack";
		netherrackhandleModifier = (float) netherrackhandleModifierProperty.getDouble(1.2);
		netherrackhandleModifierProperty.set(netherrackhandleModifier);

		Property netherrackreinforcedProperty = minconfig.get("netherrack", "netherrackreinforcedLevel", 0);
		netherrackreinforcedProperty.comment = "sets the reinforced level of netherrack";
		netherrackreinforced = netherrackreinforcedProperty.getInt(0);
		netherrackreinforcedProperty.set(netherrackreinforced);

		Property netherrackstoneboundProperty = minconfig.get("netherrack", "netherrackstonebound", 1);
		netherrackstoneboundProperty.comment = "sets the stonebound level of netherrack";
		netherrackstonebound = (float) netherrackstoneboundProperty.getDouble(1);
		netherrackstoneboundProperty.set(netherrackstonebound);

		// Copper
		ConfigCategory copperCategory = minconfig.getCategory("copper");
		copperCategory.setComment("Setup base stats of copper");

		Property copperharvestLevelProperty = minconfig.get("copper", "copperLevel", 1);
		copperharvestLevelProperty.comment = "sets the harvest level of copper";
		copperharvestLevel = copperharvestLevelProperty.getInt();
		copperharvestLevelProperty.set(copperharvestLevel);

		Property copperdurabilityProperty = minconfig.get("copper", "copperdurability", 180);
		copperdurabilityProperty.comment = "sets the base durability of copper";
		copperdurability = copperdurabilityProperty.getInt(180);
		copperdurabilityProperty.set(copperdurability);

		Property copperminingspeedProperty = minconfig.get("copper", "copperminingspeed", 500);
		copperminingspeedProperty.comment = "sets the mining speed of copper";
		copperminingspeed = copperminingspeedProperty.getInt(500);
		copperminingspeedProperty.set(copperminingspeed);

		Property copperattackProperty = minconfig.get("copper", "copperattack", 2);
		copperattackProperty.comment = "sets the attack of copper";
		copperattack = copperattackProperty.getInt();
		copperattackProperty.set(copperattack);

		Property copperhandleModifierProperty = minconfig.get("copper", "copperhandleModifier", 1.15);
		copperhandleModifierProperty.comment = "sets the handle modifier of copper";
		copperhandleModifier = (float) copperhandleModifierProperty.getDouble(1.15);
		copperhandleModifierProperty.set(copperhandleModifier);

		Property copperreinforcedProperty = minconfig.get("copper", "copperreinforcedLevel", 0);
		copperreinforcedProperty.comment = "sets the reinforced level of copper";
		copperreinforced = copperreinforcedProperty.getInt();
		copperreinforcedProperty.set(copperreinforced);

		Property copperstoneboundProperty = minconfig.get("copper", "copperstonebound", 0);
		copperstoneboundProperty.comment = "sets the stonebound level of copper";
		copperstonebound = (float) copperstoneboundProperty.getDouble(0);
		copperstoneboundProperty.set(copperstonebound);

		// Iron
		ConfigCategory ironCategory = minconfig.getCategory("iron");
		ironCategory.setComment("Setup base stats of iron");

		Property ironharvestLevelProperty = minconfig.get("iron", "ironLevel", 3);
		ironharvestLevelProperty.comment = "sets the harvest level of iron";
		ironharvestLevel = ironharvestLevelProperty.getInt();
		ironharvestLevelProperty.set(ironharvestLevel);

		Property irondurabilityProperty = minconfig.get("iron", "irondurability", 250);
		irondurabilityProperty.comment = "sets the base durability of iron";
		irondurability = irondurabilityProperty.getInt(250);
		irondurabilityProperty.set(irondurability);

		Property ironminingspeedProperty = minconfig.get("iron", "ironminingspeed", 600);
		ironminingspeedProperty.comment = "sets the mining speed of ";
		ironminingspeed = ironminingspeedProperty.getInt(600);
		ironminingspeedProperty.set(ironminingspeed);

		Property ironattackProperty = minconfig.get("iron", "ironattack", 3);
		ironattackProperty.comment = "sets the attack of iron";
		ironattack = ironattackProperty.getInt();
		ironattackProperty.set(ironattack);

		Property ironhandleModifierProperty = minconfig.get("iron", "ironhandleModifier", 1.3);
		ironhandleModifierProperty.comment = "sets the handle modifier of iron";
		ironhandleModifier = (float) ironhandleModifierProperty.getDouble(1.3);
		ironhandleModifierProperty.set(ironhandleModifier);

		Property ironreinforcedProperty = minconfig.get("iron", "ironreinforcedLevel", 1);
		ironreinforcedProperty.comment = "sets the reinforced level of ";
		ironreinforced = ironreinforcedProperty.getInt();
		ironreinforcedProperty.set(ironreinforced);

		Property ironstoneboundProperty = minconfig.get("iron", "ironstonebound", 0);
		ironstoneboundProperty.comment = "sets the stonebound level of iron";
		ironstonebound = (float) ironstoneboundProperty.getDouble(0);
		ironstoneboundProperty.set(ironstonebound);

		// Bronze
		ConfigCategory bronzeCategory = minconfig.getCategory("bronze");
		bronzeCategory.setComment("Setup base stats of bronze");

		Property bronzeharvestLevelProperty = minconfig.get("bronze", "bronzeLevel", 4);
		bronzeharvestLevelProperty.comment = "sets the harvest level of bronze";
		bronzeharvestLevel = bronzeharvestLevelProperty.getInt();
		bronzeharvestLevelProperty.set(bronzeharvestLevel);

		Property bronzedurabilityProperty = minconfig.get("bronze", "bronzedurability", 350);
		bronzedurabilityProperty.comment = "sets the base durability of bronze";
		bronzedurability = bronzedurabilityProperty.getInt(350);
		bronzedurabilityProperty.set(bronzedurability);

		Property bronzeminingspeedProperty = minconfig.get("bronze", "bronzeminingspeed", 700);
		bronzeminingspeedProperty.comment = "sets the mining speed of bronze";
		bronzeminingspeed = bronzeminingspeedProperty.getInt(700);
		bronzeminingspeedProperty.set(bronzeminingspeed);

		Property bronzeattackProperty = minconfig.get("bronze", "bronzeattack", 3);
		bronzeattackProperty.comment = "sets the attack of bronze";
		bronzeattack = bronzeattackProperty.getInt();
		bronzeattackProperty.set(bronzeattack);

		Property bronzehandleModifierProperty = minconfig.get("bronze", "bronzehandleModifier", 1.3);
		bronzehandleModifierProperty.comment = "sets the handle modifier of ";
		bronzehandleModifier = (float) bronzehandleModifierProperty.getDouble(1.3);
		bronzehandleModifierProperty.set(bronzehandleModifier);

		Property bronzereinforcedProperty = minconfig.get("bronze", "bronzereinforcedLevel", 1);
		bronzereinforcedProperty.comment = "sets the reinforced level of bronze";
		bronzereinforced = bronzereinforcedProperty.getInt();
		bronzereinforcedProperty.set(bronzereinforced);

		Property bronzestoneboundProperty = minconfig.get("bronze", "bronzestonebound", 0);
		bronzestoneboundProperty.comment = "sets the stonebound level of bronze";
		bronzestonebound = (float) bronzestoneboundProperty.getDouble(0);
		bronzestoneboundProperty.set(bronzestonebound);

		// Steel
		ConfigCategory steelCategory = minconfig.getCategory("steel");
		steelCategory.setComment("Setup base stats of steel");

		Property steelharvestLevelProperty = minconfig.get("steel", "steelLevel", 4);
		steelharvestLevelProperty.comment = "sets the harvest level of steel";
		steelharvestLevel = steelharvestLevelProperty.getInt();
		steelharvestLevelProperty.set(steelharvestLevel);

		Property steeldurabilityProperty = minconfig.get("steel", "steeldurability", 400);
		steeldurabilityProperty.comment = "sets the base durability of steel";
		steeldurability = steeldurabilityProperty.getInt(400);
		steeldurabilityProperty.set(steeldurability);

		Property steelminingspeedProperty = minconfig.get("steel", "miningspeed", 800);
		steelminingspeedProperty.comment = "sets the mining speed of steel";
		steelminingspeed = steelminingspeedProperty.getInt(800);
		steelminingspeedProperty.set(steelminingspeed);

		Property steelattackProperty = minconfig.get("steel", "attack", 3);
		steelattackProperty.comment = "sets the attack of steel";
		steelattack = steelattackProperty.getInt();
		steelattackProperty.set(steelattack);

		Property steelhandleModifierProperty = minconfig.get("steel", "steelhandleModifier", 1.3);
		steelhandleModifierProperty.comment = "sets the handle modifier of ";
		steelhandleModifier = (float) steelhandleModifierProperty.getDouble(1.3);
		steelhandleModifierProperty.set(steelhandleModifier);

		Property steelreinforcedProperty = minconfig.get("steel", "steelreinforcedLevel", 2);
		steelreinforcedProperty.comment = "sets the reinforced level of steel";
		steelreinforced = steelreinforcedProperty.getInt();
		steelreinforcedProperty.set(steelreinforced);

		Property steelstoneboundProperty = minconfig.get("steel", "steelstonebound", 0);
		steelstoneboundProperty.comment = "sets the stonebound level of steel";
		steelstonebound = (float) steelstoneboundProperty.getDouble(0);
		steelstoneboundProperty.set(steelstonebound);

		// PigIron
		ConfigCategory pigironCategory = minconfig.getCategory("pigiron");
		pigironCategory.setComment("Setup base stats of pigiron");

		Property pigironharvestLevelProperty = minconfig.get("pigiron", "pigironLevel", 4);
		pigironharvestLevelProperty.comment = "sets the harvest level of Pig Iron";
		pigironharvestLevel = pigironharvestLevelProperty.getInt();
		pigironharvestLevelProperty.set(pigironharvestLevel);

		Property pigirondurabilityProperty = minconfig.get("pigiron", "pigirondurability", 250);
		pigirondurabilityProperty.comment = "sets the base durability of Pig Iron";
		pigirondurability = pigirondurabilityProperty.getInt(250);
		pigirondurabilityProperty.set(pigirondurability);

		Property pigironminingspeedProperty = minconfig.get("pigiron", "pigironminingspeed", 600);
		pigironminingspeedProperty.comment = "sets the mining speed of Pig Iron";
		pigironminingspeed = pigironminingspeedProperty.getInt(600);
		pigironminingspeedProperty.set(pigironminingspeed);

		Property pigironattackProperty = minconfig.get("pigiron", "pigironattack", 3);
		pigironattackProperty.comment = "sets the attack of Pig Iron";
		pigironattack = pigironattackProperty.getInt();
		pigironattackProperty.set(pigironattack);

		Property pigironhandleModifierProperty = minconfig.get("pigiron", "pigironhandleModifier", 1.3);
		pigironhandleModifierProperty.comment = "sets the handle modifier of Pig Iron";
		pigironhandleModifier = (float) pigironhandleModifierProperty.getDouble(1.3);
		pigironhandleModifierProperty.set(pigironhandleModifier);

		Property pigironreinforcedProperty = minconfig.get("pigiron", "pigironreinforcedLevel", 1);
		pigironreinforcedProperty.comment = "sets the reinforced level of Pig Iron";
		pigironreinforced = pigironreinforcedProperty.getInt();
		pigironreinforcedProperty.set(pigironreinforced);

		Property pigironstoneboundProperty = minconfig.get("pigiron", "pigironstonebound", 0);
		pigironstoneboundProperty.comment = "sets the stonebound level of pig iron";
		pigironstonebound = (float) pigironstoneboundProperty.getDouble(0);
		pigironstoneboundProperty.set(pigironstonebound);

		// Obsidian
		ConfigCategory obsidianCategory = minconfig.getCategory("obsidian");
		obsidianCategory.setComment("Setup base stats of obsidian");

		Property obsidianharvestLevelProperty = minconfig.get("obsidian", "obsidianLevel", 5);
		obsidianharvestLevelProperty.comment = "sets the harvest level of obsidian";
		obsidianharvestLevel = obsidianharvestLevelProperty.getInt();
		obsidianharvestLevelProperty.set(obsidianharvestLevel);

		Property obsidiandurabilityProperty = minconfig.get("obsidian", "obsidiandurability", 89);
		obsidiandurabilityProperty.comment = "sets the base durability of obsidian";
		obsidiandurability = obsidiandurabilityProperty.getInt(89);
		obsidiandurabilityProperty.set(obsidiandurability);

		Property obsidianminingspeedProperty = minconfig.get("obsidian", "obsidianminingspeed", 700);
		obsidianminingspeedProperty.comment = "sets the mining speed of obsidian";
		obsidianminingspeed = obsidianminingspeedProperty.getInt(700);
		obsidianminingspeedProperty.set(obsidianminingspeed);

		Property obsidianattackProperty = minconfig.get("obsidian", "obsidianattack", 3);
		obsidianattackProperty.comment = "sets the attack of obsidian";
		obsidianattack = obsidianattackProperty.getInt();
		obsidianattackProperty.set(obsidianattack);

		Property obsidianhandleModifierProperty = minconfig.get("obsidian", "obsidianhandleModifier", 0.8);
		obsidianhandleModifierProperty.comment = "sets the handle modifier of obsidian";
		obsidianhandleModifier = (float) obsidianhandleModifierProperty.getDouble(0.8);
		obsidianhandleModifierProperty.set(obsidianhandleModifier);

		Property obsidianreinforcedProperty = minconfig.get("obsidian", "obsidianreinforcedLevel", 3);
		obsidianreinforcedProperty.comment = "sets the reinforced level of obsidian";
		obsidianreinforced = obsidianreinforcedProperty.getInt();
		obsidianreinforcedProperty.set(obsidianreinforced);

		Property obsidianstoneboundProperty = minconfig.get("obsidian", "obsidianstonebound", 0);
		obsidianstoneboundProperty.comment = "sets the stonebound level of obsidian";
		obsidianstonebound = (float) obsidianstoneboundProperty.getDouble(0);
		obsidianstoneboundProperty.set(obsidianstonebound);

		// Alumite
		ConfigCategory alumiteCategory = minconfig.getCategory("alumite");
		alumiteCategory.setComment("Setup base stats of alumite");

		Property alumiteharvestLevelProperty = minconfig.get("alumite", "alumiteLevel", 5);
		alumiteharvestLevelProperty.comment = "sets the harvest level of alumite";
		alumiteharvestLevel = alumiteharvestLevelProperty.getInt();
		alumiteharvestLevelProperty.set(alumiteharvestLevel);

		Property alumitedurabilityProperty = minconfig.get("alumite", "alumitedurability", 550);
		alumitedurabilityProperty.comment = "sets the base durability of alumite";
		alumitedurability = alumitedurabilityProperty.getInt(550);
		alumitedurabilityProperty.set(alumitedurability);

		Property alumiteminingspeedProperty = minconfig.get("alumite", "miningspeed", 800);
		alumiteminingspeedProperty.comment = "sets the mining speed of ";
		alumiteminingspeed = alumiteminingspeedProperty.getInt(800);
		alumiteminingspeedProperty.set(alumiteminingspeed);

		Property alumiteattackProperty = minconfig.get("alumite", "alumiteattack", 4);
		alumiteattackProperty.comment = "sets the attack of alumite";
		alumiteattack = alumiteattackProperty.getInt();
		alumiteattackProperty.set(alumiteattack);

		Property alumitehandleModifierProperty = minconfig.get("alumite", "alumitehandleModifier", 1.3);
		alumitehandleModifierProperty.comment = "sets the handle modifier of alumite";
		alumitehandleModifier = (float) alumitehandleModifierProperty.getDouble(1.3);
		alumitehandleModifierProperty.set(alumitehandleModifier);

		Property alumitereinforcedProperty = minconfig.get("alumite", "alumitereinforcedLevel", 2);
		alumitereinforcedProperty.comment = "sets the reinforced level of alumite";
		alumitereinforced = alumitereinforcedProperty.getInt();
		alumitereinforcedProperty.set(alumitereinforced);

		Property alumitestoneboundProperty = minconfig.get("alumite", "alumitestonebound", 0);
		alumitestoneboundProperty.comment = "sets the stonebound level of ";
		alumitestonebound = (float) alumitestoneboundProperty.getDouble(0);
		alumitestoneboundProperty.set(alumitestonebound);

		// Ardite
		ConfigCategory arditeCategory = minconfig.getCategory("ardite");
		arditeCategory.setComment("Setup base stats of ardite");

		Property arditeharvestLevelProperty = minconfig.get("ardite", "arditeLevel", 6);
		arditeharvestLevelProperty.comment = "sets the harvest level of ardite";
		arditeharvestLevel = arditeharvestLevelProperty.getInt();
		arditeharvestLevelProperty.set(arditeharvestLevel);

		Property arditedurabilityProperty = minconfig.get("ardite", "arditedurability", 600);
		arditedurabilityProperty.comment = "sets the base durability of ardite";
		arditedurability = arditedurabilityProperty.getInt(600);
		arditedurabilityProperty.set(arditedurability);

		Property arditeminingspeedProperty = minconfig.get("ardite", "arditeminingspeed", 800);
		arditeminingspeedProperty.comment = "sets the mining speed of ardite";
		arditeminingspeed = arditeminingspeedProperty.getInt(800);
		arditeminingspeedProperty.set(arditeminingspeed);

		Property arditeattackProperty = minconfig.get("ardite", "arditeattack", 4);
		arditeattackProperty.comment = "sets the attack of ardite";
		arditeattack = arditeattackProperty.getInt();
		arditeattackProperty.set(arditeattack);

		Property arditehandleModifierProperty = minconfig.get("ardite", "arditehandleModifier", 2.0);
		arditehandleModifierProperty.comment = "sets the handle modifier of ";
		arditehandleModifier = (float) arditehandleModifierProperty.getDouble(2);
		arditehandleModifierProperty.set(arditehandleModifier);

		Property arditereinforcedProperty = minconfig.get("ardite", "arditereinforcedLevel", 0);
		arditereinforcedProperty.comment = "sets the reinforced level of ardite";
		arditereinforced = arditereinforcedProperty.getInt();
		arditereinforcedProperty.set(arditereinforced);

		Property arditestoneboundProperty = minconfig.get("ardite", "arditestonebound", 2);
		arditestoneboundProperty.comment = "sets the stonebound level of ardite";
		arditestonebound = (float) arditestoneboundProperty.getDouble(2);
		arditestoneboundProperty.set(arditestonebound);

		// Cobalt
		ConfigCategory cobaltCategory = minconfig.getCategory("cobalt");
		cobaltCategory.setComment("Setup base stats of cobalt");

		Property cobaltharvestLevelProperty = minconfig.get("cobalt", "cobaltLevel", 7);
		cobaltharvestLevelProperty.comment = "sets the harvest level of cobalt";
		cobaltharvestLevel = cobaltharvestLevelProperty.getInt();
		cobaltharvestLevelProperty.set(cobaltharvestLevel);

		Property cobaltdurabilityProperty = minconfig.get("cobalt", "cobaltdurability", 800);
		cobaltdurabilityProperty.comment = "sets the base durability of cobalt";
		cobaltdurability = cobaltdurabilityProperty.getInt(800);
		cobaltdurabilityProperty.set(cobaltdurability);

		Property cobaltminingspeedProperty = minconfig.get("cobalt", "cobaltminingspeed", 1100);
		cobaltminingspeedProperty.comment = "sets the mining speed of cobalt";
		cobaltminingspeed = cobaltminingspeedProperty.getInt(1100);
		cobaltminingspeedProperty.set(cobaltminingspeed);

		Property cobaltattackProperty = minconfig.get("cobalt", "cobaltattack", 4);
		cobaltattackProperty.comment = "sets the attack of cobalt";
		cobaltattack = cobaltattackProperty.getInt();
		cobaltattackProperty.set(cobaltattack);

		Property cobalthandleModifierProperty = minconfig.get("cobalt", "cobalthandleModifier", 1.75);
		cobalthandleModifierProperty.comment = "sets the handle modifier of ";
		cobalthandleModifier = (float) cobalthandleModifierProperty.getDouble(1.75);
		cobalthandleModifierProperty.set(cobalthandleModifier);

		Property cobaltreinforcedProperty = minconfig.get("cobalt", "cobaltreinforcedLevel", 2);
		cobaltreinforcedProperty.comment = "sets the reinforced level of cobalt";
		cobaltreinforced = cobaltreinforcedProperty.getInt();
		cobaltreinforcedProperty.set(cobaltreinforced);

		Property cobaltstoneboundProperty = minconfig.get("cobalt", "cobaltstonebound", 0);
		cobaltstoneboundProperty.comment = "sets the stonebound level of ";
		cobaltstonebound = (float) cobaltstoneboundProperty.getDouble(0);
		cobaltstoneboundProperty.set(cobaltstonebound);

		// Manyullyn
		ConfigCategory manyullynCategory = minconfig.getCategory("manyullyn");
		manyullynCategory.setComment("Setup base stats of manyullyn");

		Property manyullynharvestLevelProperty = minconfig.get("manyullyn", "manyullynLevel", 8);
		manyullynharvestLevelProperty.comment = "sets the harvest level of manyullyn";
		manyullynharvestLevel = manyullynharvestLevelProperty.getInt();
		manyullynharvestLevelProperty.set(manyullynharvestLevel);

		Property manyullyndurabilityProperty = minconfig.get("manyullyn", "manyullyndurability", 1200);
		manyullyndurabilityProperty.comment = "sets the base durability of manyullyn";
		manyullyndurability = manyullyndurabilityProperty.getInt(1200);
		manyullyndurabilityProperty.set(manyullyndurability);

		Property manyullynminingspeedProperty = minconfig.get("manyullyn", "manyullynminingspeed", 900);
		manyullynminingspeedProperty.comment = "sets the mining speed of manyullyn";
		manyullynminingspeed = manyullynminingspeedProperty.getInt(900);
		manyullynminingspeedProperty.set(manyullynminingspeed);

		Property manyullynattackProperty = minconfig.get("manyullyn", "manyullynattack", 5);
		manyullynattackProperty.comment = "sets the attack of manyullyn";
		manyullynattack = manyullynattackProperty.getInt();
		manyullynattackProperty.set(manyullynattack);

		Property manyullynhandleModifierProperty = minconfig.get("manyullyn", "manyullynhandleModifier", 2.5);
		manyullynhandleModifierProperty.comment = "sets the handle modifier of manyullyn";
		manyullynhandleModifier = (float) manyullynhandleModifierProperty.getDouble(2.5);
		manyullynhandleModifierProperty.set(manyullynhandleModifier);

		Property manyullynreinforcedProperty = minconfig.get("manyullyn", "manyullynreinforcedLevel", 0);
		manyullynreinforcedProperty.comment = "sets the reinforced level of manyullyn";
		manyullynreinforced = manyullynreinforcedProperty.getInt();
		manyullynreinforcedProperty.set(manyullynreinforced);

		Property manyullynstoneboundProperty = minconfig.get("manyullyn", "manyullynstonebound", 0);
		manyullynstoneboundProperty.comment = "sets the stonebound level of manyullyn";
		manyullynstonebound = (float) manyullynstoneboundProperty.getDouble(0);
		manyullynstoneboundProperty.set(manyullynstonebound);

		// Thaumium
		ConfigCategory thaumiumCategory = minconfig.getCategory("thaumium");
		thaumiumCategory.setComment("Setup base stats of thaumium");

		Property thaumiumharvestLevelProperty = minconfig.get("thaumium", "thaumiumLevel", 3);
		thaumiumharvestLevelProperty.comment = "sets the harvest level of thaumium";
		thaumiumharvestLevel = thaumiumharvestLevelProperty.getInt();
		thaumiumharvestLevelProperty.set(thaumiumharvestLevel);

		Property thaumiumdurabilityProperty = minconfig.get("thaumium", "thaumiumdurability", 200);
		thaumiumdurabilityProperty.comment = "sets the base durability of thaumium";
		thaumiumdurability = thaumiumdurabilityProperty.getInt(200);
		thaumiumdurabilityProperty.set(thaumiumdurability);

		Property thaumiumminingspeedProperty = minconfig.get("thaumium", "thaumiumminingspeed", 600);
		thaumiumminingspeedProperty.comment = "sets the mining speed of thaumium";
		thaumiumminingspeed = thaumiumminingspeedProperty.getInt(600);
		thaumiumminingspeedProperty.set(thaumiumminingspeed);

		Property thaumiumattackProperty = minconfig.get("thaumium", "thaumiumattack", 3);
		thaumiumattackProperty.comment = "sets the attack of thaumium";
		thaumiumattack = thaumiumattackProperty.getInt();
		thaumiumattackProperty.set(thaumiumattack);

		Property thaumiumhandleModifierProperty = minconfig.get("thaumium", "thaumiumhandleModifier", 1.3);
		thaumiumhandleModifierProperty.comment = "sets the handle modifier of thaumium";
		thaumiumhandleModifier = (float) thaumiumhandleModifierProperty.getDouble(1.3);
		thaumiumhandleModifierProperty.set(thaumiumhandleModifier);

		Property thaumiumreinforcedProperty = minconfig.get("thaumium", "reinforcedLevel", 0);
		thaumiumreinforcedProperty.comment = "sets the reinforced level of thaumium";
		thaumiumreinforced = thaumiumreinforcedProperty.getInt();
		thaumiumreinforcedProperty.set(thaumiumreinforced);

		Property thaumiumstoneboundProperty = minconfig.get("thaumium", "thaumiumstonebound", 0);
		thaumiumstoneboundProperty.comment = "sets the stonebound level of thaumium";
		thaumiumstonebound = (float) thaumiumstoneboundProperty.getDouble(0);
		thaumiumstoneboundProperty.set(thaumiumstonebound);

		//Extra TiC / Metallurgy materials
		if (Loader.isModLoaded("ExtraTiC"))
		{		if (Loader.isModLoaded("Metallurgy3Base"))
		{
		// Brass
		ConfigCategory brassCategory = minconfig.getCategory("brass");
		brassCategory.setComment("Setup base stats of brass");

		Property brassharvestLevelProperty = minconfig.get("brass", "brassLevel", 0);
		brassharvestLevelProperty.comment = "sets the harvest level of brass";
		brassharvestLevel = brassharvestLevelProperty.getInt();
		brassharvestLevelProperty.set(brassharvestLevel);

		Property brassdurabilityProperty = minconfig.get("brass", "brassdurability", 15);
		brassdurabilityProperty.comment = "sets the base durability of brass";
		brassdurability = brassdurabilityProperty.getInt();
		brassdurabilityProperty.set(brassdurability);

		Property brassminingspeedProperty = minconfig.get("brass", "brassminingspeed", 1200);
		brassminingspeedProperty.comment = "sets the mining speed of brass";
		brassminingspeed = brassminingspeedProperty.getInt();
		brassminingspeedProperty.set(brassminingspeed);

		Property brassattackProperty = minconfig.get("brass", "brassattack", 2);
		brassattackProperty.comment = "sets the attack of brass";
		brassattack = brassattackProperty.getInt();
		brassattackProperty.set(brassattack);

		Property brasshandleModifierProperty = minconfig.get("brass", "brasshandleModifier", 0.2);
		brasshandleModifierProperty.comment = "sets the handle modifier of brass";
		brasshandleModifier = (float) brasshandleModifierProperty.getDouble(0.2);
		brasshandleModifierProperty.set(brasshandleModifier);

		Property brassreinforcedProperty = minconfig.get("brass", "brassreinforcedLevel", 0);
		brassreinforcedProperty.comment = "sets the reinforced level of brass";
		brassreinforced = brassreinforcedProperty.getInt();
		brassreinforcedProperty.set(brassreinforced);

		Property brassstoneboundProperty = minconfig.get("brass", "brassstonebound", 0.0);
		brassstoneboundProperty.comment = "sets the stonebound level of brass";
		brassstonebound = (float) brassstoneboundProperty.getDouble(0);
		brassstoneboundProperty.set(brassstonebound);

		
		}

		if (Loader.isModLoaded("Natura"))
		{
			
		}

		if (Loader.isModLoaded("Mekanism"))
		{
			
		}
		// pokefennium
		ConfigCategory pokefenniumCategory = minconfig.getCategory("pokefennium");
		pokefenniumCategory.setComment("Setup base stats of pokefennium");

		Property pokefenniumharvestLevelProperty = minconfig.get("pokefennium", "pokefenniumLevel", 4);
		pokefenniumharvestLevelProperty.comment = "sets the harvest level of pokefennium";
		pokefenniumharvestLevel = pokefenniumharvestLevelProperty.getInt();
		pokefenniumharvestLevelProperty.set(pokefenniumharvestLevel);

		Property pokefenniumdurabilityProperty = minconfig.get("pokefennium", "pokefenniumdurability", 500);
		pokefenniumdurabilityProperty.comment = "sets the base durability of pokefennium";
		pokefenniumdurability = pokefenniumdurabilityProperty.getInt();
		pokefenniumdurabilityProperty.set(pokefenniumdurability);

		Property pokefenniumminingspeedProperty = minconfig.get("pokefennium", "pokefenniumminingspeed", 850);
		pokefenniumminingspeedProperty.comment = "sets the mining speed of pokefennium";
		pokefenniumminingspeed = pokefenniumminingspeedProperty.getInt();
		pokefenniumminingspeedProperty.set(pokefenniumminingspeed);

		Property pokefenniumattackProperty = minconfig.get("pokefennium", "pokefenniumattack", 2);
		pokefenniumattackProperty.comment = "sets the attack of pokefennium";
		pokefenniumattack = pokefenniumattackProperty.getInt();
		pokefenniumattackProperty.set(pokefenniumattack);

		Property pokefenniumhandleModifierProperty = minconfig.get("pokefennium", "pokefenniumhandleModifier", 1.5);
		pokefenniumhandleModifierProperty.comment = "sets the handle modifier of pokefennium";
		pokefenniumhandleModifier = (float) pokefenniumhandleModifierProperty.getDouble(1.5);
		pokefenniumhandleModifierProperty.set(pokefenniumhandleModifier);

		Property pokefenniumreinforcedProperty = minconfig.get("pokefennium", "pokefenniumreinforcedLevel", 0);
		pokefenniumreinforcedProperty.comment = "sets the reinforced level of pokefennium";
		pokefenniumreinforced = pokefenniumreinforcedProperty.getInt();
		pokefenniumreinforcedProperty.set(pokefenniumreinforced);

		Property pokefenniumstoneboundProperty = minconfig.get("pokefennium", "pokefenniumstonebound", 0.0);
		pokefenniumstoneboundProperty.comment = "sets the stonebound level of pokefennium";
		pokefenniumstonebound = (float) pokefenniumstoneboundProperty.getDouble(0);
		pokefenniumstoneboundProperty.set(pokefenniumstonebound);

		
		if (Loader.isModLoaded("AppliedEnergistics"))
		{
			
		}

		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			
		}
		}		/**
		// blank
		ConfigCategory Category = minconfig.getCategory("");
		Category.setComment("Setup base stats of ");

		Property harvestLevelProperty = minconfig.get("", "Level", );
		harvestLevelProperty.comment = "sets the harvest level of ";
		harvestLevel = harvestLevelProperty.getInt();
		harvestLevelProperty.set(harvestLevel);

		Property durabilityProperty = minconfig.get("", "durability", );
		durabilityProperty.comment = "sets the base durability of";
		durability = durabilityProperty.get();
		durabilityProperty.set(durability);

		Property miningspeedProperty = minconfig.get("", "miningspeed", );
		miningspeedProperty.comment = "sets the mining speed of ";
		miningspeed = miningspeedProperty.get();
		miningspeedProperty.set(miningspeed);

		Property attackProperty = minconfig.get("", "attack", );
		attackProperty.comment = "sets the attack of ";
		attack = attackProperty.getInt();
		attackProperty.set(attack);

		Property handleModifierProperty = minconfig.get("", "handleModifier", );
		handleModifierProperty.comment = "sets the handle modifier of ";
		handleModifier = (float) handleModifierProperty.getDouble();
		handleModifierProperty.set(handleModifier);

		Property reinforcedProperty = minconfig.get("", "reinforcedLevel", );
		reinforcedProperty.comment = "sets the reinforced level of ";
		reinforced = reinforcedProperty.getInt();
		reinforcedProperty.set(reinforced);

		Property stoneboundProperty = minconfig.get("", "stonebound", );
		stoneboundProperty.comment = "sets the stonebound level of ";
		stonebound = (float) stoneboundProperty.getDouble(0);
		stoneboundProperty.set(stonebound);
*/

		levelconfig.save();
		
	}

}
