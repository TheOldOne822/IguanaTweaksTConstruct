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

public class MaterialConfig {


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

	//silver
	public static int silverharvestLevel;
	public static int silverdurability;
	public static int silverminingspeed;
	public static int silverattack;
	public static float silverhandleModifier;
	public static int silverreinforced;
	public static float silverstonebound;

	//ignatius
	public static int ignatiusharvestLevel;
	public static int ignatiusdurability;
	public static int ignatiusminingspeed;
	public static int ignatiusattack;
	public static float ignatiushandleModifier;
	public static int ignatiusreinforced;
	public static float ignatiusstonebound;

	//shadowIron
	public static int shadowIronharvestLevel;
	public static int shadowIrondurability;
	public static int shadowIronminingspeed;
	public static int shadowIronattack;
	public static float shadowIronhandleModifier;
	public static int shadowIronreinforced;
	public static float shadowIronstonebound;

	//prometheum
	public static int prometheumharvestLevel;
	public static int prometheumdurability;
	public static int prometheumminingspeed;
	public static int prometheumattack;
	public static float prometheumhandleModifier;
	public static int prometheumreinforced;
	public static float prometheumstonebound;

	//platinum
	public static int platinumharvestLevel;
	public static int platinumdurability;
	public static int platinumminingspeed;
	public static int platinumattack;
	public static float platinumhandleModifier;
	public static int platinumreinforced;
	public static float platinumstonebound;

	//shadowSteel
	public static int shadowSteelharvestLevel;
	public static int shadowSteeldurability;
	public static int shadowSteelminingspeed;
	public static int shadowSteelattack;
	public static float shadowSteelhandleModifier;
	public static int shadowSteelreinforced;
	public static float shadowSteelstonebound;

	//blackSteel
	public static int blackSteelharvestLevel;
	public static int blackSteeldurability;
	public static int blackSteelminingspeed;
	public static int blackSteelattack;
	public static float blackSteelhandleModifier;
	public static int blackSteelreinforced;
	public static float blackSteelstonebound;

	//deepIron
	public static int deepIronharvestLevel;
	public static int deepIrondurability;
	public static int deepIronminingspeed;
	public static int deepIronattack;
	public static float deepIronhandleModifier;
	public static int deepIronreinforced;
	public static float deepIronstonebound;

	//angmallen
	public static int angmallenharvestLevel;
	public static int angmallendurability;
	public static int angmallenminingspeed;
	public static int angmallenattack;
	public static float angmallenhandleModifier;
	public static int angmallenreinforced;
	public static float angmallenstonebound;

	//hepatizon
	public static int hepatizonharvestLevel;
	public static int hepatizondurability;
	public static int hepatizonminingspeed;
	public static int hepatizonattack;
	public static float hepatizonhandleModifier;
	public static int hepatizonreinforced;
	public static float hepatizonstonebound;

	//ceruclase
	public static int ceruclaseharvestLevel;
	public static int ceruclasedurability;
	public static int ceruclaseminingspeed;
	public static int ceruclaseattack;
	public static float ceruclasehandleModifier;
	public static int ceruclasereinforced;
	public static float ceruclasestonebound;

	//midasium
	public static int midasiumharvestLevel;
	public static int midasiumdurability;
	public static int midasiumminingspeed;
	public static int midasiumattack;
	public static float midasiumhandleModifier;
	public static int midasiumreinforced;
	public static float midasiumstonebound;

	//vyroxeres
	public static int vyroxeresharvestLevel;
	public static int vyroxeresdurability;
	public static int vyroxeresminingspeed;
	public static int vyroxeresattack;
	public static float vyroxereshandleModifier;
	public static int vyroxeresreinforced;
	public static float vyroxeresstonebound;

	//oureclase
	public static int oureclaseharvestLevel;
	public static int oureclasedurability;
	public static int oureclaseminingspeed;
	public static int oureclaseattack;
	public static float oureclasehandleModifier;
	public static int oureclasereinforced;
	public static float oureclasestonebound;

	//eximite
	public static int eximiteharvestLevel;
	public static int eximitedurability;
	public static int eximiteminingspeed;
	public static int eximiteattack;
	public static float eximitehandleModifier;
	public static int eximitereinforced;
	public static float eximitestonebound;

	//damascusSteel
	public static int damascusSteelharvestLevel;
	public static int damascusSteeldurability;
	public static int damascusSteelminingspeed;
	public static int damascusSteelattack;
	public static float damascusSteelhandleModifier;
	public static int damascusSteelreinforced;
	public static float damascusSteelstonebound;

	//amordrine
	public static int amordrineharvestLevel;
	public static int amordrinedurability;
	public static int amordrineminingspeed;
	public static int amordrineattack;
	public static float amordrinehandleModifier;
	public static int amordrinereinforced;
	public static float amordrinestonebound;

	//inolashite
	public static int inolashiteharvestLevel;
	public static int inolashitedurability;
	public static int inolashiteminingspeed;
	public static int inolashiteattack;
	public static float inolashitehandleModifier;
	public static int inolashitereinforced;
	public static float inolashitestonebound;

	//kalendrite
	public static int kalendriteharvestLevel;
	public static int kalendritedurability;
	public static int kalendriteminingspeed;
	public static int kalendriteattack;
	public static float kalendritehandleModifier;
	public static int kalendritereinforced;
	public static float kalendritestonebound;

	//astralSilver
	public static int astralSilverharvestLevel;
	public static int astralSilverdurability;
	public static int astralSilverminingspeed;
	public static int astralSilverattack;
	public static float astralSilverhandleModifier;
	public static int astralSilverreinforced;
	public static float astralSilverstonebound;

	//carmot
	public static int carmotharvestLevel;
	public static int carmotdurability;
	public static int carmotminingspeed;
	public static int carmotattack;
	public static float carmothandleModifier;
	public static int carmotreinforced;
	public static float carmotstonebound;

	//haderoth
	public static int haderothharvestLevel;
	public static int haderothdurability;
	public static int haderothminingspeed;
	public static int haderothattack;
	public static float haderothhandleModifier;
	public static int haderothreinforced;
	public static float haderothstonebound;

	//mithril
	public static int mithrilharvestLevel;
	public static int mithrildurability;
	public static int mithrilminingspeed;
	public static int mithrilattack;
	public static float mithrilhandleModifier;
	public static int mithrilreinforced;
	public static float mithrilstonebound;

	//quicksilver
	public static int quicksilverharvestLevel;
	public static int quicksilverdurability;
	public static int quicksilverminingspeed;
	public static int quicksilverattack;
	public static float quicksilverhandleModifier;
	public static int quicksilverreinforced;
	public static float quicksilverstonebound;

	//desichalkosr
	public static int desichalkosrharvestLevel;
	public static int desichalkosrdurability;
	public static int desichalkosrminingspeed;
	public static int desichalkosrattack;
	public static float desichalkosrhandleModifier;
	public static int desichalkosrreinforced;
	public static float desichalkosrstonebound;

	//vulcanite
	public static int vulcaniteharvestLevel;
	public static int vulcanitedurability;
	public static int vulcaniteminingspeed;
	public static int vulcaniteattack;
	public static float vulcanitehandleModifier;
	public static int vulcanitereinforced;
	public static float vulcanitestonebound;

	//celenegil
	public static int celenegilharvestLevel;
	public static int celenegildurability;
	public static int celenegilminingspeed;
	public static int celenegilattack;
	public static float celenegilhandleModifier;
	public static int celenegilreinforced;
	public static float celenegilstonebound;

	//orichalcum
	public static int orichalcumharvestLevel;
	public static int orichalcumdurability;
	public static int orichalcumminingspeed;
	public static int orichalcumattack;
	public static float orichalcumhandleModifier;
	public static int orichalcumreinforced;
	public static float orichalcumstonebound;

	//sanguinite
	public static int sanguiniteharvestLevel;
	public static int sanguinitedurability;
	public static int sanguiniteminingspeed;
	public static int sanguiniteattack;
	public static float sanguinitehandleModifier;
	public static int sanguinitereinforced;
	public static float sanguinitestonebound;

	//adamantine
	public static int adamantineharvestLevel;
	public static int adamantinedurability;
	public static int adamantineminingspeed;
	public static int adamantineattack;
	public static float adamantinehandleModifier;
	public static int adamantinereinforced;
	public static float adamantinestonebound;

	//atlarus
	public static int atlarusharvestLevel;
	public static int atlarusdurability;
	public static int atlarusminingspeed;
	public static int atlarusattack;
	public static float atlarushandleModifier;
	public static int atlarusreinforced;
	public static float atlarusstonebound;

	//tartarite
	public static int tartariteharvestLevel;
	public static int tartaritedurability;
	public static int tartariteminingspeed;
	public static int tartariteattack;
	public static float tartaritehandleModifier;
	public static int tartaritereinforced;
	public static float tartaritestonebound;

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
		File configDir = new File(installDir, "TiC Tweaks");
		Configuration minconfig = new Configuration(new File(configDir, "Material Config.cfg"));
		minconfig.load();

		// wood
		ConfigCategory woodCategory = minconfig.getCategory("wood");
		woodCategory.setComment("Setup base stats of wood");

		Property woodharvestLevelProperty = minconfig.get("wood", "woodHarvestLevel", 0);
		woodharvestLevelProperty.comment = "sets the harvest level of wood (Tic default 0)";
		woodharvestLevel = woodharvestLevelProperty.getInt(0);
		woodharvestLevelProperty.set(woodharvestLevel);

		Property wooddurabilityProperty = minconfig.get("wood", "wooddurability", 59);
		wooddurabilityProperty.comment = "sets the base durability of wood (Tic default 49)";
		wooddurability = wooddurabilityProperty.getInt();
		wooddurabilityProperty.set(wooddurability);

		Property woodminingspeedProperty = minconfig.get("wood", "woodminingspeed", 150);
		woodminingspeedProperty.comment = "sets the mining speed of wood (Tic default 200)";
		woodminingspeed = woodminingspeedProperty.getInt(150);
		woodminingspeedProperty.set(woodminingspeed);

		Property woodattackProperty = minconfig.get("wood", "woodattack", 1);
		woodattackProperty.comment = "sets the attack of wood (Tic default 0)";
		woodattack = woodattackProperty.getInt(1);
		woodattackProperty.set(woodattack);

		Property woodhandleModifierProperty = minconfig.get("wood", "woodhandleModifier", 1.0);
		woodhandleModifierProperty.comment = "sets the handle modifier of wood (Tic default 1.0)";
		woodhandleModifier = (float) woodhandleModifierProperty.getDouble(1.0);
		woodhandleModifierProperty.set(woodhandleModifier);

		Property woodreinforcedProperty = minconfig.get("wood", "woodreinforcedLevel", 0);
		woodreinforcedProperty.comment = "sets the reinforced level of wood (Tic default 0)";
		woodreinforced = woodreinforcedProperty.getInt(0);
		woodreinforcedProperty.set(woodreinforced);

		Property woodstoneboundProperty = minconfig.get("wood", "woodstonebound", 0.0);
		woodstoneboundProperty.comment = "sets the stonebound level of wood (Tic default 0.0)";
		woodstonebound = (float) woodstoneboundProperty.getDouble(0);
		woodstoneboundProperty.set(woodstonebound);

		// cactus
		ConfigCategory cactusCategory = minconfig.getCategory("cactus");
		cactusCategory.setComment("Setup base stats of cactus");

		Property cactusharvestLevelProperty = minconfig.get("cactus", "cactusHarvestLevel", 0);
		cactusharvestLevelProperty.comment = "sets the harvest level of cactus (Tic default 1)";
		cactusharvestLevel = cactusharvestLevelProperty.getInt(0);
		cactusharvestLevelProperty.set(cactusharvestLevel);

		Property cactusdurabilityProperty = minconfig.get("cactus", "cactusdurability", 150);
		cactusdurabilityProperty.comment = "sets the base durability of cactus (Tic default 150)";
		cactusdurability = cactusdurabilityProperty.getInt(150);
		cactusdurabilityProperty.set(cactusdurability);

		Property cactusminingspeedProperty = minconfig.get("cactus", "cactusminingspeed", 500);
		cactusminingspeedProperty.comment = "sets the mining speed of cactus (Tic default 500)";
		cactusminingspeed = cactusminingspeedProperty.getInt(500);
		cactusminingspeedProperty.set(cactusminingspeed);

		Property cactusattackProperty = minconfig.get("cactus", "cactusattack", 2);
		cactusattackProperty.comment = "sets the attack of cactus (Tic default 2)";
		cactusattack = cactusattackProperty.getInt(2);
		cactusattackProperty.set(cactusattack);

		Property cactushandleModifierProperty = minconfig.get("cactus", "cactushandleModifier", 1.0);
		cactushandleModifierProperty.comment = "sets the handle modifier of cactus (Tic default 1.0)";
		cactushandleModifier = (float) cactushandleModifierProperty.getDouble(1);
		cactushandleModifierProperty.set(cactushandleModifier);

		Property cactusreinforcedProperty = minconfig.get("cactus", "cactusreinforcedLevel", 0);
		cactusreinforcedProperty.comment = "sets the reinforced level of cactus (Tic default 0)";
		cactusreinforced = cactusreinforcedProperty.getInt(0);
		cactusreinforcedProperty.set(cactusreinforced);

		Property cactusstoneboundProperty = minconfig.get("cactus", "stonebound", -1.0);
		cactusstoneboundProperty.comment = "sets the stonebound level of cactus (Tic default -1.0)";
		cactusstonebound = (float) cactusstoneboundProperty.getDouble(-1);
		cactusstoneboundProperty.set(cactusstonebound);

		// Slime
		ConfigCategory slimeCategory = minconfig.getCategory("slime");
		slimeCategory.setComment("Setup base stats of slime");

		Property slimeharvestLevelProperty = minconfig.get("slime", "slimeHarvestLevel", 0);
		slimeharvestLevelProperty.comment = "sets the harvest level of slime (Tic default 0)";
		slimeharvestLevel = slimeharvestLevelProperty.getInt();
		slimeharvestLevelProperty.set(slimeharvestLevel);

		Property slimedurabilityProperty = minconfig.get("slime", "slimedurability", 500);
		slimedurabilityProperty.comment = "sets the base durability of slime (Tic default 500)";
		slimedurability = slimedurabilityProperty.getInt(500);
		slimedurabilityProperty.set(slimedurability);

		Property slimeminingspeedProperty = minconfig.get("slime", "slimeminingspeed", 100);
		slimeminingspeedProperty.comment = "sets the mining speed of slime (Tic default 150)";
		slimeminingspeed = slimeminingspeedProperty.getInt(100);
		slimeminingspeedProperty.set(slimeminingspeed);

		Property slimeattackProperty = minconfig.get("slime", "slimeattack", 1);
		slimeattackProperty.comment = "sets the attack of slime (Tic default 0)";
		slimeattack = slimeattackProperty.getInt();
		slimeattackProperty.set(slimeattack);

		Property slimehandleModifierProperty = minconfig.get("slime", "slimehandleModifier", 2.0);
		slimehandleModifierProperty.comment = "sets the handle modifier of slime (Tic default 1.5)";
		slimehandleModifier = (float) slimehandleModifierProperty.getDouble(2);
		slimehandleModifierProperty.set(slimehandleModifier);

		Property slimereinforcedProperty = minconfig.get("slime", "reinforcedLevel", 0);
		slimereinforcedProperty.comment = "sets the reinforced level of slime (Tic default 0)";
		slimereinforced = slimereinforcedProperty.getInt();
		slimereinforcedProperty.set(slimereinforced);

		Property slimestoneboundProperty = minconfig.get("slime", "slimestonebound", 0.0);
		slimestoneboundProperty.comment = "sets the stonebound level of slime (Tic default 0.0)";
		slimestonebound = (float) slimestoneboundProperty.getDouble(0);
		slimestoneboundProperty.set(slimestonebound);

		// BlueSlime
		ConfigCategory blueslimeCategory = minconfig.getCategory("blueslime");
		blueslimeCategory.setComment("Setup base stats of blueslime");

		Property blueslimeharvestLevelProperty = minconfig.get("blueslime", "blueslimeHarvestLevel", 0);
		blueslimeharvestLevelProperty.comment = "sets the harvest level of blueslime (Tic default 0)";
		blueslimeharvestLevel = blueslimeharvestLevelProperty.getInt();
		blueslimeharvestLevelProperty.set(blueslimeharvestLevel);

		Property blueslimedurabilityProperty = minconfig.get("blueslime", "blueslimedurability", 1200);
		blueslimedurabilityProperty.comment = "sets the base durability of blueslime (Tic default 1200)";
		blueslimedurability = blueslimedurabilityProperty.getInt(1200);
		blueslimedurabilityProperty.set(blueslimedurability);

		Property blueslimeminingspeedProperty = minconfig.get("blueslime", "blueslimeminingspeed", 100);
		blueslimeminingspeedProperty.comment = "sets the mining speed of blueslime (Tic default 150)";
		blueslimeminingspeed = blueslimeminingspeedProperty.getInt(100);
		blueslimeminingspeedProperty.set(blueslimeminingspeed);

