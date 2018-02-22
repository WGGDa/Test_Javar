package new3;
import java.util.Scanner;
public class SavingsAccountTest {
	SavingsAccount sa1 = new SavingsAccount( "Jay", 28216, 100132100);
	SavingsAccount sa2 = new SavingsAccount( "Alexis", 28217, 1001901000);
	SavingsAccount sa3 = new SavingsAccount( "John", 28218, 1001533213);
	
	int Jay=100132100;
	int Alexis=1001901000;
	int John=1001533213;

public static void main(String[]args) {
Scanner scan = new Scanner(System.in);

System.out.println("enter your username");
System.out.println("enter your pin");
System.out.println("enter your balance");

String input1 = scan.nextLine();

int input2 = scan.nextInt();

int input3 = scan.nextInt();

SavingsAccount currentaccount= new SavingsAccount(input1,input2,input3);



System.out.println("enter your username");
System.out.println("enter your pin");
System.out.println("enter your balance");
scan.next();
String input1b = scan.nextLine();

int input2b = scan.nextInt();

int input3b = scan.nextInt();

SavingsAccount OverDraft= new SavingsAccount(input1b,input2b,input3b);
	System.out.println(OverDraft.Deposit(500));
	System.out.println(currentaccount.Withdraw(100));
}
}
