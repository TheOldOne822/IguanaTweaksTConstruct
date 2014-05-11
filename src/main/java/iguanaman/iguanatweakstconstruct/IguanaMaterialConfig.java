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

public class IguanaMaterialConfig {


	//Wood
	public static int woodharvestLevel;
	public static int wooddurability;
	public static int woodminingspeed;
	public static int woodattack;
	public static float woodhandleModifier;
	public static int woodreinforced;
	public static float woodstonebound;
	
	//Cactus
	public static int cactusharvestLevel;
	public static int cactusdurability;
	public static int cactusminingspeed;
	public static int cactusattack;
	public static float cactushandleModifier;
	public static int cactusreinforced;
	public static float cactusstonebound;

	//Slime
	public static int slimeharvestLevel;
	public static int slimedurability;
	public static int slimeminingspeed;
	public static int slimeattack;
	public static float slimehandleModifier;
	public static int slimereinforced;
	public static float slimestonebound;
	
	//BlueSlime
	public static int blueslimeharvestLevel;
	public static int blueslimedurability;
	public static int blueslimeminingspeed;
	public static int blueslimeattack;
	public static float blueslimehandleModifier;
	public static int blueslimereinforced;
	public static float blueslimestonebound;
	
	//Paper
	public static int paperharvestLevel;
	public static int paperdurability;
	public static int paperminingspeed;
	public static int paperattack;
	public static float paperhandleModifier;
	public static int paperreinforced;
	public static float paperstonebound;
	
	//Stone
	public static int stoneharvestLevel;
	public static int stonedurability;
	public static int stoneminingspeed;
	public static int stoneattack;
	public static float stonehandleModifier;
	public static int stonereinforced;
	public static float stonestonebound;
	
	//Flint
	public static int flintharvestLevel;
	public static int flintdurability;
	public static int flintminingspeed;
	public static int flintattack;
	public static float flinthandleModifier;
	public static int flintreinforced;
	public static float flintstonebound;
	
	//Bone
	public static int boneharvestLevel;
	public static int bonedurability;
	public static int boneminingspeed;
	public static int boneattack;
	public static float bonehandleModifier;
	public static int bonereinforced;
	public static float bonestonebound;
	
	//Netherrack
	public static int netherrackharvestLevel;
	public static int netherrackdurability;
	public static int netherrackminingspeed;
	public static int netherrackattack;
	public static float netherrackhandleModifier;
	public static int netherrackreinforced;
	public static float netherrackstonebound;
	
	//Copper
	public static int copperharvestLevel;
	public static int copperdurability;
	public static int copperminingspeed;
	public static int copperattack;
	public static float copperhandleModifier;
	public static int copperreinforced;
	public static float copperstonebound;
	
	//Iron
	public static int ironharvestLevel;
	public static int irondurability;
	public static int ironminingspeed;
	public static int ironattack;
	public static float ironhandleModifier;
	public static int ironreinforced;
	public static float ironstonebound;
	
	//Bronze
	public static int bronzeharvestLevel;
	public static int bronzedurability;
	public static int bronzeminingspeed;
	public static int bronzeattack;
	public static float bronzehandleModifier;
	public static int bronzereinforced;
	public static float bronzestonebound;
	
	//Steel
	public static int steelharvestLevel;
	public static int steeldurability;
	public static int steelminingspeed;
	public static int steelattack;
	public static float steelhandleModifier;
	public static int steelreinforced;
	public static float steelstonebound;
	
	//PigIron
	public static int pigironharvestLevel;
	public static int pigirondurability;
	public static int pigironminingspeed;
	public static int pigironattack;
	public static float pigironhandleModifier;
	public static int pigironreinforced;
	public static float pigironstonebound;
	
	//Obsidian
	public static int obsidianharvestLevel;
	public static int obsidiandurability;
	public static int obsidianminingspeed;
	public static int obsidianattack;
	public static float obsidianhandleModifier;
	public static int obsidianreinforced;
	public static float obsidianstonebound;
	
	//Alumite
	public static int alumiteharvestLevel;
	public static int alumitedurability;
	public static int alumiteminingspeed;
	public static int alumiteattack;
	public static float alumitehandleModifier;
	public static int alumitereinforced;
	public static float alumitestonebound;
	
	//Ardite
	public static int arditeharvestLevel;
	public static int arditedurability;
	public static int arditeminingspeed;
	public static int arditeattack;
	public static float arditehandleModifier;
	public static int arditereinforced;
	public static float arditestonebound;
	
	//Cobalt
	public static int cobaltharvestLevel;
	public static int cobaltdurability;
	public static int cobaltminingspeed;
	public static int cobaltattack;
	public static float cobalthandleModifier;
	public static int cobaltreinforced;
	public static float cobaltstonebound;

	//Manyullyn
	public static int manyullynharvestLevel;
	public static int manyullyndurability;
	public static int manyullynminingspeed;
	public static int manyullynattack;
	public static float manyullynhandleModifier;
	public static int manyullynreinforced;
	public static float manyullynstonebound;
	
	//Thaumium
	public static int thaumiumharvestLevel;
	public static int thaumiumdurability;
	public static int thaumiumminingspeed;
	public static int thaumiumattack;
	public static float thaumiumhandleModifier;
	public static int thaumiumreinforced;
	public static float thaumiumstonebound;
	
	//brass
	public static int brassharvestLevel;
	public static int brassdurability;
	public static int brassminingspeed;
	public static int brassattack;
	public static float brasshandleModifier;
	public static int brassreinforced;
	public static float brassstonebound;

