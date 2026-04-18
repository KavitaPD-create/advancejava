/*2.Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
*/
package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;

public class Reverselinkedlist {

	 
	public static void main(String[] args)
	{
	LinkedList<String> objlist = new LinkedList<String>();

	objlist.add("Red");
	objlist.add("Blue");
	objlist.add("Green");
	objlist.add("Yellow");
	objlist.add("Orange");

	System.out.println("Original LinkedList: " + objlist);

	System.out.println("LinkedList in Reverse Order:");

	Iterator<String> iterator = objlist.descendingIterator();

	while(iterator.hasNext())
	{
	System.out.println(iterator.next());
	}
	}
	}
