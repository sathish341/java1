package collectionss;

import java.util.ArrayList;

public class ListCloneofDemo2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println("Actual ArrayList:"+al);
		
		ArrayList<String> copy = (ArrayList<String>) al.clone();
		System.out.println("Cloned ArrayList:"+copy);
	}

}
