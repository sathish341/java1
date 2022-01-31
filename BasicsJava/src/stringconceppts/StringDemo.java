package stringconceppts;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		// 2 ways to define string
		
		// 1.using assignment operator
		String s1 = "ravikanth";
		System.out.println(s1);
		
		// 2 way using new keyword
		String s2 = new String("Ravikan");
		System.out.println(s2);
		
		System.out.println(s1.hashCode());//address
		System.out.println(s1.length()); // length
		System.out.println(s1.charAt(2));// to get particular char based on index
		System.out.println(s1.indexOf('v')); // to get index value of particular char
		System.out.println(s1.isEmpty()); //to know is string empty or not
		System.out.println(s1.startsWith("rav"));
		System.out.println(s1.endsWith("nth"));
		System.out.println(s1.toUpperCase());//to convert to upper case
		System.out.println(s1.toLowerCase());//to convert to lower case
		
		//  .equals()- to compare strings
		// case and space also considered
		System.out.println(s1.equals(s2));
		
		// .equalsIgnorecase()-to compare strings and ignore case
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// .contains()- to check string contains part of text of another string
		// case and space also considered
		System.out.println(s1.contains(s2));//case mismatch
		//to ignore case convert case
		System.out.println(s1.contains(s2.toLowerCase()));
		// to ignore space
		System.out.println(s1.contains(s2.trim().toLowerCase()));
		
		
		//Concatenation
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		// for loop to print string one by one
		for(int i=0;i<s1.length();i++)
			System.out.println(s1.charAt(i));
		// for loop to print string in one line 
		for(int i=0;i<s1.length();i++)
			System.out.print(s1.charAt(i));
		// for loop to print reverse
		
		  for(int i=s1.length()-1;i>=0;i--)
			  System.out.println(s1.charAt(i));
		 
		
		//to replace old char with new char
		System.out.println(s1.replace('r', 'k'));
		
		//to get substring
		System.out.println(s1.substring(2, 7));
		
		// .trim()-to remove space
		String s3 = "ravi";
		String s4 = " ravi ";
		System.out.println(s3.equals(s4));// false bc; space
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3.equals(s4.trim()));
		
		// .split()- to break string into multiple parts
		String s5 = "ravi kanth";
		System.out.println(s5);
		
		String[] sArray = s5.split(" ");
		for(String s:sArray)
		{
			System.out.println(s);
		}
		
		 
		 
		 
		

	}

}
