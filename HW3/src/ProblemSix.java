
import java.util.Scanner;
public class ProblemSix {

	/**
	 * The fibonacci numbers Fn are defined as follows: F(0) is 1, F(1) is 1, and F(i+2) = F(i)+F(i+1) i = 0,1,2,...
	 * In other words, each number is the sum of the previous two numbers. the first few Fibonacci numbers are 1,1,2,3,5,
	 * and 8. One place where these numbers occur is as certain populations growth rates. If a population has no deaths,
	 * then the series shows the size of the population after each time period. It takes an organism two time periods to
	 * mature to reproducing age, and then the organism reproduces once every time period. The formula applies most 
	 * straightforwardly to asexual reproduction at a rate of one offspring per time period. 
	 * In any event, the green crud population grows at this rate and has a time period of five days. Hence, if  a green 
	 * crud population starts out as 10 pounds of crud, then in five days, there is still 10 pounds of crud; in ten days,
	 * there is 20 pounds of crud, in fifteen days, 30 pounds, in twenty days, 50 pounds, and so forth. 
	 * Write a program that takes both the initial size of a green crud population (in pounds) and a number of days as 
	 * input and outputs the number of pounds of green crud after that many days. Assume that the population size is the
	 * same for four days and then increases every fifth day. Your program should allow the user to repeat this calculation
	 * as often as desired.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double currentSize = 0, finalSize = 0; 
		int numberDays = 0;
		String reCalculate = "yes";
		
		System.out.println("Enter the initial size of the green crud population (in pounds):");
		currentSize = input.nextDouble();
		System.out.println("Enter the time period (number of days)for which you want to calculate the growth:");
		numberDays = input.nextInt();
		
		while(reCalculate.equalsIgnoreCase("yes")){
			for (int n = numberDays; n > 0; n--){
			    if(n%5 != 0){
			    	finalSize = currentSize;
			    }else{
			    	finalSize = currentSize+currentSize;
			    	currentSize = finalSize; 
			    }	
			}
			
			System.out.printf("After %d days the green crud grew to %.2f pounds", numberDays,finalSize);
			System.out.println("\nDo you wnat to re-calculate the green crud for new values? (Enter yes or no)");
			reCalculate = input.next();
			
			if (reCalculate.equalsIgnoreCase("yes")){
				System.out.println("Enter the initial size of the green crud population (in pounds):");
				currentSize = input.nextDouble();
				System.out.println("Enter the time period(number of days)for which you want to calculate the growth:");
				numberDays = input.nextInt();
			}
		}
	}

}
