/*
4.Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
*/
package linkedlist;
import java.util.LinkedList;

public class DisplayPosition {

	public static void main(String[] args)
	{
	LinkedList<String> l_listobj = new LinkedList<String>();

	l_listobj.add("Red");
	l_listobj.add("Blue");
	l_listobj.add("Green");
	l_listobj.add("Yellow");
	l_listobj.add("Orange");

	System.out.println("LinkedList Elements with Positions:");

	// Using get(p) to access elements by index
	for(int p = 0; p < l_listobj.size(); p++)
	{
	System.out.println("Position " + p + " : " + l_listobj.get(p));
	}
	}
	}