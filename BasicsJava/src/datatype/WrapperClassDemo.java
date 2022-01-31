package datatype;

import java.util.ArrayList;

public class WrapperClassDemo 
{

	
	
	public static void main(String[] args) 
	{
		//Boxing process using constructor
		Integer i1 = new Integer(100);
		Integer i2 = new Integer("200"); 
		
		System.out.println(i1);
		System.out.println(i2);
		
		//Boxing process using valueof() method
		Integer i3 = Integer.valueOf(101);
		Integer i4 = Integer.valueOf("201");
		
		System.out.println(i3);
		System.out.println(i4);
		
		//We use this Wrapper classes in java collections
		// like ArrayList to collect similar data
		ArrayList<Object> a= new ArrayList<>();
		a.add(10);
		a.add(12);
		a.add("sathish");
		
		
		
		
	}

}
