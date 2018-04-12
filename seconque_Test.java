import java.util.Scanner;

public class seconque_Test {
	public static void main(String[]args) {
		String names;
		double calories;
		double cost;
		secondque a= new secondque("tea", 280, 2.99);
		secondque b=new secondque("sprite", 500, 4.97);
		secondque c=new secondque("coke", 450, 3.89);
		
		System.out.println(a.names);
		System.out.println(a.calories);
		System.out.println(a.cost);
		
		System.out.println(b.names);
		System.out.println(b.calories);
		System.out.println(b.cost);
		
		System.out.println(c.names);
		System.out.println(c.calories);
		System.out.println(c.cost);
	}
}
