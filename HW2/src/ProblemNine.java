
import java.util.Scanner;
public class ProblemNine {

	/**
	 * Write a program that reads in two integers typed on the keyboard and outputs
	 * their sum, difference, and product.
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter two numbers");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	
	System.out.println("The two numbers that you entered were: "+number1+" and "+number2);
	System.out.println("There sum is = " +(number1+number2));
	System.out.println("There difference is = " +(number1-number2));
	System.out.println("There product is = " +(number1*number2));

	}

}
