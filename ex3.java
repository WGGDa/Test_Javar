import java.util.Random;
import java.util.Scanner;

public class ex3 {
	public static void main(String[]args) {
		Random ran= new Random(); //this is a scanner
		Scanner scan= new Scanner(System.in);
		int score=0;
		boolean isGameRunning=true;
		while(isGameRunning==true) {
	System.out.println("Do you want to roll? 1=yes 2=no");
	if (ran.nextInt()==1) {
		int numGenerated=ran.nextInt(6-1+1)+1;
	if (numGenerated!=1){ //this means: if numGenerated does not equal 1
		score=score+numGenerated;
		System.out.println("New score is" +score);		

	
	}else {System.out.println("You lose");
		isGameRunning=false;

	}
}else {
	System.out.println(score);
	isGameRunning=false;

}
}
}
}