		Property blueslimeattackProperty = minconfig.get("blueslime", "blueslimeattack", 1);
		blueslimeattackProperty.comment = "sets the attack of blueslime (Tic default 0)";
		blueslimeattack = blueslimeattackProperty.getInt();
		blueslimeattackProperty.set(blueslimeattack);

		Property blueslimehandleModifierProperty = minconfig.get("blueslime", "blueslimehandleModifier", 1.5);
		blueslimehandleModifierProperty.comment = "sets the handle modifier of blueslime (Tic default 2.0)";
		blueslimehandleModifier = (float) blueslimehandleModifierProperty.getDouble(1.5);
		blueslimehandleModifierProperty.set(blueslimehandleModifier);

		Property blueslimereinforcedProperty = minconfig.get("blueslime", "blueslimereinforcedLevel", 0);
		blueslimereinforcedProperty.comment = "sets the reinforced level of blueslime (Tic default 0)";
		blueslimereinforced = blueslimereinforcedProperty.getInt();
		blueslimereinforcedProperty.set(blueslimereinforced);

		Property blueslimestoneboundProperty = minconfig.get("blueslime", "blueslimestonebound", 0.0);
		blueslimestoneboundProperty.comment = "sets the stonebound level of blueslime (Tic default 0.0)";
		blueslimestonebound = (float) blueslimestoneboundProperty.getDouble(0);
		blueslimestoneboundProperty.set(blueslimestonebound);

		// Paper
		ConfigCategory paperCategory = minconfig.getCategory("paper");
		paperCategory.setComment("Setup base stats of paper");

		Property paperharvestLevelProperty = minconfig.get("paper", "paperHarvestLevel", 0);
		paperharvestLevelProperty.comment = "sets the harvest level of paper (Tic default 0)";
		paperharvestLevel = paperharvestLevelProperty.getInt();
		paperharvestLevelProperty.set(paperharvestLevel);

		Property paperdurabilityProperty = minconfig.get("paper", "paperdurability", 30);
		paperdurabilityProperty.comment = "sets the base durability of paper (Tic default 30)";
		paperdurability = paperdurabilityProperty.getInt(30);
		paperdurabilityProperty.set(paperdurability);

		Property paperminingspeedProperty = minconfig.get("paper", "paperminingspeed", 100);
		paperminingspeedProperty.comment = "sets the mining speed of paper (Tic default 200)";
		paperminingspeed = paperminingspeedProperty.getInt(100);
		paperminingspeedProperty.set(paperminingspeed);

		Property paperattackProperty = minconfig.get("paper", "paperattack", 1);
		paperattackProperty.comment = "sets the attack of paper (Tic default 0)";
		paperattack = paperattackProperty.getInt();
		paperattackProperty.set(paperattack);

		Property paperhandleModifierProperty = minconfig.get("paper", "paperhandleModifier", 0.3);
		paperhandleModifierProperty.comment = "sets the handle modifier of paper (Tic default 0.3)";
		paperhandleModifier = (float) paperhandleModifierProperty.getDouble(0.3);
		paperhandleModifierProperty.set(paperhandleModifier);

		Property paperreinforcedProperty = minconfig.get("paper", "paperreinforcedLevel", 0);
		paperreinforcedProperty.comment = "sets the reinforced level of paper (Tic default 0)";
		paperreinforced = paperreinforcedProperty.getInt();
		paperreinforcedProperty.set(paperreinforced);

		Property paperstoneboundProperty = minconfig.get("paper", "paperstonebound", 0.0);
		paperstoneboundProperty.comment = "sets the stonebound level of paper (Tic default 0.0)";
		paperstonebound = (float) paperstoneboundProperty.getDouble(0);
		paperstoneboundProperty.set(paperstonebound);

		// Stone
		ConfigCategory stoneCategory = minconfig.getCategory("stone");
		stoneCategory.setComment("Setup base stats of stone");

		Property stoneharvestLevelProperty = minconfig.get("stone", "stoneHarvestLevel", 0);
		stoneharvestLevelProperty.comment = "sets the harvest level of stone (Tic default 1)";
		stoneharvestLevel = stoneharvestLevelProperty.getInt();
		stoneharvestLevelProperty.set(stoneharvestLevel);

		Property stonedurabilityProperty = minconfig.get("stone", "stonedurability", 131);
		stonedurabilityProperty.comment = "sets the base durability of stone (Tic default 131)";
		stonedurability = stonedurabilityProperty.getInt(131);
		stonedurabilityProperty.set(stonedurability);

		Property stoneminingspeedProperty = minconfig.get("stone", "stoneminingspeed", 300);
		stoneminingspeedProperty.comment = "sets the mining speed of stone (Tic default 400)";
		stoneminingspeed = stoneminingspeedProperty.getInt(300);
		stoneminingspeedProperty.set(stoneminingspeed);

		Property stoneattackProperty = minconfig.get("stone", "stoneattack", 2);
		stoneattackProperty.comment = "sets the attack of stone (Tic default 1)";
		stoneattack = stoneattackProperty.getInt();
		stoneattackProperty.set(stoneattack);

		Property stonehandleModifierProperty = minconfig.get("stone", "stonehandleModifier", 0.5);
		stonehandleModifierProperty.comment = "sets the handle modifier of stone (Tic default 0.5)";
		stonehandleModifier = (float) stonehandleModifierProperty.getDouble(0.5);
		stonehandleModifierProperty.set(stonehandleModifier);

		Property stonereinforcedProperty = minconfig.get("stone", "stonereinforcedLevel", 0);
		stonereinforcedProperty.comment = "sets the reinforced level of stone (Tic default 0)";
		stonereinforced = stonereinforcedProperty.getInt();
		stonereinforcedProperty.set(stonereinforced);

		Property stonestoneboundProperty = minconfig.get("stone", "stonestonebound", 1.0);
		stonestoneboundProperty.comment = "sets the stonebound level of stone (Tic default 1.0)";
		stonestonebound = (float) stonestoneboundProperty.getDouble(1);
		stonestoneboundProperty.set(stonestonebound);

		// Flint
		ConfigCategory flintCategory = minconfig.getCategory("flint");
		flintCategory.setComment("Setup base stats of flint");

		Property flintharvestLevelProperty = minconfig.get("flint", "flintHarvestLevel", 1);
		flintharvestLevelProperty.comment = "sets the harvest level of flint (Tic default 1)";
		flintharvestLevel = flintharvestLevelProperty.getInt();
		flintharvestLevelProperty.set(flintharvestLevel);

		Property flintdurabilityProperty = minconfig.get("flint", "flintdurability", 171);
		flintdurabilityProperty.comment = "sets the base durability of flint (Tic default 171)";
		flintdurability = flintdurabilityProperty.getInt(171);
		flintdurabilityProperty.set(flintdurability);

		Property flintminingspeedProperty = minconfig.get("flint", "flintminingspeed", 400);
		flintminingspeedProperty.comment = "sets the mining speed of flint (Tic default 525)";
		flintminingspeed = flintminingspeedProperty.getInt(400);
		flintminingspeedProperty.set(flintminingspeed);

		Property flintattackProperty = minconfig.get("flint", "flintattack", 2);
		flintattackProperty.comment = "sets the attack of flint (Tic default 2)";
		flintattack = flintattackProperty.getInt();
		flintattackProperty.set(flintattack);

		Property flinthandleModifierProperty = minconfig.get("flint", "flinthandleModifier", 0.5);
		flinthandleModifierProperty.comment = "sets the handle modifier of flint (Tic default 0.7)";
		flinthandleModifier = (float) flinthandleModifierProperty.getDouble(0.5);
		flinthandleModifierProperty.set(flinthandleModifier);

		Property flintreinforcedProperty = minconfig.get("flint", "flintreinforcedLevel", 0);
		flintreinforcedProperty.comment = "sets the reinforced level of flint (Tic default 0)";
		flintreinforced = flintreinforcedProperty.getInt();
		flintreinforcedProperty.set(flintreinforced);

		Property flintstoneboundProperty = minconfig.get("flint", "flintstonebound", 0.0);
		flintstoneboundProperty.comment = "sets the stonebound level of flint (Tic default 0.0)";
		flintstonebound = (float) flintstoneboundProperty.getDouble(0);
		flintstoneboundProperty.set(flintstonebound);

		// Bone
		ConfigCategory boneCategory = minconfig.getCategory("bone");
		boneCategory.setComment("Setup base stats of bone");

		Property boneharvestLevelProperty = minconfig.get("bone", "boneHarvestLevel", 1);
		boneharvestLevelProperty.comment = "sets the harvest level of bone (Tic default 1)";
		boneharvestLevel = boneharvestLevelProperty.getInt();
		boneharvestLevelProperty.set(boneharvestLevel);

		Property bonedurabilityProperty = minconfig.get("bone", "bonedurability", 200);
		bonedurabilityProperty.comment = "sets the base durability of bone (Tic default 200)";
		bonedurability = bonedurabilityProperty.getInt();
		bonedurabilityProperty.set(bonedurability);

		Property boneminingspeedProperty = minconfig.get("bone", "boneminingspeed", 400);
		boneminingspeedProperty.comment = "sets the mining speed of bone (Tic default 400)";
		boneminingspeed = boneminingspeedProperty.getInt();
		boneminingspeedProperty.set(boneminingspeed);

		Property boneattackProperty = minconfig.get("bone", "boneattack", 2);
		boneattackProperty.comment = "sets the attack of bone (Tic default 1)";
		boneattack = boneattackProperty.getInt();
		boneattackProperty.set(boneattack);

		Property bonehandleModifierProperty = minconfig.get("bone", "bonehandleModifier", 1.0);
		bonehandleModifierProperty.comment = "sets the handle modifier of bone (Tic default 1.0)";
		bonehandleModifier = (float) bonehandleModifierProperty.getDouble(1);
		bonehandleModifierProperty.set(bonehandleModifier);

		Property bonereinforcedProperty = minconfig.get("bone", "bonereinforcedLevel", 0);
		bonereinforcedProperty.comment = "sets the reinforced level of bone (Tic default 0)";
		bonereinforced = bonereinforcedProperty.getInt();
		bonereinforcedProperty.set(bonereinforced);

		Property bonestoneboundProperty = minconfig.get("bone", "bonestonebound", 0.0);
		bonestoneboundProperty.comment = "sets the stonebound level of bone (Tic default 0.0)";
		bonestonebound = (float) bonestoneboundProperty.getDouble(0);
		bonestoneboundProperty.set(bonestonebound);

		// Netherrack
		ConfigCategory netherrackCategory = minconfig.getCategory("netherrack");
		netherrackCategory.setComment("Setup base stats of netherrack");

		Property netherrackharvestLevelProperty = minconfig.get("netherrack", "netherrackHarvestLevel", 0);
		netherrackharvestLevelProperty.comment = "sets the harvest level of netherrack (Tic default 2)";
		netherrackharvestLevel = netherrackharvestLevelProperty.getInt();
		netherrackharvestLevelProperty.set(netherrackharvestLevel);

		Property netherrackdurabilityProperty = minconfig.get("netherrack", "netherrackdurability", 131);
		netherrackdurabilityProperty.comment = "sets the base durability of netherrack (Tic default 131)";
		netherrackdurability = netherrackdurabilityProperty.getInt(131);
		netherrackdurabilityProperty.set(netherrackdurability);

		Property netherrackminingspeedProperty = minconfig.get("netherrack", "netherrackminingspeed", 400);
		netherrackminingspeedProperty.comment = "sets the mining speed of netherrack (Tic default 400)";
		netherrackminingspeed = netherrackminingspeedProperty.getInt(400);
		netherrackminingspeedProperty.set(netherrackminingspeed);

		Property netherrackattackProperty = minconfig.get("netherrack", "netherrackattack", 3);
		netherrackattackProperty.comment = "sets the attack of netherrack (Tic default 1)";
		netherrackattack = netherrackattackProperty.getInt();
		netherrackattackProperty.set(netherrackattack);

		Property netherrackhandleModifierProperty = minconfig.get("netherrack", "netherrackhandleModifier", 1.2);
		netherrackhandleModifierProperty.comment = "sets the handle modifier of netherrack (Tic default 1.2)";
		netherrackhandleModifier = (float) netherrackhandleModifierProperty.getDouble(1.2);
		netherrackhandleModifierProperty.set(netherrackhandleModifier);

		Property netherrackreinforcedProperty = minconfig.get("netherrack", "netherrackreinforcedLevel", 0);
		netherrackreinforcedProperty.comment = "sets the reinforced level of netherrack (Tic default 0)";
		netherrackreinforced = netherrackreinforcedProperty.getInt(0);
		netherrackreinforcedProperty.set(netherrackreinforced);

		Property netherrackstoneboundProperty = minconfig.get("netherrack", "netherrackstonebound", 1.0);
		netherrackstoneboundProperty.comment = "sets the stonebound level of netherrack (Tic default 1.0)";
		netherrackstonebound = (float) netherrackstoneboundProperty.getDouble(1);
		netherrackstoneboundProperty.set(netherrackstonebound);

		// Copper
		ConfigCategory copperCategory = minconfig.getCategory("copper");
		copperCategory.setComment("Setup base stats of copper");

		Property copperharvestLevelProperty = minconfig.get("copper", "copperHarvestLevel", 1);
		copperharvestLevelProperty.comment = "sets the harvest level of copper (Tic default 1)";
		copperharvestLevel = copperharvestLevelProperty.getInt();
		copperharvestLevelProperty.set(copperharvestLevel);

		Property copperdurabilityProperty = minconfig.get("copper", "copperdurability", 180);
		copperdurabilityProperty.comment = "sets the base durability of copper (Tic default 180)";
		copperdurability = copperdurabilityProperty.getInt(180);
		copperdurabilityProperty.set(copperdurability);

		Property copperminingspeedProperty = minconfig.get("copper", "copperminingspeed", 500);
		copperminingspeedProperty.comment = "sets the mining speed of copper (Tic default 500)";
		copperminingspeed = copperminingspeedProperty.getInt(500);
		copperminingspeedProperty.set(copperminingspeed);

		Property copperattackProperty = minconfig.get("copper", "copperattack", 2);
		copperattackProperty.comment = "sets the attack of copper (Tic default 2)";
		copperattack = copperattackProperty.getInt();
		copperattackProperty.set(copperattack);

		Property copperhandleModifierProperty = minconfig.get("copper", "copperhandleModifier", 1.15);
		copperhandleModifierProperty.comment = "sets the handle modifier of copper (Tic default 1.15)";
		copperhandleModifier = (float) copperhandleModifierProperty.getDouble(1.15);
		copperhandleModifierProperty.set(copperhandleModifier);

		Property copperreinforcedProperty = minconfig.get("copper", "copperreinforcedLevel", 0);
		copperreinforcedProperty.comment = "sets the reinforced level of copper (Tic default 0)";
		copperreinforced = copperreinforcedProperty.getInt();
		copperreinforcedProperty.set(copperreinforced);

		Property copperstoneboundProperty = minconfig.get("copper", "copperstonebound", 0.0);
		copperstoneboundProperty.comment = "sets the stonebound level of copper (Tic default 0.0)";
		copperstonebound = (float) copperstoneboundProperty.getDouble(0);
		copperstoneboundProperty.set(copperstonebound);

		// Iron
		ConfigCategory ironCategory = minconfig.getCategory("iron");
		ironCategory.setComment("Setup base stats of iron");

		Property ironharvestLevelProperty = minconfig.get("iron", "ironHarvestLevel", 3);
		ironharvestLevelProperty.comment = "sets the harvest level of iron (Tic default 2)";
		ironharvestLevel = ironharvestLevelProperty.getInt();
		ironharvestLevelProperty.set(ironharvestLevel);

		Property irondurabilityProperty = minconfig.get("iron", "irondurability", 250);
		irondurabilityProperty.comment = "sets the base durability of iron (Tic default 250)";
		irondurability = irondurabilityProperty.getInt(250);
		irondurabilityProperty.set(irondurability);

		Property ironminingspeedProperty = minconfig.get("iron", "ironminingspeed", 600);
		ironminingspeedProperty.comment = "sets the mining speed of iron (Tic default 600)";
		ironminingspeed = ironminingspeedProperty.getInt(600);
		ironminingspeedProperty.set(ironminingspeed);

		Property ironattackProperty = minconfig.get("iron", "ironattack", 3);
		ironattackProperty.comment = "sets the attack of iron (Tic default 2)";
		ironattack = ironattackProperty.getInt();
		ironattackProperty.set(ironattack);

		Property ironhandleModifierProperty = minconfig.get("iron", "ironhandleModifier", 1.3);
		ironhandleModifierProperty.comment = "sets the handle modifier of iron (Tic default 1.3)";
		ironhandleModifier = (float) ironhandleModifierProperty.getDouble(1.3);
		ironhandleModifierProperty.set(ironhandleModifier);

		Property ironreinforcedProperty = minconfig.get("iron", "ironreinforcedLevel", 1);
		ironreinforcedProperty.comment = "sets the reinforced level of iron (Tic default 1)";
		ironreinforced = ironreinforcedProperty.getInt();
		ironreinforcedProperty.set(ironreinforced);

