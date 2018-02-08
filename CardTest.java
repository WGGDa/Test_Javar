package new3;

import java.util.Scanner;

public class CardTest {

	public static void main(String[]args) {
		Card Card1Type1= new Card("Spade",1);//1st type
		Card Card1Type2= new Card("Clover",1);//2nd type
		Card Card1Type3= new Card("Diamond",1);//3rd type
		
		
		System.out.println(Card1Type2.suit+Card1Type2.number);
		System.out.println(Card1Type3.suit+Card1Type3.number);
		System.out.println(Card1Type1.suit+Card1Type1.number);
		Card Lucky = new Card ("Diamond",2);

		System.out.println(Lucky.suit+Lucky.number);

		
		System.out.println("Please select a card suit");
		Scanner scan = new Scanner(System.in);
		
		String Cardname = scan.nextLine();
		System.out.println("Please enter your card number");
		int Card2 = scan.nextInt();
	
		if(Card2== Lucky.number && Cardname.equals(Lucky.suit)) {
			System.out.println("You win!");
		}else {
			System.out.println("You Loose");
		}
		
	}
	
	
}
