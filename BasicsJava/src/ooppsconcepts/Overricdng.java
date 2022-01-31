package ooppsconcepts;

class Parent
{
	private void workhard()
	{
		System.out.println("Parent: work hard");
	}
	public void care()
	{
		System.out.println("parent:care");
	}
}
public class Overricdng extends Parent
{
	public void love() {
		System.out.println("child:love");
	}
	void workhard() {
		System.out.println("child: work hard");
	}
	
	
	
	
	public static void main(String[] args) {
		Overricdng obj =new Overricdng();
		obj.love();
		obj.workhard();
		obj.care();
	}
	
}

	

	


