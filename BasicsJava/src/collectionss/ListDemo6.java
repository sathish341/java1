package collectionss;

import java.util.ArrayList;
import java.util.List;

//to get subList(start,end index);
public class ListDemo6 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList:"+al);
		
		List<String> list = al.subList(1, 4);
		System.out.println(list);

	}

}
