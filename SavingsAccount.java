package new3;
import java.util.Scanner;
public class SavingsAccount {
	String UserName;
	int Pin;
	int Balance;
	
	public SavingsAccount(String UserName2,int Pin2, int Balance2) {
		
		UserName=UserName2;
		Pin=Pin2;
		Balance=Balance2;
	}

	public int Withdraw(int amount) {
		int Withdraw=(Balance-amount);
		return Withdraw;
	}
	public int Deposit(int amount) {
		int Deposit=(Balance+amount);
		return Deposit;
	}
}
