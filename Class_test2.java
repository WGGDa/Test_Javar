import java.util.Scanner;

import new4.Class_test;

public class Class_test2 {

	public static void main (String[]args) {
		
		 Class_test a = new  Class_test("apple", "300.00","2011","smartphone") ;
		
		System.out.println(a.Brand);
		System.out.println(a.PhN);
		System.out.println(a.Year);
		System.out.println(a.price);
		
		 Class_test b = new  Class_test("samsung", "400.00","2013","smart2");
		
	System.out.println(b.Brand);
	System.out.println(b.PhN);
	System.out.println(b.Year);
	System.out.println(b.price);
	 Class_test  c= new  Class_test("google", "600.00","2014","phone3");
		
		System.out.println(c.Brand);
		System.out.println(c.PhN);
		System.out.println(c.Year);
		System.out.println(c.price);
		
		System.out.println("Please enter which phone would you like to buy?");
		Scanner Class_test = new Scanner(System.in);
	}
	
}