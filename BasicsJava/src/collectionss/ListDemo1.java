package collectionss;

import java.util.ArrayList;

public class ListDemo1 
{

	public static void main(String[] args)
	{
		ArrayList<Object> a = new ArrayList<Object>();
		
		a.add(10);
		a.add(20);
		a.add("ravi");
		a.add(12.35f);
		a.add(10);
		a.add(30);
		System.out.println(a);
		
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.hashCode());
		a.add(1, "sai");
		System.out.println(a);
		System.out.println(a.contains(30));
		System.out.println(a.indexOf(10));
		a.set(1, "sai keerthan");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("ravi");
		System.out.println(a);
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
		
	}

}
