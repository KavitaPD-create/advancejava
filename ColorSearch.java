/* 1.Write a java program for getting different colors through ArrayList interface 
and search whether the color "Red" is available or not*/
 
package basics;
import java.util.ArrayList;
import java.util.Scanner;
public class ColorSearch
	{
	public static void main(String[] args)
	{
	ArrayList<String> colors = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of colors:");
	int n = sc.nextInt();
	sc.nextLine();

	for(int i=0;i<n;i++)
	{
	System.out.println("Enter color:");
	String color = sc.nextLine();
	colors.add(color);
	}

	System.out.println("Colors in the list: " + colors);

	if(colors.contains("Red"))
	{
	System.out.println("Red color is available in the list.");
	}
	else
	{
	System.out.println("Red color is NOT available in the list.");
	}
	}
	}
