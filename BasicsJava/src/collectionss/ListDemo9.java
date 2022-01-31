package collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo9 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList:"+al);
		
		Collections.swap(al, 1, 2);
		System.out.println(al);

	}

}
