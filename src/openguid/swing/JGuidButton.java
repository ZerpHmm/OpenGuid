package openguid.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JGuidButton extends JPanel
{
	public JGuidButton()
	{
		setLayout(makeLayout());
		
		add(makeHeader("position: "));
		add(makeDecimalField());
		add(makeDecimalField());
		
		add(makeHeader("size: "));
		add(makeDecimalField());
		add(makeDecimalField());
	}
	
	private LayoutManager makeLayout()
	{
		final LayoutManager layout = new BoxLayout(this, BoxLayout.LINE_AXIS).;
		return layout;
	}
	
	private JTextField makeHeader(String title)
	{
		JTextField field = new JTextField(title);
		field.setBorder(BorderFactory.createEmptyBorder());
		field.setEditable(false);
		return field;
	}
	
	private JTextField makeDecimalField()
	{
		JFormattedTextField panel = new JFormattedTextField(new DecimalFormat());
		panel.setPreferredSize(new Dimension(200, 20));
		panel.setMaximumSize(panel.getMinimumSize());
		return panel;
	}
}
