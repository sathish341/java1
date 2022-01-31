package practice;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i)); 
		}

	}

}
