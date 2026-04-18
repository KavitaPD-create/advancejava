/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
one is better.*/
package basics;

public class PerformanceTest {
	
	public static void main(String[] args)
	{
	long startTime;
	long endTime;

	StringBuffer sbf = new StringBuffer();
	startTime = System.nanoTime();
	for(int i=0;i<10000;i++)
	sbf.append("AIET");
	endTime = System.nanoTime();
	System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

	StringBuilder sbd = new StringBuilder();
	startTime = System.nanoTime();
	for(int i=0;i<10000;i++)
	sbd.append("AIET");
	endTime = System.nanoTime();
	System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
	}
	}

