package org.constructor;
//Constructor Chaining with Super:

public class SbiBank extends RbiBank
{
	SbiBank()
	{
		this(5);
		System.out.println("Bank Name: Sbi Bank");
	}
	SbiBank(int i)
	{   this("Saving");
		System.out.println("Interest "+i+"%");
	}
	SbiBank(String acc)
	{
		super();
		System.out.println("Account Type: "+acc);
	}
	public static void main(String[] args) 
	{
		SbiBank s=new SbiBank();
	
	}

}
