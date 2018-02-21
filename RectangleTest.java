package new3;
import java.util.Scanner;
public class RectangleTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter width and then length");
		
		int input1 = scan.nextInt();

		int input2 = scan.nextInt();
		
		
			Rectangle r1 = new Rectangle(input1,input2);
			
		System.out.println(r1.getarea() + "\n"+r1.getparamiter());
	}
}
