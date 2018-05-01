import java.util.Scanner;

public class LIB2 {
	public static void main(String[]args) {
		 
		LIB lib1 = new LIB("NY", "15", "45", "$21.00");
			
		System.out.println(lib1.location);
		System.out.println(lib1.totalBook);
		System.out.println(lib1.totalStaff);
		System.out.println(lib1.expense);

		LIB lib2 = new LIB("KY", "10", "85", "$21.00");
		
		System.out.println(lib2.location);
		System.out.println(lib2.totalBook);
		System.out.println(lib2.totalStaff);
		System.out.println(lib2.expense);
		
		
		LIB lib3 = new LIB("NC", "15", "35", "$21.00");
		
		System.out.println(lib3.location);
		System.out.println(lib3.totalBook);
		System.out.println(lib3.totalStaff);
		System.out.println(lib3.expense);
		
		
		LIB lib4 = new LIB("SC", "5", "40", "$21.00");
		
		System.out.println(lib4.location);
		System.out.println(lib4.totalBook);
		System.out.println(lib4.totalStaff);
		System.out.println(lib4.expense);
	

}
}