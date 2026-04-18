/*4.Write a java program for getting different colors through ArrayList interface
 *  and extract the elements 1st and 2nd from the ArrayList object by using SubList()
 */

package arraylist;
import java.util.ArrayList;
import java.util.List;

public class SubListEx {

	public static void main(String[] args)
	{
	ArrayList<String> colors = new ArrayList<String>();

	colors.add("Red");
	colors.add("Blue");
	colors.add("Green");
	colors.add("Yellow");
	colors.add("Orange");

	System.out.println("Original ArrayList: " + colors);

	// Extracting 1st and 2nd elements (index 0 and 1)
	List<String> subList = colors.subList(0, 2);

	System.out.println("Extracted Elements (1st and 2nd): " + subList);
	}
	}