		Property ironstoneboundProperty = minconfig.get("iron", "ironstonebound", 0.0);
		ironstoneboundProperty.comment = "sets the stonebound level of iron (Tic default 0)";
		ironstonebound = (float) ironstoneboundProperty.getDouble(0);
		ironstoneboundProperty.set(ironstonebound);

		// Bronze
		ConfigCategory bronzeCategory = minconfig.getCategory("bronze");
		bronzeCategory.setComment("Setup base stats of bronze");

		Property bronzeharvestLevelProperty = minconfig.get("bronze", "bronzeHarvestLevel", 4);
		bronzeharvestLevelProperty.comment = "sets the harvest level of bronze (Tic default 2)";
		bronzeharvestLevel = bronzeharvestLevelProperty.getInt();
		bronzeharvestLevelProperty.set(bronzeharvestLevel);

		Property bronzedurabilityProperty = minconfig.get("bronze", "bronzedurability", 350);
		bronzedurabilityProperty.comment = "sets the base durability of bronze (Tic default 350)";
		bronzedurability = bronzedurabilityProperty.getInt(350);
		bronzedurabilityProperty.set(bronzedurability);

		Property bronzeminingspeedProperty = minconfig.get("bronze", "bronzeminingspeed", 700);
		bronzeminingspeedProperty.comment = "sets the mining speed of bronze (Tic default 700)";
		bronzeminingspeed = bronzeminingspeedProperty.getInt(700);
		bronzeminingspeedProperty.set(bronzeminingspeed);

		Property bronzeattackProperty = minconfig.get("bronze", "bronzeattack", 3);
		bronzeattackProperty.comment = "sets the attack of bronze (Tic default 2)";
		bronzeattack = bronzeattackProperty.getInt();
		bronzeattackProperty.set(bronzeattack);

		Property bronzehandleModifierProperty = minconfig.get("bronze", "bronzehandleModifier", 1.3);
		bronzehandleModifierProperty.comment = "sets the handle modifier of bronze (Tic default 1.3)";
		bronzehandleModifier = (float) bronzehandleModifierProperty.getDouble(1.3);
		bronzehandleModifierProperty.set(bronzehandleModifier);

		Property bronzereinforcedProperty = minconfig.get("bronze", "bronzereinforcedLevel", 1);
		bronzereinforcedProperty.comment = "sets the reinforced level of bronze (Tic default 1)";
		bronzereinforced = bronzereinforcedProperty.getInt();
		bronzereinforcedProperty.set(bronzereinforced);

		Property bronzestoneboundProperty = minconfig.get("bronze", "bronzestonebound", 0.0);
		bronzestoneboundProperty.comment = "sets the stonebound level of bronze (Tic default 0.0)";
		bronzestonebound = (float) bronzestoneboundProperty.getDouble(0);
		bronzestoneboundProperty.set(bronzestonebound);

		// Steel
		ConfigCategory steelCategory = minconfig.getCategory("steel");
		steelCategory.setComment("Setup base stats of steel");

		Property steelharvestLevelProperty = minconfig.get("steel", "steelHarvestLevel", 4);
		steelharvestLevelProperty.comment = "sets the harvest level of steel (Tic default 4)";
		steelharvestLevel = steelharvestLevelProperty.getInt();
		steelharvestLevelProperty.set(steelharvestLevel);

		Property steeldurabilityProperty = minconfig.get("steel", "steeldurability", 400);
		steeldurabilityProperty.comment = "sets the base durability of steel (Tic default 750)";
		steeldurability = steeldurabilityProperty.getInt(400);
		steeldurabilityProperty.set(steeldurability);

		Property steelminingspeedProperty = minconfig.get("steel", "miningspeed", 800);
		steelminingspeedProperty.comment = "sets the mining speed of steel (Tic default 800)";
		steelminingspeed = steelminingspeedProperty.getInt(800);
		steelminingspeedProperty.set(steelminingspeed);

		Property steelattackProperty = minconfig.get("steel", "attack", 3);
		steelattackProperty.comment = "sets the attack of steel (Tic default 3)";
		steelattack = steelattackProperty.getInt();
		steelattackProperty.set(steelattack);

		Property steelhandleModifierProperty = minconfig.get("steel", "steelhandleModifier", 1.3);
		steelhandleModifierProperty.comment = "sets the handle modifier of steel (Tic default 1.3)";
		steelhandleModifier = (float) steelhandleModifierProperty.getDouble(1.3);
		steelhandleModifierProperty.set(steelhandleModifier);

		Property steelreinforcedProperty = minconfig.get("steel", "steelreinforcedLevel", 2);
		steelreinforcedProperty.comment = "sets the reinforced level of steel (Tic default 2)";
		steelreinforced = steelreinforcedProperty.getInt();
		steelreinforcedProperty.set(steelreinforced);

		Property steelstoneboundProperty = minconfig.get("steel", "steelstonebound", 0.0);
		steelstoneboundProperty.comment = "sets the stonebound level of steel (Tic default 0.0)";
		steelstonebound = (float) steelstoneboundProperty.getDouble(0);
		steelstoneboundProperty.set(steelstonebound);

		// PigIron
		ConfigCategory pigironCategory = minconfig.getCategory("pigiron");
		pigironCategory.setComment("Setup base stats of pigiron");

		Property pigironharvestLevelProperty = minconfig.get("pigiron", "pigironHarvestLevel", 4);
		pigironharvestLevelProperty.comment = "sets the harvest level of Pig Iron (Tic default 3)";
		pigironharvestLevel = pigironharvestLevelProperty.getInt();
		pigironharvestLevelProperty.set(pigironharvestLevel);

		Property pigirondurabilityProperty = minconfig.get("pigiron", "pigirondurability", 250);
		pigirondurabilityProperty.comment = "sets the base durability of Pig Iron (Tic default 250)";
		pigirondurability = pigirondurabilityProperty.getInt(250);
		pigirondurabilityProperty.set(pigirondurability);

		Property pigironminingspeedProperty = minconfig.get("pigiron", "pigironminingspeed", 600);
		pigironminingspeedProperty.comment = "sets the mining speed of Pig Iron (Tic default 600)";
		pigironminingspeed = pigironminingspeedProperty.getInt(600);
		pigironminingspeedProperty.set(pigironminingspeed);

		Property pigironattackProperty = minconfig.get("pigiron", "pigironattack", 3);
		pigironattackProperty.comment = "sets the attack of Pig Iron (Tic default 2)";
		pigironattack = pigironattackProperty.getInt();
		pigironattackProperty.set(pigironattack);

		Property pigironhandleModifierProperty = minconfig.get("pigiron", "pigironhandleModifier", 1.3);
		pigironhandleModifierProperty.comment = "sets the handle modifier of Pig Iron (Tic default 1.3)";
		pigironhandleModifier = (float) pigironhandleModifierProperty.getDouble(1.3);
		pigironhandleModifierProperty.set(pigironhandleModifier);

		Property pigironreinforcedProperty = minconfig.get("pigiron", "pigironreinforcedLevel", 1);
		pigironreinforcedProperty.comment = "sets the reinforced level of Pig Iron (Tic default 1)";
		pigironreinforced = pigironreinforcedProperty.getInt();
		pigironreinforcedProperty.set(pigironreinforced);

		Property pigironstoneboundProperty = minconfig.get("pigiron", "pigironstonebound", 0.0);
		pigironstoneboundProperty.comment = "sets the stonebound level of pig iron (Tic default 0.0)";
		pigironstonebound = (float) pigironstoneboundProperty.getDouble(0);
		pigironstoneboundProperty.set(pigironstonebound);

		// Obsidian
		ConfigCategory obsidianCategory = minconfig.getCategory("obsidian");
		obsidianCategory.setComment("Setup base stats of obsidian");

		Property obsidianharvestLevelProperty = minconfig.get("obsidian", "obsidianHarvestLevel", 5);
		obsidianharvestLevelProperty.comment = "sets the harvest level of obsidian (Tic default 3)";
		obsidianharvestLevel = obsidianharvestLevelProperty.getInt();
		obsidianharvestLevelProperty.set(obsidianharvestLevel);

		Property obsidiandurabilityProperty = minconfig.get("obsidian", "obsidiandurability", 89);
		obsidiandurabilityProperty.comment = "sets the base durability of obsidian (Tic default 89)";
		obsidiandurability = obsidiandurabilityProperty.getInt(89);
		obsidiandurabilityProperty.set(obsidiandurability);

		Property obsidianminingspeedProperty = minconfig.get("obsidian", "obsidianminingspeed", 700);
		obsidianminingspeedProperty.comment = "sets the mining speed of obsidian (Tic default 700)";
		obsidianminingspeed = obsidianminingspeedProperty.getInt(700);
		obsidianminingspeedProperty.set(obsidianminingspeed);

		Property obsidianattackProperty = minconfig.get("obsidian", "obsidianattack", 3);
		obsidianattackProperty.comment = "sets the attack of obsidian (Tic default 2)";
		obsidianattack = obsidianattackProperty.getInt();
		obsidianattackProperty.set(obsidianattack);

		Property obsidianhandleModifierProperty = minconfig.get("obsidian", "obsidianhandleModifier", 0.8);
		obsidianhandleModifierProperty.comment = "sets the handle modifier of obsidian (Tic default 0.8)";
		obsidianhandleModifier = (float) obsidianhandleModifierProperty.getDouble(0.8);
		obsidianhandleModifierProperty.set(obsidianhandleModifier);

		Property obsidianreinforcedProperty = minconfig.get("obsidian", "obsidianreinforcedLevel", 3);
		obsidianreinforcedProperty.comment = "sets the reinforced level of obsidian (Tic default 3)";
		obsidianreinforced = obsidianreinforcedProperty.getInt();
		obsidianreinforcedProperty.set(obsidianreinforced);

		Property obsidianstoneboundProperty = minconfig.get("obsidian", "obsidianstonebound", 0.0);
		obsidianstoneboundProperty.comment = "sets the stonebound level of obsidian (Tic default 0.0)";
		obsidianstonebound = (float) obsidianstoneboundProperty.getDouble(0);
		obsidianstoneboundProperty.set(obsidianstonebound);

		// Alumite
		ConfigCategory alumiteCategory = minconfig.getCategory("alumite");
		alumiteCategory.setComment("Setup base stats of alumite");

		Property alumiteharvestLevelProperty = minconfig.get("alumite", "alumiteHarvestLevel", 5);
		alumiteharvestLevelProperty.comment = "sets the harvest level of alumite (Tic default 4)";
		alumiteharvestLevel = alumiteharvestLevelProperty.getInt();
		alumiteharvestLevelProperty.set(alumiteharvestLevel);

		Property alumitedurabilityProperty = minconfig.get("alumite", "alumitedurability", 550);
		alumitedurabilityProperty.comment = "sets the base durability of alumite (Tic default 550)";
		alumitedurability = alumitedurabilityProperty.getInt(550);
		alumitedurabilityProperty.set(alumitedurability);

		Property alumiteminingspeedProperty = minconfig.get("alumite", "miningspeed", 800);
		alumiteminingspeedProperty.comment = "sets the mining speed of alumite (Tic default 800)";
		alumiteminingspeed = alumiteminingspeedProperty.getInt(800);
		alumiteminingspeedProperty.set(alumiteminingspeed);

		Property alumiteattackProperty = minconfig.get("alumite", "alumiteattack", 4);
		alumiteattackProperty.comment = "sets the attack of alumite (Tic default 3)";
		alumiteattack = alumiteattackProperty.getInt();
		alumiteattackProperty.set(alumiteattack);

		Property alumitehandleModifierProperty = minconfig.get("alumite", "alumitehandleModifier", 1.3);
		alumitehandleModifierProperty.comment = "sets the handle modifier of alumite (Tic default 1.3)";
		alumitehandleModifier = (float) alumitehandleModifierProperty.getDouble(1.3);
		alumitehandleModifierProperty.set(alumitehandleModifier);

		Property alumitereinforcedProperty = minconfig.get("alumite", "alumitereinforcedLevel", 2);
		alumitereinforcedProperty.comment = "sets the reinforced level of alumite (Tic default 2)";
		alumitereinforced = alumitereinforcedProperty.getInt();
		alumitereinforcedProperty.set(alumitereinforced);

		Property alumitestoneboundProperty = minconfig.get("alumite", "alumitestonebound", 0.0);
		alumitestoneboundProperty.comment = "sets the stonebound level of alumite (Tic default 0.0)";
		alumitestonebound = (float) alumitestoneboundProperty.getDouble(0);
		alumitestoneboundProperty.set(alumitestonebound);

		// Ardite
		ConfigCategory arditeCategory = minconfig.getCategory("ardite");
		arditeCategory.setComment("Setup base stats of ardite");

		Property arditeharvestLevelProperty = minconfig.get("ardite", "arditeHarvestLevel", 6);
		arditeharvestLevelProperty.comment = "sets the harvest level of ardite (Tic default 4)";
		arditeharvestLevel = arditeharvestLevelProperty.getInt();
		arditeharvestLevelProperty.set(arditeharvestLevel);

		Property arditedurabilityProperty = minconfig.get("ardite", "arditedurability", 600);
		arditedurabilityProperty.comment = "sets the base durability of ardite (Tic default 600)";
		arditedurability = arditedurabilityProperty.getInt(600);
		arditedurabilityProperty.set(arditedurability);

		Property arditeminingspeedProperty = minconfig.get("ardite", "arditeminingspeed", 800);
		arditeminingspeedProperty.comment = "sets the mining speed of ardite (Tic default 800)";
		arditeminingspeed = arditeminingspeedProperty.getInt(800);
		arditeminingspeedProperty.set(arditeminingspeed);

		Property arditeattackProperty = minconfig.get("ardite", "arditeattack", 4);
		arditeattackProperty.comment = "sets the attack of ardite (Tic default 3)";
		arditeattack = arditeattackProperty.getInt();
		arditeattackProperty.set(arditeattack);

		Property arditehandleModifierProperty = minconfig.get("ardite", "arditehandleModifier", 2.0);
		arditehandleModifierProperty.comment = "sets the handle modifier of ardite (Tic default 2.0)";
		arditehandleModifier = (float) arditehandleModifierProperty.getDouble(2);
		arditehandleModifierProperty.set(arditehandleModifier);

		Property arditereinforcedProperty = minconfig.get("ardite", "arditereinforcedLevel", 0);
		arditereinforcedProperty.comment = "sets the reinforced level of ardite (Tic default 0)";
		arditereinforced = arditereinforcedProperty.getInt();
		arditereinforcedProperty.set(arditereinforced);

		Property arditestoneboundProperty = minconfig.get("ardite", "arditestonebound", 2.0);
		arditestoneboundProperty.comment = "sets the stonebound level of ardite (Tic default 2.0)";
		arditestonebound = (float) arditestoneboundProperty.getDouble(2);
		arditestoneboundProperty.set(arditestonebound);

		// Cobalt
		ConfigCategory cobaltCategory = minconfig.getCategory("cobalt");
		cobaltCategory.setComment("Setup base stats of cobalt");

		Property cobaltharvestLevelProperty = minconfig.get("cobalt", "cobaltHarvestLevel", 7);
		cobaltharvestLevelProperty.comment = "sets the harvest level of cobalt (Tic default 4)";
		cobaltharvestLevel = cobaltharvestLevelProperty.getInt();
		cobaltharvestLevelProperty.set(cobaltharvestLevel);

		Property cobaltdurabilityProperty = minconfig.get("cobalt", "cobaltdurability", 800);
		cobaltdurabilityProperty.comment = "sets the base durability of cobalt (Tic default 800)";
		cobaltdurability = cobaltdurabilityProperty.getInt(800);
		cobaltdurabilityProperty.set(cobaltdurability);

		Property cobaltminingspeedProperty = minconfig.get("cobalt", "cobaltminingspeed", 1100);
		cobaltminingspeedProperty.comment = "sets the mining speed of cobalt (Tic default 1100)";
		cobaltminingspeed = cobaltminingspeedProperty.getInt(1100);
		cobaltminingspeedProperty.set(cobaltminingspeed);

		Property cobaltattackProperty = minconfig.get("cobalt", "cobaltattack", 4);
		cobaltattackProperty.comment = "sets the attack of cobalt (Tic default 3)";
		cobaltattack = cobaltattackProperty.getInt();
		cobaltattackProperty.set(cobaltattack);

		Property cobalthandleModifierProperty = minconfig.get("cobalt", "cobalthandleModifier", 1.75);
		cobalthandleModifierProperty.comment = "sets the handle modifier of cobalt (Tic default 1.75)";
		cobalthandleModifier = (float) cobalthandleModifierProperty.getDouble(1.75);
		cobalthandleModifierProperty.set(cobalthandleModifier);

		Property cobaltreinforcedProperty = minconfig.get("cobalt", "cobaltreinforcedLevel", 2);
		cobaltreinforcedProperty.comment = "sets the reinforced level of cobalt (Tic default 2)";
		cobaltreinforced = cobaltreinforcedProperty.getInt();
		cobaltreinforcedProperty.set(cobaltreinforced);

