package interfaceusage;

public interface Rbi 
{
	void withdrawl(); //Abstract Method
	void deposit();
	public static void main(String[] args) 
	{
		Rbi i;
		i=new Icici();
		i.deposit();
		i.withdrawl();
		i=new Hdfc();
		i.withdrawl(); 
		i.deposit();
		
	} 

}
