package ooppsconcepts;

public class EmployeeChild extends Employee1
{
	String address;
	
	 
	

	public EmployeeChild(String address) 
	{
		super(1745,"sai",23.45f);
		
		this.address=address;
		System.out.println(this.address);
		
	}




	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("Hyderabad");

	}

}
