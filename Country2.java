package new5;

public class Country2 {
	String country;
	String area;
	int population;
	
	
	public Country2(String country2, String area2, int popultation2) {
		country=country2;
		area=area2;
		population=popultation2;
	}
	public static int ComparePopulation(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
}
