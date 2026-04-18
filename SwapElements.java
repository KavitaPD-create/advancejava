/*5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
*/
package linkedlist;

import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {

	 
	public static void main(String[] args)
	{
	LinkedList<String> l_list = new LinkedList<String>();

	l_list.add("Red");
	l_list.add("Blue");
	l_list.add("Green");
	l_list.add("Yellow");
	l_list.add("Orange");

	System.out.println("Before Swapping: " + l_list);

	// Swapping 1st (index 0) and 3rd (index 2) elements
	Collections.swap(l_list, 0, 2);

	System.out.println("After Swapping: " + l_list);
	}
	}
