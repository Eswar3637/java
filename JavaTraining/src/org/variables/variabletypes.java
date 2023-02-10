//package variables;
////local variable
//public class variabletypes
//{
//	
//	public static void main(String[] args) 
//	{
//		String name="Eswar";
//		System.out.println("Local Variable:");
//        System.out.println(name);
//	
//	}
//}
//*****************************************************
//package variables;
////Static Variable
//public class variabletypes
//{
//	
// static String name="Eswar";
//	public static void main(String[] args) 
//	{
//		System.out.println("Static Variable:");
//        System.out.println(name);
//	}
//
//}
//*****************************************************
package org.variables;
//Instance variable
public class variabletypes
{
	
 String name="Eswar";
	public static void main(String[] args) 
	{
		variabletypes var=new variabletypes();
		System.out.println("Instance Variable:");
        System.out.println(var.name);
	}

}