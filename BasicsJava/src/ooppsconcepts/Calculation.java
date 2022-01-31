package ooppsconcepts;

public class Calculation 
{
	int a,b,c;
	
	public Calculation(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}

	public void add()
	{
		c=a+b;
		System.out.println("addition of A and B is:" + c);
		
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Sub of A and B is:" + c);
		
	}

	public static void main(String[] args)
	{
		Calculation obj = new Calculation(10,20);
		obj.add();
		obj.sub();
		
		Calculation obj1 = new Calculation(1000,2000);
		obj1.add();
		obj1.sub();
		
		
			

	}

}
