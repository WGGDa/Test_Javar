import java.util.Scanner;
public class arrayi {
	public static void main(String[]args) {
		double [] index =  {1,2,3,4,5,6,7,8,9,10};
		Scanner scan = new Scanner(System.in);
		for(int i =2; i<index.length; i=i+2) {
			System.out.println(index[i]);
		}
	}
}
