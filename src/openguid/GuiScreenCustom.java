package openguid;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;

public class GuiScreenCustom extends GuiScreen
{
	private GuiButton gb;
	private static int lastClickX = 0;
	private static int lastClickY = 0;
	private static int lastButtonX = 0;
	private static int lastButtonY = 0;
	private static int lastClick = 0;
	private static int positionX = 150;
	private static int positionY = 30;
	
    @Override
    public void initGui()
    {    	
        buttonList.add(gb = new GuiButton(1, positionX, positionY, "text"));
    	super.initGui();
    }
    
    @Override
    public void drawScreen(int i, int j, float f)
    {
        //this.drawDefaultBackground();
        super.drawScreen(i, j, f);
    }
    
    @Override
    protected void mouseClicked(int x, int y, int i)
    {
    	super.mouseClicked(x, y, i);
    	
    	gb.displayString = (x + "/" + y + "/" + i);
    	lastClickX = x;
    	lastClickY = y;
    	lastButtonX = gb.xPosition;
    	lastButtonY = gb.yPosition;
    	lastClick = i;
    }
    
    @Override
    /**
     * Called when a mouse button is pressed and the mouse is moved around. Parameters are : mouseX, mouseY,
     * lastButtonClicked & timeSinceMouseClick.
     */
    protected void mouseClickMove(int mouseX, int mouseY, int lastButtonClicked, long timeSinceMouseClick)
    {
    	super.mouseClickMove(mouseX, mouseY, lastButtonClicked, timeSinceMouseClick);

    	if(lastClick == 0)
    	{
	    	gb.xPosition = mouseX - (lastClickX - lastButtonX);
	    	gb.yPosition = mouseY - (lastClickY - lastButtonY);
    	}
    	else if(lastClick == 1)
    	{
    		if(mouseX > gb.xPosition && mouseY > gb.yPosition)
    		{
    			int sizeY = mouseY - gb.yPosition;
    			
    			if(sizeY > 20)
    				sizeY = 20;
    			
	    		gb = new GuiButton(1, gb.xPosition, gb.yPosition, mouseX - gb.xPosition, sizeY, "text");
	    		buttonList.set(0, gb);
    		}
    	}
    	
    	positionX = gb.xPosition;
    	positionY = gb.yPosition;
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return true;
    }
}
