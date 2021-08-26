package bcit.ca.kulwinder.comp1451;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Round {	
	private List<String> totalRounds;		
	
	/**
	 * The constructor populates the ArrayList
	 */
	public Round() {
		totalRounds = new ArrayList<String>();
		
		totalRounds.add("S");
		totalRounds.add("K");
		totalRounds.add("U");
		totalRounds.add("N");
		totalRounds.add("K.");
	} 
	
	/**
	 * @return the size of total rounds
	 */
	public int getSize() {
		return totalRounds.size();
	}
	
	public String getRound(int index) {
		return totalRounds.get(index);
	}

	/**
	 * @return the total rounds
	 */
	public List<String> getTotalRounds() {
		return totalRounds;
	}	

	/**
	 * @param totalRounds set the total rounds
	 */
	public void setTotalRounds(List<String> totalRounds) {
		this.totalRounds = totalRounds;
	}	
	
}