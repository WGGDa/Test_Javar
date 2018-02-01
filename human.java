package new3;

public class human {

	String firstname ;
	String middleinitial;
	String lastname;
	String career;
	String age;
			
	
public human(String first, String middle, String last, String career2, String age2) {
	firstname = first;
	middleinitial = middle ;
	lastname = last;
	career = career2;
	age = age2;
}

public static void main(String[]args) {
	
 human a = new human("Winstongabriel","G", "Douglas", "Software Developer", "19");

System.out.println(a.firstname);
System.out.println(a.middleinitial);
System.out.println(a.lastname);
System.out.println(a.career);
System.out.println(a.age);
}
}