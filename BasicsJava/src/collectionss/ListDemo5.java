package collectionss;
//to copy ArrayList to an Array 
// by calling toArray()  method

import java.util.ArrayList;
import java.util.List;

public class ListDemo5 
{

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList:"+al);
		
		// to copy ArrayList to an Array
		String [] a = new String[al.size()];
		
		al.toArray(a); //al to a
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}


	}

}
