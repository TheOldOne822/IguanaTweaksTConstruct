package iguanaman.iguanatweakstconstruct;

import iguanaman.iguanatweakstconstruct.commands.IguanaCommandLevelUpTool;
import iguanaman.iguanatweakstconstruct.commands.IguanaCommandToolXP;
import iguanaman.iguanatweakstconstruct.configs.IguanaConfig;
import iguanaman.iguanatweakstconstruct.configs.HarvestLevelConfig;
import iguanaman.iguanatweakstconstruct.configs.LevelsConfig;
import iguanaman.iguanatweakstconstruct.configs.MaterialConfig;
import iguanaman.iguanatweakstconstruct.configs.ModifierConfig;
import iguanaman.iguanatweakstconstruct.util.IguanaEventHandler;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import tconstruct.common.TContent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid="IguanaTweaksTConstruct", name="TiC Tweaks", version="1.6.X-1.0.3)",
dependencies = "required-after:TConstruct;after:*")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class IguanaTweaksTConstruct {

	// The instance of your mod that Forge uses.
	@Instance("IguanaTweaksTConstruct")
	public static IguanaTweaksTConstruct instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="iguanaman.iguanatweakstconstruct.ClientProxy", serverSide="iguanaman.iguanatweakstconstruct.CommonProxy")
	public static CommonProxy proxy;


	public static List<Item> toolParts = null;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.registerSounds();
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);

		File installDir = event.getModConfigurationDirectory();
		File configDir = new File(installDir, "TiC Tweaks");
		IguanaConfig.init(new File(configDir, "Iguana Tweaks.cfg"));
		MaterialConfig.init();
		HarvestLevelConfig.init();
		LevelsConfig.init();
		ModifierConfig.init();

		toolParts = Arrays.asList (
				TContent.toolRod, TContent.pickaxeHead, TContent.shovelHead, TContent.hatchetHead,
				TContent.binding, TContent.toughBinding, TContent.toughRod, TContent.largePlate,
				TContent.swordBlade, TContent.wideGuard, TContent.handGuard, TContent.crossbar,
				TContent.knifeBlade, TContent.fullGuard, TContent.frypanHead, TContent.signHead,
				TContent.chiselHead, TContent.scytheBlade, TContent.broadAxeHead, TContent.excavatorHead,
				TContent.largeSwordBlade, TContent.hammerHead, TContent.bowstring, TContent.fletching,
				TContent.arrowhead );

		IguanaBlocks.init();
		IguanaItems.init();
	}


	@EventHandler
	public void load(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.registerRenderers();

		MaterialTweaks.init();
		HarvestLevelTweaks.init();
		ModifierTweaks.init();
		VariousTweaks.init();
		RemoveVanillaTools.init();

		IguanaLog.log("Starting event handler");
		MinecraftForge.EVENT_BUS.register(new IguanaEventHandler());
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		if (LevelsConfig.toolLeveling)
		{
			ICommandManager commandManager = FMLCommonHandler.instance().getMinecraftServerInstance().getCommandManager();
			ServerCommandManager serverCommandManager = (ServerCommandManager) commandManager;
			serverCommandManager.registerCommand(new IguanaCommandLevelUpTool());
			serverCommandManager.registerCommand(new IguanaCommandToolXP());
		}
	}


	public static String getHarvestLevelName (int num)
	{
		if (ModifierConfig.pickaxeBoostRequired && num > 1) --num;
		switch (num)
		{
		case 0: return "\u00a77" + HarvestLevelConfig.level0name;
		case 1: return "\u00a76" + HarvestLevelConfig.level1name;
		case 2: return "\u00a74" + HarvestLevelConfig.level2name;
		case 3: return "\u00a7f" + HarvestLevelConfig.level3name;
		case 4: return "\u00a7b" + HarvestLevelConfig.level4name;
		case 5: return "\u00a7c" + HarvestLevelConfig.level5name;
		case 6: return "\u00a79" + HarvestLevelConfig.level6name;
		case 7: return "\u00a75" + HarvestLevelConfig.level7name;
		case 8: return "\u00a75" + HarvestLevelConfig.level8name;
		case 9: return "\u00a75" + HarvestLevelConfig.level9name;
		case 10: return "\u00a75" + HarvestLevelConfig.level10name;
		case 11: return "\u00a75" + HarvestLevelConfig.level11name;
		case 12: return "\u00a75" + HarvestLevelConfig.level12name;
		case 13: return "\u00a75" + HarvestLevelConfig.level13name;
		case 14: return "\u00a75" + HarvestLevelConfig.level14name;
		case 15: return "\u00a75" + HarvestLevelConfig.level15name;
		default: return "\u00a7k\u00a7k\u00a7k\u00a7k\u00a7k\u00a7k";
		}
	}

}