		Property cobaltstoneboundProperty = minconfig.get("cobalt", "cobaltstonebound", 0.0);
		cobaltstoneboundProperty.comment = "sets the stonebound level of cobalt (Tic default 0.0)";
		cobaltstonebound = (float) cobaltstoneboundProperty.getDouble(0);
		cobaltstoneboundProperty.set(cobaltstonebound);

		// Manyullyn
		ConfigCategory manyullynCategory = minconfig.getCategory("manyullyn");
		manyullynCategory.setComment("Setup base stats of manyullyn");

		Property manyullynharvestLevelProperty = minconfig.get("manyullyn", "manyullynHarvestLevel", 8);
		manyullynharvestLevelProperty.comment = "sets the harvest level of manyullyn (Tic default 5)";
		manyullynharvestLevel = manyullynharvestLevelProperty.getInt();
		manyullynharvestLevelProperty.set(manyullynharvestLevel);

		Property manyullyndurabilityProperty = minconfig.get("manyullyn", "manyullyndurability", 1200);
		manyullyndurabilityProperty.comment = "sets the base durability of manyullyn (Tic default 1200)";
		manyullyndurability = manyullyndurabilityProperty.getInt(1200);
		manyullyndurabilityProperty.set(manyullyndurability);

		Property manyullynminingspeedProperty = minconfig.get("manyullyn", "manyullynminingspeed", 900);
		manyullynminingspeedProperty.comment = "sets the mining speed of manyullyn (Tic default 900)";
		manyullynminingspeed = manyullynminingspeedProperty.getInt(900);
		manyullynminingspeedProperty.set(manyullynminingspeed);

		Property manyullynattackProperty = minconfig.get("manyullyn", "manyullynattack", 5);
		manyullynattackProperty.comment = "sets the attack of manyullyn (Tic default 4)";
		manyullynattack = manyullynattackProperty.getInt();
		manyullynattackProperty.set(manyullynattack);

		Property manyullynhandleModifierProperty = minconfig.get("manyullyn", "manyullynhandleModifier", 2.5);
		manyullynhandleModifierProperty.comment = "sets the handle modifier of manyullyn (Tic default 2.5)";
		manyullynhandleModifier = (float) manyullynhandleModifierProperty.getDouble(2.5);
		manyullynhandleModifierProperty.set(manyullynhandleModifier);

		Property manyullynreinforcedProperty = minconfig.get("manyullyn", "manyullynreinforcedLevel", 0);
		manyullynreinforcedProperty.comment = "sets the reinforced level of manyullyn (Tic default 0)";
		manyullynreinforced = manyullynreinforcedProperty.getInt();
		manyullynreinforcedProperty.set(manyullynreinforced);

		Property manyullynstoneboundProperty = minconfig.get("manyullyn", "manyullynstonebound", 0.0);
		manyullynstoneboundProperty.comment = "sets the stonebound level of manyullyn (Tic default 0.0)";
		manyullynstonebound = (float) manyullynstoneboundProperty.getDouble(0);
		manyullynstoneboundProperty.set(manyullynstonebound);

		// Thaumium
		ConfigCategory thaumiumCategory = minconfig.getCategory("thaumium");
		thaumiumCategory.setComment("Setup base stats of thaumium");

		Property thaumiumharvestLevelProperty = minconfig.get("thaumium", "thaumiumHarvestLevel", 3);
		thaumiumharvestLevelProperty.comment = "sets the harvest level of thaumium (Tic default 3)";
		thaumiumharvestLevel = thaumiumharvestLevelProperty.getInt();
		thaumiumharvestLevelProperty.set(thaumiumharvestLevel);

		Property thaumiumdurabilityProperty = minconfig.get("thaumium", "thaumiumdurability", 200);
		thaumiumdurabilityProperty.comment = "sets the base durability of thaumium (Tic default 400)";
		thaumiumdurability = thaumiumdurabilityProperty.getInt(200);
		thaumiumdurabilityProperty.set(thaumiumdurability);

		Property thaumiumminingspeedProperty = minconfig.get("thaumium", "thaumiumminingspeed", 600);
		thaumiumminingspeedProperty.comment = "sets the mining speed of thaumium (Tic default 700)";
		thaumiumminingspeed = thaumiumminingspeedProperty.getInt(600);
		thaumiumminingspeedProperty.set(thaumiumminingspeed);

		Property thaumiumattackProperty = minconfig.get("thaumium", "thaumiumattack", 3);
		thaumiumattackProperty.comment = "sets the attack of thaumium (Tic default 2)";
		thaumiumattack = thaumiumattackProperty.getInt();
		thaumiumattackProperty.set(thaumiumattack);

		Property thaumiumhandleModifierProperty = minconfig.get("thaumium", "thaumiumhandleModifier", 1.3);
		thaumiumhandleModifierProperty.comment = "sets the handle modifier of thaumium (Tic default 1.3)";
		thaumiumhandleModifier = (float) thaumiumhandleModifierProperty.getDouble(1.3);
		thaumiumhandleModifierProperty.set(thaumiumhandleModifier);

		Property thaumiumreinforcedProperty = minconfig.get("thaumium", "reinforcedLevel", 0);
		thaumiumreinforcedProperty.comment = "sets the reinforced level of thaumium (Tic default 0)";
		thaumiumreinforced = thaumiumreinforcedProperty.getInt();
		thaumiumreinforcedProperty.set(thaumiumreinforced);

		Property thaumiumstoneboundProperty = minconfig.get("thaumium", "thaumiumstonebound", 0.0);
		thaumiumstoneboundProperty.comment = "sets the stonebound level of thaumium (Tic default 0.0)";
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
		
		// silver
		ConfigCategory silverCategory = minconfig.getCategory("silver");
		silverCategory.setComment("Setup base stats of silver");

		Property silverharvestLevelProperty = minconfig.get("silver", "silverHarvestLevel", 0);
		silverharvestLevelProperty.comment = "sets the harvest level of silver";
		silverharvestLevel = silverharvestLevelProperty.getInt();
		silverharvestLevelProperty.set(silverharvestLevel);

		Property silverdurabilityProperty = minconfig.get("silver", "silverdurability", 25);
		silverdurabilityProperty.comment = "sets the base durability of silver";
		silverdurability = silverdurabilityProperty.getInt();
		silverdurabilityProperty.set(silverdurability);

		Property silverminingspeedProperty = minconfig.get("silver", "silverminingspeed", 1600);
		silverminingspeedProperty.comment = "sets the mining speed of silver";
		silverminingspeed = silverminingspeedProperty.getInt();
		silverminingspeedProperty.set(silverminingspeed);

		Property silverattackProperty = minconfig.get("silver", "silverattack", 2);
		silverattackProperty.comment = "sets the attack of silver";
		silverattack = silverattackProperty.getInt();
		silverattackProperty.set(silverattack);

		Property silverhandleModifierProperty = minconfig.get("silver", "silverhandleModifier", 0.2);
		silverhandleModifierProperty.comment = "sets the handle modifier of silver";
		silverhandleModifier = (float) silverhandleModifierProperty.getDouble(0.2);
		silverhandleModifierProperty.set(silverhandleModifier);

		Property silverreinforcedProperty = minconfig.get("silver", "silverreinforcedLevel", 0);
		silverreinforcedProperty.comment = "sets the reinforced level of silver";
		silverreinforced = silverreinforcedProperty.getInt();
		silverreinforcedProperty.set(silverreinforced);

		Property silverstoneboundProperty = minconfig.get("silver", "silverstonebound", 0.0);
		silverstoneboundProperty.comment = "sets the stonebound level of silver";
		silverstonebound = (float) silverstoneboundProperty.getDouble(0);
		silverstoneboundProperty.set(silverstonebound);

		// ignatius
		ConfigCategory ignatiusCategory = minconfig.getCategory("ignatius");
		ignatiusCategory.setComment("Setup base stats of ignatius");

		Property ignatiusharvestLevelProperty = minconfig.get("ignatius", "ignatiusHarvestLevel", 0);
		ignatiusharvestLevelProperty.comment = "sets the harvest level of ignatius";
		ignatiusharvestLevel = ignatiusharvestLevelProperty.getInt();
		ignatiusharvestLevelProperty.set(ignatiusharvestLevel);

		Property ignatiusdurabilityProperty = minconfig.get("ignatius", "ignatiusdurability", 200);
		ignatiusdurabilityProperty.comment = "sets the base durability of ignatius";
		ignatiusdurability = ignatiusdurabilityProperty.getInt();
		ignatiusdurabilityProperty.set(ignatiusdurability);

		Property ignatiusminingspeedProperty = minconfig.get("ignatius", "ignatiusminingspeed", 400);
		ignatiusminingspeedProperty.comment = "sets the mining speed of ignatius";
		ignatiusminingspeed = ignatiusminingspeedProperty.getInt();
		ignatiusminingspeedProperty.set(ignatiusminingspeed);

		Property ignatiusattackProperty = minconfig.get("ignatius", "ignatiusattack", 3);
		ignatiusattackProperty.comment = "sets the attack of ignatius";
		ignatiusattack = ignatiusattackProperty.getInt();
		ignatiusattackProperty.set(ignatiusattack);

		Property ignatiushandleModifierProperty = minconfig.get("ignatius", "ignatiushandleModifier", 1.0);
		ignatiushandleModifierProperty.comment = "sets the handle modifier of ignatius";
		ignatiushandleModifier = (float) ignatiushandleModifierProperty.getDouble(1.0);
		ignatiushandleModifierProperty.set(ignatiushandleModifier);

		Property ignatiusreinforcedProperty = minconfig.get("ignatius", "ignatiusreinforcedLevel", 0);
		ignatiusreinforcedProperty.comment = "sets the reinforced level of ignatius";
		ignatiusreinforced = ignatiusreinforcedProperty.getInt();
		ignatiusreinforcedProperty.set(ignatiusreinforced);

		Property ignatiusstoneboundProperty = minconfig.get("ignatius", "ignatiusstonebound", 0.0);
		ignatiusstoneboundProperty.comment = "sets the stonebound level of ignatius";
		ignatiusstonebound = (float) ignatiusstoneboundProperty.getDouble(0);
		ignatiusstoneboundProperty.set(ignatiusstonebound);

		// shadowIron
		ConfigCategory shadowIronCategory = minconfig.getCategory("shadowIron");
		shadowIronCategory.setComment("Setup base stats of shadowIron");

		Property shadowIronharvestLevelProperty = minconfig.get("shadowIron", "shadowIronHarvestLevel", 0);
		shadowIronharvestLevelProperty.comment = "sets the harvest level of shadowIron";
		shadowIronharvestLevel = shadowIronharvestLevelProperty.getInt();
		shadowIronharvestLevelProperty.set(shadowIronharvestLevel);

		Property shadowIrondurabilityProperty = minconfig.get("shadowIron", "shadowIrondurability", 300);
		shadowIrondurabilityProperty.comment = "sets the base durability of shadowIron";
		shadowIrondurability = shadowIrondurabilityProperty.getInt();
		shadowIrondurabilityProperty.set(shadowIrondurability);

		Property shadowIronminingspeedProperty = minconfig.get("shadowIron", "shadowIronminingspeed", 400);
		shadowIronminingspeedProperty.comment = "sets the mining speed of shadowIron";
		shadowIronminingspeed = shadowIronminingspeedProperty.getInt();
		shadowIronminingspeedProperty.set(shadowIronminingspeed);

		Property shadowIronattackProperty = minconfig.get("shadowIron", "shadowIronattack", 3);
		shadowIronattackProperty.comment = "sets the attack of shadowIron";
		shadowIronattack = shadowIronattackProperty.getInt();
		shadowIronattackProperty.set(shadowIronattack);

		Property shadowIronhandleModifierProperty = minconfig.get("shadowIron", "shadowIronhandleModifier", 1.3);
		shadowIronhandleModifierProperty.comment = "sets the handle modifier of shadowIron";
		shadowIronhandleModifier = (float) shadowIronhandleModifierProperty.getDouble(1.3);
		shadowIronhandleModifierProperty.set(shadowIronhandleModifier);

		Property shadowIronreinforcedProperty = minconfig.get("shadowIron", "shadowIronreinforcedLevel", 0);
		shadowIronreinforcedProperty.comment = "sets the reinforced level of shadowIron";
		shadowIronreinforced = shadowIronreinforcedProperty.getInt();
		shadowIronreinforcedProperty.set(shadowIronreinforced);

		Property shadowIronstoneboundProperty = minconfig.get("shadowIron", "shadowIronstonebound", 0.0);
		shadowIronstoneboundProperty.comment = "sets the stonebound level of shadowIron";
		shadowIronstonebound = (float) shadowIronstoneboundProperty.getDouble(0);
		shadowIronstoneboundProperty.set(shadowIronstonebound);

		// prometheum
		ConfigCategory prometheumCategory = minconfig.getCategory("prometheum");
		prometheumCategory.setComment("Setup base stats of prometheum");

		Property prometheumharvestLevelProperty = minconfig.get("prometheum", "prometheumHarvestLevel", 0);
		prometheumharvestLevelProperty.comment = "sets the harvest level of prometheum";
		prometheumharvestLevel = prometheumharvestLevelProperty.getInt();
		prometheumharvestLevelProperty.set(prometheumharvestLevel);

		Property prometheumdurabilityProperty = minconfig.get("prometheum", "prometheumdurability", 200);
		prometheumdurabilityProperty.comment = "sets the base durability of prometheum";
		prometheumdurability = prometheumdurabilityProperty.getInt();
		prometheumdurabilityProperty.set(prometheumdurability);

		Property prometheumminingspeedProperty = minconfig.get("prometheum", "prometheumminingspeed", 400);
		prometheumminingspeedProperty.comment = "sets the mining speed of prometheum";
		prometheumminingspeed = prometheumminingspeedProperty.getInt();
		prometheumminingspeedProperty.set(prometheumminingspeed);

		Property prometheumattackProperty = minconfig.get("prometheum", "prometheumattack", 2);
		prometheumattackProperty.comment = "sets the attack of prometheum";
		prometheumattack = prometheumattackProperty.getInt();
		prometheumattackProperty.set(prometheumattack);

		Property prometheumhandleModifierProperty = minconfig.get("prometheum", "prometheumhandleModifier", 1.0);
		prometheumhandleModifierProperty.comment = "sets the handle modifier of prometheum";
		prometheumhandleModifier = (float) prometheumhandleModifierProperty.getDouble(1.0);
		prometheumhandleModifierProperty.set(prometheumhandleModifier);

		Property prometheumreinforcedProperty = minconfig.get("prometheum", "prometheumreinforcedLevel", 0);
		prometheumreinforcedProperty.comment = "sets the reinforced level of prometheum";
		prometheumreinforced = prometheumreinforcedProperty.getInt();
		prometheumreinforcedProperty.set(prometheumreinforced);

		Property prometheumstoneboundProperty = minconfig.get("prometheum", "prometheumstonebound", 0.0);
		prometheumstoneboundProperty.comment = "sets the stonebound level of prometheum";
		prometheumstonebound = (float) prometheumstoneboundProperty.getDouble(0);
		prometheumstoneboundProperty.set(prometheumstonebound);

		// platinum
		ConfigCategory platinumCategory = minconfig.getCategory("platinum");
		platinumCategory.setComment("Setup base stats of platinum");

		Property platinumharvestLevelProperty = minconfig.get("platinum", "platinumHarvestLevel", 3);
		platinumharvestLevelProperty.comment = "sets the harvest level of platinum";
		platinumharvestLevel = platinumharvestLevelProperty.getInt();
		platinumharvestLevelProperty.set(platinumharvestLevel);

		Property platinumdurabilityProperty = minconfig.get("platinum", "platinumdurability", 100);
		platinumdurabilityProperty.comment = "sets the base durability of platinum";
		platinumdurability = platinumdurabilityProperty.getInt();
		platinumdurabilityProperty.set(platinumdurability);

		Property platinumminingspeedProperty = minconfig.get("platinum", "platinumminingspeed", 2400);
		platinumminingspeedProperty.comment = "sets the mining speed of platinum";
		platinumminingspeed = platinumminingspeedProperty.getInt();
		platinumminingspeedProperty.set(platinumminingspeed);

		Property platinumattackProperty = minconfig.get("platinum", "platinumattack", 2);
		platinumattackProperty.comment = "sets the attack of platinum";
		platinumattack = platinumattackProperty.getInt();
		platinumattackProperty.set(platinumattack);

		Property platinumhandleModifierProperty = minconfig.get("platinum", "platinumhandleModifier", 0.75);
		platinumhandleModifierProperty.comment = "sets the handle modifier of platinum";
		platinumhandleModifier = (float) platinumhandleModifierProperty.getDouble(0.75);
		platinumhandleModifierProperty.set(platinumhandleModifier);

