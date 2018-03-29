import java.util.Scanner;

public class Moviedatatype {
public static void main(String[]args){
	Movie[] Movie= new Movie[5];
	Movie[0] = new Movie("Jum", "R", "7");
	Movie[1] = new Movie("star", "pg", "3");
	Movie[2] = new Movie("can", "pg", "9");
	Movie[3] = new Movie("jak", "R", "5");
	Movie[4] = new Movie("jar", "pg", "8");
	System.out.println("Please enter the name of a movie");
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
	for(int i=0; i<Movie.length; i++) {
		
		
		if(input.equals(Movie[i].Name)) {
			System.out.println(Movie[i].Genre);
			System.out.println(Movie[i].Rating);

		}else {
			System.out.println("not found");
		}
	}
}
}
