package stringconceppts;
// char a Occurrence
import java.util.Scanner;

public class CountCharOccurence
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		String s = scan.nextLine();
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a')
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
