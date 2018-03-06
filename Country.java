package new5;
import java. util.Scanner;
public class Country {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");

		int max=0;
		int min = 0;
		 for(int i = 0; i<3; i++ ) {
				int input1 = scan.nextInt();

			 if(input1 > max) {
				max=input1;
			}
			if(input1 < min) {
				min=input1;
			}
			System.out.println("min"+min);
			System.out.println("max"+max);
		
	
		 }
	}
}
