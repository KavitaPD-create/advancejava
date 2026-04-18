/*3a. Develop a java program for performing various string operations with different string handling
functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/

package basics;
import java.util.*;

public class StringOperationsDemo {
	
	public static void main(String[] args)
	{
	stringCreation();
	lengthAndAccess();
	comparison();
	searching();
	substringOps();
	modification();
	whitespace();
	concatenation();
	splitting();
	stringBuilderDemo();
	formatting();
	emailValidation();
	}

	static void stringCreation()
	{
	String s1 = "AIET";
	String s2 = new String("College");
	System.out.println("s1: " + s1);
	System.out.println("s2: " + s2);
	}

	static void lengthAndAccess()
	{
	String s = "Java";
	System.out.println("Length: " + s.length());
	System.out.println("Char at index 1: " + s.charAt(1));
	}

	static void comparison()
	{
	String a = "Java";
	String b = "java";
	System.out.println("Equals: " + a.equals(b));
	System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
	System.out.println("CompareTo: " + a.compareTo(b));
	}

	static void searching()
	{
	String s = "Programming";
	System.out.println("Index of 'g': " + s.indexOf('g'));
	System.out.println("Last index of 'g': " + s.lastIndexOf('g'));
	System.out.println("Contains 'gram': " + s.contains("gram"));
	}

	static void substringOps()
	{
	String s = "Artificial";
	System.out.println("Substring(0,5): " + s.substring(0,5));
	System.out.println("Substring from 5: " + s.substring(5));
	}

	static void modification()
	{
	String s = "hello";
	System.out.println("Uppercase: " + s.toUpperCase());
	System.out.println("Replace l with x: " + s.replace('l','x'));
	}

	static void whitespace()
	{
	String s = "   AIET College   ";
	System.out.println("Before trim: [" + s + "]");
	System.out.println("After trim: [" + s.trim() + "]");
	}

	static void concatenation()
	{
	String s1 = "AIET";
	String s2 = "College";
	System.out.println("Using +: " + s1 + " " + s2);
	System.out.println("Using concat: " + s1.concat(" ").concat(s2));
	}

	static void splitting()
	{
	String s = "AIET,ISE,CSE,ECE";
	String[] arr = s.split(",");
	for(String x : arr)
	System.out.println(x);
	}

	static void stringBuilderDemo()
	{
	StringBuilder sb = new StringBuilder("AIET");
	sb.append(" College");
	sb.insert(4," Engineering");
	sb.replace(0,4,"Welcome");
	System.out.println("StringBuilder: " + sb);
	}

	static void formatting()
	{
	String name = "Student";
	int marks = 90;
	System.out.println(String.format("Name: %s Marks: %d",name,marks));
	}

	static void emailValidation()
	{
	String email = "user@gmail.com";
	boolean valid = email.contains("@") && email.startsWith("user") && email.endsWith(".com");
	System.out.println("Email valid? " + valid);
	}

}
