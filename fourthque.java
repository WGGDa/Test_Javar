import java.util.Scanner;

public class fourthque {
	public static void main(String[]args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 5 numbers");
	int[] numlist= new int[5];
	
	numlist[0]= scan.nextInt();
	numlist[1]= scan.nextInt();
	numlist[2]= scan.nextInt();
	numlist[3]= scan.nextInt();
	numlist[4]= scan.nextInt();
	

	for (int i=0; i>10; i++) {
		if (i%2==0 && i%3==0) 
			System.out.print(i);			
	}
}
}