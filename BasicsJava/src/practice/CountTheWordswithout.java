package practice;

import java.util.Scanner;

public class CountTheWordswithout
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		
		String s = scan.nextLine();
		
		int count = 1;
		
		for(int i=0; i<s.length()-1;i++)
		{
			if(s.charAt(i)==' '  && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
