package ooppsconcepts;

//instead of creating multiple object reference
//using this() we can call multiple constructors with one class object
// Employee1.java

public class Employee 
{
	int eno;
	String ename;
	float sal;
	
	public Employee()
	{
		System.out.println("iam default constructor");
	}
	
	
	public Employee(int eno)
	{
		this.eno=eno;
	}
	
	
	public Employee(int eno, String ename) 
	{
		this.eno=eno; //using same variable
		this.ename=ename;
	}
	
	public Employee(int eno, String ename, float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}


	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		System.out.println(e1.sal);
		
		Employee e2 = new Employee(1743);
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		System.out.println(e2.sal);
		
		Employee e3 = new Employee(1744,"sathish");
		System.out.println(e3.eno);
		System.out.println(e3.ename);
		System.out.println(e3.sal);
		
		Employee e4 = new Employee(1745,"sai",23.45f);
		System.out.println(e4.eno);
		System.out.println(e4.ename);
		System.out.println(e4.sal);
		
		
		
	}

}
