package org.abstraction;

public class BankInfo implements sbiBank,hdfcBank
   {

 @Override
	public void fixed()
	{
		System.out.println("Fixed Interest: 9%");
	}
 @Override
	public void savings() 
	{
		System.out.println("Savings Interest: 7%");

	}
 @Override
	public void deposit() 
	{
		System.out.println("Deposit Interest: 8%");

	}
	public static void main(String[] args) 
	{
       BankInfo b = new BankInfo();
       b.deposit();
       b.fixed();
       b.savings();
       
	}

}
