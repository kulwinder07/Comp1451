package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder singh
 * @version 1.0
 *
 */
public class Name {

	private String firstName;
	private String middleName;
	private String lastName;
	
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 */
	public Name(String firstName,String middleName ,String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		
	}

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName= lastName;
		
	}

	/**
	 * @param lastName
	 */
	public Name(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if(firstName!= null) {
		this.firstName = firstName.toUpperCase().charAt(0)+firstName.substring(1).toLowerCase();
		}else {
			throw new IllegalArgumentException("first name cannot be null");
		}
	}

	/**
	 * @return middle name
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName
	 */
	public void setMiddleName(String middleName) {
		if(middleName != null) {
		this.middleName = middleName.toUpperCase().charAt(0)+middleName.substring(1).toLowerCase();
		}else {
			throw new IllegalArgumentException("middle name cannot be null");
		}
	}

	/**
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if(lastName != null) {
		this.lastName = lastName.toUpperCase().charAt(0)+ lastName.substring(1).toLowerCase();
		}else {
			throw new IllegalArgumentException("last name cannot be null");
		}
	}
     
	
	/**
	 * @return full name
	 */
	public String getFullName() {
		if(middleName!= null) {
			return this.getFirstName()+" "+this.getMiddleName()+ " "+this.getLastName();
		}else if(firstName !=null) {
			return this.getFirstName()+" "+this.getLastName();
			
		}else {
			return this.getLastName();
		}
	}
	
}
