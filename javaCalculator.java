import java.util. Scanner;
public class javaCalculator 
{

    public static void main(String[] args){
        int numa;
        int numb;
        String calc;


        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        numa = input.nextInt();

        System.out.println("please enter the second number");
        numb = input.nextInt();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter operation");
        calc = scan.nextLine();

        if (calc.equals ("+"));
        
        {
            System.out.println("your answer is" + (numa + numb));
        }
        if  (calc.equals ("-"));
        {
            System.out.println("your answer is" + (numa - numb));
        }

        if (calc.equals ("/"));
        {
            System.out.println("your answer is" + (numa / numb));
        }
        if (calc.equals ("*"))
        {
            System.out.println("your answer is" + (numa * numb));
        }
    }
}



