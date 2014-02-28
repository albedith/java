
import java.util.Scanner;
public class ProblemFive {

	/**
	 * The straight-line method for computing the yearly depreciation in value D for an
	 * item is given by the formula D = (P-S)/Y where P is the purchase price, S is the
	 * salvage value, and Y is the number of years the item is used. Write a program
	 * that takes as input the purchase price of an item, the expected number of years 
	 * of service and the expected salvage value. The program should then output the 
	 * yearly depreciation for the item.
	 * 
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Let's calculate the year depreciation of your car");
	System.out.println("Enter the purchase price of your car");
	double purchase = input.nextDouble();
	System.out.println("Enter the number of years the car has been in use");
	int year = input.nextInt();
	System.out.println("Enter the expected salvage value for the car");
	double salvage = input.nextDouble();
	
	System.out.print("The yearly depreciation value for the car is: ");
	System.out.printf("%.2f", (purchase-salvage)/year);
	}

}
