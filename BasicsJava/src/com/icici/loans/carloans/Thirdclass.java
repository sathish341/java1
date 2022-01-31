package com.icici.loans.carloans;

public class Thirdclass 
{
	int a=10, b=20,c;  
	void add()
	{
		c=a+b;
		System.out.println("Addition of a & b is:"+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Sub of a & b is:"+c);
	}

	public static void main(String[] args) 
	{
		Thirdclass obj = new Thirdclass();
		obj.add();
		obj.sub();
	}

}
