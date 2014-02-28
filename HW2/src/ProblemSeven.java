
import java.util.Scanner;
public class ProblemSeven {

	/**
	 * Write a program that determines the change to be dispensed from a vending machine.
	 * An item in the machine can cost between 25 cents and a dollar, in 5-cent increments
	 * and the machine accepts only a single dollar bill to pay for the item.
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter how many cents the item cost. Enter the cents as an interger");
	int price = input.nextInt();
	int quaters = (100-price)/25;
	int dimes = ((100-price)%25)/10;
	int nickels = ((100-price)%10)/5;
	
	
	System.out.printf("You bought an item for %d cents and gave me a dollar \n",price);
	System.out.printf("So your change is \n %d quaters \n %d dimes \n %d nickels", quaters, dimes, nickels);

	}

}
