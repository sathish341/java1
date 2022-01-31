package exceptionhandlingconcepts;

import java.util.Scanner;

public class UserDefineExceptionDemo extends Exception
{

	public UserDefineExceptionDemo(String string)
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while (true) 
		{
			System.out.println("Enter the Alpha numeric value");
			str = sc.nextLine();
			try 
			{
				if (str.length() != 10) 
				{

					throw new UserDefineExceptionDemo("String should be 10 didgit alpha numeric");
				} 
				else 
				{
					System.out.println(str);
					break;
				}
			} 
			catch (UserDefineExceptionDemo e) 
			{
                            
				e.printStackTrace();
			} 
		}
	}

}