	//electrum
	public static int electrumharvestLevel;
	public static int electrumdurability;
	public static int electrumminingspeed;
	public static int electrumattack;
	public static float electrumhandleModifier;
	public static int electrumreinforced;
	public static float electrumstonebound;

	
	
	
	//bloodwood
	public static int bloodwoodharvestLevel;
	public static int bloodwooddurability;
	public static int bloodwoodminingspeed;
	public static int bloodwoodattack;
	public static float bloodwoodhandleModifier;
	public static int bloodwoodreinforced;
	public static float bloodwoodstonebound;

	//darkwood
	public static int darkwoodharvestLevel;
	public static int darkwooddurability;
	public static int darkwoodminingspeed;
	public static int darkwoodattack;
	public static float darkwoodhandleModifier;
	public static int darkwoodreinforced;
	public static float darkwoodstonebound;

	//fusewood
	public static int fusewoodharvestLevel;
	public static int fusewooddurability;
	public static int fusewoodminingspeed;
	public static int fusewoodattack;
	public static float fusewoodhandleModifier;
	public static int fusewoodreinforced;
	public static float fusewoodstonebound;

	//ghostwood
	public static int ghostwoodharvestLevel;
	public static int ghostwooddurability;
	public static int ghostwoodminingspeed;
	public static int ghostwoodattack;
	public static float ghostwoodhandleModifier;
	public static int ghostwoodreinforced;
	public static float ghostwoodstonebound;

	//netherQuartz
	public static int netherQuartzharvestLevel;
	public static int netherQuartzdurability;
	public static int netherQuartzminingspeed;
	public static int netherQuartzattack;
	public static float netherQuartzhandleModifier;
	public static int netherQuartzreinforced;
	public static float netherQuartzstonebound;

	//refinedGlowstone
	public static int refinedGlowstoneharvestLevel;
	public static int refinedGlowstonedurability;
	public static int refinedGlowstoneminingspeed;
	public static int refinedGlowstoneattack;
	public static float refinedGlowstonehandleModifier;
	public static int refinedGlowstonereinforced;
	public static float refinedGlowstonestonebound;

	//osmium
	public static int osmiumharvestLevel;
	public static int osmiumdurability;
	public static int osmiumminingspeed;
	public static int osmiumattack;
	public static float osmiumhandleModifier;
	public static int osmiumreinforced;
	public static float osmiumstonebound;

	//pokefennium
	public static int pokefenniumharvestLevel;
	public static int pokefenniumdurability;
	public static int pokefenniumminingspeed;
	public static int pokefenniumattack;
	public static float pokefenniumhandleModifier;
	public static int pokefenniumreinforced;
	public static float pokefenniumstonebound;
	
	//fairy
	public static int fairyharvestLevel;
	public static int fairydurability;
	public static int fairyminingspeed;
	public static int fairyattack;
	public static float fairyhandleModifier;
	public static int fairyreinforced;
	public static float fairystonebound;

	//certusQuartz
	public static int certusQuartzharvestLevel;
	public static int certusQuartzdurability;
	public static int certusQuartzminingspeed;
	public static int certusQuartzattack;
	public static float certusQuartzhandleModifier;
	public static int certusQuartzreinforced;
	public static float certusQuartzstonebound;

	//amethyst
	public static int amethystharvestLevel;
	public static int amethystdurability;
	public static int amethystminingspeed;
	public static int amethystattack;
	public static float amethysthandleModifier;
	public static int amethystreinforced;
	public static float amethyststonebound;