		Property platinumreinforcedProperty = minconfig.get("platinum", "platinumreinforcedLevel", 0);
		platinumreinforcedProperty.comment = "sets the reinforced level of platinum";
		platinumreinforced = platinumreinforcedProperty.getInt();
		platinumreinforcedProperty.set(platinumreinforced);

		Property platinumstoneboundProperty = minconfig.get("platinum", "platinumstonebound", 0.0);
		platinumstoneboundProperty.comment = "sets the stonebound level of platinum";
		platinumstonebound = (float) platinumstoneboundProperty.getDouble(0);
		platinumstoneboundProperty.set(platinumstonebound);

		// shadowSteel
		ConfigCategory shadowSteelCategory = minconfig.getCategory("shadowSteel");
		shadowSteelCategory.setComment("Setup base stats of shadowSteel");

		Property shadowSteelharvestLevelProperty = minconfig.get("shadowSteel", "shadowSteelHarvestLevel", 3);
		shadowSteelharvestLevelProperty.comment = "sets the harvest level of shadowSteel";
		shadowSteelharvestLevel = shadowSteelharvestLevelProperty.getInt();
		shadowSteelharvestLevelProperty.set(shadowSteelharvestLevel);

		Property shadowSteeldurabilityProperty = minconfig.get("shadowSteel", "shadowSteeldurability", 400);
		shadowSteeldurabilityProperty.comment = "sets the base durability of shadowSteel";
		shadowSteeldurability = shadowSteeldurabilityProperty.getInt();
		shadowSteeldurabilityProperty.set(shadowSteeldurability);

		Property shadowSteelminingspeedProperty = minconfig.get("shadowSteel", "shadowSteelminingspeed", 600);
		shadowSteelminingspeedProperty.comment = "sets the mining speed of shadowSteel";
		shadowSteelminingspeed = shadowSteelminingspeedProperty.getInt();
		shadowSteelminingspeedProperty.set(shadowSteelminingspeed);

		Property shadowSteelattackProperty = minconfig.get("shadowSteel", "shadowSteelattack", 4);
		shadowSteelattackProperty.comment = "sets the attack of shadowSteel";
		shadowSteelattack = shadowSteelattackProperty.getInt();
		shadowSteelattackProperty.set(shadowSteelattack);

		Property shadowSteelhandleModifierProperty = minconfig.get("shadowSteel", "shadowSteelhandleModifier", 1.3);
		shadowSteelhandleModifierProperty.comment = "sets the handle modifier of shadowSteel";
		shadowSteelhandleModifier = (float) shadowSteelhandleModifierProperty.getDouble(1.3);
		shadowSteelhandleModifierProperty.set(shadowSteelhandleModifier);

		Property shadowSteelreinforcedProperty = minconfig.get("shadowSteel", "shadowSteelreinforcedLevel", 2);
		shadowSteelreinforcedProperty.comment = "sets the reinforced level of shadowSteel";
		shadowSteelreinforced = shadowSteelreinforcedProperty.getInt();
		shadowSteelreinforcedProperty.set(shadowSteelreinforced);

		Property shadowSteelstoneboundProperty = minconfig.get("shadowSteel", "shadowSteelstonebound", 0.0);
		shadowSteelstoneboundProperty.comment = "sets the stonebound level of shadowSteel";
		shadowSteelstonebound = (float) shadowSteelstoneboundProperty.getDouble(0);
		shadowSteelstoneboundProperty.set(shadowSteelstonebound);

		// blackSteel
		ConfigCategory blackSteelCategory = minconfig.getCategory("blackSteel");
		blackSteelCategory.setComment("Setup base stats of blackSteel");

		Property blackSteelharvestLevelProperty = minconfig.get("blackSteel", "blackSteelHarvestLevel", 3);
		blackSteelharvestLevelProperty.comment = "sets the harvest level of blackSteel";
		blackSteelharvestLevel = blackSteelharvestLevelProperty.getInt();
		blackSteelharvestLevelProperty.set(blackSteelharvestLevel);

		Property blackSteeldurabilityProperty = minconfig.get("blackSteel", "blackSteeldurability", 500);
		blackSteeldurabilityProperty.comment = "sets the base durability of blackSteel";
		blackSteeldurability = blackSteeldurabilityProperty.getInt();
		blackSteeldurabilityProperty.set(blackSteeldurability);

		Property blackSteelminingspeedProperty = minconfig.get("blackSteel", "blackSteelminingspeed", 800);
		blackSteelminingspeedProperty.comment = "sets the mining speed of blackSteel";
		blackSteelminingspeed = blackSteelminingspeedProperty.getInt();
		blackSteelminingspeedProperty.set(blackSteelminingspeed);

		Property blackSteelattackProperty = minconfig.get("blackSteel", "blackSteelattack", 3);
		blackSteelattackProperty.comment = "sets the attack of blackSteel";
		blackSteelattack = blackSteelattackProperty.getInt();
		blackSteelattackProperty.set(blackSteelattack);

		Property blackSteelhandleModifierProperty = minconfig.get("blackSteel", "blackSteelhandleModifier", 1.3);
		blackSteelhandleModifierProperty.comment = "sets the handle modifier of blackSteel";
		blackSteelhandleModifier = (float) blackSteelhandleModifierProperty.getDouble(1.3);
		blackSteelhandleModifierProperty.set(blackSteelhandleModifier);

		Property blackSteelreinforcedProperty = minconfig.get("blackSteel", "blackSteelreinforcedLevel", 2);
		blackSteelreinforcedProperty.comment = "sets the reinforced level of blackSteel";
		blackSteelreinforced = blackSteelreinforcedProperty.getInt();
		blackSteelreinforcedProperty.set(blackSteelreinforced);

		Property blackSteelstoneboundProperty = minconfig.get("blackSteel", "blackSteelstonebound", 0.0);
		blackSteelstoneboundProperty.comment = "sets the stonebound level of blackSteel";
		blackSteelstonebound = (float) blackSteelstoneboundProperty.getDouble(0);
		blackSteelstoneboundProperty.set(blackSteelstonebound);

		// deepIron
		ConfigCategory deepIronCategory = minconfig.getCategory("deepIron");
		deepIronCategory.setComment("Setup base stats of deepIron");

		Property deepIronharvestLevelProperty = minconfig.get("deepIron", "deepIronHarvestLevel", 3);
		deepIronharvestLevelProperty.comment = "sets the harvest level of deepIron";
		deepIronharvestLevel = deepIronharvestLevelProperty.getInt();
		deepIronharvestLevelProperty.set(deepIronharvestLevel);

		Property deepIrondurabilityProperty = minconfig.get("deepIron", "deepIrondurability", 250);
		deepIrondurabilityProperty.comment = "sets the base durability of deepIron";
		deepIrondurability = deepIrondurabilityProperty.getInt();
		deepIrondurabilityProperty.set(deepIrondurability);

		Property deepIronminingspeedProperty = minconfig.get("deepIron", "deepIronminingspeed", 600);
		deepIronminingspeedProperty.comment = "sets the mining speed of deepIron";
		deepIronminingspeed = deepIronminingspeedProperty.getInt();
		deepIronminingspeedProperty.set(deepIronminingspeed);

		Property deepIronattackProperty = minconfig.get("deepIron", "deepIronattack", 3);
		deepIronattackProperty.comment = "sets the attack of deepIron";
		deepIronattack = deepIronattackProperty.getInt();
		deepIronattackProperty.set(deepIronattack);

		Property deepIronhandleModifierProperty = minconfig.get("deepIron", "deepIronhandleModifier", 1.3);
		deepIronhandleModifierProperty.comment = "sets the handle modifier of deepIron";
		deepIronhandleModifier = (float) deepIronhandleModifierProperty.getDouble(1.3);
		deepIronhandleModifierProperty.set(deepIronhandleModifier);

		Property deepIronreinforcedProperty = minconfig.get("deepIron", "deepIronreinforcedLevel", 1);
		deepIronreinforcedProperty.comment = "sets the reinforced level of deepIron";
		deepIronreinforced = deepIronreinforcedProperty.getInt();
		deepIronreinforcedProperty.set(deepIronreinforced);

		Property deepIronstoneboundProperty = minconfig.get("deepIron", "deepIronstonebound", 0.0);
		deepIronstoneboundProperty.comment = "sets the stonebound level of deepIron";
		deepIronstonebound = (float) deepIronstoneboundProperty.getDouble(0);
		deepIronstoneboundProperty.set(deepIronstonebound);

		// angmallen
		ConfigCategory angmallenCategory = minconfig.getCategory("angmallen");
		angmallenCategory.setComment("Setup base stats of angmallen");

		Property angmallenharvestLevelProperty = minconfig.get("angmallen", "angmallenHarvestLevel", 4);
		angmallenharvestLevelProperty.comment = "sets the harvest level of angmallen";
		angmallenharvestLevel = angmallenharvestLevelProperty.getInt();
		angmallenharvestLevelProperty.set(angmallenharvestLevel);

		Property angmallendurabilityProperty = minconfig.get("angmallen", "angmallendurability", 300);
		angmallendurabilityProperty.comment = "sets the base durability of angmallen";
		angmallendurability = angmallendurabilityProperty.getInt();
		angmallendurabilityProperty.set(angmallendurability);

		Property angmallenminingspeedProperty = minconfig.get("angmallen", "angmallenminingspeed", 800);
		angmallenminingspeedProperty.comment = "sets the mining speed of angmallen";
		angmallenminingspeed = angmallenminingspeedProperty.getInt();
		angmallenminingspeedProperty.set(angmallenminingspeed);

		Property angmallenattackProperty = minconfig.get("angmallen", "angmallenattack", 3);
		angmallenattackProperty.comment = "sets the attack of angmallen";
		angmallenattack = angmallenattackProperty.getInt();
		angmallenattackProperty.set(angmallenattack);

		Property angmallenhandleModifierProperty = minconfig.get("angmallen", "angmallenhandleModifier", 1.0);
		angmallenhandleModifierProperty.comment = "sets the handle modifier of angmallen";
		angmallenhandleModifier = (float) angmallenhandleModifierProperty.getDouble(1.0);
		angmallenhandleModifierProperty.set(angmallenhandleModifier);

		Property angmallenreinforcedProperty = minconfig.get("angmallen", "angmallenreinforcedLevel", 0);
		angmallenreinforcedProperty.comment = "sets the reinforced level of angmallen";
		angmallenreinforced = angmallenreinforcedProperty.getInt();
		angmallenreinforcedProperty.set(angmallenreinforced);

		Property angmallenstoneboundProperty = minconfig.get("angmallen", "angmallenstonebound", 0);
		angmallenstoneboundProperty.comment = "sets the stonebound level of angmallen";
		angmallenstonebound = (float) angmallenstoneboundProperty.getDouble(0);
		angmallenstoneboundProperty.set(angmallenstonebound);

		// hepatizon
		ConfigCategory hepatizonCategory = minconfig.getCategory("hepatizon");
		hepatizonCategory.setComment("Setup base stats of hepatizon");

		Property hepatizonharvestLevelProperty = minconfig.get("hepatizon", "hepatizonHarvestLevel", 4);
		hepatizonharvestLevelProperty.comment = "sets the harvest level of hepatizon";
		hepatizonharvestLevel = hepatizonharvestLevelProperty.getInt();
		hepatizonharvestLevelProperty.set(hepatizonharvestLevel);

		Property hepatizondurabilityProperty = minconfig.get("hepatizon", "hepatizondurability", 300);
		hepatizondurabilityProperty.comment = "sets the base durability of hepatizon";
		hepatizondurability = hepatizondurabilityProperty.getInt();
		hepatizondurabilityProperty.set(hepatizondurability);

		Property hepatizonminingspeedProperty = minconfig.get("hepatizon", "hepatizonminingspeed", 800);
		hepatizonminingspeedProperty.comment = "sets the mining speed of hepatizon";
		hepatizonminingspeed = hepatizonminingspeedProperty.getInt();
		hepatizonminingspeedProperty.set(hepatizonminingspeed);

		Property hepatizonattackProperty = minconfig.get("hepatizon", "hepatizonattack", 2);
		hepatizonattackProperty.comment = "sets the attack of hepatizon";
		hepatizonattack = hepatizonattackProperty.getInt();
		hepatizonattackProperty.set(hepatizonattack);

		Property hepatizonhandleModifierProperty = minconfig.get("hepatizon", "hepatizonhandleModifier", 1.2);
		hepatizonhandleModifierProperty.comment = "sets the handle modifier of hepatizon";
		hepatizonhandleModifier = (float) hepatizonhandleModifierProperty.getDouble(1.2);
		hepatizonhandleModifierProperty.set(hepatizonhandleModifier);

		Property hepatizonreinforcedProperty = minconfig.get("hepatizon", "hepatizonreinforcedLevel", 0);
		hepatizonreinforcedProperty.comment = "sets the reinforced level of hepatizon";
		hepatizonreinforced = hepatizonreinforcedProperty.getInt();
		hepatizonreinforcedProperty.set(hepatizonreinforced);

		Property hepatizonstoneboundProperty = minconfig.get("hepatizon", "hepatizonstonebound", 0);
		hepatizonstoneboundProperty.comment = "sets the stonebound level of hepatizon";
		hepatizonstonebound = (float) hepatizonstoneboundProperty.getDouble(0);
		hepatizonstoneboundProperty.set(hepatizonstonebound);

		// ceruclase
		ConfigCategory ceruclaseCategory = minconfig.getCategory("ceruclase");
		ceruclaseCategory.setComment("Setup base stats of ceruclase");

		Property ceruclaseharvestLevelProperty = minconfig.get("ceruclase", "ceruclaseHarvestLevel", 4);
		ceruclaseharvestLevelProperty.comment = "sets the harvest level of ceruclase";
		ceruclaseharvestLevel = ceruclaseharvestLevelProperty.getInt();
		ceruclaseharvestLevelProperty.set(ceruclaseharvestLevel);

		Property ceruclasedurabilityProperty = minconfig.get("ceruclase", "ceruclasedurability", 500);
		ceruclasedurabilityProperty.comment = "sets the base durability of ceruclase";
		ceruclasedurability = ceruclasedurabilityProperty.getInt();
		ceruclasedurabilityProperty.set(ceruclasedurability);

		Property ceruclaseminingspeedProperty = minconfig.get("ceruclase", "ceruclaseminingspeed", 700);
		ceruclaseminingspeedProperty.comment = "sets the mining speed of ceruclase";
		ceruclaseminingspeed = ceruclaseminingspeedProperty.getInt();
		ceruclaseminingspeedProperty.set(ceruclaseminingspeed);

		Property ceruclaseattackProperty = minconfig.get("ceruclase", "ceruclaseattack", 4);
		ceruclaseattackProperty.comment = "sets the attack of ceruclase";
		ceruclaseattack = ceruclaseattackProperty.getInt();
		ceruclaseattackProperty.set(ceruclaseattack);

		Property ceruclasehandleModifierProperty = minconfig.get("ceruclase", "ceruclasehandleModifier", 1.4);
		ceruclasehandleModifierProperty.comment = "sets the handle modifier of ceruclase";
		ceruclasehandleModifier = (float) ceruclasehandleModifierProperty.getDouble(1.4);
		ceruclasehandleModifierProperty.set(ceruclasehandleModifier);

		Property ceruclasereinforcedProperty = minconfig.get("ceruclase", "ceruclasereinforcedLevel", 0);
		ceruclasereinforcedProperty.comment = "sets the reinforced level of ceruclase";
		ceruclasereinforced = ceruclasereinforcedProperty.getInt();
		ceruclasereinforcedProperty.set(ceruclasereinforced);

		Property ceruclasestoneboundProperty = minconfig.get("ceruclase", "ceruclasestonebound", 0.0);
		ceruclasestoneboundProperty.comment = "sets the stonebound level of ceruclase";
		ceruclasestonebound = (float) ceruclasestoneboundProperty.getDouble(0);
		ceruclasestoneboundProperty.set(ceruclasestonebound);

		// midasium
		ConfigCategory midasiumCategory = minconfig.getCategory("midasium");
		midasiumCategory.setComment("Setup base stats of midasium");

		Property midasiumharvestLevelProperty = minconfig.get("midasium", "midasiumHarvestLevel", 4);
		midasiumharvestLevelProperty.comment = "sets the harvest level of midasium";
		midasiumharvestLevel = midasiumharvestLevelProperty.getInt();
		midasiumharvestLevelProperty.set(midasiumharvestLevel);

		Property midasiumdurabilityProperty = minconfig.get("midasium", "midasiumdurability", 100);
		midasiumdurabilityProperty.comment = "sets the base durability of midasium";
		midasiumdurability = midasiumdurabilityProperty.getInt();
		midasiumdurabilityProperty.set(midasiumdurability);

		Property midasiumminingspeedProperty = minconfig.get("midasium", "midasiumminingspeed", 1000);
		midasiumminingspeedProperty.comment = "sets the mining speed of midasium";
		midasiumminingspeed = midasiumminingspeedProperty.getInt();
		midasiumminingspeedProperty.set(midasiumminingspeed);

		Property midasiumattackProperty = minconfig.get("midasium", "midasiumattack", 4);
		midasiumattackProperty.comment = "sets the attack of midasium";
		midasiumattack = midasiumattackProperty.getInt();
		midasiumattackProperty.set(midasiumattack);

