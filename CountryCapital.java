/*
 * 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
 *  France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the 
 *  capital of the countries on console whenever the countries are selected on the list.
 */
package swing;
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapital {
	public static void main(String[] args)
	{
	JFrame frame = new JFrame("Country Capitals");

	String countries[] = {"USA","India","Vietnam","Canada","Denmark","France","Great Britain","Japan","Africa","Greenland","Singapore"};

	HashMap<String,String> capitals = new HashMap<String,String>();

	capitals.put("USA","Washington D.C.");
	capitals.put("India","New Delhi");
	capitals.put("Vietnam","Hanoi");
	capitals.put("Canada","Ottawa");
	capitals.put("Denmark","Copenhagen");
	capitals.put("France","Paris");
	capitals.put("Great Britain","London");
	capitals.put("Japan","Tokyo");
	capitals.put("Africa","No Single Capital");
	capitals.put("Greenland","Nuuk");
	capitals.put("Singapore","Singapore");

	JList<String> list = new JList<String>(countries);
	list.setBounds(50,50,200,200);

	list.addListSelectionListener(new ListSelectionListener()
	{
	public void valueChanged(ListSelectionEvent e)
	{
	if(!e.getValueIsAdjusting())
	{
	String country = list.getSelectedValue();
	System.out.println("Capital of " + country + " is " + capitals.get(country));
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
