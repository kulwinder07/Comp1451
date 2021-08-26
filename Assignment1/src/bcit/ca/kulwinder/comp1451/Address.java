package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Address {
	private String streetNumber;
	private String StreetName;
	private String city;
	private String postalCode;
	
	/**
	 * @param streetNumber
	 * @param streetName
	 * @param city
	 * @param postalCode
	 */
	public Address(String streetNumber, String streetName, String city, String postalCode) {
		this.streetNumber = streetNumber;
		this.StreetName = streetName;
		this.city = city;
		this.postalCode = postalCode;
	}

	/**
	 * @return street number
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * @param streetNumber
	 */
	public void setStreetNumber(String streetNumber) {
		if(streetNumber != null && !streetNumber.isEmpty() ){
		this.streetNumber = streetNumber;
		}else {
			throw new IllegalArgumentException("street number cannot be null");
		}
	}

	/**
	 * @return street name
	 */
	public String getStreetName() {
		return StreetName;
	}

	/**
	 * @param streetName
	 */
	public void setStreetName(String streetName) {
		if(streetName != null && streetName.isEmpty()) {
		StreetName = streetName;
		}else {
			throw new IllegalArgumentException("street name cannot be null");
		}
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 */
	public void setCity(String city) {
		if(city != null && city.isEmpty()) {
		this.city = city;
		}else {
			throw new IllegalArgumentException("city cannot be null");
		}
	}

	/**
	 * @return psta cde
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 */
	public void setPostalCode(String postalCode) {
		if(postalCode != null && postalCode.isEmpty()) {
		this.postalCode = postalCode;
		}else {
			throw new IllegalArgumentException("postal code cannot be null");
		}
	}
	
	

}
