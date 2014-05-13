package iguanaman.iguanatweakstconstruct;

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
		TConstructRegistry.addToolMaterial(0, "Wood", "Wooden ", IguanaMaterialConfig.woodharvestLevel, Math.round(IguanaMaterialConfig.wooddurability * durMod), Math.round(IguanaMaterialConfig.woodminingspeed * speedMod), IguanaMaterialConfig.woodattack, IguanaMaterialConfig.woodhandleModifier, IguanaMaterialConfig.woodreinforced, IguanaMaterialConfig.woodstonebound, "\u00A7e", "");

		TConstructRegistry.toolMaterials.remove(4);
		TConstructRegistry.addToolMaterial(4, "Cactus", IguanaMaterialConfig.cactusharvestLevel, Math.round(IguanaMaterialConfig.cactusdurability * durMod), Math.round(IguanaMaterialConfig.cactusminingspeed * speedMod), IguanaMaterialConfig.cactusattack, IguanaMaterialConfig.cactushandleModifier, IguanaMaterialConfig.cactusreinforced, IguanaMaterialConfig.cactusstonebound, "\u00A72", "Jagged");

		TConstructRegistry.toolMaterials.remove(8);
		TConstructRegistry.addToolMaterial(8, "Slime", IguanaMaterialConfig.slimeharvestLevel, Math.round(IguanaMaterialConfig.slimedurability * durMod), Math.round(IguanaMaterialConfig.slimeminingspeed * speedMod), IguanaMaterialConfig.slimeattack, IguanaMaterialConfig.slimehandleModifier, IguanaMaterialConfig.slimereinforced, IguanaMaterialConfig.slimestonebound, "\u00A7a", "");

		TConstructRegistry.toolMaterials.remove(17);
		TConstructRegistry.addToolMaterial(17, "BlueSlime", "Slime ", IguanaMaterialConfig.blueslimeharvestLevel, Math.round(IguanaMaterialConfig.blueslimedurability * durMod), Math.round(IguanaMaterialConfig.blueslimeminingspeed * speedMod), IguanaMaterialConfig.blueslimeattack, IguanaMaterialConfig.blueslimehandleModifier, IguanaMaterialConfig.blueslimereinforced, IguanaMaterialConfig.blueslimestonebound, "\u00A7b", "");

		TConstructRegistry.toolMaterials.remove(9);
		TConstructRegistry.addToolMaterial(9, "Paper", IguanaMaterialConfig.paperharvestLevel, Math.round(IguanaMaterialConfig.paperdurability * durMod), Math.round(IguanaMaterialConfig.paperminingspeed * speedMod), IguanaMaterialConfig.paperattack, IguanaMaterialConfig.paperhandleModifier, IguanaMaterialConfig.paperreinforced, IguanaMaterialConfig.paperstonebound, "\u00A7f", "Writable");

		TConstructRegistry.toolMaterials.remove(1);
		TConstructRegistry.addToolMaterial(1, "Stone", IguanaMaterialConfig.stoneharvestLevel, Math.round(IguanaMaterialConfig.stonedurability * durMod), Math.round(IguanaMaterialConfig.stoneminingspeed * speedMod), IguanaMaterialConfig.stoneattack, IguanaMaterialConfig.stonehandleModifier, IguanaMaterialConfig.stonereinforced, IguanaMaterialConfig.stonestonebound, "", "Stonebound");

		TConstructRegistry.toolMaterials.remove(3);
		TConstructRegistry.addToolMaterial(3, "Flint", IguanaMaterialConfig.flintharvestLevel, Math.round(IguanaMaterialConfig.flintdurability * durMod), Math.round(IguanaMaterialConfig.flintminingspeed * speedMod), IguanaMaterialConfig.flintattack, IguanaMaterialConfig.flinthandleModifier, IguanaMaterialConfig.flintreinforced, IguanaMaterialConfig.flintstonebound, "\u00A78", "");

		TConstructRegistry.toolMaterials.remove(5);
		TConstructRegistry.addToolMaterial(5, "Bone", IguanaMaterialConfig.boneharvestLevel, Math.round(IguanaMaterialConfig.bonedurability * durMod), Math.round(IguanaMaterialConfig.boneminingspeed * speedMod), IguanaMaterialConfig.boneattack, IguanaMaterialConfig.bonehandleModifier, IguanaMaterialConfig.bonereinforced, IguanaMaterialConfig.bonestonebound, "\u00A7e", "");

		TConstructRegistry.toolMaterials.remove(7);
		TConstructRegistry.addToolMaterial(7, "Netherrack", IguanaMaterialConfig.netherrackharvestLevel, Math.round(IguanaMaterialConfig.netherrackdurability * durMod), Math.round(IguanaMaterialConfig.netherrackminingspeed * speedMod), IguanaMaterialConfig.netherrackattack, IguanaMaterialConfig.netherrackhandleModifier, IguanaMaterialConfig.netherrackreinforced, IguanaMaterialConfig.netherrackstonebound, "\u00A74", "Stonebound");

		TConstructRegistry.toolMaterials.remove(13);
		TConstructRegistry.addToolMaterial(13, "Copper", IguanaMaterialConfig.copperharvestLevel, Math.round(IguanaMaterialConfig.copperdurability * durMod), Math.round(IguanaMaterialConfig.copperminingspeed * speedMod), IguanaMaterialConfig.copperattack, IguanaMaterialConfig.copperhandleModifier, IguanaMaterialConfig.copperreinforced, IguanaMaterialConfig.copperstonebound, "\u00A7c", "");

		TConstructRegistry.toolMaterials.remove(2);
		TConstructRegistry.addToolMaterial(2, "Iron", IguanaMaterialConfig.ironharvestLevel, Math.round(IguanaMaterialConfig.irondurability * durMod), Math.round(IguanaMaterialConfig.ironminingspeed * speedMod), IguanaMaterialConfig.ironattack, IguanaMaterialConfig.ironhandleModifier, IguanaMaterialConfig.ironreinforced, IguanaMaterialConfig.ironstonebound, "\u00A7f", "");

		TConstructRegistry.toolMaterials.remove(14);
		TConstructRegistry.addToolMaterial(14, "Bronze", IguanaMaterialConfig.bronzeharvestLevel, Math.round(IguanaMaterialConfig.bronzedurability * durMod), Math.round(IguanaMaterialConfig.bronzeminingspeed * speedMod), IguanaMaterialConfig.bronzeattack, IguanaMaterialConfig.bronzehandleModifier, IguanaMaterialConfig.bronzereinforced, IguanaMaterialConfig.bronzestonebound, "\u00A76", "");

		if (TContent.thaumcraftAvailable)
		{
			TConstructRegistry.toolMaterials.remove(31);
			TConstructRegistry.addToolMaterial(31, "Thaumium", IguanaMaterialConfig.thaumiumharvestLevel, Math.round(IguanaMaterialConfig.thaumiumdurability * durMod), Math.round(IguanaMaterialConfig.thaumiumminingspeed * speedMod), IguanaMaterialConfig.thaumiumattack, IguanaMaterialConfig.thaumiumhandleModifier, IguanaMaterialConfig.thaumiumreinforced, IguanaMaterialConfig.thaumiumstonebound, "\u00A75", "Thaumic");
		}

		TConstructRegistry.toolMaterials.remove(16);
		TConstructRegistry.addToolMaterial(16, "Steel", IguanaMaterialConfig.steelharvestLevel, Math.round(IguanaMaterialConfig.steeldurability * durMod), Math.round(IguanaMaterialConfig.steelminingspeed * speedMod), IguanaMaterialConfig.steelattack, IguanaMaterialConfig.steelhandleModifier, IguanaMaterialConfig.steelreinforced, IguanaMaterialConfig.steelstonebound, "\u00A7f", "");

		TConstructRegistry.toolMaterials.remove(18);
		TConstructRegistry.addToolMaterial(18, "PigIron", "Pig Iron ", IguanaMaterialConfig.pigironharvestLevel, Math.round(IguanaMaterialConfig.pigirondurability * durMod), Math.round(IguanaMaterialConfig.pigironminingspeed * speedMod), IguanaMaterialConfig.pigironattack, IguanaMaterialConfig.pigironhandleModifier, IguanaMaterialConfig.pigironreinforced, IguanaMaterialConfig.pigironstonebound, "\u00A7c", "Tasty");

		TConstructRegistry.toolMaterials.remove(6);
		TConstructRegistry.addToolMaterial(6, "Obsidian", IguanaMaterialConfig.obsidianharvestLevel, Math.round(IguanaMaterialConfig.obsidiandurability * durMod), Math.round(IguanaMaterialConfig.obsidianminingspeed * speedMod), IguanaMaterialConfig.obsidianattack, IguanaMaterialConfig.obsidianhandleModifier, IguanaMaterialConfig.obsidianreinforced, IguanaMaterialConfig.obsidianstonebound, "\u00A78", "");

		TConstructRegistry.toolMaterials.remove(15);
		TConstructRegistry.addToolMaterial(15, "Alumite", IguanaMaterialConfig.alumiteharvestLevel, Math.round(IguanaMaterialConfig.alumitedurability * durMod), Math.round(IguanaMaterialConfig.alumiteminingspeed * speedMod), IguanaMaterialConfig.alumiteattack, IguanaMaterialConfig.alumitehandleModifier, IguanaMaterialConfig.alumitereinforced, IguanaMaterialConfig.alumitestonebound, "\u00A7d", "");

		TConstructRegistry.toolMaterials.remove(11);
		TConstructRegistry.addToolMaterial(11, "Ardite", IguanaMaterialConfig.arditeharvestLevel, Math.round(IguanaMaterialConfig.arditedurability * durMod), Math.round(IguanaMaterialConfig.arditeminingspeed * speedMod), IguanaMaterialConfig.arditeattack, IguanaMaterialConfig.arditehandleModifier, IguanaMaterialConfig.arditereinforced, IguanaMaterialConfig.arditestonebound, "\u00A74", "Stonebound");

		TConstructRegistry.toolMaterials.remove(10);
		TConstructRegistry.addToolMaterial(10, "Cobalt", IguanaMaterialConfig.cobaltharvestLevel, Math.round(IguanaMaterialConfig.cobaltdurability * durMod), Math.round(IguanaMaterialConfig.cobaltminingspeed * speedMod), IguanaMaterialConfig.cobaltattack, IguanaMaterialConfig.cobalthandleModifier, IguanaMaterialConfig.cobaltreinforced, IguanaMaterialConfig.cobaltstonebound, "\u00A73", "");

		TConstructRegistry.toolMaterials.remove(12);
		TConstructRegistry.addToolMaterial(12, "Manyullyn", IguanaMaterialConfig.manyullynharvestLevel, Math.round(IguanaMaterialConfig.manyullyndurability * durMod), Math.round(IguanaMaterialConfig.manyullynminingspeed * speedMod), IguanaMaterialConfig.manyullynattack, IguanaMaterialConfig.manyullynhandleModifier, IguanaMaterialConfig.manyullynreinforced, IguanaMaterialConfig.manyullynstonebound, "\u00A75", "");


		//Extra TiC / Metallurgy materials
		if (Loader.isModLoaded("ExtraTiC"))
		{		if (Loader.isModLoaded("Metallurgy3Base"))
		{

			// Stone level
			TConstructRegistry.toolMaterials.remove(103);
			TConstructRegistry.addToolMaterial(103, "Brass", IguanaMaterialConfig.brassharvestLevel, Math.round(IguanaMaterialConfig.brassdurability * durMod), Math.round(IguanaMaterialConfig.brassminingspeed * speedMod), IguanaMaterialConfig.brassattack, IguanaMaterialConfig.brasshandleModifier, IguanaMaterialConfig.brassreinforced, IguanaMaterialConfig.brassstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(104);
			TConstructRegistry.addToolMaterial(104, "Electrum", IguanaMaterialConfig.electrumharvestLevel, Math.round(IguanaMaterialConfig.electrumdurability * durMod), Math.round(IguanaMaterialConfig.electrumminingspeed * speedMod), IguanaMaterialConfig.electrumattack, IguanaMaterialConfig.electrumhandleModifier, IguanaMaterialConfig.electrumreinforced, IguanaMaterialConfig.electrumstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(106);
			TConstructRegistry.addToolMaterial(106, "Silver", IguanaMaterialConfig.silverharvestLevel, Math.round(IguanaMaterialConfig.silverdurability * durMod), Math.round(IguanaMaterialConfig.silverminingspeed * speedMod), IguanaMaterialConfig.silverattack, IguanaMaterialConfig.silverhandleModifier, IguanaMaterialConfig.silverreinforced, IguanaMaterialConfig.silverstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(109);
			TConstructRegistry.addToolMaterial(109, "Ignatius", IguanaMaterialConfig.ignatiusharvestLevel, Math.round(IguanaMaterialConfig.ignatiusdurability * durMod), Math.round(IguanaMaterialConfig.ignatiusminingspeed * speedMod), IguanaMaterialConfig.ignatiusattack, IguanaMaterialConfig.ignatiushandleModifier, IguanaMaterialConfig.ignatiusreinforced, IguanaMaterialConfig.ignatiusstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(114);
			TConstructRegistry.addToolMaterial(114, "Shadow Iron", IguanaMaterialConfig.shadowIronharvestLevel, Math.round(IguanaMaterialConfig.shadowIrondurability * durMod), Math.round(IguanaMaterialConfig.shadowIronminingspeed * speedMod), IguanaMaterialConfig.shadowIronattack, IguanaMaterialConfig.shadowIronhandleModifier, IguanaMaterialConfig.shadowIronreinforced, IguanaMaterialConfig.shadowIronstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(129);
			TConstructRegistry.addToolMaterial(129, "Prometheum", IguanaMaterialConfig.prometheumharvestLevel, Math.round(IguanaMaterialConfig.prometheumdurability * durMod), Math.round(IguanaMaterialConfig.prometheumminingspeed * speedMod), IguanaMaterialConfig.prometheumattack, IguanaMaterialConfig.prometheumhandleModifier, IguanaMaterialConfig.prometheumreinforced, IguanaMaterialConfig.prometheumstonebound, "", "");

			// Iron Level
			TConstructRegistry.toolMaterials.remove(105);
			TConstructRegistry.addToolMaterial(105, "Platinum", IguanaMaterialConfig.platinumharvestLevel, Math.round(IguanaMaterialConfig.platinumdurability * durMod), Math.round(IguanaMaterialConfig.platinumminingspeed * speedMod), IguanaMaterialConfig.platinumattack, IguanaMaterialConfig.platinumhandleModifier, IguanaMaterialConfig.platinumreinforced, IguanaMaterialConfig.platinumstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(115);
			TConstructRegistry.addToolMaterial(115, "Shadow Steel", IguanaMaterialConfig.shadowSteelharvestLevel, Math.round(IguanaMaterialConfig.shadowSteeldurability * durMod), Math.round(IguanaMaterialConfig.shadowSteelminingspeed * speedMod), IguanaMaterialConfig.shadowSteelattack, IguanaMaterialConfig.shadowSteelhandleModifier, IguanaMaterialConfig.shadowSteelreinforced, IguanaMaterialConfig.shadowSteelstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(121);
			TConstructRegistry.addToolMaterial(121, "Black Steel", IguanaMaterialConfig.blackSteelharvestLevel, Math.round(IguanaMaterialConfig.blackSteeldurability * durMod), Math.round(IguanaMaterialConfig.blackSteelminingspeed * speedMod), IguanaMaterialConfig.blackSteelattack, IguanaMaterialConfig.blackSteelhandleModifier, IguanaMaterialConfig.blackSteelreinforced, IguanaMaterialConfig.blackSteelstonebound, "§9", "");

			TConstructRegistry.toolMaterials.remove(124);
			TConstructRegistry.addToolMaterial(124, "Deep Iron", IguanaMaterialConfig.deepIronharvestLevel, Math.round(IguanaMaterialConfig.deepIrondurability * durMod), Math.round(IguanaMaterialConfig.deepIronminingspeed * speedMod), IguanaMaterialConfig.deepIronattack, IguanaMaterialConfig.deepIronhandleModifier, IguanaMaterialConfig.deepIronreinforced, IguanaMaterialConfig.deepIronstonebound, "§9", "");

			// Bronze Level
			TConstructRegistry.toolMaterials.remove(100);
			TConstructRegistry.addToolMaterial(100, "Angmallen", IguanaMaterialConfig.angmallenharvestLevel, Math.round(IguanaMaterialConfig.angmallendurability * durMod), Math.round(IguanaMaterialConfig.angmallenminingspeed * speedMod), IguanaMaterialConfig.angmallenattack, IguanaMaterialConfig.angmallenhandleModifier, IguanaMaterialConfig.angmallenreinforced, IguanaMaterialConfig.angmallenstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(102);
			TConstructRegistry.addToolMaterial(102, "Hepatizon", IguanaMaterialConfig.hepatizonharvestLevel, Math.round(IguanaMaterialConfig.hepatizondurability * durMod), Math.round(IguanaMaterialConfig.hepatizonminingspeed * speedMod), IguanaMaterialConfig.hepatizonattack, IguanaMaterialConfig.hepatizonhandleModifier, IguanaMaterialConfig.hepatizonreinforced, IguanaMaterialConfig.hepatizonstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(108);
			TConstructRegistry.addToolMaterial(108, "Ceruclase", IguanaMaterialConfig.ceruclaseharvestLevel, Math.round(IguanaMaterialConfig.ceruclasedurability * durMod), Math.round(IguanaMaterialConfig.ceruclaseminingspeed * speedMod), IguanaMaterialConfig.ceruclaseattack, IguanaMaterialConfig.ceruclasehandleModifier, IguanaMaterialConfig.ceruclasereinforced, IguanaMaterialConfig.ceruclasestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(112);
			TConstructRegistry.addToolMaterial(112, "Midasium", IguanaMaterialConfig.midasiumharvestLevel, Math.round(IguanaMaterialConfig.midasiumdurability * durMod), Math.round(IguanaMaterialConfig.midasiumminingspeed * speedMod), IguanaMaterialConfig.midasiumattack, IguanaMaterialConfig.midasiumhandleModifier, IguanaMaterialConfig.midasiumreinforced, IguanaMaterialConfig.midasiumstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(117);
			TConstructRegistry.addToolMaterial(117, "Vyroxeres", IguanaMaterialConfig.vyroxeresharvestLevel, Math.round(IguanaMaterialConfig.vyroxeresdurability * durMod), Math.round(IguanaMaterialConfig.vyroxeresminingspeed * speedMod), IguanaMaterialConfig.vyroxeresattack, IguanaMaterialConfig.vyroxereshandleModifier, IguanaMaterialConfig.vyroxeresreinforced, IguanaMaterialConfig.vyroxeresstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(128);
			TConstructRegistry.addToolMaterial(128, "Oureclase", IguanaMaterialConfig.oureclaseharvestLevel, Math.round(IguanaMaterialConfig.oureclasedurability * durMod), Math.round(IguanaMaterialConfig.oureclaseminingspeed * speedMod), IguanaMaterialConfig.oureclaseattack, IguanaMaterialConfig.oureclasehandleModifier, IguanaMaterialConfig.oureclasereinforced, IguanaMaterialConfig.oureclasestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(133);
			TConstructRegistry.addToolMaterial(133, "Eximite", IguanaMaterialConfig.eximiteharvestLevel, Math.round(IguanaMaterialConfig.eximitedurability * durMod), Math.round(IguanaMaterialConfig.eximiteminingspeed * speedMod), IguanaMaterialConfig.eximiteattack, IguanaMaterialConfig.eximitehandleModifier, IguanaMaterialConfig.eximitereinforced, IguanaMaterialConfig.eximitestonebound, "", "");

			// Obsidian Level
			TConstructRegistry.toolMaterials.remove(101);
			TConstructRegistry.addToolMaterial(101, "Damascus Steel", IguanaMaterialConfig.damascusSteelharvestLevel, Math.round(IguanaMaterialConfig.damascusSteeldurability * durMod), Math.round(IguanaMaterialConfig.damascusSteelminingspeed * speedMod), IguanaMaterialConfig.damascusSteelattack, IguanaMaterialConfig.damascusSteelhandleModifier, IguanaMaterialConfig.damascusSteelreinforced, IguanaMaterialConfig.damascusSteelstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(107);
			TConstructRegistry.addToolMaterial(107, "Amordrine", IguanaMaterialConfig.amordrineharvestLevel, Math.round(IguanaMaterialConfig.amordrinedurability * durMod), Math.round(IguanaMaterialConfig.amordrineminingspeed * speedMod), IguanaMaterialConfig.amordrineattack, IguanaMaterialConfig.amordrinehandleModifier, IguanaMaterialConfig.amordrinereinforced, IguanaMaterialConfig.amordrinestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(110);
			TConstructRegistry.addToolMaterial(110, "Inolashite", IguanaMaterialConfig.inolashiteharvestLevel, Math.round(IguanaMaterialConfig.inolashitedurability * durMod), Math.round(IguanaMaterialConfig.inolashiteminingspeed * speedMod), IguanaMaterialConfig.inolashiteattack, IguanaMaterialConfig.inolashitehandleModifier, IguanaMaterialConfig.inolashitereinforced, IguanaMaterialConfig.inolashitestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(111);
			TConstructRegistry.addToolMaterial(111, "Kalendrite", IguanaMaterialConfig.kalendriteharvestLevel, Math.round(IguanaMaterialConfig.kalendritedurability * durMod), Math.round(IguanaMaterialConfig.kalendriteminingspeed * speedMod), IguanaMaterialConfig.kalendriteattack, IguanaMaterialConfig.kalendritehandleModifier, IguanaMaterialConfig.kalendritereinforced, IguanaMaterialConfig.kalendritestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(119);
			TConstructRegistry.addToolMaterial(119, "Astral Silver", IguanaMaterialConfig.astralSilverharvestLevel, Math.round(IguanaMaterialConfig.astralSilverdurability * durMod), Math.round(IguanaMaterialConfig.astralSilverminingspeed * speedMod), IguanaMaterialConfig.astralSilverattack, IguanaMaterialConfig.astralSilverhandleModifier, IguanaMaterialConfig.astralSilverreinforced, IguanaMaterialConfig.astralSilverstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(122);
			TConstructRegistry.addToolMaterial(122, "Carmot", IguanaMaterialConfig.carmotharvestLevel, Math.round(IguanaMaterialConfig.carmotdurability * durMod), Math.round(IguanaMaterialConfig.carmotminingspeed * speedMod), IguanaMaterialConfig.carmotattack, IguanaMaterialConfig.carmothandleModifier, IguanaMaterialConfig.carmotreinforced, IguanaMaterialConfig.carmotstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(125);
			TConstructRegistry.addToolMaterial(125, "Haderoth", IguanaMaterialConfig.haderothharvestLevel, Math.round(IguanaMaterialConfig.haderothdurability * durMod), Math.round(IguanaMaterialConfig.haderothminingspeed * speedMod), IguanaMaterialConfig.haderothattack, IguanaMaterialConfig.haderothhandleModifier, IguanaMaterialConfig.haderothreinforced, IguanaMaterialConfig.haderothstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(126);
			TConstructRegistry.addToolMaterial(126, "Mithril", IguanaMaterialConfig.mithrilharvestLevel, Math.round(IguanaMaterialConfig.mithrildurability * durMod), Math.round(IguanaMaterialConfig.mithrilminingspeed * speedMod), IguanaMaterialConfig.mithrilattack, IguanaMaterialConfig.mithrilhandleModifier, IguanaMaterialConfig.mithrilreinforced, IguanaMaterialConfig.mithrilstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(130);
			TConstructRegistry.addToolMaterial(130, "Quicksilver", IguanaMaterialConfig.quicksilverharvestLevel, Math.round(IguanaMaterialConfig.quicksilverdurability * durMod), Math.round(IguanaMaterialConfig.quicksilverminingspeed * speedMod), IguanaMaterialConfig.quicksilverattack, IguanaMaterialConfig.quicksilverhandleModifier, IguanaMaterialConfig.quicksilverreinforced, IguanaMaterialConfig.quicksilverstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(132);
			TConstructRegistry.addToolMaterial(132, "Desichalkosr", IguanaMaterialConfig.desichalkosrharvestLevel, Math.round(IguanaMaterialConfig.desichalkosrdurability * durMod), Math.round(IguanaMaterialConfig.desichalkosrminingspeed * speedMod), IguanaMaterialConfig.desichalkosrattack, IguanaMaterialConfig.desichalkosrhandleModifier, IguanaMaterialConfig.desichalkosrreinforced, IguanaMaterialConfig.desichalkosrstonebound, "", "");

			//Ardite Level
			TConstructRegistry.toolMaterials.remove(116);
			TConstructRegistry.addToolMaterial(116, "Vulcanite", IguanaMaterialConfig.vulcaniteharvestLevel, Math.round(IguanaMaterialConfig.vulcanitedurability * durMod), Math.round(IguanaMaterialConfig.vulcaniteminingspeed * speedMod), IguanaMaterialConfig.vulcaniteattack, IguanaMaterialConfig.vulcanitehandleModifier, IguanaMaterialConfig.vulcanitereinforced, IguanaMaterialConfig.vulcanitestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(123);
			TConstructRegistry.addToolMaterial(123, "Celenegil", IguanaMaterialConfig.celenegilharvestLevel, Math.round(IguanaMaterialConfig.celenegildurability * durMod), Math.round(IguanaMaterialConfig.celenegilminingspeed * speedMod), IguanaMaterialConfig.celenegilattack, IguanaMaterialConfig.celenegilhandleModifier, IguanaMaterialConfig.celenegilreinforced, IguanaMaterialConfig.celenegilstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(127);
			TConstructRegistry.addToolMaterial(127, "Orichalcum", IguanaMaterialConfig.orichalcumharvestLevel, Math.round(IguanaMaterialConfig.orichalcumdurability * durMod), Math.round(IguanaMaterialConfig.orichalcumminingspeed * speedMod), IguanaMaterialConfig.orichalcumattack, IguanaMaterialConfig.orichalcumhandleModifier, IguanaMaterialConfig.orichalcumreinforced, IguanaMaterialConfig.orichalcumstonebound, "", "");

			// Cobalt Level
			TConstructRegistry.toolMaterials.remove(113);
			TConstructRegistry.addToolMaterial(113, "Sanguinite", IguanaMaterialConfig.sanguiniteharvestLevel, Math.round(IguanaMaterialConfig.sanguinitedurability * durMod), Math.round(IguanaMaterialConfig.sanguiniteminingspeed * speedMod), IguanaMaterialConfig.sanguiniteattack, IguanaMaterialConfig.sanguinitehandleModifier, IguanaMaterialConfig.sanguinitereinforced, IguanaMaterialConfig.sanguinitestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(118);
			TConstructRegistry.addToolMaterial(118, "Adamantine", IguanaMaterialConfig.adamantineharvestLevel, Math.round(IguanaMaterialConfig.adamantinedurability * durMod), Math.round(IguanaMaterialConfig.adamantineminingspeed * speedMod), IguanaMaterialConfig.adamantineattack, IguanaMaterialConfig.adamantinehandleModifier, IguanaMaterialConfig.adamantinereinforced, IguanaMaterialConfig.adamantinestonebound, "§4", "");

			TConstructRegistry.toolMaterials.remove(120);
			TConstructRegistry.addToolMaterial(120, "Atlarus", IguanaMaterialConfig.atlarusharvestLevel, Math.round(IguanaMaterialConfig.atlarusdurability * durMod), Math.round(IguanaMaterialConfig.atlarusminingspeed * speedMod), IguanaMaterialConfig.atlarusattack, IguanaMaterialConfig.atlarushandleModifier, IguanaMaterialConfig.atlarusreinforced, IguanaMaterialConfig.atlarusstonebound, "", "");

			//Manyullyn Level
			TConstructRegistry.toolMaterials.remove(131);
			TConstructRegistry.addToolMaterial(131, "Tartarite", IguanaMaterialConfig.tartariteharvestLevel, Math.round(IguanaMaterialConfig.tartaritedurability * durMod), Math.round(IguanaMaterialConfig.tartariteminingspeed * speedMod), IguanaMaterialConfig.tartariteattack, IguanaMaterialConfig.tartaritehandleModifier, IguanaMaterialConfig.tartaritereinforced, IguanaMaterialConfig.tartaritestonebound, "", "");

		}
		
		if (Loader.isModLoaded("Natura"))
		{
			TConstructRegistry.toolMaterials.remove(134);
			TConstructRegistry.addToolMaterial(134, "Bloodwood", IguanaMaterialConfig.bloodwoodharvestLevel, Math.round(IguanaMaterialConfig.bloodwooddurability * durMod), Math.round(IguanaMaterialConfig.bloodwoodminingspeed * speedMod), IguanaMaterialConfig.bloodwoodattack, IguanaMaterialConfig.bloodwoodhandleModifier, IguanaMaterialConfig.bloodwoodreinforced, IguanaMaterialConfig.bloodwoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(135);
			TConstructRegistry.addToolMaterial(135, "Darkwood", IguanaMaterialConfig.darkwoodharvestLevel, Math.round(IguanaMaterialConfig.darkwooddurability * durMod), Math.round(IguanaMaterialConfig.darkwoodminingspeed * speedMod), IguanaMaterialConfig.darkwoodattack, IguanaMaterialConfig.darkwoodhandleModifier, IguanaMaterialConfig.darkwoodreinforced, IguanaMaterialConfig.darkwoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(136);
			TConstructRegistry.addToolMaterial(136, "Fusewood", IguanaMaterialConfig.fusewoodharvestLevel, Math.round(IguanaMaterialConfig.fusewooddurability * durMod), Math.round(IguanaMaterialConfig.fusewoodminingspeed * speedMod), IguanaMaterialConfig.fusewoodattack, IguanaMaterialConfig.fusewoodhandleModifier, IguanaMaterialConfig.fusewoodreinforced, IguanaMaterialConfig.fusewoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(137);
			TConstructRegistry.addToolMaterial(137, "Ghostwood", IguanaMaterialConfig.ghostwoodharvestLevel, Math.round(IguanaMaterialConfig.ghostwooddurability * durMod), Math.round(IguanaMaterialConfig.ghostwoodminingspeed * speedMod), IguanaMaterialConfig.ghostwoodattack, IguanaMaterialConfig.ghostwoodhandleModifier, IguanaMaterialConfig.ghostwoodreinforced, IguanaMaterialConfig.ghostwoodstonebound, "", "");

			TConstructRegistry.toolMaterials.remove(138);
			TConstructRegistry.addToolMaterial(138, "Nether Quartz", IguanaMaterialConfig.netherQuartzharvestLevel, Math.round(IguanaMaterialConfig.netherQuartzdurability * durMod), Math.round(IguanaMaterialConfig.netherQuartzminingspeed * speedMod), IguanaMaterialConfig.netherQuartzattack, IguanaMaterialConfig.netherQuartzhandleModifier, IguanaMaterialConfig.netherQuartzreinforced, IguanaMaterialConfig.netherQuartzstonebound, "", "");
		}
		
		if (Loader.isModLoaded("Mekanism"))
		{
			TConstructRegistry.toolMaterials.remove(139);
			TConstructRegistry.addToolMaterial(139, "Refined Glowstone", IguanaMaterialConfig.refinedGlowstoneharvestLevel, Math.round(IguanaMaterialConfig.refinedGlowstonedurability * durMod), Math.round(IguanaMaterialConfig.refinedGlowstoneminingspeed * speedMod), IguanaMaterialConfig.refinedGlowstoneattack, IguanaMaterialConfig.refinedGlowstonehandleModifier, IguanaMaterialConfig.refinedGlowstonereinforced, IguanaMaterialConfig.refinedGlowstonestonebound, "", "");

			TConstructRegistry.toolMaterials.remove(140);
			TConstructRegistry.addToolMaterial(140, "Osmium", IguanaMaterialConfig.osmiumharvestLevel, Math.round(IguanaMaterialConfig.osmiumdurability * durMod), Math.round(IguanaMaterialConfig.osmiumminingspeed * speedMod), IguanaMaterialConfig.osmiumattack, IguanaMaterialConfig.osmiumhandleModifier, IguanaMaterialConfig.osmiumreinforced, IguanaMaterialConfig.osmiumstonebound, "", "");
		}
		
		TConstructRegistry.toolMaterials.remove(141);
		TConstructRegistry.addToolMaterial(141, "Pokefennium", IguanaMaterialConfig.pokefenniumharvestLevel, Math.round(IguanaMaterialConfig.pokefenniumdurability * durMod), Math.round(IguanaMaterialConfig.pokefenniumminingspeed * speedMod), IguanaMaterialConfig.pokefenniumattack, IguanaMaterialConfig.pokefenniumhandleModifier, IguanaMaterialConfig.pokefenniumreinforced, IguanaMaterialConfig.pokefenniumstonebound, "", "");

		TConstructRegistry.toolMaterials.remove(142);
		TConstructRegistry.addToolMaterial(142, "Fairy",  IguanaMaterialConfig.fairyharvestLevel, Math.round(IguanaMaterialConfig.fairydurability * durMod), Math.round(IguanaMaterialConfig.fairyminingspeed * speedMod), IguanaMaterialConfig.fairyattack, IguanaMaterialConfig.fairyhandleModifier, IguanaMaterialConfig.fairyreinforced, IguanaMaterialConfig.fairystonebound, "", "");

		if (Loader.isModLoaded("AppliedEnergistics"))
		{
			TConstructRegistry.toolMaterials.remove(143);
			TConstructRegistry.addToolMaterial(143, "Certus Quartz", IguanaMaterialConfig.certusQuartzharvestLevel, Math.round(IguanaMaterialConfig.certusQuartzdurability * durMod), Math.round(IguanaMaterialConfig.certusQuartzminingspeed * speedMod), IguanaMaterialConfig.certusQuartzattack, IguanaMaterialConfig.certusQuartzhandleModifier, IguanaMaterialConfig.certusQuartzreinforced, IguanaMaterialConfig.certusQuartzstonebound, "", "");
		}

		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			TConstructRegistry.toolMaterials.remove(144);
			TConstructRegistry.addToolMaterial(144, "Amethyst", IguanaMaterialConfig.amethystharvestLevel, Math.round(IguanaMaterialConfig.amethystdurability * durMod), Math.round(IguanaMaterialConfig.amethystminingspeed * speedMod), IguanaMaterialConfig.amethystattack, IguanaMaterialConfig.amethysthandleModifier, IguanaMaterialConfig.amethystreinforced, IguanaMaterialConfig.amethyststonebound, "", "");
		}
}
}
}
