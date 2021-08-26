package bcit.ca.kulwinder.comp1451;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.playGame();
		

	}
	
	public void playGame() {
		Rounds rounds = new Rounds();
		rounds.round();
		if(Rounds.END_GAME== true) {
			return;
			
			
			 Players computer = new Players("Al");
			 Players p1 = new Players(rounds.getPlayersName());

		        // Sets the mode and plays:
		        rounds.setTheModeOfGame(computer, p1);
		        // System.out.println("END = " + Skunk.END);
		        if(Rounds.END_GAME == true) {
		            return;
		        }

		      

		        // Compares two players' scores:
		        rounds.comparePlayersScores(computer, p1);
		}
	}

}
