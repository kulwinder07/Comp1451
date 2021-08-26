package bcit.ca.comp1451.A01195084;


/**
 * @author Kulwinder Singh & Sunggeon Kim
 * @version 1.3
 *
 */

public final class Biography extends Book {
	private Name subject;

	/**
	 * @param authorsName
	 * @param titleOfTheBook
	 * @param yearPublished
	 * @param subject
	 * @throws InvalidBookDateException
	 * @throws InvalidArgumentException
	 */
	public Biography(Name authorsName, String titleOfTheBook, int yearPublished, Name subject)
			throws InvalidBookDateException, InvalidArgumentException {
		super(authorsName, titleOfTheBook, yearPublished);
		this.subject = subject;
		
		
	}

	/**
	 * @return subject
	 */
	public Name getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 * @throws InvalidArgumentException
	 */
	public void setSubject(Name subject) throws InvalidArgumentException {
		if(subject ==null) {
			this.subject = subject;
		}else {
			throw new InvalidArgumentException("Invalid subject");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biography other = (Biography) obj;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	
	

}
