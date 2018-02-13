package new4;
import java.util.Scanner;
public class LIBRARY {

	String Library_Location;
	int Library_Total_Books;
	int Library_Staff_Total;
	double Library_Yearly_Expense;
	
	public LIBRARY(String Library_Location2,int Library_Total_Books2,int Library_Staff_Total2,double Library_Yearly_Expense2) {
		 Library_Location= Library_Location2;
		 Library_Total_Books=Library_Total_Books2 ;
		 Library_Staff_Total= Library_Staff_Total2;
		 Library_Yearly_Expense=Library_Yearly_Expense2 ;
	
	}
		public static void main(String[]args) {		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter library location, total books, total staff, and yearly expense: ");
		    LIBRARY lib1 = new LIBRARY(scan.nextLine(),scan.nextInt(), scan.nextInt(), scan.nextDouble());
		    
		    System.out.println("Please enter library location, total books, total staff, and yearly expense: ");
		    LIBRARY lib2 = new LIBRARY(scan.nextLine(),scan.nextInt(), scan.nextInt(), scan.nextDouble());
		    
		    System.out.println("Please enter library location, total books, total staff, and yearly expense: ");
		    LIBRARY lib3 = new LIBRARY(scan.nextLine(),scan.nextInt(), scan.nextInt(), scan.nextDouble());
		    
		    System.out.println("Please enter library location, total books, total staff, and yearly expense: ");
		    LIBRARY lib4 = new LIBRARY(scan.nextLine(),scan.nextInt(), scan.nextInt(), scan.nextDouble());
		    
		    System.out.println("Please enter library location, total books, total staff, and yearly expense: ");
		    LIBRARY lib5 = new LIBRARY(scan.nextLine(),scan.nextInt(), scan.nextInt(), scan.nextDouble());
		
		
		
		System.out.println(lib1.Library_Location);
		System.out.println(lib1.Library_Staff_Total);
		System.out.println(lib1.Library_Total_Books);
		System.out.println(lib1.Library_Yearly_Expense);
		
		System.out.println(lib2.Library_Location);
		System.out.println(lib2.Library_Staff_Total);
		System.out.println(lib2.Library_Total_Books);
		System.out.println(lib2.Library_Yearly_Expense);
		
		System.out.println(lib3.Library_Location);
		System.out.println(lib3.Library_Staff_Total);
		System.out.println(lib3.Library_Total_Books);
		System.out.println(lib3.Library_Yearly_Expense);
		
		System.out.println(lib4.Library_Location);
		System.out.println(lib4.Library_Staff_Total);
		System.out.println(lib4.Library_Total_Books);
		System.out.println(lib4.Library_Yearly_Expense);
		
		System.out.println(lib5.Library_Location);
		System.out.println(lib5.Library_Staff_Total);
		System.out.println(lib5.Library_Total_Books);
		System.out.println(lib5.Library_Yearly_Expense);
	}
	   
	}

