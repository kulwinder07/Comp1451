package bcit.ca.kulwinder.comp1451;

public class DiceRolling {
	
	public static final int ONE =1;
	public static final int ZERO = 0;
	public static final int TWO= 2;
	public static final int ANY_TRIPLES=100;
	
	private int totalDices;
	private Dicer[] dicer;
	private int scoreOfFirstTimeRoll;
	private boolean firstTimeRoll;
	private boolean hasDoublesOnes;
	private boolean hasTriplesOnes;
	
	public DiceRolling(int totalDices) {
		
		setTotalDices(totalDices);
		setScoreOfFirstTimeRoll(0);
		
		
		
	}

	public int getTotalDices() {
		return totalDices;
	}

	public void setTotalDices(int totalDices) {
		if(totalDices == Rounds.TWO_MODE_DICES || totalDices == Rounds.THREE_MODE_DICES ) {
		this.totalDices = totalDices;
		}else {
			throw new IllegalArgumentException("invaid mode");
		}

	}

	public int getScoreOfFirstTimeRoll() {
		return scoreOfFirstTimeRoll;
	}

	public void setScoreOfFirstTimeRoll(int scoreOfFirstTimeRoll) {
		if(scoreOfFirstTimeRoll>=0) {
		this.scoreOfFirstTimeRoll = scoreOfFirstTimeRoll;
		}else {
			throw new IllegalArgumentException("score cannot be negative");
		}
	}
	
	public void SetDicer(int totalDices) {
		dicer = new Dicer[totalDices];
		for(int i=0; i<totalDices; i++) {
			dicer[i] = new Dicer();
		}
		
	}
	
	public Dicer[] getDicer() {
		return dicer;
	}
	
	public boolean firstTimeRoll() {
		boolean firstTime = false;
		for(int i =0; i<this.getTotalDices(); i++) {
			if(dicer[i].getNumbers() == ONE && firstTimeRoll == true) {
				firstTime = true;
				System.out.println();
				System.out.println();
				break;
			}else if(dicer[i].getNumbers() == ONE && firstTimeRoll == false) {
				firstTime = true;
				System.out.println();;
				break;
			
			}
			
		}
		return firstTimeRoll;
		
	}
	
	 


	
	
	
	

}
