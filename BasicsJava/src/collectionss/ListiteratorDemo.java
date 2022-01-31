package collectionss;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Oracle");
		a.add("vmware");
		a.add("kosmik");
		a.add("mindq");
		a.add("colabra");
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.equals("Oracle"))
				var.set("profilics");
			else
				var.remove();
		}
		System.out.println(a);

	}

}
