package openguid.swing.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTabbedPane;

import openguid.swing.JGuidButton;

public class ActionAddButton implements ActionListener
{
	private int nextButtonID = 0;
	private final JTabbedPane tabbeObj;
	
	public ActionAddButton(JTabbedPane pane)
	{
		tabbeObj = pane;
	}
	
	@Override
	public void actionPerformed(ActionEvent event)
	{
		tabbeObj.add("Button " + (++nextButtonID), new JGuidButton());
		tabbeObj.setSelectedIndex(tabbeObj.getTabCount() - 1);
	}
}
