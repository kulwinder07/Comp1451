package bcit.ca.kulwinder.comp1451;

import java.util.Scanner;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Players {	
	private String namePlayer;	
	private Scanner userInput = new Scanner(System.in);
		
	/**
	 * @param namePlayer 
	 */
	public Players() {	
		setNamePlayer(userInput);
	}	
	
	/**
	 * @return the namePlayer
	 */
	public String getNamePlayer() {
		return namePlayer;
	}	
	
	/**
	 * @param userInput
	 *            the namePlayer to set
	 */
	public void setNamePlayer(Scanner userInput) {
		this.namePlayer = userInput.toString();
	}	

	/**
	 * This method gets name of the player 
	 */
	public void getPlayerNameFromKeyboard() {
		System.out.println("Please, enter the player's name: ");

		if (userInput.hasNext()) {
			if((userInput != null) ) {
				setNamePlayer(userInput);
			}			
		}			
	}	

} 

