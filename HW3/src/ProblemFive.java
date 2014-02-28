
public class ProblemFive {

	/**
	 *  You have just purchased a stereo system that cost $1,000 on the following credit plan: no down payment, an interest
	 * rate of 18% per year (and hence 1.5% per month), and monthly payments of $50. The monthly payment of $50 is used to
	 * pay the interest, and whatever is left is used to pay part of the remaining debt.
	 * Hence the first month you pay 1.5% of 1,000 in interest. That is $15 in interest. So the remaining $35 is deducted
	 * from your debt, which leaves you with a debt of $965.00. The next month, you pay interest of %1.5 of $965.00, which
	 * is $14.48. Hence, you can deduct $35.52 (which is $50 - $14.48) from the amount you owe.
	 * Write a program that tells you how many months it will take you to pay of the loan, as well as the total amount
	 * of interest paid over the life of the loan. Use a loop to calculate the amount of interest and the size of the debt
	 * after each month. (Your final program need not output the monthly amount of interest paid and remaining debt,
	 * but you may want to write a preliminary version of the program that does output these values.) Use a variable to
	 * count the number of loop iterations and hence the number of months until the debt is zero. You may want to use
	 * other variables, as well. The last payment may be less than $50 if the debt is small, but do not forget the 
	 * interest. If you owe $50, your monthly payment of $50 will not pay off your debt, although it will come close. One
	 * month's interest of $50 is only 75 cents. 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stereo_cost = 1000, payment = 50, n_months = 0;
		double interest = 1.5/100, balance = 0, interest_payment = 0, principal_payment = 0, moneyOnInterest = 0;
		
		balance = stereo_cost;
		
		while(balance > 0){
			interest_payment = interest * balance;
			principal_payment = payment - interest_payment;
			moneyOnInterest = moneyOnInterest + interest_payment;
			balance = balance - principal_payment;
			n_months = n_months + 1;
		}			
		System.out.printf("It will take you %d months to pay your loan", n_months);
		System.out.printf("\nYou will spend %.2f dollars on interest.", moneyOnInterest);
		System.out.printf("\nAt the end of your loan you will pay %.2f for your stereo.",(stereo_cost+moneyOnInterest));
				
	}

}
