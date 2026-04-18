/*3.Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
*/
package linkedlist;
import java.util.LinkedList;
public class InsertAtEnd {
	public static void main(String[] args)
	{
	LinkedList<String> l_listobj = new LinkedList<String>();

	l_listobj.add("Red");
	l_listobj.add("Blue");
	l_listobj.add("Green");
	l_listobj.add("Yellow");

	System.out.println("Original LinkedList: " + l_listobj);

	// Inserting element at the end using offerLast()
	l_listobj.offerLast("Pink");

	System.out.println("LinkedList after inserting at end: " + l_listobj);
	}
	}