	public static void init()
	{
		File installDir = new File("config");
		File configDir = new File(installDir, "TConstruct Tweaks");
		Configuration minconfig = new Configuration(new File(configDir, "Material Config.cfg"));
		minconfig.load();

		// wood
		ConfigCategory woodCategory = minconfig.getCategory("wood");
		woodCategory.setComment("Setup base stats of wood");

		Property woodharvestLevelProperty = minconfig.get("wood", "woodHarvestLevel", 0);
		woodharvestLevelProperty.comment = "sets the harvest level of wood";
		woodharvestLevel = woodharvestLevelProperty.getInt(0);
		woodharvestLevelProperty.set(woodharvestLevel);

		Property wooddurabilityProperty = minconfig.get("wood", "wooddurability", 59);
		wooddurabilityProperty.comment = "sets the base durability of wood";
		wooddurability = wooddurabilityProperty.getInt();
		wooddurabilityProperty.set(wooddurability);

		Property woodminingspeedProperty = minconfig.get("wood", "woodminingspeed", 150);
		woodminingspeedProperty.comment = "sets the mining speed of wood";
		woodminingspeed = woodminingspeedProperty.getInt(150);
		woodminingspeedProperty.set(woodminingspeed);

		Property woodattackProperty = minconfig.get("wood", "woodattack", 1);
		woodattackProperty.comment = "sets the attack of wood";
		woodattack = woodattackProperty.getInt(1);
		woodattackProperty.set(woodattack);

		Property woodhandleModifierProperty = minconfig.get("wood", "woodhandleModifier", 1.0);
		woodhandleModifierProperty.comment = "sets the handle modifier of wood";
		woodhandleModifier = (float) woodhandleModifierProperty.getDouble(1.0);
		woodhandleModifierProperty.set(woodhandleModifier);

		Property woodreinforcedProperty = minconfig.get("wood", "woodreinforcedLevel", 0);
		woodreinforcedProperty.comment = "sets the reinforced level of wood";
		woodreinforced = woodreinforcedProperty.getInt(0);
		woodreinforcedProperty.set(woodreinforced);

		Property woodstoneboundProperty = minconfig.get("wood", "woodstonebound", 0);
		woodstoneboundProperty.comment = "sets the stonebound level of wood";
		woodstonebound = (float) woodstoneboundProperty.getDouble(0);
		woodstoneboundProperty.set(woodstonebound);

		// cactus
		ConfigCategory cactusCategory = minconfig.getCategory("cactus");
		cactusCategory.setComment("Setup base stats of cactus");

		Property cactusharvestLevelProperty = minconfig.get("cactus", "cactusHarvestLevel", 0);
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

		Property slimeharvestLevelProperty = minconfig.get("slime", "slimeHarvestLevel", 0);
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

		Property blueslimeharvestLevelProperty = minconfig.get("blueslime", "blueslimeHarvestLevel", 0);
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

		Property paperharvestLevelProperty = minconfig.get("paper", "paperHarvestLevel", 0);
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

		Property stoneharvestLevelProperty = minconfig.get("stone", "stoneHarvestLevel", 0);
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

		Property flintharvestLevelProperty = minconfig.get("flint", "flintHarvestLevel", 1);
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

		Property boneharvestLevelProperty = minconfig.get("bone", "boneHarvestLevel", 1);
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

		Property netherrackharvestLevelProperty = minconfig.get("netherrack", "netherrackHarvestLevel", 0);
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

		Property copperharvestLevelProperty = minconfig.get("copper", "copperHarvestLevel", 1);
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

		Property ironharvestLevelProperty = minconfig.get("iron", "ironHarvestLevel", 3);
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

		Property bronzeharvestLevelProperty = minconfig.get("bronze", "bronzeHarvestLevel", 4);
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

		Property steelharvestLevelProperty = minconfig.get("steel", "steelHarvestLevel", 4);
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

		Property pigironharvestLevelProperty = minconfig.get("pigiron", "pigironHarvestLevel", 4);
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

		Property obsidianharvestLevelProperty = minconfig.get("obsidian", "obsidianHarvestLevel", 5);
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

		Property alumiteharvestLevelProperty = minconfig.get("alumite", "alumiteHarvestLevel", 5);
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

		Property arditeharvestLevelProperty = minconfig.get("ardite", "arditeHarvestLevel", 6);
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

		Property cobaltharvestLevelProperty = minconfig.get("cobalt", "cobaltHarvestLevel", 7);
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

		Property manyullynharvestLevelProperty = minconfig.get("manyullyn", "manyullynHarvestLevel", 8);
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

		Property thaumiumharvestLevelProperty = minconfig.get("thaumium", "thaumiumHarvestLevel", 3);
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

		Property brassharvestLevelProperty = minconfig.get("brass", "brassHarvestLevel", 0);
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

		// electrum
		ConfigCategory electrumCategory = minconfig.getCategory("electrum");
		electrumCategory.setComment("Setup base stats of electrum");

		Property electrumharvestLevelProperty = minconfig.get("electrum", "electrumHarvestLevel", 0);
		electrumharvestLevelProperty.comment = "sets the harvest level of electrum";
		electrumharvestLevel = electrumharvestLevelProperty.getInt();
		electrumharvestLevelProperty.set(electrumharvestLevel);

		Property electrumdurabilityProperty = minconfig.get("electrum", "electrumdurability", 100);
		electrumdurabilityProperty.comment = "sets the base durability of electrum";
		electrumdurability = electrumdurabilityProperty.getInt();
		electrumdurabilityProperty.set(electrumdurability);

		Property electrumminingspeedProperty = minconfig.get("electrum", "electrumminingspeed", 2000);
		electrumminingspeedProperty.comment = "sets the mining speed of electrum";
		electrumminingspeed = electrumminingspeedProperty.getInt();
		electrumminingspeedProperty.set(electrumminingspeed);

		Property electrumattackProperty = minconfig.get("electrum", "electrumattack", 2);
		electrumattackProperty.comment = "sets the attack of electrum";
		electrumattack = electrumattackProperty.getInt();
		electrumattackProperty.set(electrumattack);

		Property electrumhandleModifierProperty = minconfig.get("electrum", "electrumhandleModifier", 0.75);
		electrumhandleModifierProperty.comment = "sets the handle modifier of electrum";
		electrumhandleModifier = (float) electrumhandleModifierProperty.getDouble(0.75);
		electrumhandleModifierProperty.set(electrumhandleModifier);

		Property electrumreinforcedProperty = minconfig.get("electrum", "electrumreinforcedLevel", 0);
		electrumreinforcedProperty.comment = "sets the reinforced level of electrum";
		electrumreinforced = electrumreinforcedProperty.getInt();
		electrumreinforcedProperty.set(electrumreinforced);

		Property electrumstoneboundProperty = minconfig.get("electrum", "electrumstonebound", 0.0);
		electrumstoneboundProperty.comment = "sets the stonebound level of electrum";
		electrumstonebound = (float) electrumstoneboundProperty.getDouble(0);
		electrumstoneboundProperty.set(electrumstonebound);
		
		}

