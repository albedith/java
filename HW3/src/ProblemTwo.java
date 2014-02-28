import java.util.Scanner;
public class ProblemTwo {
	/**
	 * In the game of craps, a pass line bet proceeds as follows. Two six-sided dice are
	 * rolled; the first roll of the dice in a craps round is called the "come out roll"
	 * A come out roll of 7 or 11 automatically wins, and a come out roll of 2,3, or 12
	 * automatically loses. If a 4, 5, 6, 8, 9, or 10 is rolled on the come out roll,
	 * that number becomes the point. The player keeps rolling the dice until either 7
	 * or the point is rolled. If the point is rolled first, then the player wins the bet.
	 * If a 7 is rolled first, then the player loses.
	 * 
	 * Write a program that simulates a game of craps using these rules without human input.
	 * Instead of asking for a wager, the program should calculate whether the player would
	 * win or lose. The program should simulate rolling the two dice and calculate the sum.
	 * Add a loop so that the program plays 10,000 games. Add counters that count how many
	 * times the player wins, and how many times the player loses. At the end of the 10,000
	 * games, compute the probability of winning (i.e wins/(wins+losses)) and output this
	 * value. over the long run, who is going to win the most games, you or the house?
	 * 
	 * Note: To generate a random number, use x = Math.random();. For example multiplying
	 * by 6 and converting to an integer results in an integer that  is between 0 and 5.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int point = 0, n_runs = 0, n_won = 0, n_loss = 0;
				
			for (n_runs = 0; n_runs < 10000; n_runs++)
			{	
				int dice1 = 1 + (int)(Math.random()* ((6-1)+1));
				int dice2 = 1 + (int)(Math.random()* ((6-1)+1));
				int sum = (dice1 + dice2);
											
				if (n_runs == 0){
					System.out.println("The first dice value is: "+ dice1 + "\nThe second dice value is: " + dice2);
					System.out.println("The dice sum is: " + sum );	
				}
					
				if (((sum == 7 ) || (sum == 11)) && (n_runs < 1))
				{
					System.out.println("You Won!!");
					n_won++;
					break;					
				} else if (((sum == 2 ) || (sum == 3)|| (sum == 12)) && (n_runs < 1)) {
					System.out.println("You Lost!!");
					n_loss++;
					break;
				} else if (n_runs < 1) {
					point = sum;
					System.out.printf("You did not win or lose on your first run and you accumulated %d points.", point);
					System.out.println("\nYou will now enter to an automated draft of 10,000 runs. \n Good Luck");
				} 
				
				if (n_runs >= 1){					
					if (sum == point ) {	
						n_won++;						
					} else if (sum == 7 ) {	
						n_loss++;						
					}	
				}
			}
			System.out.println("The game has finished \nYou won " + n_won + " times.");
			System.out.println("You loss " + n_loss + " times.");
			
			if ((n_won != 0) || (n_loss != 0))
			System.out.println("Your probabilities of winning were "+ (n_won / (n_won + n_loss)));
							
		}
		
	}

