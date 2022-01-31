package stringconceppts;

import java.util.Scanner;

public class CountTheWords 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s = scan.nextLine();
		String[] sarray = s.trim().split(" ");
		
		System.out.println(sarray.length);
		

	}

}
