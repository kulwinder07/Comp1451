package bcit.ca.kulwinder.comp1451;

import java.util.Scanner;
/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */

public class Game {

	private Players player = new Players();
	private Board board = new Board();
	private Round roundList = new Round();
	private Scanner scan = new Scanner(System.in);
	private Dice dice1 = new Dice(6);
	private Dice dice2 = new Dice(6);
	private Dice dice3 = new Dice(6);
	private Score gameScore = new Score();
	private Score roundScore = new Score();
	private String currentRound;	
	private boolean continueRound = false;	
	public static final int BONUS = 100;
	

	/**
	 * This method calls the game information
	 * 
	 */
	public void getGameInfo() {		
		board.getInformation();
		player.getPlayerNameFromKeyboard();		

	} 	
	
	/**
	 *  This method goes through all rounds rolling the dice and getting the score
	 */
	public void getPlayingGame() {			
		for (int i = 0; i < roundList.getSize(); i++) {
			currentRound = roundList.getRound(i);

			do {
				dice1.rollDice();
				dice2.rollDice();
				dice3.rollDice();

				System.out.println("Round: " + currentRound);
				System.out.println("First die: " + dice1.getFaceValue());
				System.out.println("Second die: " + dice2.getFaceValue());
				System.out.println("Third die: " + dice3.getFaceValue());
				
				diceVerification();
				
			} while (continueRound);

			gameScore.addScore(roundScore.getTotalScore());
			roundScore.setTotalScore(0);
		}
	} 	
	
	/**
	 * This method verify according to the dice faceValue which score to apply
	 */
	public void diceVerification() {
		if ((dice1.getFaceValue() == dice1.getFirstDiceNumber()) ||(dice2.getFaceValue() == dice2.getFirstDiceNumber()) &&(dice1.getFaceValue() == dice3.getFirstDiceNumber())) {
			board.getTwoOnes();
			roundScore.setTotalScore(0);
			gameScore.setTotalScore(0);
			System.out.println("Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = false;
		} else if ((dice1.getFaceValue() == dice1.getFirstDiceNumber()) || (dice2.getFaceValue() == dice2.getFirstDiceNumber()) || (dice1.getFaceValue() == dice3.getFirstDiceNumber())) {
			board.getOne();
			roundScore.setTotalScore(0);
			gameScore.setTotalScore(0);
			System.out.println("Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = false;
		} else if ((dice1.getFaceValue() == dice1.getLastDiceNumber()) && (dice2.getFaceValue() == dice2.getLastDiceNumber()) && (dice1.getFaceValue() == dice3.getLastDiceNumber())){
			board.getAnyTriples();
			roundScore.addScore(BONUS);
			System.out.println("Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = validationContinueRound(currentRound);
		} else {
			int sumFaces = dice1.getFaceValue() + dice2.getFaceValue()+dice3.getFaceValue();
			roundScore.addScore(sumFaces);
			System.out.println("Sum of faces: " + sumFaces + " | Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = validationContinueRound(currentRound);
		}		
	} 
	
	/**
	 * @param round
	 * @return true if the player continues in the same round 
	 */
	public boolean validationContinueRound(String round) {
		boolean continueRound = false;
		System.out.println("Continue in the same round? (y/n)");
		while (scan.hasNext()) {
			String userInput = scan.next();			
			if (userInput.equalsIgnoreCase("y")) {
				continueRound = true;
				break;
			} else if (userInput.equalsIgnoreCase("n") && round.equalsIgnoreCase("K.")) {				
				continueRound = false;
				break;
			} else if (userInput.equalsIgnoreCase("n")) {
				System.out.println("You choose change the round.");
				continueRound = false;
				break;
			} else {
				System.out.println("Please, type only Y or N.");
			}
		}
		return continueRound;
	} 

	/**
	 * This method details final game
	 */
	public void getDetailsFinalGame() {

		System.out.println("--------------Game over!--------------");
		System.out.println("Congratulations!!!!!");
		System.out.println("Total game: " + gameScore.getTotalScore());

	}
	
}