		Property midasiumhandleModifierProperty = minconfig.get("midasium", "midasiumhandleModifier", 1.0);
		midasiumhandleModifierProperty.comment = "sets the handle modifier of midasium";
		midasiumhandleModifier = (float) midasiumhandleModifierProperty.getDouble(1.0);
		midasiumhandleModifierProperty.set(midasiumhandleModifier);

		Property midasiumreinforcedProperty = minconfig.get("midasium", "midasiumreinforcedLevel", 0);
		midasiumreinforcedProperty.comment = "sets the reinforced level of midasium";
		midasiumreinforced = midasiumreinforcedProperty.getInt();
		midasiumreinforcedProperty.set(midasiumreinforced);

		Property midasiumstoneboundProperty = minconfig.get("midasium", "midasiumstonebound", 0.0);
		midasiumstoneboundProperty.comment = "sets the stonebound level of midasium";
		midasiumstonebound = (float) midasiumstoneboundProperty.getDouble(0);
		midasiumstoneboundProperty.set(midasiumstonebound);

		// vyroxeres
		ConfigCategory vyroxeresCategory = minconfig.getCategory("vyroxeres");
		vyroxeresCategory.setComment("Setup base stats of vyroxeres");

		Property vyroxeresharvestLevelProperty = minconfig.get("vyroxeres", "vyroxeresHarvestLevel", 4);
		vyroxeresharvestLevelProperty.comment = "sets the harvest level of vyroxeres";
		vyroxeresharvestLevel = vyroxeresharvestLevelProperty.getInt();
		vyroxeresharvestLevelProperty.set(vyroxeresharvestLevel);

		Property vyroxeresdurabilityProperty = minconfig.get("vyroxeres", "vyroxeresdurability", 300);
		vyroxeresdurabilityProperty.comment = "sets the base durability of vyroxeres";
		vyroxeresdurability = vyroxeresdurabilityProperty.getInt();
		vyroxeresdurabilityProperty.set(vyroxeresdurability);

		Property vyroxeresminingspeedProperty = minconfig.get("vyroxeres", "vyroxeresminingspeed", 700);
		vyroxeresminingspeedProperty.comment = "sets the mining speed of vyroxeres";
		vyroxeresminingspeed = vyroxeresminingspeedProperty.getInt();
		vyroxeresminingspeedProperty.set(vyroxeresminingspeed);

		Property vyroxeresattackProperty = minconfig.get("vyroxeres", "vyroxeresattack", 4);
		vyroxeresattackProperty.comment = "sets the attack of vyroxeres";
		vyroxeresattack = vyroxeresattackProperty.getInt();
		vyroxeresattackProperty.set(vyroxeresattack);

		Property vyroxereshandleModifierProperty = minconfig.get("vyroxeres", "vyroxereshandleModifier", 1.3);
		vyroxereshandleModifierProperty.comment = "sets the handle modifier of vyroxeres";
		vyroxereshandleModifier = (float) vyroxereshandleModifierProperty.getDouble(1.3);
		vyroxereshandleModifierProperty.set(vyroxereshandleModifier);

		Property vyroxeresreinforcedProperty = minconfig.get("vyroxeres", "vyroxeresreinforcedLevel", 0);
		vyroxeresreinforcedProperty.comment = "sets the reinforced level of vyroxeres";
		vyroxeresreinforced = vyroxeresreinforcedProperty.getInt();
		vyroxeresreinforcedProperty.set(vyroxeresreinforced);

		Property vyroxeresstoneboundProperty = minconfig.get("vyroxeres", "vyroxeresstonebound", 0.0);
		vyroxeresstoneboundProperty.comment = "sets the stonebound level of vyroxeres";
		vyroxeresstonebound = (float) vyroxeresstoneboundProperty.getDouble(0);
		vyroxeresstoneboundProperty.set(vyroxeresstonebound);

		// oureclase
		ConfigCategory oureclaseCategory = minconfig.getCategory("oureclase");
		oureclaseCategory.setComment("Setup base stats of oureclase");

		Property oureclaseharvestLevelProperty = minconfig.get("oureclase", "oureclaseHarvestLevel", 4);
		oureclaseharvestLevelProperty.comment = "sets the harvest level of oureclase";
		oureclaseharvestLevel = oureclaseharvestLevelProperty.getInt();
		oureclaseharvestLevelProperty.set(oureclaseharvestLevel);

		Property oureclasedurabilityProperty = minconfig.get("oureclase", "oureclasedurability", 750);
		oureclasedurabilityProperty.comment = "sets the base durability of oureclase";
		oureclasedurability = oureclasedurabilityProperty.getInt();
		oureclasedurabilityProperty.set(oureclasedurability);

		Property oureclaseminingspeedProperty = minconfig.get("oureclase", "oureclaseminingspeed", 800);
		oureclaseminingspeedProperty.comment = "sets the mining speed of oureclase";
		oureclaseminingspeed = oureclaseminingspeedProperty.getInt();
		oureclaseminingspeedProperty.set(oureclaseminingspeed);

		Property oureclaseattackProperty = minconfig.get("oureclase", "oureclaseattack", 3);
		oureclaseattackProperty.comment = "sets the attack of oureclase";
		oureclaseattack = oureclaseattackProperty.getInt();
		oureclaseattackProperty.set(oureclaseattack);

		Property oureclasehandleModifierProperty = minconfig.get("oureclase", "oureclasehandleModifier", 1.3);
		oureclasehandleModifierProperty.comment = "sets the handle modifier of oureclase";
		oureclasehandleModifier = (float) oureclasehandleModifierProperty.getDouble(1.3);
		oureclasehandleModifierProperty.set(oureclasehandleModifier);

		Property oureclasereinforcedProperty = minconfig.get("oureclase", "oureclasereinforcedLevel", 0);
		oureclasereinforcedProperty.comment = "sets the reinforced level of oureclase";
		oureclasereinforced = oureclasereinforcedProperty.getInt();
		oureclasereinforcedProperty.set(oureclasereinforced);

		Property oureclasestoneboundProperty = minconfig.get("oureclase", "oureclasestonebound", 0.0);
		oureclasestoneboundProperty.comment = "sets the stonebound level of oureclase";
		oureclasestonebound = (float) oureclasestoneboundProperty.getDouble(0);
		oureclasestoneboundProperty.set(oureclasestonebound);

		// eximite
		ConfigCategory eximiteCategory = minconfig.getCategory("eximite");
		eximiteCategory.setComment("Setup base stats of eximite");

		Property eximiteharvestLevelProperty = minconfig.get("eximite", "eximiteHarvestLevel", 4);
		eximiteharvestLevelProperty.comment = "sets the harvest level of eximite";
		eximiteharvestLevel = eximiteharvestLevelProperty.getInt();
		eximiteharvestLevelProperty.set(eximiteharvestLevel);

		Property eximitedurabilityProperty = minconfig.get("eximite", "eximitedurability", 1000);
		eximitedurabilityProperty.comment = "sets the base durability of eximite";
		eximitedurability = eximitedurabilityProperty.getInt();
		eximitedurabilityProperty.set(eximitedurability);

		Property eximiteminingspeedProperty = minconfig.get("eximite", "eximiteminingspeed", 800);
		eximiteminingspeedProperty.comment = "sets the mining speed of eximite";
		eximiteminingspeed = eximiteminingspeedProperty.getInt();
		eximiteminingspeedProperty.set(eximiteminingspeed);

		Property eximiteattackProperty = minconfig.get("eximite", "eximiteattack", 4);
		eximiteattackProperty.comment = "sets the attack of eximite";
		eximiteattack = eximiteattackProperty.getInt();
		eximiteattackProperty.set(eximiteattack);

		Property eximitehandleModifierProperty = minconfig.get("eximite", "eximitehandleModifier", 1.3);
		eximitehandleModifierProperty.comment = "sets the handle modifier of eximite";
		eximitehandleModifier = (float) eximitehandleModifierProperty.getDouble(1.3);
		eximitehandleModifierProperty.set(eximitehandleModifier);

		Property eximitereinforcedProperty = minconfig.get("eximite", "eximitereinforcedLevel", 0);
		eximitereinforcedProperty.comment = "sets the reinforced level of eximite";
		eximitereinforced = eximitereinforcedProperty.getInt();
		eximitereinforcedProperty.set(eximitereinforced);

		Property eximitestoneboundProperty = minconfig.get("eximite", "eximitestonebound", 0);
		eximitestoneboundProperty.comment = "sets the stonebound level of eximite";
		eximitestonebound = (float) eximitestoneboundProperty.getDouble(0);
		eximitestoneboundProperty.set(eximitestonebound);

		// damascusSteel
		ConfigCategory damascusSteelCategory = minconfig.getCategory("damascusSteel");
		damascusSteelCategory.setComment("Setup base stats of damascusSteel");

		Property damascusSteelharvestLevelProperty = minconfig.get("damascusSteel", "damascusSteelHarvestLevel", 5);
		damascusSteelharvestLevelProperty.comment = "sets the harvest level of damascusSteel";
		damascusSteelharvestLevel = damascusSteelharvestLevelProperty.getInt();
		damascusSteelharvestLevelProperty.set(damascusSteelharvestLevel);

		Property damascusSteeldurabilityProperty = minconfig.get("damascusSteel", "damascusSteeldurability", 500);
		damascusSteeldurabilityProperty.comment = "sets the base durability of damascusSteel";
		damascusSteeldurability = damascusSteeldurabilityProperty.getInt();
		damascusSteeldurabilityProperty.set(damascusSteeldurability);

		Property damascusSteelminingspeedProperty = minconfig.get("damascusSteel", "damascusSteelminingspeed", 600);
		damascusSteelminingspeedProperty.comment = "sets the mining speed of damascusSteel";
		damascusSteelminingspeed = damascusSteelminingspeedProperty.getInt();
		damascusSteelminingspeedProperty.set(damascusSteelminingspeed);

		Property damascusSteelattackProperty = minconfig.get("damascusSteel", "damascusSteelattack", 3);
		damascusSteelattackProperty.comment = "sets the attack of damascusSteel";
		damascusSteelattack = damascusSteelattackProperty.getInt();
		damascusSteelattackProperty.set(damascusSteelattack);

		Property damascusSteelhandleModifierProperty = minconfig.get("damascusSteel", "damascusSteelhandleModifier", 1.3);
		damascusSteelhandleModifierProperty.comment = "sets the handle modifier of damascusSteel";
		damascusSteelhandleModifier = (float) damascusSteelhandleModifierProperty.getDouble(1.3);
		damascusSteelhandleModifierProperty.set(damascusSteelhandleModifier);

		Property damascusSteelreinforcedProperty = minconfig.get("damascusSteel", "damascusSteelreinforcedLevel", 2);
		damascusSteelreinforcedProperty.comment = "sets the reinforced level of damascusSteel";
		damascusSteelreinforced = damascusSteelreinforcedProperty.getInt();
		damascusSteelreinforcedProperty.set(damascusSteelreinforced);

		Property damascusSteelstoneboundProperty = minconfig.get("damascusSteel", "damascusSteelstonebound", 0.0);
		damascusSteelstoneboundProperty.comment = "sets the stonebound level of damascusSteel";
		damascusSteelstonebound = (float) damascusSteelstoneboundProperty.getDouble(0);
		damascusSteelstoneboundProperty.set(damascusSteelstonebound);

		// amordrine
		ConfigCategory amordrineCategory = minconfig.getCategory("amordrine");
		amordrineCategory.setComment("Setup base stats of amordrine");

		Property amordrineharvestLevelProperty = minconfig.get("amordrine", "amordrineHarvestLevel", 5);
		amordrineharvestLevelProperty.comment = "sets the harvest level of amordrine";
		amordrineharvestLevel = amordrineharvestLevelProperty.getInt();
		amordrineharvestLevelProperty.set(amordrineharvestLevel);

		Property amordrinedurabilityProperty = minconfig.get("amordrine", "amordrinedurability", 1300);
		amordrinedurabilityProperty.comment = "sets the base durability of amordrine";
		amordrinedurability = amordrinedurabilityProperty.getInt();
		amordrinedurabilityProperty.set(amordrinedurability);

		Property amordrineminingspeedProperty = minconfig.get("amordrine", "amordrineminingspeed", 1400);
		amordrineminingspeedProperty.comment = "sets the mining speed of amordrine";
		amordrineminingspeed = amordrineminingspeedProperty.getInt();
		amordrineminingspeedProperty.set(amordrineminingspeed);

		Property amordrineattackProperty = minconfig.get("amordrine", "amordrineattack", 4);
		amordrineattackProperty.comment = "sets the attack of amordrine";
		amordrineattack = amordrineattackProperty.getInt();
		amordrineattackProperty.set(amordrineattack);

		Property amordrinehandleModifierProperty = minconfig.get("amordrine", "amordrinehandleModifier", 1.8);
		amordrinehandleModifierProperty.comment = "sets the handle modifier of amordrine";
		amordrinehandleModifier = (float) amordrinehandleModifierProperty.getDouble(1.8);
		amordrinehandleModifierProperty.set(amordrinehandleModifier);

		Property amordrinereinforcedProperty = minconfig.get("amordrine", "amordrinereinforcedLevel", 0);
		amordrinereinforcedProperty.comment = "sets the reinforced level of amordrine";
		amordrinereinforced = amordrinereinforcedProperty.getInt();
		amordrinereinforcedProperty.set(amordrinereinforced);

		Property amordrinestoneboundProperty = minconfig.get("amordrine", "amordrinestonebound", 0.0);
		amordrinestoneboundProperty.comment = "sets the stonebound level of amordrine";
		amordrinestonebound = (float) amordrinestoneboundProperty.getDouble(0);
		amordrinestoneboundProperty.set(amordrinestonebound);

		// inolashite
		ConfigCategory inolashiteCategory = minconfig.getCategory("inolashite");
		inolashiteCategory.setComment("Setup base stats of inolashite");

		Property inolashiteharvestLevelProperty = minconfig.get("inolashite", "inolashiteHarvestLevel", 5);
		inolashiteharvestLevelProperty.comment = "sets the harvest level of inolashite";
		inolashiteharvestLevel = inolashiteharvestLevelProperty.getInt();
		inolashiteharvestLevelProperty.set(inolashiteharvestLevel);

		Property inolashitedurabilityProperty = minconfig.get("inolashite", "inolashitedurability", 900);
		inolashitedurabilityProperty.comment = "sets the base durability of inolashite";
		inolashitedurability = inolashitedurabilityProperty.getInt();
		inolashitedurabilityProperty.set(inolashitedurability);

		Property inolashiteminingspeedProperty = minconfig.get("inolashite", "inolashiteminingspeed", 800);
		inolashiteminingspeedProperty.comment = "sets the mining speed of inolashite";
		inolashiteminingspeed = inolashiteminingspeedProperty.getInt();
		inolashiteminingspeedProperty.set(inolashiteminingspeed);

		Property inolashiteattackProperty = minconfig.get("inolashite", "inolashiteattack", 4);
		inolashiteattackProperty.comment = "sets the attack of inolashite";
		inolashiteattack = inolashiteattackProperty.getInt();
		inolashiteattackProperty.set(inolashiteattack);

		Property inolashitehandleModifierProperty = minconfig.get("inolashite", "inolashitehandleModifier", 1.7);
		inolashitehandleModifierProperty.comment = "sets the handle modifier of inolashite";
		inolashitehandleModifier = (float) inolashitehandleModifierProperty.getDouble(1.7);
		inolashitehandleModifierProperty.set(inolashitehandleModifier);

		Property inolashitereinforcedProperty = minconfig.get("inolashite", "inolashitereinforcedLevel", 0);
		inolashitereinforcedProperty.comment = "sets the reinforced level of inolashite";
		inolashitereinforced = inolashitereinforcedProperty.getInt();
		inolashitereinforcedProperty.set(inolashitereinforced);

		Property inolashitestoneboundProperty = minconfig.get("inolashite", "inolashitestonebound", 0.0);
		inolashitestoneboundProperty.comment = "sets the stonebound level of inolashite";
		inolashitestonebound = (float) inolashitestoneboundProperty.getDouble(0);
		inolashitestoneboundProperty.set(inolashitestonebound);

		// kalendrite
		ConfigCategory kalendriteCategory = minconfig.getCategory("kalendrite");
		kalendriteCategory.setComment("Setup base stats of kalendrite");

		Property kalendriteharvestLevelProperty = minconfig.get("kalendrite", "kalendriteHarvestLevel", 5);
		kalendriteharvestLevelProperty.comment = "sets the harvest level of kalendrite";
		kalendriteharvestLevel = kalendriteharvestLevelProperty.getInt();
		kalendriteharvestLevelProperty.set(kalendriteharvestLevel);

		Property kalendritedurabilityProperty = minconfig.get("kalendrite", "kalendritedurability", 1000);
		kalendritedurabilityProperty.comment = "sets the base durability of kalendrite";
		kalendritedurability = kalendritedurabilityProperty.getInt();
		kalendritedurabilityProperty.set(kalendritedurability);

