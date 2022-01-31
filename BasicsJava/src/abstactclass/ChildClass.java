package abstactclass;

public class ChildClass extends FirstAbstract {

	@Override
	void m2() {
		System.out.println(" iam m2 overrriden in child class");

	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.m2();
		c.m1();
	}

}
