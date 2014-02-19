package openguid.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import openguid.skeleton.GuiSkeleton;
import openguid.swing.action.ActionAddButton;

public class JGuidFrame extends AbstractJGuidFrame
	implements WindowListener
{
	public JGuidFrame()
	{
		super(new GuiSkeleton());
		this.setVisible(true);
	}
	
	@Override
	protected void buildMenu(JMenuBar menuBar)
	{
		menuBar.add(buildMenuGui(new JMenu("Gui")));
	}
	
	private JMenu buildMenuGui(JMenu menu)
	{
		final JMenuItem item1 = new JMenuItem("Add button");
		item1.addActionListener(new ActionAddButton(this.getTabbe())); menu.add(item1);
		
		return menu;
	}
}
