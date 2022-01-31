package stringconceppts;
//removing spaces using builtin removeAll("\\s+","");
import java.util.Scanner;

public class RmoveWhiteSpaces 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		
		String s = scan.nextLine();
		System.out.println(s.replaceAll("\\s", ""));
		
		

	}

}
