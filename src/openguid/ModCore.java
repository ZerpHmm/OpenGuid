package openguid;

import org.apache.logging.log4j.Logger;

import rafoudiablol.api.BaseForgeMod;
import rafoudiablol.api.RApi;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
	modid = ModCore.MODID,
	name = ModCore.NAME,
	version = ModCore.VERSION,
	dependencies = RApi.DEPENDENCY
)

/**
 *	CGui Designer core
**/

public class ModCore extends BaseForgeMod
{
	public static final String VERSION = "1.0";
	public static final String NAME = "Gui Designer";
	public static final String MODID = "guid";
	
	/**
	 *	mod instance
	**/
	
	@Instance(
		value = MODID
	) public static ModCore instance;

	/**
	 *	proxy
	**/
	
	@SidedProxy(
		clientSide="openguid.ModProxy"
	) public static ModProxy proxy;

	/**
	 *	static method to get mod logger
	**/

	public static Logger log() {
		return instance.getLogger();
	}
	
	// ----------------------------
	
	public ModCore()
	{
		super(proxy, true);
	}
	
	@EventHandler @Override
	public void pre(FMLPreInitializationEvent event) {
		super.pre(event);
	}
	
	@EventHandler @Override
	public void post(FMLPostInitializationEvent event) {
		super.post(event);
	}
	
	@EventHandler @Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
}
