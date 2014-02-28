import java.util.Scanner;
public class ProblemFour {

	/**
	 * It is difficult to make a budget that spans several years, because prices are not stable. If your company needs
	 * 200 pencils per year, you cannot simply use this year's price as the cost of pencils two years from now. Because
	 * of inflation, the cost is likely to be higher that it is today. 
	 * Write a program to gauge the expected cost of an item in a specified number of years. The program asks for the cost
	 * of the item, the number of years from now that the item will be purchased, and the rate of inflation. The program
	 * then outputs the estimated cost of the item after the specified period. Have the user enter the inflation rate as a
	 * percentage, such as 5.6 (percent). Your program should then convert the percentage to a fraction, such as 0.056 and
	 * should use a loop to estimate the price adjusted for inflation.
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double cost = 0, inflation = 0, inflation_fraction = 0, estimated_cost = 0, cost_fraction = 0, new_cost = 0;
	int years = 0;
	
	System.out.println("Let's estimate the expected cost of the item for the specified number of years.");
	System.out.println("How much does the item cost today?");
	cost = input.nextDouble();
	System.out.println("How many years from now do you plan to purchase the item?");
	years = input.nextInt();
	System.out.println("what is the percentage rate of inflation?");
	inflation = input.nextDouble();
	
	inflation_fraction = inflation/100;
	cost_fraction = inflation_fraction * cost;
	
	for(int n =0; n < years; n++){
		estimated_cost = cost + cost_fraction;
		cost = estimated_cost;
	}
	System.out.printf("In %d years the item will cost %.2f", years, estimated_cost);

	}

}
