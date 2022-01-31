package collectionss;

import java.util.ArrayList;
import java.util.List;

public final class ListDemo4
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println(al);
		
		List<String> list = new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		System.out.println(list);
		
		System.out.println("Does ArrayList contains all list elements:"+al.containsAll(list));

	}

}
