package openguid.swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import openguid.skeleton.GuiSkeleton;

public abstract class AbstractJGuidFrame extends JFrame
	implements WindowListener
{
	private final GuiSkeleton skeleton;
	private boolean isClosed = false;
	protected JMenuBar jMenuBar = new JMenuBar();
	protected JTabbedPane jTabbe = new JTabbedPane();
	
	public AbstractJGuidFrame(GuiSkeleton skeleton)
	{
		this.skeleton = skeleton;
		this.setTitle("Gui Designer");
		this.setSize(400, 200);
		this.setContentPane(jTabbe);
		this.setJMenuBar(jMenuBar);
		this.addWindowListener(this);
		
		buildMenu(jMenuBar);
	}
	
	protected final JTabbedPane getTabbe()
	{
		return jTabbe;
	}
	
	public final GuiSkeleton getSkeleton()
	{
		return skeleton;
	}
	
	public final boolean isClosed()
	{
		return isClosed;
	}
	
	protected abstract void buildMenu(JMenuBar menu);

	@Override
	public void windowActivated(WindowEvent e)
	{
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		isClosed = true;
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
	}
	
	static
	{
		try
		{
			UIManager.setLookAndFeel(
				UIManager.getSystemLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (InstantiationException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
