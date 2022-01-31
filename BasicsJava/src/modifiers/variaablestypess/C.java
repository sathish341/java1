package modifiers.variaablestypess;

import inheritancedemo.B;

public class C extends B
{
	void m3()
	{
		System.out.println("iam m3 of classC");
	}

	public static void main(String[] args) {
		C c = new C();
		c.m3();
		c.m2();
		c.m1();
		
		
		

	}

}
