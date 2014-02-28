
import java.util.Scanner;
public class ProblemEight {

	/**
	 * Write a program that reads in a line of text and then outputs that line of text 
	 * first in all uppercase and then in all lowercase letters.
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Write your sentence");
	String keyboard = input.nextLine();
	
	System.out.println("This is the sentence that you wrote: "+keyboard);
	System.out.println("This is the sentence with all letters in uppercase: "+keyboard.toUpperCase());
	System.out.println("This is the sentence with all letters in lowercase: "+keyboard.toLowerCase());
	}

}
