package collectionss;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 
{

	public static void main(String[] args)
	{
		HashMap<String, Integer> m = new HashMap<String,Integer>();
		
		m.put("karthik", 90003);
		m.put("sathish", 123568);
		m.put("sai", 56566);
		m.put("krishna", 334555);
		m.put("Binnu", 678445);
		System.out.println(m);
		
		System.out.println(m.get("sathish"));
		
		Set<String> keys = m.keySet();
		for( String i: keys)
		{
			System.out.println( i + ":"+ m.get(i));
		}
		
		
		Set<Entry<String, Integer>> value = m.entrySet();
		for(Entry<String, Integer> e : value)
		{
			System.out.println(e.getKey() + ":" + e.getValue());
			
		}

	}

}
