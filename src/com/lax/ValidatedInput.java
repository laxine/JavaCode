package com.lax;

/**
 *@author laxine
 */
public class ValidatedInput  {
	
	 public static void main (String srgs[]) {
		 System.out.println("runnign java 9");
		 PrintValueClass.PrintValue(10);
		 PrintValueClass PrintValueClassobject=new PrintValueClass();
		 PrintValueClassobject.PrintValue2(2);
		 System.out.println(PrintValueClassobject.hashCode());

	 }
}

 class PrintValueClass{
	 PrintValueClass(){
		 System.out.println("inside construct");

	 }
	 public static void PrintValue (int x) {
		 System.out.println("value is:" +x);
	 }
	 public  void PrintValue2 (int x) {
		 System.out.println("value is:" +x);
	 }

}

 /*
  * @param PrintValueClass
  * public, default,protected  and static are access modifiers (static means you can call a method without creating a object
  */