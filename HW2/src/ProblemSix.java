import java.util.Scanner;
public class ProblemSix {

	/**
	 * A government research lab has concluded that an artificial sweetener commonly used
	 * in diet soda pop causes death in laboratory mice. A friend of yours is desperate
	 * to lose weight but cannot give up the soda pop. Your friend wants to know how much
	 * diet soda pop it is possible to drink without dying as a result. Write a program
	 * to supply the answer. The input to the program is  the amount of artificial 
	 * sweetener needed to kill a mouse, the weight of the mouse, and the desired weight 
	 * of the dieter. Assume that diet soda contains 1/10th of one percent artificial
	 * sweetener. Use a named constant for this fraction. You may want to express the 
	 * percent as the double value 0.001.
	 */
	
	public static final double CONCENTRATION_SWEETENER_IN_CAN = 0.001;
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter amount of sweetner needed to kill a mouse");
	double maxSweetenerMouse = input.nextDouble();
	System.out.println("Enter weight of the mouse");
	double mouseWeight = input.nextDouble();
	System.out.println("Enter your desired weight");
	double desiredWeight = input.nextDouble();
	
	double maxSweetenerPerson = (desiredWeight*maxSweetenerMouse)/mouseWeight;
	double maxCans = maxSweetenerPerson/CONCENTRATION_SWEETENER_IN_CAN;
	
	System.out.printf("The maximun amount of soda pop that you can drink is: %.2f", maxCans);
	}

}
