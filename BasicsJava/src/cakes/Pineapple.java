package cakes;

public class Pineapple extends Cake
{
	

	public Pineapple() 
	{
		setName("Pine Apple");
		setType("Eggless");
		setPrice(750);
		
	}

	@Override
	public void recipe() 
	{
		System.out.println("-----PineApple Recipe--");
		System.out.println(" Take some fresh PineApples");
		System.out.println("------");
	}
	
	@Override
	public void myfans() 
	{
		System.out.println("pineapple lovers love me");
		

	}

}
