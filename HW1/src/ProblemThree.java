
public class ProblemThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "albedith", last = "diaz";
		
		/*Move the first letter of the name to the end of the word and add "ay"
		 *Make the first letter capitalized.
		 *Example: first = "walt" , last = "savitch";
		 *Result: Altway Avitchsay
		*/
		
		String first_FirstLetter = first.substring(0,1);
		String last_FirstLetter = last.substring(0,1);
		String first_SecondLetter = first.substring(1,2);
		String last_SecondLetter = last.substring(1,2);
		int first_Length = first.length();
		int last_Length = last.length();
		
		String newFirst = first_SecondLetter.toUpperCase() + first.substring(2, first_Length) + first_FirstLetter + "ay";
		String newLast = last_SecondLetter.toUpperCase() + last.substring(2, last_Length) + last_FirstLetter + "ay";
		
		System.out.println(newFirst + " " + newLast);
	}

}
