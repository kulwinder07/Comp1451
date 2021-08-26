package bcit.ca.kulwinder.comp1451;

import java.util.Random;
import java.util.Scanner;

public class Players {
	
	public static final String PLAY_THE_GAME="P";
	public static final String STOP_THE_GAME = "S";
	public static final String INTERRUPT = "I";
	
	
	private String playerName;
	private String options;
	
	private int[] totalRounds= new int[Rounds.TOTAL_ROUNDS];
	
	
	public Players(String playerName) {
		this.playerName = playerName;
		setOptions(PLAY_THE_GAME);
		
				
		
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		if(playerName != null) {
		this.playerName = playerName;
		}else {
			throw new IllegalArgumentException("name cannot be null");
		}
	}


	public String getOptions() {
		return options;
	}


	public void setOptions(String options) {
		if(options.equalsIgnoreCase(PLAY_THE_GAME) || options.equalsIgnoreCase(STOP_THE_GAME)) {
		this.options = options.toUpperCase();
		}else {
			throw new IllegalArgumentException("invaid");
		}
	}
	
	public void resetOptions() {
		if(this.getOptions() != INTERRUPT) {
			this.setOptions(PLAY_THE_GAME);
			
		}
	}


	public int getTotalRounds(int round) {
		return totalRounds[round];
	}


	public void setTotalRounds(int score, int round) {
		if(score >= 0) {
		this.totalRounds[round] = score;
		}else {
			throw new IllegalArgumentException("invaid scores");
		}
	}
	
	 public int getScoresOfGame() {
	        int count = 0;
	        for(int i=0; i<Rounds.TOTAL_ROUNDS; i++) {
	            count = count + totalRounds[i];
	        }
	        return count;
	    }
	public void computerOptions() {
		Random ran = new Random();
		int results = ran.nextInt(2);
		if(results ==0) {
			setOptions(STOP_THE_GAME);
			System.out.println("---computer's options is stop the game--");
		}else {
			setOptions(PLAY_THE_GAME);
			System.out.println("-----computer's options is play the game-----");
		}
	}
	
	public void diplayTheRounds() {
		int round = 0;
		System.out.println("this round"+this.getPlayerName()+"'s score are " + this.getTotalRounds(round)+"");
	}
	
	public void playersOptions() {
		System.out.println("---------------------");
		System.out.println("-------choose the options P to play or S to stop---------");
		try (Scanner scanner = new Scanner(System.in)) {
			while(scanner.hasNext()) {
				String option = scanner.next();
				if(option.equalsIgnoreCase(PLAY_THE_GAME)) {
					setOptions(PLAY_THE_GAME);
					System.out.println("-----------------------");
					System.out.println("-----you choose PLAY--------- ");
					return;
				}else if(option.equalsIgnoreCase(STOP_THE_GAME)) {
					setOptions(STOP_THE_GAME);
					System.out.println("------------------");
					System.out.println("---------you choose the STOP-----------");
					return;
				}else {
					System.out.println("------------------------------");
					System.out.println("--------invalid input please choose P or S---------");
				}

			}
		}
	}

}
