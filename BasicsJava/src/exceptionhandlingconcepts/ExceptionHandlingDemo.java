package exceptionhandlingconcepts;

import java.util.Scanner;

public class ExceptionHandlingDemo 
{

	public static void main(String[] args) 
	{
		int nr, dr, result;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the NR value:");
			nr = sc.nextInt();
			System.out.println("Enter the VR value:");
			dr = sc.nextInt();
			
			try {
				
				result = nr / dr;
				System.out.println(result);
				break;
			} catch (ArithmeticException e) {

				e.printStackTrace();
			} 
		}

	}

}
