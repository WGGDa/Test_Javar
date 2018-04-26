import java.util.Scanner;
public class AVERAGE {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the first number");
	int num1 = scan.nextInt();
	
	System.out.println("Please enter the second number");
	int num2 = scan.nextInt();
	
	System.out.println("Please enter the third number");
	int num3 = scan.nextInt();
	
	System.out.println("Please enter the fourth number");
	int num4 = scan.nextInt();
	
	System.out.println("Please enter the fith number");
	int num5 = scan.nextInt();
	
	System.out.println("Please enter the sixth number");
	int num6 = scan.nextInt();
	
	System.out.println("Please enter the seventh number");
	int num7 = scan.nextInt();
	
	System.out.println("Please enter the eighth number");
	int num8 = scan.nextInt();
	
	System.out.println("The average of the numbers is"+(num1+num2+num3+num4+num5+num6+num7+num8 /8));
}
}
