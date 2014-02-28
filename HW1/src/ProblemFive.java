
public class ProblemFive {

	/**
	 * @param args
	 */
	public static final String TEXT = "I hate when people hate other people.";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hate = TEXT.indexOf("hate");
		String newText = TEXT.substring(0, hate)+ "love" + TEXT.substring(hate+4);
		
		System.out.println("The line of text to be changed is: \n" + TEXT);
		System.out.println("I have rephrased that line to read: \n" + newText);
	}

}
