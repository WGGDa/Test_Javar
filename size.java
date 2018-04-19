import java.util.Random;

public class size {
	public static void main(String[]args) {
Random random= new Random(); // like a scanner
int [] numlist=new int[50]; //this makes the array able to hold 50 elements
for(int i=0; i<numlist.length; i++ ) {
int numGenreated=random.nextInt(62-25+1)+25;// this sets it equal to a variable
numlist [i]=numGenreated;
System.out.println(numlist[i]);
}
}
}
