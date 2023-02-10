package org.encapsulation;

public class Utilization extends Banking{

	public static void main(String[] args) 
	{
		Utilization u=new Utilization();
		u.setUserid(43534);
		u.setUsername("Eswar.S");
		u.setPassword("Eswarguru1@");
		u.setPhn(7484628445l);
		
		System.out.println("User ID: "+u.getUserid());
		System.out.println("User Name: "+u.getUsername());
		System.out.println("User Password: "+u.getPassword());
		System.out.println("User Phone: "+u.getPhn());

		
		
		
	}

}
