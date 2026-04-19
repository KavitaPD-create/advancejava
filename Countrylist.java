/*
 * 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
 *  Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
 *   display them on console whenever the countries are selected on the list.
 */

package swing;
import javax.swing.*;
import javax.swing.event.*;
public class Countrylist {
	public static void main(String[] args)
	{
	JFrame frame = new JFrame("Country List");

	String countries[] = {"USA","India","Vietnam","Canada","Denmark","France","Great Britain","Japan","Africa","Greenland","Singapore"};

	JList<String> list = new JList<String>(countries);
	list.setBounds(50,50,200,200);

	list.addListSelectionListener(new ListSelectionListener()
	{
	public void valueChanged(ListSelectionEvent e)
	{
	if(!e.getValueIsAdjusting())
	{
	System.out.println("Selected: " + list.getSelectedValue());
	}
	}
	});

	frame.add(list);
	frame.setSize(300,300);
	frame.setLayout(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	
}
