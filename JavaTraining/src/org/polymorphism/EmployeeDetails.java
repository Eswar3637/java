package org.polymorphism;
//OverLoading
public class EmployeeDetails 
{
	public void empName(String empname)
	{
		System.out.println("Employee Name :"+empname);
	}
	public void empId(int empid)
	{
		System.out.println("Employee ID :"+empid);
	}
	public void empPhn(long empphn)
	{
		System.out.println("Employee Phone :"+empphn);
	}
	public static void main(String[] args) 

	{
		EmployeeDetails e = new EmployeeDetails();
		e.empId(111);
		e.empName("Eswar");
		e.empPhn(8526682216l);
		
	}

}
