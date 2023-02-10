package org.polymorphism;
//Overridding
public class SbiBank extends RbiBank
{
@Override
public void savings() {
	System.out.println("Sbi Bank Saving Interest is 7%");
	super.savings();
}

	public static void main(String[] args) 
	{
//      SbiBank s=new SbiBank();
//      s.fixed();
//      s.savings();
      String s=("Java");
      char a= s.charAt(1);
      System.out.println(a);
	}

}
