package exceptionhandlingconcepts;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedExceptionDemo
{
	static void m1() throws Exception
	{
		BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\sathi\\Desktop\\s.txt"));
	}


	/*
	 * public static void main(String[] args) throws Exception { m1();
	 * 
	 * }
	 */
	
	public static void main(String[] args)
	{
		try 
		{
			m1();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
