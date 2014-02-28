
public class ProblemOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int personWeight = 150;
		int minutes = 0;
		double kilogram = 2.2;
		int runningMets = 10, basketballMets = 8, sleepingMets = 1;
		
		minutes = 30;
		double caloriesBurnedRunning = 0.0175 * (runningMets * minutes) * (personWeight * kilogram);
		double caloriesBurnedBasketball = 0.0175 * (basketballMets * minutes) * (personWeight * kilogram);
		
		minutes = 60*6;
		double caloriesBurnedSleeping = 0.0175 * (sleepingMets * minutes) * (personWeight * kilogram);
		System.out.println("Person X weights " + personWeight + " pounds.");
		
		System.out.println("Person X burned " + (int)caloriesBurnedRunning + " calories after running 6 MPH for 30 minutes.");
		System.out.println("Person X burned " + (int)caloriesBurnedBasketball + " calories after playing basketball for 30 minutes.");
		System.out.println("Person X burned " + (int)caloriesBurnedSleeping + " calories after sleeping for 6 hours.");
	//TODO print the calories with only two numbers after the decimal point.
	}

}
