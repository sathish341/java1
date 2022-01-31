package collectionss;
// .addAll(); 
// to add all elements of a list to ArrayList

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList:"+al);
		
		List<String> list  = new ArrayList<String>();
		list.add("one");
		list.add("Two");
		al.addAll(list);
		
		System.out.println("After copy:"+al);

	}

}
