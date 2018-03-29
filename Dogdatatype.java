package new5;
import java.util.Scanner;
public class Dogdatatype {
public static void main(String[]args) {
	
	
	
	

	Dog[] Dog = new Dog[3];
	for(int i=0; i<Dog.length; i++) {
		System.out.println("Enter a dog name and breed here");
		System.out.println("Enter a dog name and breed here");
		System.out.println("Enter a dog name and breed here");
	Scanner Doglist = new Scanner(System.in); 
	String DogName= Doglist.nextLine();
	String DogBreed=Doglist.nextLine();
	
	Dog[i]=new Dog(DogName, DogBreed);
	

	}
	System.out.println(Dog[1].Name);
	System.out.println(Dog[1].Breed);
}
}
