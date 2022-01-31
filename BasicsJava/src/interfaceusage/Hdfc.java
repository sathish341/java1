package interfaceusage;

public class Hdfc implements Rbi
{
	

	public static void main(String[] args)
	{
		Hdfc h = new Hdfc();
		h.withdrawl();
		h.deposit();
		
				
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("i am overriden withdrawl in HDFC");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overriden deposit in HDFC");
		
	}

}
