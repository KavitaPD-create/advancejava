/*2 a. Develop a java program for performing various string operations with different string handling
functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
endsWith()*/  

package basics;
import java.util.*;
public class StringOperations {	
	public static void main(String[] args)
	{
	stringCreation();
	lengthAndCharAccess();
	stringComparison();
	stringSearching();
	substringOperations();
	stringModification();
	whitespaceHandling();
	stringConcatenation();
	stringSplitting();
	stringBuilderDemo();
	stringFormatting();
	emailValidation();
	}

	static void stringCreation()
	{
	String s1 = "Apple";
	String s2 = new String("Banana");
	System.out.println("String1: " + s1);
	System.out.println("String2: " + s2);
	}

	static void lengthAndCharAccess()
	{
	String s = "Orange";
	System.out.println("Length: " + s.length());
	System.out.println("Character at index 2: " + s.charAt(2));
	}

	static void stringComparison()
	{
	String s1 = "Apple";
	String s2 = "apple";
	System.out.println("Equals: " + s1.equals(s2));
	System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
	System.out.println("CompareTo: " + s1.compareTo(s2));
	}

	static void stringSearching()
	{
	String s = "Banana";
	System.out.println("Index of 'a': " + s.indexOf('a'));
	System.out.println("Last index of 'a': " + s.lastIndexOf('a'));
	System.out.println("Contains 'na': " + s.contains("na"));
	}

	static void substringOperations()
	{
	String s = "Pineapple";
	System.out.println("Substring(0,4): " + s.substring(0,4));
	System.out.println("Substring from 4: " + s.substring(4));
	}

	static void stringModification()
	{
	String s = "hello";
	System.out.println("Uppercase: " + s.toUpperCase());
	System.out.println("Replace l with x: " + s.replace('l','x'));
	}

	static void whitespaceHandling()
	{
	String s = "   Java Programming   ";
	System.out.println("Original: [" + s + "]");
	System.out.println("Trimmed: [" + s.trim() + "]");
	}

	static void stringConcatenation()
	{
	String s1 = "Hello";
	String s2 = "World";
	System.out.println("Using +: " + s1 + " " + s2);
	System.out.println("Using concat: " + s1.concat(" ").concat(s2));
	}

	static void stringSplitting()
	{
	String s = "Apple,Banana,Orange";
	String[] arr = s.split(",");
	System.out.println("After split:");
	for(String str : arr)
	System.out.println(str);
	}

	static void stringBuilderDemo()
	{
	StringBuilder sb = new StringBuilder("Java");
	sb.append(" Programming");
	sb.insert(4," Language");
	sb.replace(0,4,"Advanced");
	System.out.println("StringBuilder: " + sb);
	}

	static void stringFormatting()
	{
	String name = "Kavita";
	int age = 20;
	System.out.println(String.format("Name: %s Age: %d",name,age));
	}

	static void emailValidation()
	{
	String email = "example@gmail.com";
	boolean valid = email.contains("@") && email.startsWith("example") && email.endsWith(".com");
	System.out.println("Email valid? " + valid);
	}
	}
