
public class array3 {
	public static void main(String[]args) {
		int [] nums = {18,21,2,12,70,60,};
		int smallest = nums[0];
		int second=0 ;
		for(int i=0; i<nums.length; i++) {	
			if(nums[i]<smallest) {
				smallest = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < second && nums[i]>smallest) {
				second = nums[i];
			}
			
		}			
 System.out.println(second);}
}


