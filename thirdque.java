	import java.util.Scanner;

public class thirdque {
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter five names");
			String[] namelist= new String[5];
			namelist[0]= scan.next();
			namelist[1]= scan.next();
			namelist[2]= scan.next();
			namelist[3]= scan.next();
			namelist[4]= scan.next();
			
			System.out.println(namelist[0]);
			System.out.println(namelist[1]);
			System.out.println(namelist[2]);
			System.out.println(namelist[3]);
			System.out.println(namelist[4]);

		}

	}

