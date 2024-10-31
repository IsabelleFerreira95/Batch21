package ConditionalStatements;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input=new Scanner(System.in);

        //prompt user to enter their full name
        System.out.println("Please enter your full name");
        //read user input
        String fullName=input.nextLine();
        //print captured value
        System.out.println("Your name is "+fullName);

        System.out.println("Please enter your age");

        int age=input.nextInt();
        System.out.println("Your age is "+age);
        System.out.println("Your full name is "+fullName+" and your age is "+age+" years old");

        System.out.println("Which school you are currently studying?");
        String school=input.next();

        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);
        System.out.println("You are studying at "+school+" and your grade is "+grade);

        System.out.println("Are you enjoying classes at "+school+"?");
        boolean enjoying=input.nextBoolean();

        System.out.println(enjoying+", I am enjoying to study at "+school+"!");

        input.close();
    }
}
