package org.constructor;
//Constructor Chaining with this:
public class RbiBank {
	RbiBank()
	{
		this(5);
		System.out.println("Bank Name: Rbi Bank");
	}
	RbiBank(int i)
	{   this("Saving");
		System.out.println("Interest "+i+"%");
	}
	RbiBank(String acc)
	{
		System.out.println("Account Type: "+acc);
	}

	public static void main(String[] args)
	{
		RbiBank b=new RbiBank();
		

	}

}
