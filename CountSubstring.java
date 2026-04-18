/*Q2. Write a Java Program for Counting how many times a substring
 *  appears in a main string using user defined function countOccurrences()
 */

package StringEx;
import java.util.Scanner;
public class CountSubstring {
	public static int countOccurrences(String str, String sub)
	{
	int count = 0;
	int index = 0;

	while((index = str.indexOf(sub, index)) != -1)
	{
	count++;
	index += sub.length();
	}
	return count;
	}

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter main string: ");
	String str = sc.nextLine();

	System.out.print("Enter substring: ");
	String sub = sc.nextLine();

	System.out.println("Occurrences: " + countOccurrences(str, sub));

	sc.close();
	}
}