		if (Loader.isModLoaded("Natura"))
		{
			// bloodwood
			ConfigCategory bloodwoodCategory = minconfig.getCategory("bloodwood");
			bloodwoodCategory.setComment("Setup base stats of bloodwood");

			Property bloodwoodharvestLevelProperty = minconfig.get("bloodwood", "bloodwoodHarvestLevel", 3);
			bloodwoodharvestLevelProperty.comment = "sets the harvest level of bloodwood";
			bloodwoodharvestLevel = bloodwoodharvestLevelProperty.getInt();
			bloodwoodharvestLevelProperty.set(bloodwoodharvestLevel);

			Property bloodwooddurabilityProperty = minconfig.get("bloodwood", "bloodwooddurability", 350);
			bloodwooddurabilityProperty.comment = "sets the base durability of bloodwood";
			bloodwooddurability = bloodwooddurabilityProperty.getInt();
			bloodwooddurabilityProperty.set(bloodwooddurability);

			Property bloodwoodminingspeedProperty = minconfig.get("bloodwood", "bloodwoodminingspeed", 700);
			bloodwoodminingspeedProperty.comment = "sets the mining speed of bloodwood";
			bloodwoodminingspeed = bloodwoodminingspeedProperty.getInt();
			bloodwoodminingspeedProperty.set(bloodwoodminingspeed);

			Property bloodwoodattackProperty = minconfig.get("bloodwood", "bloodwoodattack", 3);
			bloodwoodattackProperty.comment = "sets the attack of bloodwood";
			bloodwoodattack = bloodwoodattackProperty.getInt();
			bloodwoodattackProperty.set(bloodwoodattack);

			Property bloodwoodhandleModifierProperty = minconfig.get("bloodwood", "bloodwoodhandleModifier", 1.5);
			bloodwoodhandleModifierProperty.comment = "sets the handle modifier of bloodwood";
			bloodwoodhandleModifier = (float) bloodwoodhandleModifierProperty.getDouble(1.5);
			bloodwoodhandleModifierProperty.set(bloodwoodhandleModifier);

			Property bloodwoodreinforcedProperty = minconfig.get("bloodwood", "bloodwoodreinforcedLevel", 0);
			bloodwoodreinforcedProperty.comment = "sets the reinforced level of bloodwood";
			bloodwoodreinforced = bloodwoodreinforcedProperty.getInt();
			bloodwoodreinforcedProperty.set(bloodwoodreinforced);

			Property bloodwoodstoneboundProperty = minconfig.get("bloodwood", "bloodwoodstonebound", 0.0);
			bloodwoodstoneboundProperty.comment = "sets the stonebound level of bloodwood";
			bloodwoodstonebound = (float) bloodwoodstoneboundProperty.getDouble(0);
			bloodwoodstoneboundProperty.set(bloodwoodstonebound);

			// darkwood
			ConfigCategory darkwoodCategory = minconfig.getCategory("darkwood");
			darkwoodCategory.setComment("Setup base stats of darkwood");

			Property darkwoodharvestLevelProperty = minconfig.get("darkwood", "darkwoodHarvestLevel", 1);
			darkwoodharvestLevelProperty.comment = "sets the harvest level of darkwood";
			darkwoodharvestLevel = darkwoodharvestLevelProperty.getInt();
			darkwoodharvestLevelProperty.set(darkwoodharvestLevel);

			Property darkwooddurabilityProperty = minconfig.get("darkwood", "darkwooddurability", 131);
			darkwooddurabilityProperty.comment = "sets the base durability of darkwood";
			darkwooddurability = darkwooddurabilityProperty.getInt();
			darkwooddurabilityProperty.set(darkwooddurability);

			Property darkwoodminingspeedProperty = minconfig.get("darkwood", "darkwoodminingspeed", 400);
			darkwoodminingspeedProperty.comment = "sets the mining speed of darkwood";
			darkwoodminingspeed = darkwoodminingspeedProperty.getInt();
			darkwoodminingspeedProperty.set(darkwoodminingspeed);

			Property darkwoodattackProperty = minconfig.get("darkwood", "darkwoodattack", 1);
			darkwoodattackProperty.comment = "sets the attack of darkwood";
			darkwoodattack = darkwoodattackProperty.getInt();
			darkwoodattackProperty.set(darkwoodattack);

			Property darkwoodhandleModifierProperty = minconfig.get("darkwood", "darkwoodhandleModifier", 1.7);
			darkwoodhandleModifierProperty.comment = "sets the handle modifier of darkwood";
			darkwoodhandleModifier = (float) darkwoodhandleModifierProperty.getDouble(1.7);
			darkwoodhandleModifierProperty.set(darkwoodhandleModifier);

			Property darkwoodreinforcedProperty = minconfig.get("darkwood", "darkwoodreinforcedLevel", 0);
			darkwoodreinforcedProperty.comment = "sets the reinforced level of darkwood";
			darkwoodreinforced = darkwoodreinforcedProperty.getInt();
			darkwoodreinforcedProperty.set(darkwoodreinforced);

			Property darkwoodstoneboundProperty = minconfig.get("darkwood", "darkwoodstonebound", 0.0);
			darkwoodstoneboundProperty.comment = "sets the stonebound level of darkwood";
			darkwoodstonebound = (float) darkwoodstoneboundProperty.getDouble(0);
			darkwoodstoneboundProperty.set(darkwoodstonebound);

			// fusewood
			ConfigCategory fusewoodCategory = minconfig.getCategory("fusewood");
			fusewoodCategory.setComment("Setup base stats of fusewood");

			Property fusewoodharvestLevelProperty = minconfig.get("fusewood", "fusewoodHarvestLevel", 2);
			fusewoodharvestLevelProperty.comment = "sets the harvest level of fusewood";
			fusewoodharvestLevel = fusewoodharvestLevelProperty.getInt();
			fusewoodharvestLevelProperty.set(fusewoodharvestLevel);

			Property fusewooddurabilityProperty = minconfig.get("fusewood", "fusewooddurability", 250);
			fusewooddurabilityProperty.comment = "sets the base durability of fusewood";
			fusewooddurability = fusewooddurabilityProperty.getInt();
			fusewooddurabilityProperty.set(fusewooddurability);

			Property fusewoodminingspeedProperty = minconfig.get("fusewood", "fusewoodminingspeed", 600);
			fusewoodminingspeedProperty.comment = "sets the mining speed of fusewood";
			fusewoodminingspeed = fusewoodminingspeedProperty.getInt();
			fusewoodminingspeedProperty.set(fusewoodminingspeed);

			Property fusewoodattackProperty = minconfig.get("fusewood", "fusewoodattack", 2);
			fusewoodattackProperty.comment = "sets the attack of fusewood";
			fusewoodattack = fusewoodattackProperty.getInt();
			fusewoodattackProperty.set(fusewoodattack);

			Property fusewoodhandleModifierProperty = minconfig.get("fusewood", "fusewoodhandleModifier", 1.4);
			fusewoodhandleModifierProperty.comment = "sets the handle modifier of fusewood";
			fusewoodhandleModifier = (float) fusewoodhandleModifierProperty.getDouble(1.4);
			fusewoodhandleModifierProperty.set(fusewoodhandleModifier);

			Property fusewoodreinforcedProperty = minconfig.get("fusewood", "fusewoodreinforcedLevel", 0);
			fusewoodreinforcedProperty.comment = "sets the reinforced level of fusewood";
			fusewoodreinforced = fusewoodreinforcedProperty.getInt();
			fusewoodreinforcedProperty.set(fusewoodreinforced);

			Property fusewoodstoneboundProperty = minconfig.get("fusewood", "fusewoodstonebound", 0.0);
			fusewoodstoneboundProperty.comment = "sets the stonebound level of fusewood";
			fusewoodstonebound = (float) fusewoodstoneboundProperty.getDouble(0);
			fusewoodstoneboundProperty.set(fusewoodstonebound);

			// ghostwood
			ConfigCategory ghostwoodCategory = minconfig.getCategory("ghostwood");
			ghostwoodCategory.setComment("Setup base stats of ghostwood");

			Property ghostwoodharvestLevelProperty = minconfig.get("ghostwood", "ghostwoodHarvestLevel", 1);
			ghostwoodharvestLevelProperty.comment = "sets the harvest level of ghostwood";
			ghostwoodharvestLevel = ghostwoodharvestLevelProperty.getInt();
			ghostwoodharvestLevelProperty.set(ghostwoodharvestLevel);

			Property ghostwooddurabilityProperty = minconfig.get("ghostwood", "ghostwooddurability", 131);
			ghostwooddurabilityProperty.comment = "sets the base durability of ghostwood";
			ghostwooddurability = ghostwooddurabilityProperty.getInt();
			ghostwooddurabilityProperty.set(ghostwooddurability);

			Property ghostwoodminingspeedProperty = minconfig.get("ghostwood", "ghostwoodminingspeed", 400);
			ghostwoodminingspeedProperty.comment = "sets the mining speed of ghostwood";
			ghostwoodminingspeed = ghostwoodminingspeedProperty.getInt();
			ghostwoodminingspeedProperty.set(ghostwoodminingspeed);

			Property ghostwoodattackProperty = minconfig.get("ghostwood", "ghostwoodattack", 1);
			ghostwoodattackProperty.comment = "sets the attack of ghostwood";
			ghostwoodattack = ghostwoodattackProperty.getInt();
			ghostwoodattackProperty.set(ghostwoodattack);

			Property ghostwoodhandleModifierProperty = minconfig.get("ghostwood", "ghostwoodhandleModifier", 1.3);
			ghostwoodhandleModifierProperty.comment = "sets the handle modifier of ghostwood";
			ghostwoodhandleModifier = (float) ghostwoodhandleModifierProperty.getDouble(1.3);
			ghostwoodhandleModifierProperty.set(ghostwoodhandleModifier);

			Property ghostwoodreinforcedProperty = minconfig.get("ghostwood", "ghostwoodreinforcedLevel", 0);
			ghostwoodreinforcedProperty.comment = "sets the reinforced level of ghostwood";
			ghostwoodreinforced = ghostwoodreinforcedProperty.getInt();
			ghostwoodreinforcedProperty.set(ghostwoodreinforced);

			Property ghostwoodstoneboundProperty = minconfig.get("ghostwood", "ghostwoodstonebound", 0.0);
			ghostwoodstoneboundProperty.comment = "sets the stonebound level of ghostwood";
			ghostwoodstonebound = (float) ghostwoodstoneboundProperty.getDouble(0);
			ghostwoodstoneboundProperty.set(ghostwoodstonebound);

			// netherQuartz
			ConfigCategory netherQuartzCategory = minconfig.getCategory("netherQuartz");
			netherQuartzCategory.setComment("Setup base stats of nether Quartz");

			Property netherQuartzharvestLevelProperty = minconfig.get("netherQuartz", "netherQuartzHarvestLevel", 1);
			netherQuartzharvestLevelProperty.comment = "sets the harvest level of nether Quartz";
			netherQuartzharvestLevel = netherQuartzharvestLevelProperty.getInt();
			netherQuartzharvestLevelProperty.set(netherQuartzharvestLevel);

			Property netherQuartzdurabilityProperty = minconfig.get("netherQuartz", "netherQuartzdurability", 101);
			netherQuartzdurabilityProperty.comment = "sets the base durability of nether Quartz";
			netherQuartzdurability = netherQuartzdurabilityProperty.getInt();
			netherQuartzdurabilityProperty.set(netherQuartzdurability);

			Property netherQuartzminingspeedProperty = minconfig.get("netherQuartz", "netherQuartzminingspeed", 300);
			netherQuartzminingspeedProperty.comment = "sets the mining speed of nether Quartz";
			netherQuartzminingspeed = netherQuartzminingspeedProperty.getInt();
			netherQuartzminingspeedProperty.set(netherQuartzminingspeed);

			Property netherQuartzattackProperty = minconfig.get("netherQuartz", "netherQuartzattack", 1);
			netherQuartzattackProperty.comment = "sets the attack of nether Quartz";
			netherQuartzattack = netherQuartzattackProperty.getInt();
			netherQuartzattackProperty.set(netherQuartzattack);

			Property netherQuartzhandleModifierProperty = minconfig.get("netherQuartz", "netherQuartzhandleModifier", 0.7);
			netherQuartzhandleModifierProperty.comment = "sets the handle modifier of nether Quartz";
			netherQuartzhandleModifier = (float) netherQuartzhandleModifierProperty.getDouble(0.7);
			netherQuartzhandleModifierProperty.set(netherQuartzhandleModifier);

			Property netherQuartzreinforcedProperty = minconfig.get("netherQuartz", "netherQuartzreinforcedLevel", 0);
			netherQuartzreinforcedProperty.comment = "sets the reinforced level of nether Quartz";
			netherQuartzreinforced = netherQuartzreinforcedProperty.getInt();
			netherQuartzreinforcedProperty.set(netherQuartzreinforced);

			Property netherQuartzstoneboundProperty = minconfig.get("netherQuartz", "netherQuartzstonebound", 0.0);
			netherQuartzstoneboundProperty.comment = "sets the stonebound level of nether Quartz";
			netherQuartzstonebound = (float) netherQuartzstoneboundProperty.getDouble(0);
			netherQuartzstoneboundProperty.set(netherQuartzstonebound);

		}