		Property kalendriteminingspeedProperty = minconfig.get("kalendrite", "kalendriteminingspeed", 800);
		kalendriteminingspeedProperty.comment = "sets the mining speed of kalendrite";
		kalendriteminingspeed = kalendriteminingspeedProperty.getInt();
		kalendriteminingspeedProperty.set(kalendriteminingspeed);

		Property kalendriteattackProperty = minconfig.get("kalendrite", "kalendriteattack", 4);
		kalendriteattackProperty.comment = "sets the attack of kalendrite";
		kalendriteattack = kalendriteattackProperty.getInt();
		kalendriteattackProperty.set(kalendriteattack);

		Property kalendritehandleModifierProperty = minconfig.get("kalendrite", "kalendritehandleModifier", 1.75);
		kalendritehandleModifierProperty.comment = "sets the handle modifier of kalendrite";
		kalendritehandleModifier = (float) kalendritehandleModifierProperty.getDouble(1.75);
		kalendritehandleModifierProperty.set(kalendritehandleModifier);

		Property kalendritereinforcedProperty = minconfig.get("kalendrite", "kalendritereinforcedLevel", 0);
		kalendritereinforcedProperty.comment = "sets the reinforced level of kalendrite";
		kalendritereinforced = kalendritereinforcedProperty.getInt();
		kalendritereinforcedProperty.set(kalendritereinforced);

		Property kalendritestoneboundProperty = minconfig.get("kalendrite", "kalendritestonebound", 0.0);
		kalendritestoneboundProperty.comment = "sets the stonebound level of kalendrite";
		kalendritestonebound = (float) kalendritestoneboundProperty.getDouble(0);
		kalendritestoneboundProperty.set(kalendritestonebound);

		// astralSilver
		ConfigCategory astralSilverCategory = minconfig.getCategory("astralSilver");
		astralSilverCategory.setComment("Setup base stats of astralSilver");

		Property astralSilverharvestLevelProperty = minconfig.get("astralSilver", "astralSilverHarvestLevel", 5);
		astralSilverharvestLevelProperty.comment = "sets the harvest level of astralSilver";
		astralSilverharvestLevel = astralSilverharvestLevelProperty.getInt();
		astralSilverharvestLevelProperty.set(astralSilverharvestLevel);

		Property astralSilverdurabilityProperty = minconfig.get("astralSilver", "astralSilverdurability", 35);
		astralSilverdurabilityProperty.comment = "sets the base durability of astralSilver";
		astralSilverdurability = astralSilverdurabilityProperty.getInt();
		astralSilverdurabilityProperty.set(astralSilverdurability);

		Property astralSilverminingspeedProperty = minconfig.get("astralSilver", "astralSilverminingspeed", 1200);
		astralSilverminingspeedProperty.comment = "sets the mining speed of astralSilver";
		astralSilverminingspeed = astralSilverminingspeedProperty.getInt();
		astralSilverminingspeedProperty.set(astralSilverminingspeed);

		Property astralSilverattackProperty = minconfig.get("astralSilver", "astralSilverattack", 2);
		astralSilverattackProperty.comment = "sets the attack of astralSilver";
		astralSilverattack = astralSilverattackProperty.getInt();
		astralSilverattackProperty.set(astralSilverattack);

		Property astralSilverhandleModifierProperty = minconfig.get("astralSilver", "astralSilverhandleModifier", 0.35);
		astralSilverhandleModifierProperty.comment = "sets the handle modifier of astralSilver";
		astralSilverhandleModifier = (float) astralSilverhandleModifierProperty.getDouble(0.35);
		astralSilverhandleModifierProperty.set(astralSilverhandleModifier);

		Property astralSilverreinforcedProperty = minconfig.get("astralSilver", "astralSilverreinforcedLevel", 0);
		astralSilverreinforcedProperty.comment = "sets the reinforced level of astralSilver";
		astralSilverreinforced = astralSilverreinforcedProperty.getInt();
		astralSilverreinforcedProperty.set(astralSilverreinforced);

		Property astralSilverstoneboundProperty = minconfig.get("astralSilver", "astralSilverstonebound", 0.0);
		astralSilverstoneboundProperty.comment = "sets the stonebound level of astralSilver";
		astralSilverstonebound = (float) astralSilverstoneboundProperty.getDouble(0);
		astralSilverstoneboundProperty.set(astralSilverstonebound);

		// carmot
		ConfigCategory carmotCategory = minconfig.getCategory("carmot");
		carmotCategory.setComment("Setup base stats of carmot");

		Property carmotharvestLevelProperty = minconfig.get("carmot", "carmotHarvestLevel", 5);
		carmotharvestLevelProperty.comment = "sets the harvest level of carmot";
		carmotharvestLevel = carmotharvestLevelProperty.getInt();
		carmotharvestLevelProperty.set(carmotharvestLevel);

		Property carmotdurabilityProperty = minconfig.get("carmot", "carmotdurability", 50);
		carmotdurabilityProperty.comment = "sets the base durability of carmot";
		carmotdurability = carmotdurabilityProperty.getInt();
		carmotdurabilityProperty.set(carmotdurability);

		Property carmotminingspeedProperty = minconfig.get("carmot", "carmotminingspeed", 1200);
		carmotminingspeedProperty.comment = "sets the mining speed of carmot";
		carmotminingspeed = carmotminingspeedProperty.getInt();
		carmotminingspeedProperty.set(carmotminingspeed);

		Property carmotattackProperty = minconfig.get("carmot", "carmotattack", 2);
		carmotattackProperty.comment = "sets the attack of carmot";
		carmotattack = carmotattackProperty.getInt();
		carmotattackProperty.set(carmotattack);

		Property carmothandleModifierProperty = minconfig.get("carmot", "carmothandleModifier", 0.35);
		carmothandleModifierProperty.comment = "sets the handle modifier of carmot";
		carmothandleModifier = (float) carmothandleModifierProperty.getDouble(0.35);
		carmothandleModifierProperty.set(carmothandleModifier);

		Property carmotreinforcedProperty = minconfig.get("carmot", "carmotreinforcedLevel", 0);
		carmotreinforcedProperty.comment = "sets the reinforced level of carmot";
		carmotreinforced = carmotreinforcedProperty.getInt();
		carmotreinforcedProperty.set(carmotreinforced);

		Property carmotstoneboundProperty = minconfig.get("carmot", "carmotstonebound", 0.0);
		carmotstoneboundProperty.comment = "sets the stonebound level of carmot";
		carmotstonebound = (float) carmotstoneboundProperty.getDouble(0);
		carmotstoneboundProperty.set(carmotstonebound);

		// haderoth
		ConfigCategory haderothCategory = minconfig.getCategory("haderoth");
		haderothCategory.setComment("Setup base stats of haderoth");

		Property haderothharvestLevelProperty = minconfig.get("haderoth", "haderothHarvestLevel", 5);
		haderothharvestLevelProperty.comment = "sets the harvest level of haderoth";
		haderothharvestLevel = haderothharvestLevelProperty.getInt();
		haderothharvestLevelProperty.set(haderothharvestLevel);

		Property haderothdurabilityProperty = minconfig.get("haderoth", "haderothdurability", 1250);
		haderothdurabilityProperty.comment = "sets the base durability of haderoth";
		haderothdurability = haderothdurabilityProperty.getInt();
		haderothdurabilityProperty.set(haderothdurability);

		Property haderothminingspeedProperty = minconfig.get("haderoth", "haderothminingspeed", 1200);
		haderothminingspeedProperty.comment = "sets the mining speed of haderoth";
		haderothminingspeed = haderothminingspeedProperty.getInt();
		haderothminingspeedProperty.set(haderothminingspeed);

		Property haderothattackProperty = minconfig.get("haderoth", "haderothattack", 4);
		haderothattackProperty.comment = "sets the attack of haderoth";
		haderothattack = haderothattackProperty.getInt();
		haderothattackProperty.set(haderothattack);

		Property haderothhandleModifierProperty = minconfig.get("haderoth", "haderothhandleModifier", 2.3);
		haderothhandleModifierProperty.comment = "sets the handle modifier of haderoth";
		haderothhandleModifier = (float) haderothhandleModifierProperty.getDouble(2.3);
		haderothhandleModifierProperty.set(haderothhandleModifier);

		Property haderothreinforcedProperty = minconfig.get("haderoth", "haderothreinforcedLevel", 0);
		haderothreinforcedProperty.comment = "sets the reinforced level of haderoth";
		haderothreinforced = haderothreinforcedProperty.getInt();
		haderothreinforcedProperty.set(haderothreinforced);

		Property haderothstoneboundProperty = minconfig.get("haderoth", "haderothstonebound", 0.0);
		haderothstoneboundProperty.comment = "sets the stonebound level of haderoth";
		haderothstonebound = (float) haderothstoneboundProperty.getDouble(0);
		haderothstoneboundProperty.set(haderothstonebound);

		// mithril
		ConfigCategory mithrilCategory = minconfig.getCategory("mithril");
		mithrilCategory.setComment("Setup base stats of mithril");

		Property mithrilharvestLevelProperty = minconfig.get("mithril", "mithrilHarvestLevel", 5);
		mithrilharvestLevelProperty.comment = "sets the harvest level of mithril";
		mithrilharvestLevel = mithrilharvestLevelProperty.getInt();
		mithrilharvestLevelProperty.set(mithrilharvestLevel);

		Property mithrildurabilityProperty = minconfig.get("mithril", "mithrildurability", 1000);
		mithrildurabilityProperty.comment = "sets the base durability of mithril";
		mithrildurability = mithrildurabilityProperty.getInt();
		mithrildurabilityProperty.set(mithrildurability);

		Property mithrilminingspeedProperty = minconfig.get("mithril", "mithrilminingspeed", 900);
		mithrilminingspeedProperty.comment = "sets the mining speed of mithril";
		mithrilminingspeed = mithrilminingspeedProperty.getInt();
		mithrilminingspeedProperty.set(mithrilminingspeed);

		Property mithrilattackProperty = minconfig.get("mithril", "mithrilattack", 4);
		mithrilattackProperty.comment = "sets the attack of mithril";
		mithrilattack = mithrilattackProperty.getInt();
		mithrilattackProperty.set(mithrilattack);

		Property mithrilhandleModifierProperty = minconfig.get("mithril", "mithrilhandleModifier", 1.5);
		mithrilhandleModifierProperty.comment = "sets the handle modifier of mithril";
		mithrilhandleModifier = (float) mithrilhandleModifierProperty.getDouble(1.5);
		mithrilhandleModifierProperty.set(mithrilhandleModifier);

		Property mithrilreinforcedProperty = minconfig.get("mithril", "mithrilreinforcedLevel", 0);
		mithrilreinforcedProperty.comment = "sets the reinforced level of mithril";
		mithrilreinforced = mithrilreinforcedProperty.getInt();
		mithrilreinforcedProperty.set(mithrilreinforced);

		Property mithrilstoneboundProperty = minconfig.get("mithril", "mithrilstonebound", 0.0);
		mithrilstoneboundProperty.comment = "sets the stonebound level of mithril";
		mithrilstonebound = (float) mithrilstoneboundProperty.getDouble(0);
		mithrilstoneboundProperty.set(mithrilstonebound);

		// quicksilver
		ConfigCategory quicksilverCategory = minconfig.getCategory("quicksilver");
		quicksilverCategory.setComment("Setup base stats of quicksilver");

		Property quicksilverharvestLevelProperty = minconfig.get("quicksilver", "quicksilverHarvestLevel", 5);
		quicksilverharvestLevelProperty.comment = "sets the harvest level of quicksilver";
		quicksilverharvestLevel = quicksilverharvestLevelProperty.getInt();
		quicksilverharvestLevelProperty.set(quicksilverharvestLevel);

		Property quicksilverdurabilityProperty = minconfig.get("quicksilver", "quicksilverdurability", 1100);
		quicksilverdurabilityProperty.comment = "sets the base durability of quicksilver";
		quicksilverdurability = quicksilverdurabilityProperty.getInt();
		quicksilverdurabilityProperty.set(quicksilverdurability);

		Property quicksilverminingspeedProperty = minconfig.get("quicksilver", "quicksilverminingspeed", 1400);
		quicksilverminingspeedProperty.comment = "sets the mining speed of quicksilver";
		quicksilverminingspeed = quicksilverminingspeedProperty.getInt();
		quicksilverminingspeedProperty.set(quicksilverminingspeed);

		Property quicksilverattackProperty = minconfig.get("quicksilver", "quicksilverattack", 4);
		quicksilverattackProperty.comment = "sets the attack of quicksilver";
		quicksilverattack = quicksilverattackProperty.getInt();
		quicksilverattackProperty.set(quicksilverattack);

		Property quicksilverhandleModifierProperty = minconfig.get("quicksilver", "quicksilverhandleModifier", 1.8);
		quicksilverhandleModifierProperty.comment = "sets the handle modifier of quicksilver";
		quicksilverhandleModifier = (float) quicksilverhandleModifierProperty.getDouble(1.8);
		quicksilverhandleModifierProperty.set(quicksilverhandleModifier);

		Property quicksilverreinforcedProperty = minconfig.get("quicksilver", "quicksilverreinforcedLevel", 0);
		quicksilverreinforcedProperty.comment = "sets the reinforced level of quicksilver";
		quicksilverreinforced = quicksilverreinforcedProperty.getInt();
		quicksilverreinforcedProperty.set(quicksilverreinforced);

		Property quicksilverstoneboundProperty = minconfig.get("quicksilver", "quicksilverstonebound", 0.0);
		quicksilverstoneboundProperty.comment = "sets the stonebound level of quicksilver";
		quicksilverstonebound = (float) quicksilverstoneboundProperty.getDouble(0);
		quicksilverstoneboundProperty.set(quicksilverstonebound);

		// desichalkosr
		ConfigCategory desichalkosrCategory = minconfig.getCategory("desichalkosr");
		desichalkosrCategory.setComment("Setup base stats of desichalkosr");

		Property desichalkosrharvestLevelProperty = minconfig.get("desichalkosr", "desichalkosrHarvestLevel", 5);
		desichalkosrharvestLevelProperty.comment = "sets the harvest level of desichalkosr";
		desichalkosrharvestLevel = desichalkosrharvestLevelProperty.getInt();
		desichalkosrharvestLevelProperty.set(desichalkosrharvestLevel);

		Property desichalkosrdurabilityProperty = minconfig.get("desichalkosr", "desichalkosrdurability", 1800);
		desichalkosrdurabilityProperty.comment = "sets the base durability of desichalkosr";
		desichalkosrdurability = desichalkosrdurabilityProperty.getInt();
		desichalkosrdurabilityProperty.set(desichalkosrdurability);

		Property desichalkosrminingspeedProperty = minconfig.get("desichalkosr", "desichalkosrminingspeed", 1000);
		desichalkosrminingspeedProperty.comment = "sets the mining speed of desichalkosr";
		desichalkosrminingspeed = desichalkosrminingspeedProperty.getInt();
		desichalkosrminingspeedProperty.set(desichalkosrminingspeed);

		Property desichalkosrattackProperty = minconfig.get("desichalkosr", "desichalkosrattack", 5);
		desichalkosrattackProperty.comment = "sets the attack of desichalkosr";
		desichalkosrattack = desichalkosrattackProperty.getInt();
		desichalkosrattackProperty.set(desichalkosrattack);

		Property desichalkosrhandleModifierProperty = minconfig.get("desichalkosr", "desichalkosrhandleModifier", 2.75);
		desichalkosrhandleModifierProperty.comment = "sets the handle modifier of desichalkosr";
		desichalkosrhandleModifier = (float) desichalkosrhandleModifierProperty.getDouble(2.75);
		desichalkosrhandleModifierProperty.set(desichalkosrhandleModifier);

		Property desichalkosrreinforcedProperty = minconfig.get("desichalkosr", "desichalkosrreinforcedLevel", 0);
		desichalkosrreinforcedProperty.comment = "sets the reinforced level of desichalkosr";
		desichalkosrreinforced = desichalkosrreinforcedProperty.getInt();
		desichalkosrreinforcedProperty.set(desichalkosrreinforced);

		Property desichalkosrstoneboundProperty = minconfig.get("desichalkosr", "desichalkosrstonebound", 0.0);
		desichalkosrstoneboundProperty.comment = "sets the stonebound level of desichalkosr";
		desichalkosrstonebound = (float) desichalkosrstoneboundProperty.getDouble(0);
		desichalkosrstoneboundProperty.set(desichalkosrstonebound);

		// vulcanite
		ConfigCategory vulcaniteCategory = minconfig.getCategory("vulcanite");
		vulcaniteCategory.setComment("Setup base stats of vulcanite");

		Property vulcaniteharvestLevelProperty = minconfig.get("vulcanite", "vulcaniteHarvestLevel", 6);
		vulcaniteharvestLevelProperty.comment = "sets the harvest level of vulcanite";
		vulcaniteharvestLevel = vulcaniteharvestLevelProperty.getInt();
		vulcaniteharvestLevelProperty.set(vulcaniteharvestLevel);

