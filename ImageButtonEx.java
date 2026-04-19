/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed”
 *  or “Hour Glass is pressed” depending upon the Jbutton with image either Digital
 *   Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
 */
package swingprog;
import javax.swing.*;
import java.awt.event.*;
public class ImageButtonEx {

	
	public static void main(String[] args)
	{
	JFrame frame = new JFrame("Image Button");

	ImageIcon clockIcon = new ImageIcon("clock.png");
	ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

	JButton btn1 = new JButton("Digital Clock", clockIcon);
	JButton btn2 = new JButton("Hour Glass", hourglassIcon);

	btn1.setBounds(50, 100, 200, 60);
	btn2.setBounds(270, 100, 200, 60);

	JLabel label = new JLabel();
	label.setBounds(150, 50, 300, 30);

	btn1.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	label.setText("Digital Clock is pressed");
	}
	});

	btn2.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	label.setText("Hour Glass is pressed");
	}
	});

	frame.add(btn1);
	frame.add(btn2);
	frame.add(label);

	frame.setSize(550, 300);
	frame.setLayout(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	
}
