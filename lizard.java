import java.util.Scanner;
public class lizard {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word");
		String text= scan.nextLine();
		System.out.println(Secondtolast(text));
	}
		public static String Secondtolast(String word){
			char first = word.charAt(0);
			int index= word.length()-2;
			char AlmostLast= word.charAt(index);
			String firstandlast=first+""+AlmostLast;
			return firstandlast;
	}
}
