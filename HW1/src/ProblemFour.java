
public class ProblemFour {

	/**
	 * @param args
	 */
	public static final int MAX_ARTIFICIAL_SWEETENER = 735;
	public static final double MOUSE_WEIGHT = 0.044;
	public static final int DIETER_START_WEIGHT = 170;
	public static final int DIETER_DESIRED_WEIGHT = 130;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dietSoda = (0.1)*(0.01*MAX_ARTIFICIAL_SWEETENER);
		double maxDietSoda = MAX_ARTIFICIAL_SWEETENER/dietSoda;
		
		System.out.println("Each can of diet soda pop contains " + dietSoda + " grams of sweetener.");
		System.out.println("The maximum amount of sodas that you can drink is " + maxDietSoda);
	}

}
