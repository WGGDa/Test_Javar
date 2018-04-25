import java.util.Scanner;
public class class4 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Please enter five numbers");
	int [] numlist = new int[5];
	numlist[0]= scan.nextInt();
	numlist[1]= scan.nextInt();
	numlist[2]= scan.nextInt();
	numlist[3]= scan.nextInt();
	numlist[4]= scan.nextInt();
	
	for(int i=0; i<numlist.length; i++) {
	if(numlist[i]%4==0 && numlist[i]%5==0 && numlist[i]>10) {
	System.out.println(numlist[i]);
	}
	
}
}
}