		if (Loader.isModLoaded("Mekanism"))
		{
			// refinedGlowstone
			ConfigCategory refinedGlowstoneCategory = minconfig.getCategory("refinedGlowstone");
			refinedGlowstoneCategory.setComment("Setup base stats of refined Glowstone");

			Property refinedGlowstoneharvestLevelProperty = minconfig.get("refinedGlowstone", "refinedGlowstoneHarvestLevel", 2);
			refinedGlowstoneharvestLevelProperty.comment = "sets the harvest level of refined Glowstone";
			refinedGlowstoneharvestLevel = refinedGlowstoneharvestLevelProperty.getInt();
			refinedGlowstoneharvestLevelProperty.set(refinedGlowstoneharvestLevel);

			Property refinedGlowstonedurabilityProperty = minconfig.get("refinedGlowstone", "refinedGlowstonedurability", 300);
			refinedGlowstonedurabilityProperty.comment = "sets the base durability of refined Glowstone";
			refinedGlowstonedurability = refinedGlowstonedurabilityProperty.getInt();
			refinedGlowstonedurabilityProperty.set(refinedGlowstonedurability);

			Property refinedGlowstoneminingspeedProperty = minconfig.get("refinedGlowstone", "refinedGlowstoneminingspeed", 1400);
			refinedGlowstoneminingspeedProperty.comment = "sets the mining speed of refined Glowstone";
			refinedGlowstoneminingspeed = refinedGlowstoneminingspeedProperty.getInt();
			refinedGlowstoneminingspeedProperty.set(refinedGlowstoneminingspeed);

			Property refinedGlowstoneattackProperty = minconfig.get("refinedGlowstone", "refinedGlowstoneattack", 5);
			refinedGlowstoneattackProperty.comment = "sets the attack of refined Glowstone";
			refinedGlowstoneattack = refinedGlowstoneattackProperty.getInt();
			refinedGlowstoneattackProperty.set(refinedGlowstoneattack);

			Property refinedGlowstonehandleModifierProperty = minconfig.get("refinedGlowstone", "refinedGlowstonehandleModifier", 1.75);
			refinedGlowstonehandleModifierProperty.comment = "sets the handle modifier of refined Glowstone";
			refinedGlowstonehandleModifier = (float) refinedGlowstonehandleModifierProperty.getDouble(1.75);
			refinedGlowstonehandleModifierProperty.set(refinedGlowstonehandleModifier);

			Property refinedGlowstonereinforcedProperty = minconfig.get("refinedGlowstone", "refinedGlowstonereinforcedLevel", 0);
			refinedGlowstonereinforcedProperty.comment = "sets the reinforced level of refined Glowstone";
			refinedGlowstonereinforced = refinedGlowstonereinforcedProperty.getInt();
			refinedGlowstonereinforcedProperty.set(refinedGlowstonereinforced);

			Property refinedGlowstonestoneboundProperty = minconfig.get("refinedGlowstone", "refinedGlowstonestonebound", 0.0);
			refinedGlowstonestoneboundProperty.comment = "sets the stonebound level of refined Glowstone";
			refinedGlowstonestonebound = (float) refinedGlowstonestoneboundProperty.getDouble(0);
			refinedGlowstonestoneboundProperty.set(refinedGlowstonestonebound);

			// osmium
			ConfigCategory osmiumCategory = minconfig.getCategory("osmium");
			osmiumCategory.setComment("Setup base stats of osmium");

			Property osmiumharvestLevelProperty = minconfig.get("osmium", "osmiumHarvestLevel", 2);
			osmiumharvestLevelProperty.comment = "sets the harvest level of osmium";
			osmiumharvestLevel = osmiumharvestLevelProperty.getInt();
			osmiumharvestLevelProperty.set(osmiumharvestLevel);

			Property osmiumdurabilityProperty = minconfig.get("osmium", "osmiumdurability", 500);
			osmiumdurabilityProperty.comment = "sets the base durability of osmium";
			osmiumdurability = osmiumdurabilityProperty.getInt();
			osmiumdurabilityProperty.set(osmiumdurability);

			Property osmiumminingspeedProperty = minconfig.get("osmium", "osmiumminingspeed", 1000);
			osmiumminingspeedProperty.comment = "sets the mining speed of osmium";
			osmiumminingspeed = osmiumminingspeedProperty.getInt();
			osmiumminingspeedProperty.set(osmiumminingspeed);

			Property osmiumattackProperty = minconfig.get("osmium", "osmiumattack", 4);
			osmiumattackProperty.comment = "sets the attack of osmium";
			osmiumattack = osmiumattackProperty.getInt();
			osmiumattackProperty.set(osmiumattack);

			Property osmiumhandleModifierProperty = minconfig.get("osmium", "osmiumhandleModifier", 1.3);
			osmiumhandleModifierProperty.comment = "sets the handle modifier of osmium";
			osmiumhandleModifier = (float) osmiumhandleModifierProperty.getDouble(1.3);
			osmiumhandleModifierProperty.set(osmiumhandleModifier);

			Property osmiumreinforcedProperty = minconfig.get("osmium", "osmiumreinforcedLevel", 0);
			osmiumreinforcedProperty.comment = "sets the reinforced level of osmium";
			osmiumreinforced = osmiumreinforcedProperty.getInt();
			osmiumreinforcedProperty.set(osmiumreinforced);

			Property osmiumstoneboundProperty = minconfig.get("osmium", "osmiumstonebound", 0.0);
			osmiumstoneboundProperty.comment = "sets the stonebound level of osmium";
			osmiumstonebound = (float) osmiumstoneboundProperty.getDouble(0);
			osmiumstoneboundProperty.set(osmiumstonebound);
		}

