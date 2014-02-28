
public class ProblemTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfCoupons_1 = 36;
		int candyBars = numberOfCoupons_1/10;
		int numberOfCoupons_2 = numberOfCoupons_1%10;
		int gumballs = numberOfCoupons_2/3;
		
		System.out.println("I won a total of " + numberOfCoupons_1 + " coupons.");
		System.out.println("With the total number of coupons I was able to buy " + candyBars + " candy bars.");
		System.out.println("With the remaining number of coupons, I was able to buy " + gumballs + " gumballs.");
	}

}
