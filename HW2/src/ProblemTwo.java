
import java.util.Scanner;
public class ProblemTwo {

	/**
	 * Write a program that enters two string variables, first and last, which the user
	 * should enter with their name. First, convert both strings to all lowercase.
	 * Your program should then create a new string that contains the full name in pig 
	 * latin with the first letter to the end of the word and adding "ay". Output the 
	 * pig latin name to the screen. Use the substring and toUpperCase methods to 
	 * construct the new name.
	 * 
	 *  For example if the user inputs "Walt" and "Savitch" the new string should be 
	 *  "Altway Avitchsay".
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your FirstName");
	String first = input.next();
	System.out.println("Enter your LastName");
	String last = input.next();
	System.out.println("Your FullName is: "+first+" "+last);
	
	String newFirst = first.toLowerCase();
	String newLast = last.toLowerCase();
	
	String firstFirstLetter = first.substring(1,2);
	String lastFirstLetter = last.substring(1,2);
	
	System.out.print("Your name in pig latin is: " + firstFirstLetter.toUpperCase()+newFirst.substring(2)+newFirst.substring(0, 1)+"ay");
	System.out.print(" " + lastFirstLetter.toUpperCase()+newLast.substring(2)+newLast.substring(0, 1)+"ay"  );
	}

}
