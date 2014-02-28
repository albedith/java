import java.util.Scanner;

public class Trial {

	public static void main(String[] args) {
	 Scanner input = new Scanner (System.in);
	
	 System.out.println("Enter a sentece of 3 words");
	 String sentence1 = input.next();
	 String sentence2 = input.next();
	 String sentence3 = input.next();
	 System.out.println("This is the sentence that you entered: " + sentence1 + " " + sentence2 + " " + sentence3);

	}

}
