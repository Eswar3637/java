package org.constructor;
// Constructor Chaining:
public class ConstructorChaining
{
	public ConstructorChaining()
 {      //Constructor Chaining
		this(44345);
	 System.out.println("Employee Name: Eswar");
 }
	public ConstructorChaining(int i)
	 {
		this(68648l);
		 System.out.println("Employee Id: "+i);
	 }
	public ConstructorChaining(long phn)
	 {
		 System.out.println("Employee Mobile: "+phn);
	 }
	public static void main(String[] args)
	{
      ConstructorChaining e=new ConstructorChaining();
      
     
	}

}
