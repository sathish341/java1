package ooppsconcepts;

public class Overloading 
{
	public void m1(int i)
	{
		System.out.println(i);
	}
	public void m1(float i) {
		System.out.println(i);
	}
	public void m1(String i) {
		System.out.println(i);
	}
	public void m1(Integer i) {
		System.out.println(i);
	}
	public void m1(Number i) {
		System.out.println(i);
	}
	public void m1(Object i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.m1(100);
		obj.m1(24.5f);
		obj.m1(200);
		obj.m1(1007);
		obj.m1("sathish");
		obj.m1("sathi123");
		
	}

}
