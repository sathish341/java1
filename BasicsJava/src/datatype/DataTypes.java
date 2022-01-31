package datatype;

public class DataTypes 
{
	byte b =127;//1 byte
	short s =32767;//2bytes
	int i =214334455;//4bytes
	long l =213344444;//8bytes
	
	float f =21.34f;//4bytes
	double d =2133.2;//8bytes
	
	char ch ='a';
	boolean bb=true;
	
	String str ="sathish";
	

	
	public static void main(String[] args) 
	{
		DataTypes obj =new DataTypes();
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
