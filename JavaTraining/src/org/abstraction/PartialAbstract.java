package org.abstraction;

public class PartialAbstract extends Abstract
{
	@Override
	public void Breakfast() 
	{
       System.out.println("BreakFast");
	}
	public static void main(String[] args)
	{
		PartialAbstract i = new PartialAbstract();
       i.Breakfast();
       i.panCard();
       i.voterId();
	

			
	}

}
