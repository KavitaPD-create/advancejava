/*
 * 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan
 */
package swing;
import javax.swing.*;
import java.awt.*;

public class ColourTabs1 {

	public static void main(String[] args)
	{
	JFrame frame = new JFrame("CMY Tabs");

	JTabbedPane tab = new JTabbedPane();

	JPanel cyanPanel = new JPanel();
	cyanPanel.setBackground(Color.CYAN);

	JPanel magentaPanel = new JPanel();
	magentaPanel.setBackground(Color.MAGENTA);

	JPanel yellowPanel = new JPanel();
	yellowPanel.setBackground(Color.YELLOW);

	tab.addTab("CYAN", cyanPanel);
	tab.addTab("MAGENTA", magentaPanel);
	tab.addTab("YELLOW", yellowPanel);

	frame.add(tab);

	frame.setSize(400,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	}
