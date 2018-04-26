import java.util.Scanner;
public class EVEN {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter five numbers");
	double [] index= new double[5];
	index[0] = scan.nextInt();
	index[1] = scan.nextInt();
	index[2] = scan.nextInt();
	index[3] = scan.nextInt();
	index[4] = scan.nextInt();

	for(int i=2; i<5; i=i+2) {
		System.out.println(index[i]);
	}
}
}
