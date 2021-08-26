package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Score {	
	private int totalScore;

	/**
	 * @return the totalScore
	 */
	public int getTotalScore() {			
		return totalScore;		
	}	

	/**
	 * @param totalScore
	 */	
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;		
	}

	/**
	 * @param roundScore
	 */
	public void addScore(int roundScore) {
		this.totalScore = this.totalScore + roundScore;
	}
	
}