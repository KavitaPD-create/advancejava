/*5.Write a java program for getting different colors through ArrayList interface and
delete nth element from the ArrayList object by using remove by index
*/
package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveNTHElement {



	public static void main(String[] args)
	{
	ArrayList<String> colors = new ArrayList<String>();

	colors.add("Red");
	colors.add("Blue");
	colors.add("Green");
	colors.add("Yellow");
	colors.add("Orange");

	Scanner sc = new Scanner(System.in);

	System.out.println("Original ArrayList: " + colors);

	System.out.print("Enter the position (n) to delete: ");
	int n = sc.nextInt();

	// Since index starts from 0, nth element = n-1 index
	if(n > 0 && n <= colors.size())
	{
	colors.remove(n - 1);
	System.out.println("ArrayList after deletion: " + colors);
	}
	else
	{
	System.out.println("Invalid position!");
	}

	sc.close();
	}

}
