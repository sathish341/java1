package interfaceusage;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i= new Icici();
		i.withdrawl();
		i.deposit();
	}

	@Override
	public void withdrawl() {
		System.out.println("i am overriden withdarwl in ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overriden deposit in ICICI");
		
	}

}