		// pokefennium
		ConfigCategory pokefenniumCategory = minconfig.getCategory("pokefennium");
		pokefenniumCategory.setComment("Setup base stats of pokefennium");

		Property pokefenniumharvestLevelProperty = minconfig.get("pokefennium", "pokefenniumHarvestLevel", 4);
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

		// fairy
		ConfigCategory fairyCategory = minconfig.getCategory("fairy");
		fairyCategory.setComment("Setup base stats of fairy");

		Property fairyharvestLevelProperty = minconfig.get("fairy", "fairyHarvestLevel", 4);
		fairyharvestLevelProperty.comment = "sets the harvest level of fairy";
		fairyharvestLevel = fairyharvestLevelProperty.getInt();
		fairyharvestLevelProperty.set(fairyharvestLevel);

		Property fairydurabilityProperty = minconfig.get("fairy", "fairydurability", 250);
		fairydurabilityProperty.comment = "sets the base durability of fairy";
		fairydurability = fairydurabilityProperty.getInt();
		fairydurabilityProperty.set(fairydurability);

		Property fairyminingspeedProperty = minconfig.get("fairy", "fairyminingspeed", 750);
		fairyminingspeedProperty.comment = "sets the mining speed of fairy";
		fairyminingspeed = fairyminingspeedProperty.getInt();
		fairyminingspeedProperty.set(fairyminingspeed);

