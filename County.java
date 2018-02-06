package new3;

import java.util.Scanner;

public class County {
	String CountyName ;
	String CountyPopulation ;
	String CountyYearEstablished ;
	String CountyLandVolume ;
	
	
	
	
	public County(String CountyName2, String CountyPopulation2, String CountyYearEstablished2, String CountyLandVolume2) {
		 CountyName = CountyName2;
		 CountyPopulation = CountyPopulation2;
		 CountyYearEstablished = CountyYearEstablished2;
		 CountyLandVolume = CountyLandVolume2;
		
	
}
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int CountyName, CountyPopulation, CountyYearEstablished, CountyLandVolume;
		
		County a = new County("Erie", "10000", "1950", "195");
		
		System.out.println(a.CountyName);
		System.out.println(a.CountyPopulation);
		System.out.println(a.CountyYearEstablished);
		System.out.println(a.CountyLandVolume);


	}

	
	
	
}