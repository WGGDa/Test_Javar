import java.util.Scanner;
public class LS {
	public static void main (String[]args){
		Scanner scan=new Scanner(System.in);
int []nums = {55,7,8,9,45,2};
int largest = nums[0];
for(int i=0; i<nums.length; i++) {
	if (nums[i]>largest) {
		largest = nums[i];
		System.out.println(largest);
	}
}

}
}
