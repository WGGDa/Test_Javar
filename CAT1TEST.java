import java.util.Scanner;
public class CAT1TEST {
public static void main(String[]args) {
	
	System.out.println("Please enter a name and breed");
	Scanner scan = new Scanner(System.in);
	CAT [] list = new CAT[3];
	
	CAT a= new CAT(scan.nextLine(),scan.nextLine());
	
	list [2] = a;
	System.out.println(list [2].name);
	System.out.println(list [2].breed);

CAT b= new CAT(scan.nextLine(),scan.nextLine());
	
	list [0] = b;
	System.out.println(list [0].name);
	System.out.println(list [0].breed);
	
CAT c= new CAT(scan.nextLine(),scan.nextLine());
	
	list [1] = c;
	System.out.println(list [1].name);
	System.out.println(list [1].breed);
}
}
