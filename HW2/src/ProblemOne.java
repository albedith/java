import java.util.Scanner;

public class ProblemOne {
	/**
	 * The Babylonian algorithm to compute the square root of a number n is as follows:
	 * 1. Make a guess at the answer (you can pick n/2 as your initial guess).
	 * 2. Compute r = n/guess
	 * 3. Set guess = (guess + r) /2
	 * 4. Go back to step 2 for as many iterations as necessary. The more you repeat step
	 * 2 and 3, the closer guess will become to the square root of n.
	 * 
	 * Write a program that inputs an integer for n, iterates through the Babylonian 
	 * algorithm five times, and outputs the answer as a double to two decimal places.
	 * Your answer will be most accurate for small values of n.
	 */
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter your number n");
	 int n = input.nextInt();
	 System.out.println("The number n is " + n);
	 
	 int guess = 100, r;
	
	 r = n/guess;
	 guess = (guess+r)/2;
	 
	/** r = n/guess;
	 guess = (guess+r)/2;
	 
	 r = n/guess;
	 guess = (guess+r)/2;
	 
	 r = n/guess;
	 guess = (guess+r)/2;
	 
	 r = n/guess;
	 guess = (guess+r)/2;*/
	 
	 System.out.printf("%.2f",guess);
	 System.out.println(r);

	}

}
