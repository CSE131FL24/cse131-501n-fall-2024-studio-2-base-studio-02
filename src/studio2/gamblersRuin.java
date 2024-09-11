package studio2;

import java.util.Scanner;

public class gamblersRuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	double winChance, winLimit; 
	
	// how much we are gambling
	System.out.println("How much money do you want to gamble today?");
	double startAmount = in.nextDouble();
	double original  = startAmount;
	
	winLimit = 10.0;
	
	System.out.println("How many days do you want to gamble?");
	int totalSimulations = in.nextInt();

	
	
	int moves = 0;
	for (int count = 1; count <= totalSimulations ; count++) {
		startAmount = original;
		moves = 0;
		while ((startAmount > 0) && (startAmount < winLimit)) {
			winChance = Math.random();
			
			if (winChance <= 0.7) {
				startAmount++;
				moves++;
			} else
				startAmount--;
				moves++;
			}
				
		if (startAmount == winLimit) {
			System.out.println("Simulation: " + count + " " + moves + " WIN");
		} else {
			System.out.println("Simulation: " + count + " " + moves + " LOSE");
			
		}
	}


	
	}
}
