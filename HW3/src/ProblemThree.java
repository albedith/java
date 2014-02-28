import java.util.Scanner;
public class ProblemThree {

	/**
	 * One way to estimate the adult height of a child is to use the following formula,
	 * which uses the height of the parents:
	 * H_male_child = ((H_mother*13/12)+H_father)/2
	 * H_female_child = ((H_father*12/13)+H_mother)/2
	 * 
	 * All heights are in inches. Write a program that takes as input the gender of the 
	 * child, the height of the mother in inches, and the height of the father in inches,
	 * and outputs the estimated adult height of the child in inches. The program should
	 * allow the user to enter a new set of values, outputting the predicted height, until
	 * the user decides to exit. The user should be able to input the height in feet and 
	 * inches, and the program should output the estimated height of the child in feet and
	 * inches. Use the integer data type to store the heights.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double mother_height, father_height, child_height;
		String keepGoing,measurement;
		
		do
		{
			System.out.println("To calculate the estimated adult height of a child you will need to enter the height of the mother and the father. ");
			System.out.println("Do you want to input the values in inches or feet? \nEnter inches or feet");
			measurement= input.next();
			System.out.println("Enter the gender of the child (Enter female or male):");
			String child_gender = input.next();
			System.out.println("Enter the height of the mother in " + measurement + ":");
			mother_height = input.nextInt();
			System.out.println("Enter the height of the father in " + measurement + ":");
			father_height = input.nextInt();
			
				if (child_gender.equalsIgnoreCase("female")){
					if (measurement.equalsIgnoreCase("inches")){
						child_height = (((father_height*12)/13)+mother_height)/2;
						System.out.printf("The estimated adult height of your child is %.2f inches.\n", child_height);
					}else{
						child_height = ((((father_height*12)*12)/13)+(mother_height*12))/2;
						System.out.printf("The estimated adult height of your child is %.2f feet.\n", (child_height/12));
					}
				}else if (child_gender.equalsIgnoreCase("male")){
					if(measurement.equalsIgnoreCase("inches")){
						child_height = (((mother_height*13)/12)+father_height)/2;
						System.out.printf("The estimated adult height of your child is %.2f inches.\n", child_height);;
					}else{
						child_height = ((((mother_height*12)*13)/12)+(father_height*12))/2;
						System.out.printf("The estimated adult height of your child is %.2f feet.\n", (child_height/12));
					}
				}
				
				System.out.println("Do you want to enter new values and re-calculate? \n Enter yes or no");
				keepGoing = input.next();
				 
		}while (keepGoing.equalsIgnoreCase("yes"));
		
	}

}
