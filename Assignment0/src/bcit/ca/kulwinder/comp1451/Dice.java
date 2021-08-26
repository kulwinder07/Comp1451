package bcit.ca.kulwinder.comp1451;

import java.util.Random;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Dice {

	private int numberOfSides;
	private int faceValue;	
	private final int MINIMUM_NUMBER = 1;
	private final int MAXIMUM_NUMBER = 6;

	/**
	 * This constructor takes numberOfSides of the die as argument
	 * 
	 * @param numberOfSides
	 */
	public Dice(int numberOfSides) {		
		this.numberOfSides = numberOfSides;
	}

	/**
	 * This method will roll the Die
	 */
	public void rollDice() {
		Random random = new Random();
		faceValue = 1 + random.nextInt(numberOfSides);
	} 

	/**
	 * 
	 * @return faceValue
	 */
	public int getFaceValue() {
		return faceValue;
	} 
	/**
	 * @return the firstDieNumber
	 */
	public int getFirstDiceNumber() {
		return MINIMUM_NUMBER;
	}

	/**
	 * @return the lastDieNumber
	 */
	public int getLastDiceNumber() {
		return MAXIMUM_NUMBER;
	}	
	
	public void setNumbers(int numbers) {
		if(numbers>=MINIMUM_NUMBER && numbers<=MAXIMUM_NUMBER ) {
			setNumbers(numbers);
		}
		
		
	}

}