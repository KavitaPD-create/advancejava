/*Q4. Write a Java Program for Checking if a string reads the same backward as forward
 *  (ignoring case and punctuation) using user defined function isPalindrome():
 */


package StringEx;
import java.util.Scanner;

public class PalindromeCheck {	 
	public static boolean isPalindrome(String str)
	{
	// Remove non-alphanumeric and convert to lowercase
	str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	int left = 0;
	int right = str.length() - 1;

	while(left < right)
	{
	if(str.charAt(left) != str.charAt(right))
	return false;
	left++;
	right--;
	}
	return true;
	}

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a string: ");
	String input = sc.nextLine();

	if(isPalindrome(input))
	System.out.println("It is a Palindrome");
	else
	System.out.println("Not a Palindrome");

	sc.close();
	}
	}
