package org.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProg {

	public static void main(String[] args) 
	{
		Set s1=new LinkedHashSet<>();
		s1.add(10);
		s1.add("Eswar");
		s1.add(30);
		s1.add("Guru");
		s1.add(15);
		s1.add("Akash");
		s1.add(6254362348l);
		System.out.println(s1);
		for (Object object : s1) {
			System.out.println(object);
			
		}
		Set s2=new TreeSet<>();
//		s2.add(10);
		s2.add("Eswar");
//		s2.add(30);
		s2.add("Guru");
//		s2.add(15);
		s2.add("Akash");
//		s2.add(6254362348l);
		
		System.out.println(s2);

		
		

		
	}

}
