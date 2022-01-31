package ooppsconcepts;

public class Employee1 
{
	int eno;
	String ename;
	float sal;
	
	public Employee1()
	{
		System.out.println("i am default constructor");
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	


	public Employee1(int eno) 
	{
		this();
		this.eno=eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}



	public Employee1(int eno, String ename)
	{
		this(1743);
		this.eno=eno;
		this.ename=ename;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}



	public Employee1(int eno, String ename, float sal) 
	{
		this(1744,"sathish");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
		
	}



	public static void main(String[] args) 
	{
		
		
		Employee1 e4 = new Employee1(1745,"sai",23.45f);
		
		
		
		
		
	}

}
