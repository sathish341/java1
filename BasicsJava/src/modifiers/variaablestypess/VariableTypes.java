package modifiers.variaablestypess;
// two types of variable 1.primitive 2.non-primitive
// they are further divided into 3 types
//1.instance 2.static 3.local
public class VariableTypes 
{   //primitive variables
	int x=10; // instance variable
	static float sal=543.3f;//static variable
	static VariableTypes obj; //static-reference
	
	void m1()//instance method
	{
		int x=20;//local variable
		//System.out.println(y);
		System.out.println(this.x);//instance variable directly accessed in instance method
		System.out.println(VariableTypes.sal);//static variable directly accessed in instance method
	}
	static void m2()//static method
	{
		System.out.println(sal);//static variable directly accessed in static method
		VariableTypes obj = new VariableTypes();//local-reference variable
		System.out.println(obj.x);//instance variable accessed indirectly by creating obj in static method
	}
	
	public static void main(String[] args) 
	{
		VariableTypes obj = new VariableTypes();
		//System.out.println(obj.x);
		//System.out.println(sal);
		obj.m1();
		
	}
	

}
