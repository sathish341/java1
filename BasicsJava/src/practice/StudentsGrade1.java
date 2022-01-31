package practice;

import java.util.Scanner;

public class StudentsGrade1 {

	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter no of subs:");
		int subs = scan.nextInt();
		int [] marks = new int[subs];
		
		float sum=0,avg;
		System.out.println("Enter marks:");
		
		for(int i=0; i<marks.length;i++)
		{
			marks[i]=scan.nextInt();
			sum = sum + marks[i];
		}
		System.out.println("Total marks:" + sum);
		
		avg = sum/subs;
		System.out.println("Average :" + avg);
		
		if(avg>80)
		{
			System.out.println("Grade A");
		}
		else if(avg<=80 && avg>60)
		{
			System.out.println("Grade B");
		}	
		else if(avg<=60 && avg>40)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Grade D");
		}

	}

}
