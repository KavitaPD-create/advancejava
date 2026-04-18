/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a
LinkedList to perform the following operations with different functions directed as follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing
elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating
over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
package basics;
import java.util.*;
public class ListOperations {
	public static void main(String[] args)
	{
	ArrayList<String> arrayList = new ArrayList<>();
	LinkedList<String> linkedList = new LinkedList<>();

	addElements(arrayList);
	addElements(linkedList);

	addAtIndex(arrayList);
	addAtIndex(linkedList);

	addMultiple(arrayList);
	addMultiple(linkedList);

	accessElements(arrayList);
	accessElements(linkedList);

	updateElements(arrayList);
	updateElements(linkedList);

	removeElements(arrayList);
	removeElements(linkedList);

	searchElements(arrayList);
	searchElements(linkedList);

	listSize(arrayList);
	listSize(linkedList);

	iterateList(arrayList);
	iterateList(linkedList);

	useIterator(arrayList);
	useIterator(linkedList);

	sortList(arrayList);
	sortList(linkedList);

	subListExample(arrayList);
	subListExample(linkedList);

	clearList(arrayList);
	clearList(linkedList);
	}

	static void addElements(List<String> list)
	{
	list.add("Apple");
	list.add("Banana");
	list.add("Orange");
	System.out.println("After adding: " + list);
	}

	static void addAtIndex(List<String> list)
	{
	list.add(1,"Mango");
	System.out.println("After adding at index: " + list);
	}

	static void addMultiple(List<String> list)
	{
	List<String> newList = Arrays.asList("Grapes","Pineapple");
	list.addAll(newList);
	System.out.println("After adding multiple: " + list);
	}

	static void accessElements(List<String> list)
	{
	System.out.println("Element at index 2: " + list.get(2));
	}

	static void updateElements(List<String> list)
	{
	list.set(2,"Kiwi");
	System.out.println("After update: " + list);
	}

	static void removeElements(List<String> list)
	{
	list.remove("Banana");
	System.out.println("After removal: " + list);
	}

	static void searchElements(List<String> list)
	{
	System.out.println("Contains Apple? " + list.contains("Apple"));
	}

	static void listSize(List<String> list)
	{
	System.out.println("List size: " + list.size());
	}

	static void iterateList(List<String> list)
	{
	System.out.print("Using for-each: ");
	for(String item : list)
	System.out.print(item + " ");
	System.out.println();
	}

	static void useIterator(List<String> list)
	{
	System.out.print("Using Iterator: ");
	Iterator<String> it = list.iterator();
	while(it.hasNext())
	System.out.print(it.next() + " ");
	System.out.println();
	}

	static void sortList(List<String> list)
	{
	Collections.sort(list);
	System.out.println("After sorting: " + list);
	}

	static void subListExample(List<String> list)
	{
	if(list.size() >= 3)
	System.out.println("Sublist (1 to 3): " + list.subList(1,3));
	}

	static void clearList(List<String> list)
	{
	list.clear();
	System.out.println("After clearing: " + list);
	}
}
