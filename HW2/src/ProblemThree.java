
import java.util.Scanner;
public class ProblemThree {

	/**
	 * Write a program that reads in a line of text and then outputs that line of text
	 * with the first occurrence of "hate" changed to "love".
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a sentence that has the word hate.");
	String sentence = input.nextLine();
	
	int indexHate = sentence.indexOf("hate", 0);
	System.out.println(sentence.substring(0, indexHate)+"love"+sentence.substring(indexHate+4,sentence.length()));

	}

}
