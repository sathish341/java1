package inheritancedemo;

public class B extends A//is a relationship
{
	public void m2()
	{
		System.out.println("i am m2 of classB");
	}
	public void m1()
	{
		System.out.println("iam m1 overriden in classB");
	}
	
	
	public static void main(String[] args) {
		B b = new B();
		b.m2();
		b.m1();
		
		A a = new A();//has a relationship
		a.m1();
		
		A obj = new B();
		obj.m1();
		
				
				

	}

}
