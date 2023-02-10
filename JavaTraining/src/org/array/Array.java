package org.array;

public class Array
{

	public static void main(String[] args)
	{
		String a[]=new String[7];
		a[0]="Eswar"; 
//		a[3]=20; 
//		a[5]=25; 
//		a[1]=15; 
		int length = a.length;
		System.out.println(length);
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
//		//Multi-dimensioan Array
//		String a[][]=new String[2][2];
//		a[0][0]="Eswar"; 
//		a[0][1]="Saleem"; 
//		a[1][0]="Murugan"; 
//		a[1][1]="Amala"; 
////	  for(int i=0;i<a.length;i++)
////		{
////		  for(int j=0;j<a.length;j++)
////		{
////			System.out.println(a[i][j]);
////		}
////	}
//	//  Enhanced loop
//	  for(String[] i:a)
//	  {
//		  for(String j:i)
//		  {
//			  System.out.println(j);
//		  }
//	  }
	  
	}
}
