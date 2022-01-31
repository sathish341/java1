package collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo8
{

	

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList:"+al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		

	}

}