		Property fairyattackProperty = minconfig.get("fairy", "fairyattack", 2);
		fairyattackProperty.comment = "sets the attack of fairy";
		fairyattack = fairyattackProperty.getInt();
		fairyattackProperty.set(fairyattack);

		Property fairyhandleModifierProperty = minconfig.get("fairy", "fairyhandleModifier", 1.2);
		fairyhandleModifierProperty.comment = "sets the handle modifier of fairy";
		fairyhandleModifier = (float) fairyhandleModifierProperty.getDouble(1.2);
		fairyhandleModifierProperty.set(fairyhandleModifier);

		Property fairyreinforcedProperty = minconfig.get("fairy", "fairyreinforcedLevel", 0);
		fairyreinforcedProperty.comment = "sets the reinforced level of fairy";
		fairyreinforced = fairyreinforcedProperty.getInt();
		fairyreinforcedProperty.set(fairyreinforced);

		Property fairystoneboundProperty = minconfig.get("fairy", "fairystonebound", 0.0);
		fairystoneboundProperty.comment = "sets the stonebound level of fairy";
		fairystonebound = (float) fairystoneboundProperty.getDouble(0);
		fairystoneboundProperty.set(fairystonebound);
		
		if (Loader.isModLoaded("AppliedEnergistics"))
		{
			// certusQuartz
			ConfigCategory certusQuartzCategory = minconfig.getCategory("certusQuartz");
			certusQuartzCategory.setComment("Setup base stats of certus Quartz");

			Property certusQuartzharvestLevelProperty = minconfig.get("certusQuartz", "certusQuartzHarvestLevel", 2);
			certusQuartzharvestLevelProperty.comment = "sets the harvest level of certus Quartz";
			certusQuartzharvestLevel = certusQuartzharvestLevelProperty.getInt();
			certusQuartzharvestLevelProperty.set(certusQuartzharvestLevel);

			Property certusQuartzdurabilityProperty = minconfig.get("certusQuartz", "certusQuartzdurability", 250);
			certusQuartzdurabilityProperty.comment = "sets the base durability of certus Quartz";
			certusQuartzdurability = certusQuartzdurabilityProperty.getInt();
			certusQuartzdurabilityProperty.set(certusQuartzdurability);

			Property certusQuartzminingspeedProperty = minconfig.get("certusQuartz", "certusQuartzminingspeed", 600);
			certusQuartzminingspeedProperty.comment = "sets the mining speed of certus Quartz";
			certusQuartzminingspeed = certusQuartzminingspeedProperty.getInt();
			certusQuartzminingspeedProperty.set(certusQuartzminingspeed);

			Property certusQuartzattackProperty = minconfig.get("certusQuartz", "certusQuartzattack", 2);
			certusQuartzattackProperty.comment = "sets the attack of certus Quartz";
			certusQuartzattack = certusQuartzattackProperty.getInt();
			certusQuartzattackProperty.set(certusQuartzattack);

			Property certusQuartzhandleModifierProperty = minconfig.get("certusQuartz", "certusQuartzhandleModifier", 1.4);
			certusQuartzhandleModifierProperty.comment = "sets the handle modifier of certus Quartz";
			certusQuartzhandleModifier = (float) certusQuartzhandleModifierProperty.getDouble(1.4);
			certusQuartzhandleModifierProperty.set(certusQuartzhandleModifier);

			Property certusQuartzreinforcedProperty = minconfig.get("certusQuartz", "certusQuartzreinforcedLevel", 0);
			certusQuartzreinforcedProperty.comment = "sets the reinforced level of certus Quartz";
			certusQuartzreinforced = certusQuartzreinforcedProperty.getInt();
			certusQuartzreinforcedProperty.set(certusQuartzreinforced);

			Property certusQuartzstoneboundProperty = minconfig.get("certusQuartz", "certusQuartzstonebound", 0.0);
			certusQuartzstoneboundProperty.comment = "sets the stonebound level of certus Quartz";
			certusQuartzstonebound = (float) certusQuartzstoneboundProperty.getDouble(0);
			certusQuartzstoneboundProperty.set(certusQuartzstonebound);
		}

		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			// amethyst
			ConfigCategory amethystCategory = minconfig.getCategory("amethyst");
			amethystCategory.setComment("Setup base stats of amethyst");

