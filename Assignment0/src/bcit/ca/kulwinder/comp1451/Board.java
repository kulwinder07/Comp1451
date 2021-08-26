package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Board {


	public void getInformation() {

		System.out.println("__________________________Welcome to The SKUNK Game!!!____________________________");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("The game has 5 rounds, S, K, U, N, and K, in each round will roll 3 dice.");
		System.out.println("Your points are the sum of the dice's face.");
		System.out.println("When you roll tripple any, you win 100 points.");
		System.out.println("However, if you are playind round and roll one 1 you lose all the points in that round and go to the next round.");
		System.out.println("If you  are playing round and roll two 1s, you lose all your points in that round and go to the next round.");
		System.out.println("At each roll dice, you can continue in the current round, or you can go to the next round. ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("_____________________Let's start the game! Good Luck!_________________________");
		System.out.println();

	} 
	
	public void getTwoOnes() {		
		System.out.println("Two dice with number 1, you lost all points until now.");			
	} 

	public void getOne() {			
		System.out.println("One die with number 1, you lost lost all the points.");		
	}  

	public void getAnyTriples() { 			
		System.out.println("You got 100 points with tripple!!");	
	} 	

}