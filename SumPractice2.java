package new3;

public class SumPractice2 {
	public static void main(String[]args) {
		int a, b, c, average;
		a = 72;
		b = 6;
		c = 91 ;
		System.out.println(" Average : "+averageSumPractice2(a,b,c));
		
		int d,e,f, average2;
		d = 200;
		e = 1;
		f = 117 ;
		System.out.println(" Average : "+averageSumPractice2(d,e,f));
		
	}


	
	
	public static double averageSumPractice2(int a, int b, int c){
		
		double average = ( a + b + c ) / 3;

		return average;
		

	
	
	}
}
