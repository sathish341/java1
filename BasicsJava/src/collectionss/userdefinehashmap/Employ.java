package collectionss.userdefinehashmap;

public class Employ 
{
	private int EmpNo;
	private String EmpName;
	
	

	public Employ(int empNo, String empName) 
	{
		super();
		EmpNo = empNo;
		EmpName = empName;
	}
	
	public void display()
	{
		System.out.println("EmpID :" + EmpNo + "  "+ "EmpNAME :" + EmpName);
		
	}
	
	
	public int getEmpNo() {
		return EmpNo;
	}

	public String getEmpName() {
		return EmpName;
	}

	public static void main(String[] args) 
	{
		Employ e = new Employ(100,"ravileela"); 
		e.display();
		

	}

}
