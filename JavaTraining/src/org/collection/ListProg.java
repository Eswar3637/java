package org.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.print.attribute.HashAttributeSet;

public class ListProg {

	public static void main(String[] args) {
		
		ArrayList li1=new ArrayList();
		li1.add("Eswar");
		li1.add("Saleem");
		li1.add("Murugan");
		li1.add("Pooja");
		li1.add("Janani");
		
		ArrayList <Integer> li2 =new ArrayList<Integer>();
		li2.add(10);
		li2.add(20);
		li2.add(54);
		li2.add(56);
		li2.add(12);
		
		System.out.println(li1);
		System.out.println(li2);
		System.out.println(li1.get(4));
		System.out.println(li1.remove(2));
		System.out.println(li1);
		li1.set(1, "Amala");
		System.out.println(li1);
		boolean a=li1.contains("Amala");
		System.out.println(a);
		System.out.println(li1.indexOf("Amala"));
		li2.addAll(li1)	;
		System.out.println(li2);
		//*********************************
		LinkedList<String> li3=new LinkedList<String>();
		li3.add("Siva");
		li3.add("Anand");
		li3.add("Priya");
		System.out.println(li3);
		li3.indexOf("Priya");
		int i= li3.indexOf("Priya");
		System.out.println(i);
		int x =li2.indexOf("Eswar");
		for (int j = 0; j <=x; j++)
		{
			System.out.println(li2.get(j));
		}
		for (Object y:li2)
		{
			System.out.println(y);
		}

		
		
		
		
		
		
		
		

		
		

	}

}
