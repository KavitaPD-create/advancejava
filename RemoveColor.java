/*
 *2. Write a java program for getting different colors through ArrayList interface and
 *  remove the 2nd element and color "Blue" from the ArrayList
 */
package basics;
import java.util.ArrayList;
public class RemoveColor {
	public static void main(String[] args)
	{
	ArrayList<String> colors = new ArrayList<String>();

	colors.add("Red");
	colors.add("Green");
	colors.add("Blue");
	colors.add("Yellow");
	colors.add("Black");

	System.out.println("Original List: " + colors);

	if(colors.size() >= 2)
	{
	colors.remove(1);
	}

	System.out.println("After removing 2nd element: " + colors);

	colors.remove("Blue");

	System.out.println("After removing Blue: " + colors);
	}
	}

