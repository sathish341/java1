package collectionss;

import java.util.ArrayList;
import java.util.Collections;

// to reverse the content have to call 
//   Collections.reverse()  method
public final class ListDemo7 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList:"+al);
		
		Collections.reverse(al);
		System.out.println(al);

	}

}
