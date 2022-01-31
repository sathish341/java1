package abstactclass;

public abstract class FirstAbstract 
{
	int x=10;
	void m1()
	{
		System.out.println("i am m1 concrete method from FirstAbstract");
		
	}
	abstract void m2();
	
	public static void main(String[] args)
	{
		FirstAbstract obj;
		obj=new ChildClass();
		obj.m1();
		obj.m2();
		
	}

}
