package finalSetGet;

public class Emp1
{
	private int eNo;
	private String eName;
	private float eSal;
	
	
	

	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	

	public float geteSal() {
		return eSal;
	}
	public void seteSal(float eSal) {
		this.eSal = eSal;
	}




	public static void main(String[] args)
	{
		Emp1 e = new Emp1();
		System.out.println(e.eNo);
		System.out.println(e.eName);
		System.out.println(e.eSal);

	}

}
