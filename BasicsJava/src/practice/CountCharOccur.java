package practice;

public class CountCharOccur {

	public static void main(String[] args) 
	{
		String s = "Java is java again java again" ;
		
		int counta = 0;
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) == 'a')
			{
				counta++;
			}
		}
		System.out.println(counta);

	}

}
