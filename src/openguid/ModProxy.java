package openguid;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import openguid.swing.AbstractJGuidFrame;
import openguid.swing.JGuidFrame;

import org.lwjgl.input.Keyboard;

import rafoudiablol.api.BaseForgeProxy;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;

public class ModProxy extends BaseForgeProxy
{
	private static AbstractJGuidFrame jGuidGrame = null;
	private static KeyBinding keyBindGuid;
	private static boolean keyBindGuidPressed;
	
	@Override
	public void registerKeyBindings()
	{
		keyBindGuid = new KeyBinding("key.guid", Keyboard.KEY_G, "key.categories.misc");
		keyBindGuidPressed = false;
		ClientRegistry.registerKeyBinding(keyBindGuid);
	}
	
	@SubscribeEvent
	public void onEvent(RenderTickEvent event)
	{
		if(event.side.isClient())
		{
			while(keyBindGuid.isPressed())
			{
				openGui();
				openJWindow();
			}
		}
	}
	
	private void openGui()
	{
		final Minecraft mc = Minecraft.getMinecraft();
		
		if(!(mc.currentScreen instanceof GuiScreenCustom))
		{
			mc.displayGuiScreen(new GuiScreenCustom());
		}
	}
	
	private void openJWindow()
	{
		if(jGuidGrame == null || jGuidGrame.isClosed())
		{
			jGuidGrame = new JGuidFrame();
		}
		else
		{
			jGuidGrame.requestFocus();
		}
	}
}