			Property amethystharvestLevelProperty = minconfig.get("amethyst", "amethystHarvestLevel", 4);
			amethystharvestLevelProperty.comment = "sets the harvest level of amethyst";
			amethystharvestLevel = amethystharvestLevelProperty.getInt();
			amethystharvestLevelProperty.set(amethystharvestLevel);

			Property amethystdurabilityProperty = minconfig.get("amethyst", "amethystdurability", 1548);
			amethystdurabilityProperty.comment = "sets the base durability of amethyst";
			amethystdurability = amethystdurabilityProperty.getInt();
			amethystdurabilityProperty.set(amethystdurability);

			Property amethystminingspeedProperty = minconfig.get("amethyst", "amethystminingspeed", 1500);
			amethystminingspeedProperty.comment = "sets the mining speed of amethyst";
			amethystminingspeed = amethystminingspeedProperty.getInt();
			amethystminingspeedProperty.set(amethystminingspeed);

			Property amethystattackProperty = minconfig.get("amethyst", "amethystattack", 5);
			amethystattackProperty.comment = "sets the attack of amethyst";
			amethystattack = amethystattackProperty.getInt();
			amethystattackProperty.set(amethystattack);

			Property amethysthandleModifierProperty = minconfig.get("amethyst", "amethysthandleModifier", 1.2);
			amethysthandleModifierProperty.comment = "sets the handle modifier of amethyst";
			amethysthandleModifier = (float) amethysthandleModifierProperty.getDouble(1.2);
			amethysthandleModifierProperty.set(amethysthandleModifier);

			Property amethystreinforcedProperty = minconfig.get("amethyst", "amethystreinforcedLevel", 0);
			amethystreinforcedProperty.comment = "sets the reinforced level of amethyst";
			amethystreinforced = amethystreinforcedProperty.getInt();
			amethystreinforcedProperty.set(amethystreinforced);

			Property amethyststoneboundProperty = minconfig.get("amethyst", "amethyststonebound", 0.0);
			amethyststoneboundProperty.comment = "sets the stonebound level of amethyst";
			amethyststonebound = (float) amethyststoneboundProperty.getDouble(0);
			amethyststoneboundProperty.set(amethyststonebound);
		}
		}		/**
		// blank
		ConfigCategory Category = minconfig.getCategory("");
		Category.setComment("Setup base stats of ");

		Property harvestLevelProperty = minconfig.get("", "HarvestLevel", );
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
		minconfig.save();
		
	}

}
