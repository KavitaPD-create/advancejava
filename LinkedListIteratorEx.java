/*1.Write a Java program to iterate through all elements in a linked list starting at 
the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorEx {
	
	public static void main(String[] args)
	{
	LinkedList<String> listobj = new LinkedList<String>();

	listobj.add("Red");
	listobj.add("Blue");
	listobj.add("Green");
	listobj.add("Yellow");
	listobj.add("Orange");

	System.out.println("LinkedList elements: " + listobj);

	// Creating ListIterator starting from index 1 (2nd position)
	ListIterator<String> iteratorobj = listobj.listIterator(1);

	System.out.println("Elements from 2nd position:");

	while(iteratorobj.hasNext())
	{
	System.out.println(iteratorobj.next());
	}
	}
	}