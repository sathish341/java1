package finalSetGet;

public class Empdupe1 extends Emp1
{

	public static void main(String[] args) 
	{
		Empdupe1 edd = new Empdupe1();
		edd.seteNo(1744);
		System.out.println(edd.geteNo());
		edd.seteName("Ravi");
		System.out.println(edd.geteName());
		edd.seteSal(1234.5f);
		System.out.println(edd.geteSal());

	}

}
