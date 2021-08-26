package bcit.ca.kulwinder.comp1451;

import java.util.Scanner;

public class Rounds {
	
	public static final int TOTAL_ROUNDS= 5;
	public static final String QUIT_THE_GAME= "Q";
	public static final int THREE_MODE_DICES = 3;
	public static final int TWO_MODE_DICES= 2;
	public static boolean END_GAME = false;
	
	private String[] rounds = {"S", "K", "U", "N", "K"} ;
	
	private String playersName;
	
	
	public Rounds(String playersName) {
		this.playersName = playersName;
	}


	public Rounds() {
		
	}


	public String getPlayersName() {
		return playersName;
	}
	
	public void round() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		setPlayersName();
		
	}


	public void setPlayersName() {
		try (Scanner scanner = new Scanner(System.in)) {
			if(scanner.hasNext()) {
				this.playersName = scanner.next();
				if(this.playersName.equalsIgnoreCase(QUIT_THE_GAME)) {
					System.out.println("-------");
					System.out.println("--game is over--");
					Rounds.END_GAME=true;
					return;
				}else {
			        System.out.println("-------");
			        System.out.println("----"+"Hello" +playersName+"---");
			        
			}
}
		}
	
	
	

	}
	
	public void setTheModeOfGame(Players firstPlayer, Players secondPlayer) {
		System.out.println("----------------------");
		System.out.println("----------Skunk game------------");
		System.out.println("---2-TWO MODE DICES OR 3-THREE MODE DICES----OR Q-QUIT THE GAME--------------");
		System.out.println("-----please sdelect 2 or 3- or Q--");
		Scanner scanner = new Scanner(System.in);
		String string;
		while(scanner.hasNext()) {
			if(scanner.hasNext()) {
				int totalDice = scanner.nextInt();
				if(totalDice == TWO_MODE_DICES) {
					System.out.println("----------------------");
					System.out.println("-------TWO MODE DICES-----");
					DiceRolling diceRolling = new DiceRolling(TWO_MODE_DICES);
					
					
				}
			}
			
		}
		
	}
	   public void gamePay(DiceRolling diceRolling, Players firstPlayer, Players secondPlayer) {
		   if(diceRolling.getTotalDices()== TWO_MODE_DICES) {
			   for(int i =0; i <TOTAL_ROUNDS; i++) {
				   System.out.println("-----");
				   System.out.println("------"+ rounds[i]+"--");
			   }
			   
			   public void displayPlayerScores(Players player) {
			        System.out.println("---------------------------------------------------------------------------------------");
			        System.out.println("|||||||||||||||||||||||||||||<<<<    Processing...    >>>>|||||||||||||||||||||||||||||");
			        System.out.println("---------------------------------------------------------------------------------------");
			        
			        for(int i=0; i<TOTAL_ROUNDS; i++) {
			            System.out.println("Round " + skunk[i] + ":  " + player.getName() + "'s scores are " + player.getScoresOfRound(i) + ".");
			        }
			        System.out.println("---------------------------------------------------------------------------------------");
			        System.out.println("In total, " + player.getName() + "'s scores are " + player.getScoresOfGame() + ".");
			        System.out.println("---------------------------------------------------------------------------------------");
			    }
			   
		   }
		   
	   }
	
	   public void comparePlayersScores(Players p1, Players p2) {
	        if(p1.getScoresOfGame() > p2.getScoresOfGame()) {
	            System.out.println("#######################################################################################");
	            System.out.println("#####                    -   AI wins!!! Please try again.   -                     #####");
	            System.out.println("#######################################################################################");
	        }
	        else if(p1.getScoresOfGame() < p2.getScoresOfGame()) {
	            System.out.println("#######################################################################################");
	            System.out.println("                       Congratulations " + p2.getPlayerName() + ", you beat the AI !!!               ");
	            System.out.println("#######################################################################################");
	        }
	        else {
	            System.out.println("#######################################################################################");
	            System.out.println("#####                        -   Tie! Please try again.   -                       #####");
	            System.out.println("#######################################################################################");
	        }
	    }
	}
