package org.constructor;
//Constructor
public class Employee
{
	public Employee()
 {
	 System.out.println("Employee Name: Eswar");
 }
	public Employee(int i)
	 {
		 System.out.println("Employee Id: "+i);
	 }
	public Employee(long phn)
	 {
		 System.out.println("Employee Mobile: "+phn);
	 }
	public static void main(String[] args)
	{
      Employee e=new Employee();
      Employee e1=new Employee(1456);
      Employee e2=new Employee(852668648l);
     
	}

}
