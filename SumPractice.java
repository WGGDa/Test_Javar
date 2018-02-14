package new3;

public class SumPractice {

	public static void main(String[]args) {
		int a = 82;
		int b= 64;
		int c = compareSumPractice(a,b);
		
		System.out.println(c);
		
		int x = 232;
		int y= 684;
		int z= compareSumPractice(x,y);
		
		System.out.println(z);
		
		int d = 18;
		int e = 31;
		int f = compareSumPractice(d,e);
		
		System.out.println(f);
	}
	
	public static int compareSumPractice(int a, int b){
		
		
		if ( b < a){
		return b;
		}else {
			return a;
		}
	
		
	}
}
	
		
	
	

