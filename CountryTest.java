package new5;
import java.util.Scanner;
public class CountryTest {
	public static void main(String[]args) {
		String country;
		String area;
		int population;
	Country2 a= new Country2("Jamaica","North",780);
	Country2 b= new Country2("Japan","South",420);
	
	
	System.out.println(a.country);
	System.out.println(a.area);
	System.out.println(a.population);
	
	System.out.println(b.country);
	System.out.println(b.area);
	System.out.println(b.population);

	System.out.println(a.ComparePopulation(a.population,b.population));



}
}