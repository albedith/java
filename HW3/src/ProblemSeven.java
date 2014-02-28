import java.util.Scanner;
public class ProblemSeven {

	/**
	 * The value of e^x can be approximated by the sum: 1 + x + x^2/2! + x^3/3! + ... + x^n/n!
	 * Write a program that takes a value x as input and outputs this sum for n taken to be each of the values 1 to 10, 50
	 * and 100. Your program should repeat the calculation for new values of x until the user says she or he is through.
	 * The expression n! is called the factorial of n and is defined as n! = 1 + 2 + 3 + ... + n
	 * Use variables of type double to store the factorials (or arrange your calculation to avoid any direct calculation
	 * of factorials); otherwise, you are likely to produce integer overflow, that is, integers larger than Java allows.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double x_input = 0, numerador = 0, denominador = 0, answer = 0, factorial = 0;
		String reCalculate = "yes";
		
		System.out.println("Enter your value for x");
		x_input = input.nextDouble();
		
		while (reCalculate.equalsIgnoreCase("yes")){
			for(int n = 0; n < 101; n++){
				if ( n == 0){
					numerador = 1;
					denominador = 1;
				}else if (n == 1){
					numerador = x_input;
					denominador = 1;
				}else{
					numerador = numerador * x_input;
					denominador = denominador + n;
				}
				
				factorial = (numerador/denominador);
				answer = answer + factorial;
				
				if ((n == 1) || (n ==10) || (n==50) || (n==100))
					System.out.printf("For n = %d the sum is equal to %-5.2e\n",n ,answer);
			}
			
			System.out.println("Do you want to re-calculate the sum for a different x value? (Enter yes or no)");
			reCalculate = input.next();
			
			if (reCalculate.equalsIgnoreCase("yes")){
				System.out.println("Enter your value for x");
				x_input = input.nextDouble();
			}
		}
	}

}
