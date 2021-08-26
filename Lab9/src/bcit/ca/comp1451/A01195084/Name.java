package bcit.ca.comp1451.A01195084;

/**
 * @author Kulwinder Singh & Sunggeon Kim
 * @version 1.3
 *
 */

public class Name {
	private String firstName;
	private String lastName;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @throws InvalidArgumentException
	 */
	public Name(String firstName, String lastName) throws InvalidArgumentException{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return  first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 * @throws InvalidArgumentException
	 */
	public void setFirstName(String firstName) throws InvalidArgumentException {
		if(firstName ==null) {
			this.firstName = firstName;
		}else {
			throw new InvalidArgumentException("Invalid first name!!!");
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
	 * @throws InvalidArgumentException
	 */
	public void setLastName(String lastName) throws InvalidArgumentException {
		if(lastName ==null) {
			this.lastName = lastName;
		}else {
			throw new InvalidArgumentException("Invalid last name!!!");
		}
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	/**
	 * @return full name of authors
	 */
	public String getFullName() {
		return firstName + "  "+ lastName;
	}

}