		Property vulcanitedurabilityProperty = minconfig.get("vulcanite", "vulcanitedurability", 1500);
		vulcanitedurabilityProperty.comment = "sets the base durability of vulcanite";
		vulcanitedurability = vulcanitedurabilityProperty.getInt();
		vulcanitedurabilityProperty.set(vulcanitedurability);

		Property vulcaniteminingspeedProperty = minconfig.get("vulcanite", "vulcaniteminingspeed", 1000);
		vulcaniteminingspeedProperty.comment = "sets the mining speed of vulcanite";
		vulcaniteminingspeed = vulcaniteminingspeedProperty.getInt();
		vulcaniteminingspeedProperty.set(vulcaniteminingspeed);

		Property vulcaniteattackProperty = minconfig.get("vulcanite", "vulcaniteattack", 4);
		vulcaniteattackProperty.comment = "sets the attack of vulcanite";
		vulcaniteattack = vulcaniteattackProperty.getInt();
		vulcaniteattackProperty.set(vulcaniteattack);

		Property vulcanitehandleModifierProperty = minconfig.get("vulcanite", "vulcanitehandleModifier", 2.0);
		vulcanitehandleModifierProperty.comment = "sets the handle modifier of vulcanite";
		vulcanitehandleModifier = (float) vulcanitehandleModifierProperty.getDouble(2.0);
		vulcanitehandleModifierProperty.set(vulcanitehandleModifier);

		Property vulcanitereinforcedProperty = minconfig.get("vulcanite", "vulcanitereinforcedLevel", 0);
		vulcanitereinforcedProperty.comment = "sets the reinforced level of vulcanite";
		vulcanitereinforced = vulcanitereinforcedProperty.getInt();
		vulcanitereinforcedProperty.set(vulcanitereinforced);

		Property vulcanitestoneboundProperty = minconfig.get("vulcanite", "vulcanitestonebound", 0.0);
		vulcanitestoneboundProperty.comment = "sets the stonebound level of vulcanite";
		vulcanitestonebound = (float) vulcanitestoneboundProperty.getDouble(0);
		vulcanitestoneboundProperty.set(vulcanitestonebound);

		// celenegil
		ConfigCategory celenegilCategory = minconfig.getCategory("celenegil");
		celenegilCategory.setComment("Setup base stats of celenegil");

		Property celenegilharvestLevelProperty = minconfig.get("celenegil", "celenegilHarvestLevel", 6);
		celenegilharvestLevelProperty.comment = "sets the harvest level of celenegil";
		celenegilharvestLevel = celenegilharvestLevelProperty.getInt();
		celenegilharvestLevelProperty.set(celenegilharvestLevel);

		Property celenegildurabilityProperty = minconfig.get("celenegil", "celenegildurability", 1600);
		celenegildurabilityProperty.comment = "sets the base durability of celenegil";
		celenegildurability = celenegildurabilityProperty.getInt();
		celenegildurabilityProperty.set(celenegildurability);

		Property celenegilminingspeedProperty = minconfig.get("celenegil", "celenegilminingspeed", 1400);
		celenegilminingspeedProperty.comment = "sets the mining speed of celenegil";
		celenegilminingspeed = celenegilminingspeedProperty.getInt();
		celenegilminingspeedProperty.set(celenegilminingspeed);

		Property celenegilattackProperty = minconfig.get("celenegil", "celenegilattack", 4);
		celenegilattackProperty.comment = "sets the attack of celenegil";
		celenegilattack = celenegilattackProperty.getInt();
		celenegilattackProperty.set(celenegilattack);

		Property celenegilhandleModifierProperty = minconfig.get("celenegil", "celenegilhandleModifier", 2.5);
		celenegilhandleModifierProperty.comment = "sets the handle modifier of celenegil";
		celenegilhandleModifier = (float) celenegilhandleModifierProperty.getDouble(2.5);
		celenegilhandleModifierProperty.set(celenegilhandleModifier);

		Property celenegilreinforcedProperty = minconfig.get("celenegil", "celenegilreinforcedLevel", 0);
		celenegilreinforcedProperty.comment = "sets the reinforced level of celenegil";
		celenegilreinforced = celenegilreinforcedProperty.getInt();
		celenegilreinforcedProperty.set(celenegilreinforced);

		Property celenegilstoneboundProperty = minconfig.get("celenegil", "celenegilstonebound", 0.0);
		celenegilstoneboundProperty.comment = "sets the stonebound level of celenegil";
		celenegilstonebound = (float) celenegilstoneboundProperty.getDouble(0);
		celenegilstoneboundProperty.set(celenegilstonebound);

		// orichalcum
		ConfigCategory orichalcumCategory = minconfig.getCategory("orichalcum");
		orichalcumCategory.setComment("Setup base stats of orichalcum");

		Property orichalcumharvestLevelProperty = minconfig.get("orichalcum", "orichalcumHarvestLevel", 6);
		orichalcumharvestLevelProperty.comment = "sets the harvest level of orichalcum";
		orichalcumharvestLevel = orichalcumharvestLevelProperty.getInt();
		orichalcumharvestLevelProperty.set(orichalcumharvestLevel);

		Property orichalcumdurabilityProperty = minconfig.get("orichalcum", "orichalcumdurability", 1350);
		orichalcumdurabilityProperty.comment = "sets the base durability of orichalcum";
		orichalcumdurability = orichalcumdurabilityProperty.getInt();
		orichalcumdurabilityProperty.set(orichalcumdurability);

		Property orichalcumminingspeedProperty = minconfig.get("orichalcum", "orichalcumminingspeed", 900);
		orichalcumminingspeedProperty.comment = "sets the mining speed of orichalcum";
		orichalcumminingspeed = orichalcumminingspeedProperty.getInt();
		orichalcumminingspeedProperty.set(orichalcumminingspeed);

		Property orichalcumattackProperty = minconfig.get("orichalcum", "orichalcumattack", 4);
		orichalcumattackProperty.comment = "sets the attack of orichalcum";
		orichalcumattack = orichalcumattackProperty.getInt();
		orichalcumattackProperty.set(orichalcumattack);

		Property orichalcumhandleModifierProperty = minconfig.get("orichalcum", "orichalcumhandleModifier", 2.5);
		orichalcumhandleModifierProperty.comment = "sets the handle modifier of orichalcum";
		orichalcumhandleModifier = (float) orichalcumhandleModifierProperty.getDouble(2.5);
		orichalcumhandleModifierProperty.set(orichalcumhandleModifier);

		Property orichalcumreinforcedProperty = minconfig.get("orichalcum", "orichalcumreinforcedLevel", 0);
		orichalcumreinforcedProperty.comment = "sets the reinforced level of orichalcum";
		orichalcumreinforced = orichalcumreinforcedProperty.getInt();
		orichalcumreinforcedProperty.set(orichalcumreinforced);

		Property orichalcumstoneboundProperty = minconfig.get("orichalcum", "orichalcumstonebound", 0.0);
		orichalcumstoneboundProperty.comment = "sets the stonebound level of orichalcum";
		orichalcumstonebound = (float) orichalcumstoneboundProperty.getDouble(0);
		orichalcumstoneboundProperty.set(orichalcumstonebound);

		// sanguinite
		ConfigCategory sanguiniteCategory = minconfig.getCategory("sanguinite");
		sanguiniteCategory.setComment("Setup base stats of sanguinite");

		Property sanguiniteharvestLevelProperty = minconfig.get("sanguinite", "sanguiniteHarvestLevel", 7);
		sanguiniteharvestLevelProperty.comment = "sets the harvest level of sanguinite";
		sanguiniteharvestLevel = sanguiniteharvestLevelProperty.getInt();
		sanguiniteharvestLevelProperty.set(sanguiniteharvestLevel);

		Property sanguinitedurabilityProperty = minconfig.get("sanguinite", "sanguinitedurability", 1750);
		sanguinitedurabilityProperty.comment = "sets the base durability of sanguinite";
		sanguinitedurability = sanguinitedurabilityProperty.getInt();
		sanguinitedurabilityProperty.set(sanguinitedurability);

		Property sanguiniteminingspeedProperty = minconfig.get("sanguinite", "sanguiniteminingspeed", 1200);
		sanguiniteminingspeedProperty.comment = "sets the mining speed of sanguinite";
		sanguiniteminingspeed = sanguiniteminingspeedProperty.getInt();
		sanguiniteminingspeedProperty.set(sanguiniteminingspeed);

		Property sanguiniteattackProperty = minconfig.get("sanguinite", "sanguiniteattack", 5);
		sanguiniteattackProperty.comment = "sets the attack of sanguinite";
		sanguiniteattack = sanguiniteattackProperty.getInt();
		sanguiniteattackProperty.set(sanguiniteattack);

		Property sanguinitehandleModifierProperty = minconfig.get("sanguinite", "sanguinitehandleModifier", 2.3);
		sanguinitehandleModifierProperty.comment = "sets the handle modifier of sanguinite";
		sanguinitehandleModifier = (float) sanguinitehandleModifierProperty.getDouble(2.3);
		sanguinitehandleModifierProperty.set(sanguinitehandleModifier);

		Property sanguinitereinforcedProperty = minconfig.get("sanguinite", "sanguinitereinforcedLevel", 0);
		sanguinitereinforcedProperty.comment = "sets the reinforced level of sanguinite";
		sanguinitereinforced = sanguinitereinforcedProperty.getInt();
		sanguinitereinforcedProperty.set(sanguinitereinforced);

		Property sanguinitestoneboundProperty = minconfig.get("sanguinite", "sanguinitestonebound", 0.0);
		sanguinitestoneboundProperty.comment = "sets the stonebound level of sanguinite";
		sanguinitestonebound = (float) sanguinitestoneboundProperty.getDouble(0);
		sanguinitestoneboundProperty.set(sanguinitestonebound);
		
		// adamantine
		ConfigCategory adamantineCategory = minconfig.getCategory("adamantine");
		adamantineCategory.setComment("Setup base stats of adamantine");

		Property adamantineharvestLevelProperty = minconfig.get("adamantine", "adamantineHarvestLevel", 7);
		adamantineharvestLevelProperty.comment = "sets the harvest level of adamantine";
		adamantineharvestLevel = adamantineharvestLevelProperty.getInt();
		adamantineharvestLevelProperty.set(adamantineharvestLevel);

		Property adamantinedurabilityProperty = minconfig.get("adamantine", "adamantinedurability", 1550);
		adamantinedurabilityProperty.comment = "sets the base durability of adamantine";
		adamantinedurability = adamantinedurabilityProperty.getInt();
		adamantinedurabilityProperty.set(adamantinedurability);

		Property adamantineminingspeedProperty = minconfig.get("adamantine", "adamantineminingspeed", 1000);
		adamantineminingspeedProperty.comment = "sets the mining speed of adamantine";
		adamantineminingspeed = adamantineminingspeedProperty.getInt();
		adamantineminingspeedProperty.set(adamantineminingspeed);

		Property adamantineattackProperty = minconfig.get("adamantine", "adamantineattack", 5);
		adamantineattackProperty.comment = "sets the attack of adamantine";
		adamantineattack = adamantineattackProperty.getInt();
		adamantineattackProperty.set(adamantineattack);

		Property adamantinehandleModifierProperty = minconfig.get("adamantine", "adamantinehandleModifier", 2.75);
		adamantinehandleModifierProperty.comment = "sets the handle modifier of adamantine";
		adamantinehandleModifier = (float) adamantinehandleModifierProperty.getDouble(2.75);
		adamantinehandleModifierProperty.set(adamantinehandleModifier);

		Property adamantinereinforcedProperty = minconfig.get("adamantine", "adamantinereinforcedLevel", 2);
		adamantinereinforcedProperty.comment = "sets the reinforced level of adamantine";
		adamantinereinforced = adamantinereinforcedProperty.getInt();
		adamantinereinforcedProperty.set(adamantinereinforced);

		Property adamantinestoneboundProperty = minconfig.get("adamantine", "adamantinestonebound", 0.0);
		adamantinestoneboundProperty.comment = "sets the stonebound level of adamantine";
		adamantinestonebound = (float) adamantinestoneboundProperty.getDouble(0);
		adamantinestoneboundProperty.set(adamantinestonebound);

		// atlarus
		ConfigCategory atlarusCategory = minconfig.getCategory("atlarus");
		atlarusCategory.setComment("Setup base stats of atlarus");

		Property atlarusharvestLevelProperty = minconfig.get("atlarus", "atlarusHarvestLevel", 7);
		atlarusharvestLevelProperty.comment = "sets the harvest level of atlarus";
		atlarusharvestLevel = atlarusharvestLevelProperty.getInt();
		atlarusharvestLevelProperty.set(atlarusharvestLevel);

		Property atlarusdurabilityProperty = minconfig.get("atlarus", "atlarusdurability", 1750);
		atlarusdurabilityProperty.comment = "sets the base durability of atlarus";
		atlarusdurability = atlarusdurabilityProperty.getInt();
		atlarusdurabilityProperty.set(atlarusdurability);

		Property atlarusminingspeedProperty = minconfig.get("atlarus", "atlarusminingspeed", 1000);
		atlarusminingspeedProperty.comment = "sets the mining speed of atlarus";
		atlarusminingspeed = atlarusminingspeedProperty.getInt();
		atlarusminingspeedProperty.set(atlarusminingspeed);

		Property atlarusattackProperty = minconfig.get("atlarus", "atlarusattack", 5);
		atlarusattackProperty.comment = "sets the attack of atlarus";
		atlarusattack = atlarusattackProperty.getInt();
		atlarusattackProperty.set(atlarusattack);

		Property atlarushandleModifierProperty = minconfig.get("atlarus", "atlarushandleModifier", 2.5);
		atlarushandleModifierProperty.comment = "sets the handle modifier of atlarus";
		atlarushandleModifier = (float) atlarushandleModifierProperty.getDouble(2.5);
		atlarushandleModifierProperty.set(atlarushandleModifier);

		Property atlarusreinforcedProperty = minconfig.get("atlarus", "atlarusreinforcedLevel", 0);
		atlarusreinforcedProperty.comment = "sets the reinforced level of atlarus";
		atlarusreinforced = atlarusreinforcedProperty.getInt();
		atlarusreinforcedProperty.set(atlarusreinforced);

		Property atlarusstoneboundProperty = minconfig.get("atlarus", "atlarusstonebound", 0.0);
		atlarusstoneboundProperty.comment = "sets the stonebound level of atlarus";
		atlarusstonebound = (float) atlarusstoneboundProperty.getDouble(0);
		atlarusstoneboundProperty.set(atlarusstonebound);

		// tartarite
		ConfigCategory tartariteCategory = minconfig.getCategory("tartarite");
		tartariteCategory.setComment("Setup base stats of tartarite");

		Property tartariteharvestLevelProperty = minconfig.get("tartarite", "tartariteHarvestLevel", 8);
		tartariteharvestLevelProperty.comment = "sets the harvest level of tartarite";
		tartariteharvestLevel = tartariteharvestLevelProperty.getInt();
		tartariteharvestLevelProperty.set(tartariteharvestLevel);

		Property tartaritedurabilityProperty = minconfig.get("tartarite", "tartaritedurability", 3000);
		tartaritedurabilityProperty.comment = "sets the base durability of tartarite";
		tartaritedurability = tartaritedurabilityProperty.getInt();
		tartaritedurabilityProperty.set(tartaritedurability);

		Property tartariteminingspeedProperty = minconfig.get("tartarite", "tartariteminingspeed", 1400);
		tartariteminingspeedProperty.comment = "sets the mining speed of tartarite";
		tartariteminingspeed = tartariteminingspeedProperty.getInt();
		tartariteminingspeedProperty.set(tartariteminingspeed);

		Property tartariteattackProperty = minconfig.get("tartarite", "tartariteattack", 6);
		tartariteattackProperty.comment = "sets the attack of tartarite";
		tartariteattack = tartariteattackProperty.getInt();
		tartariteattackProperty.set(tartariteattack);

		Property tartaritehandleModifierProperty = minconfig.get("tartarite", "tartaritehandleModifier", 3.0);
		tartaritehandleModifierProperty.comment = "sets the handle modifier of tartarite";
		tartaritehandleModifier = (float) tartaritehandleModifierProperty.getDouble(3.0);
		tartaritehandleModifierProperty.set(tartaritehandleModifier);

		Property tartaritereinforcedProperty = minconfig.get("tartarite", "tartaritereinforcedLevel", 0);
		tartaritereinforcedProperty.comment = "sets the reinforced level of tartarite";
		tartaritereinforced = tartaritereinforcedProperty.getInt();
		tartaritereinforcedProperty.set(tartaritereinforced);

		Property tartaritestoneboundProperty = minconfig.get("tartarite", "tartaritestonebound", 0.0);
		tartaritestoneboundProperty.comment = "sets the stonebound level of tartarite";
		tartaritestonebound = (float) tartaritestoneboundProperty.getDouble(0);
		tartaritestoneboundProperty.set(tartaritestonebound);
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
