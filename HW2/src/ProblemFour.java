
import java.util.Scanner;
public class ProblemFour {

	/**
	 * An automobile is used for commuting purposes. Write a program that takes as input
	 * the distance of the commute in miles, the automobile's fuel consumption rate in
	 * miles per gallon, and the price of a gallon of gas. The program should then output
	 * the cost of the commute.
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter how many miles do you commute");
	double miles = input.nextDouble();
	System.out.println("Enter your car Fuel Consumption Rate in Miles per Gallon");
	double fuelConsumptionRate = input.nextDouble();
	System.out.println("Enter how much does 1 gallon of gas cost");
	double gallonPrice = input.nextDouble();

	System.out.println("Since you commute " +miles+ " miles");
	System.out.println("and 1 gallon of gas costs $" +gallonPrice);
	System.out.println("Your commute costs");
	System.out.printf("$%.2f",(miles/fuelConsumptionRate)* gallonPrice);
	}

}
