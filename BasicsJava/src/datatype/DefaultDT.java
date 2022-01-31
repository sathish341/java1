package datatype;

public class DefaultDT 
{
	byte b ;//1 byte
	short s ;//2bytes
	int i ;//4bytes
	long l ;//8bytes
	
	float f ;//4bytes
	double d;//8bytes
	
	char ch ;
	boolean bb;
	
	String str ;
	

	
	public static void main(String[] args) 
	{
		DefaultDT obj =new DefaultDT();
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.ch);
		System.out.println(obj.bb);
		System.out.println(obj.str);

	}


}
