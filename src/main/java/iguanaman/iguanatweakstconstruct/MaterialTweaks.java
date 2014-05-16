package iguanaman.iguanatweakstconstruct;

import iguanaman.iguanatweakstconstruct.configs.IguanaConfig;
import iguanaman.iguanatweakstconstruct.configs.MaterialConfig;
import tconstruct.common.TContent;
import tconstruct.library.TConstructRegistry;
import cpw.mods.fml.common.Loader;

public class MaterialTweaks {

	public static void init()
	{


		// TINKERS
		IguanaLog.log("Modifying TConstruct materials");

		float durMod = IguanaConfig.durabilityPercentage / 100F;
		float speedMod = IguanaConfig.miningSpeedPercentage / 100F;

		TConstructRegistry.toolMaterials.remove(0);
		TConstructRegistry.addToolMaterial(0, "Wood", "Wooden ", MaterialConfig.woodharvestLevel, Math.round(MaterialConfig.wooddurability * durMod), Math.round(MaterialConfig.woodminingspeed * speedMod), MaterialConfig.woodattack, MaterialConfig.woodhandleModifier, MaterialConfig.woodreinforced, MaterialConfig.woodstonebound, "\u00A7e", "");

		TConstructRegistry.toolMaterials.remove(4);
		TConstructRegistry.addToolMaterial(4, "Cactus", MaterialConfig.cactusharvestLevel, Math.round(MaterialConfig.cactusdurability * durMod), Math.round(MaterialConfig.cactusminingspeed * speedMod), MaterialConfig.cactusattack, MaterialConfig.cactushandleModifier, MaterialConfig.cactusreinforced, MaterialConfig.cactusstonebound, "\u00A72", "Jagged");

		TConstructRegistry.toolMaterials.remove(8);
		TConstructRegistry.addToolMaterial(8, "Slime", MaterialConfig.slimeharvestLevel, Math.round(MaterialConfig.slimedurability * durMod), Math.round(MaterialConfig.slimeminingspeed * speedMod), MaterialConfig.slimeattack, MaterialConfig.slimehandleModifier, MaterialConfig.slimereinforced, MaterialConfig.slimestonebound, "\u00A7a", "");

		TConstructRegistry.toolMaterials.remove(17);
		TConstructRegistry.addToolMaterial(17, "BlueSlime", "Slime ", MaterialConfig.blueslimeharvestLevel, Math.round(MaterialConfig.blueslimedurability * durMod), Math.round(MaterialConfig.blueslimeminingspeed * speedMod), MaterialConfig.blueslimeattack, MaterialConfig.blueslimehandleModifier, MaterialConfig.blueslimereinforced, MaterialConfig.blueslimestonebound, "\u00A7b", "");

		TConstructRegistry.toolMaterials.remove(9);
		TConstructRegistry.addToolMaterial(9, "Paper", MaterialConfig.paperharvestLevel, Math.round(MaterialConfig.paperdurability * durMod), Math.round(MaterialConfig.paperminingspeed * speedMod), MaterialConfig.paperattack, MaterialConfig.paperhandleModifier, MaterialConfig.paperreinforced, MaterialConfig.paperstonebound, "\u00A7f", "Writable");

		TConstructRegistry.toolMaterials.remove(1);
		TConstructRegistry.addToolMaterial(1, "Stone", MaterialConfig.stoneharvestLevel, Math.round(MaterialConfig.stonedurability * durMod), Math.round(MaterialConfig.stoneminingspeed * speedMod), MaterialConfig.stoneattack, MaterialConfig.stonehandleModifier, MaterialConfig.stonereinforced, MaterialConfig.stonestonebound, "", "Stonebound");

		TConstructRegistry.toolMaterials.remove(3);
		TConstructRegistry.addToolMaterial(3, "Flint", MaterialConfig.flintharvestLevel, Math.round(MaterialConfig.flintdurability * durMod), Math.round(MaterialConfig.flintminingspeed * speedMod), MaterialConfig.flintattack, MaterialConfig.flinthandleModifier, MaterialConfig.flintreinforced, MaterialConfig.flintstonebound, "\u00A78", "");

		TConstructRegistry.toolMaterials.remove(5);
		TConstructRegistry.addToolMaterial(5, "Bone", MaterialConfig.boneharvestLevel, Math.round(MaterialConfig.bonedurability * durMod), Math.round(MaterialConfig.boneminingspeed * speedMod), MaterialConfig.boneattack, MaterialConfig.bonehandleModifier, MaterialConfig.bonereinforced, MaterialConfig.bonestonebound, "\u00A7e", "");

		TConstructRegistry.toolMaterials.remove(7);
		TConstructRegistry.addToolMaterial(7, "Netherrack", MaterialConfig.netherrackharvestLevel, Math.round(MaterialConfig.netherrackdurability * durMod), Math.round(MaterialConfig.netherrackminingspeed * speedMod), MaterialConfig.netherrackattack, MaterialConfig.netherrackhandleModifier, MaterialConfig.netherrackreinforced, MaterialConfig.netherrackstonebound, "\u00A74", "Stonebound");

		TConstructRegistry.toolMaterials.remove(13);
		TConstructRegistry.addToolMaterial(13, "Copper", MaterialConfig.copperharvestLevel, Math.round(MaterialConfig.copperdurability * durMod), Math.round(MaterialConfig.copperminingspeed * speedMod), MaterialConfig.copperattack, MaterialConfig.copperhandleModifier, MaterialConfig.copperreinforced, MaterialConfig.copperstonebound, "\u00A7c", "");

		TConstructRegistry.toolMaterials.remove(2);
		TConstructRegistry.addToolMaterial(2, "Iron", MaterialConfig.ironharvestLevel, Math.round(MaterialConfig.irondurability * durMod), Math.round(MaterialConfig.ironminingspeed * speedMod), MaterialConfig.ironattack, MaterialConfig.ironhandleModifier, MaterialConfig.ironreinforced, MaterialConfig.ironstonebound, "\u00A7f", "");

		TConstructRegistry.toolMaterials.remove(14);
		TConstructRegistry.addToolMaterial(14, "Bronze", MaterialConfig.bronzeharvestLevel, Math.round(MaterialConfig.bronzedurability * durMod), Math.round(MaterialConfig.bronzeminingspeed * speedMod), MaterialConfig.bronzeattack, MaterialConfig.bronzehandleModifier, MaterialConfig.bronzereinforced, MaterialConfig.bronzestonebound, "\u00A76", "");

		if (TContent.thaumcraftAvailable)
		{
			TConstructRegistry.toolMaterials.remove(31);
			TConstructRegistry.addToolMaterial(31, "Thaumium", MaterialConfig.thaumiumharvestLevel, Math.round(MaterialConfig.thaumiumdurability * durMod), Math.round(MaterialConfig.thaumiumminingspeed * speedMod), MaterialConfig.thaumiumattack, MaterialConfig.thaumiumhandleModifier, MaterialConfig.thaumiumreinforced, MaterialConfig.thaumiumstonebound, "\u00A75", "Thaumic");
		}

		TConstructRegistry.toolMaterials.remove(16);
		TConstructRegistry.addToolMaterial(16, "Steel", MaterialConfig.steelharvestLevel, Math.round(MaterialConfig.steeldurability * durMod), Math.round(MaterialConfig.steelminingspeed * speedMod), MaterialConfig.steelattack, MaterialConfig.steelhandleModifier, MaterialConfig.steelreinforced, MaterialConfig.steelstonebound, "\u00A7f", "");

		TConstructRegistry.toolMaterials.remove(18);
		TConstructRegistry.addToolMaterial(18, "PigIron", "Pig Iron ", MaterialConfig.pigironharvestLevel, Math.round(MaterialConfig.pigirondurability * durMod), Math.round(MaterialConfig.pigironminingspeed * speedMod), MaterialConfig.pigironattack, MaterialConfig.pigironhandleModifier, MaterialConfig.pigironreinforced, MaterialConfig.pigironstonebound, "\u00A7c", "Tasty");

		TConstructRegistry.toolMaterials.remove(6);
		TConstructRegistry.addToolMaterial(6, "Obsidian", MaterialConfig.obsidianharvestLevel, Math.round(MaterialConfig.obsidiandurability * durMod), Math.round(MaterialConfig.obsidianminingspeed * speedMod), MaterialConfig.obsidianattack, MaterialConfig.obsidianhandleModifier, MaterialConfig.obsidianreinforced, MaterialConfig.obsidianstonebound, "\u00A78", "");

		TConstructRegistry.toolMaterials.remove(15);
		TConstructRegistry.addToolMaterial(15, "Alumite", MaterialConfig.alumiteharvestLevel, Math.round(MaterialConfig.alumitedurability * durMod), Math.round(MaterialConfig.alumiteminingspeed * speedMod), MaterialConfig.alumiteattack, MaterialConfig.alumitehandleModifier, MaterialConfig.alumitereinforced, MaterialConfig.alumitestonebound, "\u00A7d", "");

		TConstructRegistry.toolMaterials.remove(11);
		TConstructRegistry.addToolMaterial(11, "Ardite", MaterialConfig.arditeharvestLevel, Math.round(MaterialConfig.arditedurability * durMod), Math.round(MaterialConfig.arditeminingspeed * speedMod), MaterialConfig.arditeattack, MaterialConfig.arditehandleModifier, MaterialConfig.arditereinforced, MaterialConfig.arditestonebound, "\u00A74", "Stonebound");

		TConstructRegistry.toolMaterials.remove(10);
		TConstructRegistry.addToolMaterial(10, "Cobalt", MaterialConfig.cobaltharvestLevel, Math.round(MaterialConfig.cobaltdurability * durMod), Math.round(MaterialConfig.cobaltminingspeed * speedMod), MaterialConfig.cobaltattack, MaterialConfig.cobalthandleModifier, MaterialConfig.cobaltreinforced, MaterialConfig.cobaltstonebound, "\u00A73", "");

		TConstructRegistry.toolMaterials.remove(12);
		TConstructRegistry.addToolMaterial(12, "Manyullyn", MaterialConfig.manyullynharvestLevel, Math.round(MaterialConfig.manyullyndurability * durMod), Math.round(MaterialConfig.manyullynminingspeed * speedMod), MaterialConfig.manyullynattack, MaterialConfig.manyullynhandleModifier, MaterialConfig.manyullynreinforced, MaterialConfig.manyullynstonebound, "\u00A75", "");


		//Extra TiC / Metallurgy materials
		if (Loader.isModLoaded("ExtraTiC"))
		{		if (Loader.isModLoaded("Metallurgy3Base"))
		{

			// Stone level
			TConstructRegistry.toolMaterials.remove(103);
			TConstructRegistry.addToolMaterial(103, "Brass", MaterialConfig.brassharvestLevel, Math.round(MaterialConfig.brassdurability * durMod), Math.round(MaterialConfig.brassminingspeed * speedMod), MaterialConfig.brassattack, MaterialConfig.brasshandleModifier, MaterialConfig.brassreinforced, MaterialConfig.brassstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(104);
			TConstructRegistry.addToolMaterial(104, "Electrum", MaterialConfig.electrumharvestLevel, Math.round(MaterialConfig.electrumdurability * durMod), Math.round(MaterialConfig.electrumminingspeed * speedMod), MaterialConfig.electrumattack, MaterialConfig.electrumhandleModifier, MaterialConfig.electrumreinforced, MaterialConfig.electrumstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(106);
			TConstructRegistry.addToolMaterial(106, "Silver", MaterialConfig.silverharvestLevel, Math.round(MaterialConfig.silverdurability * durMod), Math.round(MaterialConfig.silverminingspeed * speedMod), MaterialConfig.silverattack, MaterialConfig.silverhandleModifier, MaterialConfig.silverreinforced, MaterialConfig.silverstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(109);
			TConstructRegistry.addToolMaterial(109, "Ignatius", MaterialConfig.ignatiusharvestLevel, Math.round(MaterialConfig.ignatiusdurability * durMod), Math.round(MaterialConfig.ignatiusminingspeed * speedMod), MaterialConfig.ignatiusattack, MaterialConfig.ignatiushandleModifier, MaterialConfig.ignatiusreinforced, MaterialConfig.ignatiusstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(114);
			TConstructRegistry.addToolMaterial(114, "Shadow Iron", MaterialConfig.shadowIronharvestLevel, Math.round(MaterialConfig.shadowIrondurability * durMod), Math.round(MaterialConfig.shadowIronminingspeed * speedMod), MaterialConfig.shadowIronattack, MaterialConfig.shadowIronhandleModifier, MaterialConfig.shadowIronreinforced, MaterialConfig.shadowIronstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(129);
			TConstructRegistry.addToolMaterial(129, "Prometheum", MaterialConfig.prometheumharvestLevel, Math.round(MaterialConfig.prometheumdurability * durMod), Math.round(MaterialConfig.prometheumminingspeed * speedMod), MaterialConfig.prometheumattack, MaterialConfig.prometheumhandleModifier, MaterialConfig.prometheumreinforced, MaterialConfig.prometheumstonebound, "", "");

			// Iron Level
			TConstructRegistry.toolMaterials.remove(105);
			TConstructRegistry.addToolMaterial(105, "Platinum", MaterialConfig.platinumharvestLevel, Math.round(MaterialConfig.platinumdurability * durMod), Math.round(MaterialConfig.platinumminingspeed * speedMod), MaterialConfig.platinumattack, MaterialConfig.platinumhandleModifier, MaterialConfig.platinumreinforced, MaterialConfig.platinumstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(115);
			TConstructRegistry.addToolMaterial(115, "Shadow Steel", MaterialConfig.shadowSteelharvestLevel, Math.round(MaterialConfig.shadowSteeldurability * durMod), Math.round(MaterialConfig.shadowSteelminingspeed * speedMod), MaterialConfig.shadowSteelattack, MaterialConfig.shadowSteelhandleModifier, MaterialConfig.shadowSteelreinforced, MaterialConfig.shadowSteelstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(121);
			TConstructRegistry.addToolMaterial(121, "Black Steel", MaterialConfig.blackSteelharvestLevel, Math.round(MaterialConfig.blackSteeldurability * durMod), Math.round(MaterialConfig.blackSteelminingspeed * speedMod), MaterialConfig.blackSteelattack, MaterialConfig.blackSteelhandleModifier, MaterialConfig.blackSteelreinforced, MaterialConfig.blackSteelstonebound, "§9", "");

			TConstructRegistry.toolMaterials.remove(124);
			TConstructRegistry.addToolMaterial(124, "Deep Iron", MaterialConfig.deepIronharvestLevel, Math.round(MaterialConfig.deepIrondurability * durMod), Math.round(MaterialConfig.deepIronminingspeed * speedMod), MaterialConfig.deepIronattack, MaterialConfig.deepIronhandleModifier, MaterialConfig.deepIronreinforced, MaterialConfig.deepIronstonebound, "§9", "");

			// Bronze Level
			TConstructRegistry.toolMaterials.remove(100);
			TConstructRegistry.addToolMaterial(100, "Angmallen", MaterialConfig.angmallenharvestLevel, Math.round(MaterialConfig.angmallendurability * durMod), Math.round(MaterialConfig.angmallenminingspeed * speedMod), MaterialConfig.angmallenattack, MaterialConfig.angmallenhandleModifier, MaterialConfig.angmallenreinforced, MaterialConfig.angmallenstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(102);
			TConstructRegistry.addToolMaterial(102, "Hepatizon", MaterialConfig.hepatizonharvestLevel, Math.round(MaterialConfig.hepatizondurability * durMod), Math.round(MaterialConfig.hepatizonminingspeed * speedMod), MaterialConfig.hepatizonattack, MaterialConfig.hepatizonhandleModifier, MaterialConfig.hepatizonreinforced, MaterialConfig.hepatizonstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(108);
			TConstructRegistry.addToolMaterial(108, "Ceruclase", MaterialConfig.ceruclaseharvestLevel, Math.round(MaterialConfig.ceruclasedurability * durMod), Math.round(MaterialConfig.ceruclaseminingspeed * speedMod), MaterialConfig.ceruclaseattack, MaterialConfig.ceruclasehandleModifier, MaterialConfig.ceruclasereinforced, MaterialConfig.ceruclasestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(112);
			TConstructRegistry.addToolMaterial(112, "Midasium", MaterialConfig.midasiumharvestLevel, Math.round(MaterialConfig.midasiumdurability * durMod), Math.round(MaterialConfig.midasiumminingspeed * speedMod), MaterialConfig.midasiumattack, MaterialConfig.midasiumhandleModifier, MaterialConfig.midasiumreinforced, MaterialConfig.midasiumstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(117);
			TConstructRegistry.addToolMaterial(117, "Vyroxeres", MaterialConfig.vyroxeresharvestLevel, Math.round(MaterialConfig.vyroxeresdurability * durMod), Math.round(MaterialConfig.vyroxeresminingspeed * speedMod), MaterialConfig.vyroxeresattack, MaterialConfig.vyroxereshandleModifier, MaterialConfig.vyroxeresreinforced, MaterialConfig.vyroxeresstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(128);
			TConstructRegistry.addToolMaterial(128, "Oureclase", MaterialConfig.oureclaseharvestLevel, Math.round(MaterialConfig.oureclasedurability * durMod), Math.round(MaterialConfig.oureclaseminingspeed * speedMod), MaterialConfig.oureclaseattack, MaterialConfig.oureclasehandleModifier, MaterialConfig.oureclasereinforced, MaterialConfig.oureclasestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(133);
			TConstructRegistry.addToolMaterial(133, "Eximite", MaterialConfig.eximiteharvestLevel, Math.round(MaterialConfig.eximitedurability * durMod), Math.round(MaterialConfig.eximiteminingspeed * speedMod), MaterialConfig.eximiteattack, MaterialConfig.eximitehandleModifier, MaterialConfig.eximitereinforced, MaterialConfig.eximitestonebound, "", "");

			// Obsidian Level
			TConstructRegistry.toolMaterials.remove(101);
			TConstructRegistry.addToolMaterial(101, "Damascus Steel", MaterialConfig.damascusSteelharvestLevel, Math.round(MaterialConfig.damascusSteeldurability * durMod), Math.round(MaterialConfig.damascusSteelminingspeed * speedMod), MaterialConfig.damascusSteelattack, MaterialConfig.damascusSteelhandleModifier, MaterialConfig.damascusSteelreinforced, MaterialConfig.damascusSteelstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(107);
			TConstructRegistry.addToolMaterial(107, "Amordrine", MaterialConfig.amordrineharvestLevel, Math.round(MaterialConfig.amordrinedurability * durMod), Math.round(MaterialConfig.amordrineminingspeed * speedMod), MaterialConfig.amordrineattack, MaterialConfig.amordrinehandleModifier, MaterialConfig.amordrinereinforced, MaterialConfig.amordrinestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(110);
			TConstructRegistry.addToolMaterial(110, "Inolashite", MaterialConfig.inolashiteharvestLevel, Math.round(MaterialConfig.inolashitedurability * durMod), Math.round(MaterialConfig.inolashiteminingspeed * speedMod), MaterialConfig.inolashiteattack, MaterialConfig.inolashitehandleModifier, MaterialConfig.inolashitereinforced, MaterialConfig.inolashitestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(111);
			TConstructRegistry.addToolMaterial(111, "Kalendrite", MaterialConfig.kalendriteharvestLevel, Math.round(MaterialConfig.kalendritedurability * durMod), Math.round(MaterialConfig.kalendriteminingspeed * speedMod), MaterialConfig.kalendriteattack, MaterialConfig.kalendritehandleModifier, MaterialConfig.kalendritereinforced, MaterialConfig.kalendritestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(119);
			TConstructRegistry.addToolMaterial(119, "Astral Silver", MaterialConfig.astralSilverharvestLevel, Math.round(MaterialConfig.astralSilverdurability * durMod), Math.round(MaterialConfig.astralSilverminingspeed * speedMod), MaterialConfig.astralSilverattack, MaterialConfig.astralSilverhandleModifier, MaterialConfig.astralSilverreinforced, MaterialConfig.astralSilverstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(122);
			TConstructRegistry.addToolMaterial(122, "Carmot", MaterialConfig.carmotharvestLevel, Math.round(MaterialConfig.carmotdurability * durMod), Math.round(MaterialConfig.carmotminingspeed * speedMod), MaterialConfig.carmotattack, MaterialConfig.carmothandleModifier, MaterialConfig.carmotreinforced, MaterialConfig.carmotstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(125);
			TConstructRegistry.addToolMaterial(125, "Haderoth", MaterialConfig.haderothharvestLevel, Math.round(MaterialConfig.haderothdurability * durMod), Math.round(MaterialConfig.haderothminingspeed * speedMod), MaterialConfig.haderothattack, MaterialConfig.haderothhandleModifier, MaterialConfig.haderothreinforced, MaterialConfig.haderothstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(126);
			TConstructRegistry.addToolMaterial(126, "Mithril", MaterialConfig.mithrilharvestLevel, Math.round(MaterialConfig.mithrildurability * durMod), Math.round(MaterialConfig.mithrilminingspeed * speedMod), MaterialConfig.mithrilattack, MaterialConfig.mithrilhandleModifier, MaterialConfig.mithrilreinforced, MaterialConfig.mithrilstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(130);
			TConstructRegistry.addToolMaterial(130, "Quicksilver", MaterialConfig.quicksilverharvestLevel, Math.round(MaterialConfig.quicksilverdurability * durMod), Math.round(MaterialConfig.quicksilverminingspeed * speedMod), MaterialConfig.quicksilverattack, MaterialConfig.quicksilverhandleModifier, MaterialConfig.quicksilverreinforced, MaterialConfig.quicksilverstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(132);
			TConstructRegistry.addToolMaterial(132, "Desichalkosr", MaterialConfig.desichalkosrharvestLevel, Math.round(MaterialConfig.desichalkosrdurability * durMod), Math.round(MaterialConfig.desichalkosrminingspeed * speedMod), MaterialConfig.desichalkosrattack, MaterialConfig.desichalkosrhandleModifier, MaterialConfig.desichalkosrreinforced, MaterialConfig.desichalkosrstonebound, "", "");

			//Ardite Level
			TConstructRegistry.toolMaterials.remove(116);
			TConstructRegistry.addToolMaterial(116, "Vulcanite", MaterialConfig.vulcaniteharvestLevel, Math.round(MaterialConfig.vulcanitedurability * durMod), Math.round(MaterialConfig.vulcaniteminingspeed * speedMod), MaterialConfig.vulcaniteattack, MaterialConfig.vulcanitehandleModifier, MaterialConfig.vulcanitereinforced, MaterialConfig.vulcanitestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(123);
			TConstructRegistry.addToolMaterial(123, "Celenegil", MaterialConfig.celenegilharvestLevel, Math.round(MaterialConfig.celenegildurability * durMod), Math.round(MaterialConfig.celenegilminingspeed * speedMod), MaterialConfig.celenegilattack, MaterialConfig.celenegilhandleModifier, MaterialConfig.celenegilreinforced, MaterialConfig.celenegilstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(127);
			TConstructRegistry.addToolMaterial(127, "Orichalcum", MaterialConfig.orichalcumharvestLevel, Math.round(MaterialConfig.orichalcumdurability * durMod), Math.round(MaterialConfig.orichalcumminingspeed * speedMod), MaterialConfig.orichalcumattack, MaterialConfig.orichalcumhandleModifier, MaterialConfig.orichalcumreinforced, MaterialConfig.orichalcumstonebound, "", "");

			// Cobalt Level
			TConstructRegistry.toolMaterials.remove(113);
			TConstructRegistry.addToolMaterial(113, "Sanguinite", MaterialConfig.sanguiniteharvestLevel, Math.round(MaterialConfig.sanguinitedurability * durMod), Math.round(MaterialConfig.sanguiniteminingspeed * speedMod), MaterialConfig.sanguiniteattack, MaterialConfig.sanguinitehandleModifier, MaterialConfig.sanguinitereinforced, MaterialConfig.sanguinitestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(118);
			TConstructRegistry.addToolMaterial(118, "Adamantine", MaterialConfig.adamantineharvestLevel, Math.round(MaterialConfig.adamantinedurability * durMod), Math.round(MaterialConfig.adamantineminingspeed * speedMod), MaterialConfig.adamantineattack, MaterialConfig.adamantinehandleModifier, MaterialConfig.adamantinereinforced, MaterialConfig.adamantinestonebound, "§4", "");

			TConstructRegistry.toolMaterials.remove(120);
			TConstructRegistry.addToolMaterial(120, "Atlarus", MaterialConfig.atlarusharvestLevel, Math.round(MaterialConfig.atlarusdurability * durMod), Math.round(MaterialConfig.atlarusminingspeed * speedMod), MaterialConfig.atlarusattack, MaterialConfig.atlarushandleModifier, MaterialConfig.atlarusreinforced, MaterialConfig.atlarusstonebound, "", "");

			//Manyullyn Level
			TConstructRegistry.toolMaterials.remove(131);
			TConstructRegistry.addToolMaterial(131, "Tartarite", MaterialConfig.tartariteharvestLevel, Math.round(MaterialConfig.tartaritedurability * durMod), Math.round(MaterialConfig.tartariteminingspeed * speedMod), MaterialConfig.tartariteattack, MaterialConfig.tartaritehandleModifier, MaterialConfig.tartaritereinforced, MaterialConfig.tartaritestonebound, "", "");

		}
		
		if (Loader.isModLoaded("Natura"))
		{
			TConstructRegistry.toolMaterials.remove(134);
			TConstructRegistry.addToolMaterial(134, "Bloodwood", MaterialConfig.bloodwoodharvestLevel, Math.round(MaterialConfig.bloodwooddurability * durMod), Math.round(MaterialConfig.bloodwoodminingspeed * speedMod), MaterialConfig.bloodwoodattack, MaterialConfig.bloodwoodhandleModifier, MaterialConfig.bloodwoodreinforced, MaterialConfig.bloodwoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(135);
			TConstructRegistry.addToolMaterial(135, "Darkwood", MaterialConfig.darkwoodharvestLevel, Math.round(MaterialConfig.darkwooddurability * durMod), Math.round(MaterialConfig.darkwoodminingspeed * speedMod), MaterialConfig.darkwoodattack, MaterialConfig.darkwoodhandleModifier, MaterialConfig.darkwoodreinforced, MaterialConfig.darkwoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(136);
			TConstructRegistry.addToolMaterial(136, "Fusewood", MaterialConfig.fusewoodharvestLevel, Math.round(MaterialConfig.fusewooddurability * durMod), Math.round(MaterialConfig.fusewoodminingspeed * speedMod), MaterialConfig.fusewoodattack, MaterialConfig.fusewoodhandleModifier, MaterialConfig.fusewoodreinforced, MaterialConfig.fusewoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(137);
			TConstructRegistry.addToolMaterial(137, "Ghostwood", MaterialConfig.ghostwoodharvestLevel, Math.round(MaterialConfig.ghostwooddurability * durMod), Math.round(MaterialConfig.ghostwoodminingspeed * speedMod), MaterialConfig.ghostwoodattack, MaterialConfig.ghostwoodhandleModifier, MaterialConfig.ghostwoodreinforced, MaterialConfig.ghostwoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(138);
			TConstructRegistry.addToolMaterial(138, "Nether Quartz", MaterialConfig.netherQuartzharvestLevel, Math.round(MaterialConfig.netherQuartzdurability * durMod), Math.round(MaterialConfig.netherQuartzminingspeed * speedMod), MaterialConfig.netherQuartzattack, MaterialConfig.netherQuartzhandleModifier, MaterialConfig.netherQuartzreinforced, MaterialConfig.netherQuartzstonebound, "", "");
		}
		
		if (Loader.isModLoaded("Mekanism"))
		{
			TConstructRegistry.toolMaterials.remove(139);
			TConstructRegistry.addToolMaterial(139, "Refined Glowstone", MaterialConfig.refinedGlowstoneharvestLevel, Math.round(MaterialConfig.refinedGlowstonedurability * durMod), Math.round(MaterialConfig.refinedGlowstoneminingspeed * speedMod), MaterialConfig.refinedGlowstoneattack, MaterialConfig.refinedGlowstonehandleModifier, MaterialConfig.refinedGlowstonereinforced, MaterialConfig.refinedGlowstonestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(140);
			TConstructRegistry.addToolMaterial(140, "Osmium", MaterialConfig.osmiumharvestLevel, Math.round(MaterialConfig.osmiumdurability * durMod), Math.round(MaterialConfig.osmiumminingspeed * speedMod), MaterialConfig.osmiumattack, MaterialConfig.osmiumhandleModifier, MaterialConfig.osmiumreinforced, MaterialConfig.osmiumstonebound, "", "");
		}
		
		TConstructRegistry.toolMaterials.remove(141);
		TConstructRegistry.addToolMaterial(141, "Pokefennium", MaterialConfig.pokefenniumharvestLevel, Math.round(MaterialConfig.pokefenniumdurability * durMod), Math.round(MaterialConfig.pokefenniumminingspeed * speedMod), MaterialConfig.pokefenniumattack, MaterialConfig.pokefenniumhandleModifier, MaterialConfig.pokefenniumreinforced, MaterialConfig.pokefenniumstonebound, "", "");

		TConstructRegistry.toolMaterials.remove(142);
		TConstructRegistry.addToolMaterial(142, "Fairy",  MaterialConfig.fairyharvestLevel, Math.round(MaterialConfig.fairydurability * durMod), Math.round(MaterialConfig.fairyminingspeed * speedMod), MaterialConfig.fairyattack, MaterialConfig.fairyhandleModifier, MaterialConfig.fairyreinforced, MaterialConfig.fairystonebound, "", "");

		if (Loader.isModLoaded("AppliedEnergistics"))
		{
			TConstructRegistry.toolMaterials.remove(143);
			TConstructRegistry.addToolMaterial(143, "Certus Quartz", MaterialConfig.certusQuartzharvestLevel, Math.round(MaterialConfig.certusQuartzdurability * durMod), Math.round(MaterialConfig.certusQuartzminingspeed * speedMod), MaterialConfig.certusQuartzattack, MaterialConfig.certusQuartzhandleModifier, MaterialConfig.certusQuartzreinforced, MaterialConfig.certusQuartzstonebound, "", "");
		}

		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			TConstructRegistry.toolMaterials.remove(144);
			TConstructRegistry.addToolMaterial(144, "Amethyst", MaterialConfig.amethystharvestLevel, Math.round(MaterialConfig.amethystdurability * durMod), Math.round(MaterialConfig.amethystminingspeed * speedMod), MaterialConfig.amethystattack, MaterialConfig.amethysthandleModifier, MaterialConfig.amethystreinforced, MaterialConfig.amethyststonebound, "", "");
		}
}
}
}
