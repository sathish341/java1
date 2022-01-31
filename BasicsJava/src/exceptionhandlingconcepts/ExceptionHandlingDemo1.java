package exceptionhandlingconcepts;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandlingDemo1 
{

	public static void main(String[] args) 
	{
		int nr, dr, result;
		Scanner sc = new Scanner(System.in);
		
		
		
		while (true) 
		{
			System.out.println("Enter the NR value");
			nr = sc.nextInt();
			System.out.println("Enter the DR value");
			dr = sc.nextInt();
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			
			catch (ArithmeticException e) 
			{

				e.printStackTrace();
			}
			catch (NullPointerException e) 
			{
				e.printStackTrace();
			} 
			catch (NoSuchElementException e) 
			{
				e.printStackTrace();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
			
		}
	    

	}

}
