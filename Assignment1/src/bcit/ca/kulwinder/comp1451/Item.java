package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Item {
	private double weightKg;
	private double manufacturingPriceDollars;
	private double suggestedRetailPriceDollars;
	private String uniqueID; 
 
	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollars
	 * @param uniqueID
	 */
	public Item(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars,
			String uniqueID) {
		this.weightKg = weightKg;
		this.manufacturingPriceDollars = manufacturingPriceDollars;
		this.suggestedRetailPriceDollars =suggestedRetailPriceDollars;		
		this.uniqueID = uniqueID;
	}

	/**
	 * @return weight kg
	 */
	public double getWeightKg() {
		return weightKg;
	}

	/**
	 * @param weightKg
	 */
	public void setWeightKg(double weightKg) {
		if(weightKg >=0) {
		this.weightKg = weightKg;
		}else {
			throw new IllegalArgumentException("weight cannot be negative");
		}
	}

	/**
	 * @return manufacturingPriceDollars
	 */
	public double getManufacturingPriceDollars() {
		
		return manufacturingPriceDollars;
		
	}

	/**
	 * @param manufacturingPriceDollars
	 */
	public void setManufacturingPriceDollars(double manufacturingPriceDollars) {
		if(manufacturingPriceDollars>=0) {
		this.manufacturingPriceDollars = manufacturingPriceDollars;
		}else {
			throw new IllegalArgumentException("manufacturingPriceDollars cannot be negative");
		}
	}

	/**
	 * @return suggestedRetailPriceDollars
	 */
	public double getSuggestedRetailPriceDollars() {
		return suggestedRetailPriceDollars;
	}

	/**
	 * @param suggestedRetailPriceDollars
	 */
	public void setSuggestedRetailPriceDollars(double suggestedRetailPriceDollars) {
		if(suggestedRetailPriceDollars>=0) {
		this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
		}else {
			throw new IllegalArgumentException(" suggestedRetailPriceDollars cannot be negative");
		}
	}

	/**
	 * @return unique id
	 */
	public String getUniqueID() {
		return uniqueID;
	}

	/**
	 * @param uniqueID
	 */
	public void setUniqueID(String uniqueID) {
		if(uniqueID != null) {
		this.uniqueID = uniqueID;
		}else {
			throw new IllegalArgumentException("unique id cannot be null");
		}
	}
}
