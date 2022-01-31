package collectionss;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 
{

	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
		

		m.put("karthik", 90003);
		m.put("sathish", 123568);
		m.put("sai", 56566);
		m.put("krishna", 334555);
		m.put("Binnu", 678445);
		System.out.println(m);
		
		Set<String> keys = m.keySet();
		for(String i : keys)
		{
			System.out.println(i + ":" + m.get(i));
		}
		
		System.out.println("--------------------");
		
		Set<Entry<String, Integer>> values = m.entrySet();
		for(Entry<String, Integer> e : values)
		{
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		
	}

}
