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

public class ModifierConfig {

	// modifiers
	public static boolean addCleanModifier;
	public static boolean moreExpensiveSilkyCloth;
	public static boolean moreExpensiveSilkyJewel;
	public static int mossRepairSpeed;
	public static int redstoneEffect;
	public static boolean ticExtraModifier;

	// pick boost
	public static boolean pickaxeBoostRequired;
	public static boolean mobHeadPickaxeBoost;
	public static boolean levelingPickaxeBoost;
	public static int levelingPickaxeBoostXpPercentage;
	public static boolean diamondPickaxeBoost;

	// head levels
	public static int skeletonboost;
	public static int zombieboost;
	public static int creeperboost;
	public static int endermanboost;
	public static int witherskeletonboost;
	public static int zombiepigmanboost;
	public static int blazeboost;
	public static int netherstarboost;
	public static int emeraldboost;

	public static void init()
	{
		File installDir = new File("config");
		File configDir = new File(installDir, "TiC Tweaks");
		Configuration modconfig = new Configuration(new File(configDir, "Modifier Level Config.cfg"));
		modconfig.load();

		// modifiers
		ConfigCategory modifiersCategory = modconfig.getCategory("modifiers");
		modifiersCategory.setComment("Options relating to tool modifiers");

		Property addCleanModifierProperty = modconfig.get("modifiers", "addCleanModifier", true);
		addCleanModifierProperty.comment = "Silky Cloth can be used to remove all modifiers from a tool (currently safe but not working)";
		addCleanModifier = addCleanModifierProperty.getBoolean(true);

		Property moreExpensiveSilkyClothProperty = modconfig.get("modifiers", "moreExpensiveSilkyCloth", true);
		moreExpensiveSilkyClothProperty.comment = "Silky Cloth needs gold ingots, instead of nuggets";
		moreExpensiveSilkyCloth = moreExpensiveSilkyClothProperty.getBoolean(true);

		Property moreExpensiveSilkyJewelProperty = modconfig.get("modifiers", "moreExpensiveSilkyJewel", true);
		moreExpensiveSilkyJewelProperty.comment = "Silky Jewel needs emerald block, instead of one emerald";
		moreExpensiveSilkyJewel = moreExpensiveSilkyJewelProperty.getBoolean(true);

		Property mossRepairSpeedProperty = modconfig.get("modifiers", "mossRepairSpeed", 3);
		mossRepairSpeedProperty.comment = "Rate tools with moss repair (TC default 3)";
		mossRepairSpeed = Math.max(mossRepairSpeedProperty.getInt(3), 0);
		mossRepairSpeedProperty.set(mossRepairSpeed);

		Property redstoneEffectProperty = modconfig.get("modifiers", "redstoneEffect", 4);
		redstoneEffectProperty.comment = "Amount each piece of redstone increases mining speed (tinkers default is 8)";
		redstoneEffect = Math.max(redstoneEffectProperty.getInt(4), 1);
		redstoneEffectProperty.set(redstoneEffect);

		Property ticExtraModifierProperty = modconfig.get("modifiers", "ticExtraModifier", false);
		ticExtraModifierProperty.comment = "Allow base TiC Extra Modifier Mods";
		ticExtraModifier = ticExtraModifierProperty.getBoolean(false);
		ticExtraModifierProperty.set(ticExtraModifier);


		// pick leveling
		ConfigCategory pickboostingCategory = modconfig.getCategory("pickboosting");
		pickboostingCategory.setComment("Options to configure to pickaxe mining level boost and mechanics");

		Property diamondPickaxeBoostProperty = modconfig.get("pickboosting", "diamondPickaxeBoost", true);
		diamondPickaxeBoostProperty.comment = "Diamond mod allows mining obsidian";
		diamondPickaxeBoost = diamondPickaxeBoostProperty.getBoolean(true);

		Property pickaxeBoostRequiredProperty = modconfig.get("pickboosting", "pickaxeBoostRequired", true);
		pickaxeBoostRequiredProperty.comment = "Pickaxes only mine upto their head material level and need a mob head modifier OR leveling boost to advance";
		pickaxeBoostRequired = pickaxeBoostRequiredProperty.getBoolean(true);

		Property mobHeadPickaxeBoostProperty = modconfig.get("pickboosting", "mobHeadPickaxeBoost", true);
		mobHeadPickaxeBoostProperty.comment = "Mob heads can be used to boost a pickaxe's mining level";
		mobHeadPickaxeBoost = mobHeadPickaxeBoostProperty.getBoolean(true);

		Property levelingPickaxeBoostProperty = modconfig.get("pickboosting", "levelingPickaxeBoost", true);
		levelingPickaxeBoostProperty.comment = "A pickaxes mining level can be boosted through gaining XP";
		levelingPickaxeBoost = levelingPickaxeBoostProperty.getBoolean(true);

		Property levelingPickaxeBoostXpPercentageProperty = modconfig.get("pickboosting", "levelingPickaxeBoostXpPercentage", 100);
		levelingPickaxeBoostXpPercentageProperty.comment = "Change the percentage of XP required to boost a pick (i.e. 200 means 2x normal boost xp required)";
		levelingPickaxeBoostXpPercentage = Math.max(levelingPickaxeBoostXpPercentageProperty.getInt(100), 1);
		levelingPickaxeBoostXpPercentageProperty.set(levelingPickaxeBoostXpPercentage);


		// head levels
		ConfigCategory headLevelCategory = modconfig.getCategory("headlevel");
		headLevelCategory.setComment("Options to configure what level mob heads boost");
		
		Property skeletonboostProperty = modconfig.get("headlevel", "skeletonboost", 3);
		skeletonboostProperty.comment = "Max harvest boostable with Skeleton Skull";
		skeletonboost = skeletonboostProperty.getInt(3);
		skeletonboostProperty.set(skeletonboost);
		
		Property zombieboostProperty = modconfig.get("headlevel", "zombieboost", 3);
		zombieboostProperty.comment = "Max harvest boostable with Zombie Head";
		zombieboost = zombieboostProperty.getInt(3);
		zombieboostProperty.set(zombieboost);
		
		Property creeperboostProperty = modconfig.get("headlevel", "creeperboost", 4);
		creeperboostProperty.comment = "Max harvest boostable with Creeper Head";
		creeperboost = creeperboostProperty.getInt(4);
		creeperboostProperty.set(creeperboost);
		
		Property endermanboostProperty = modconfig.get("headlevel", "endermanboost", 5);
		endermanboostProperty.comment = "Max harvest boostable with Enderman Head";
		endermanboost = endermanboostProperty.getInt(5);
		endermanboostProperty.set(endermanboost);
		
		Property witherskeletonboostProperty = modconfig.get("headlevel", "witherskeletonboost", 6);
		witherskeletonboostProperty.comment = "Max harvest boostable with Wither Skeleton";
		witherskeletonboost = witherskeletonboostProperty.getInt(6);
		witherskeletonboostProperty.set(witherskeletonboost);
		
		Property zombiepigmanboostProperty = modconfig.get("headlevel", "zombiepigmanboost", 5);
		zombiepigmanboostProperty.comment = "Max harvest boostable with Zombie Pigman";
		zombiepigmanboost = zombiepigmanboostProperty.getInt(5);
		zombiepigmanboostProperty.set(zombiepigmanboost);
		
		Property blazeboostProperty = modconfig.get("headlevel", "blazeboost", 5);
		blazeboostProperty.comment = "Max harvest boostable with Blaze Skull";
		blazeboost = blazeboostProperty.getInt(5);
		blazeboostProperty.set(blazeboost);
		
		Property netherstarboostProperty = modconfig.get("headlevel", "netherstarboost", 7);
		netherstarboostProperty.comment = "Max harvest boostable with Nether Star";
		netherstarboost = netherstarboostProperty.getInt(7);
		netherstarboostProperty.set(netherstarboost);
		
		Property emeraldboostProperty = modconfig.get("headlevel", "emeraldboost", 4);
		emeraldboostProperty.comment = "Harvest level that emerald boosts to";
		emeraldboost = emeraldboostProperty.getInt(4);
		emeraldboostProperty.set(emeraldboost);
		
		modconfig.save();
		
	}

}
