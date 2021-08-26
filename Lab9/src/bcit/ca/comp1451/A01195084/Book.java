package bcit.ca.comp1451.A01195084;
/**
 * @author Kulwinder Singh & Sunggeon Kim
 * @version 1.3
 *
 */
public class Book implements Comparable<Book> {
	private Name authorsName;
	protected String titleOfTheBook;
	private int yearPublished;
	public static final int MAXIMUM_YEAR = 2016;
	
	/**
	 * @param authorsName
	 * @param titleOfTheBook
	 * @param yearPublished
	 * @throws InvalidBookDateException
	 * @throws InvalidArgumentException
	 */
	public Book( Name authorsName,  String titleOfTheBook, int yearPublished) 
			throws InvalidBookDateException,InvalidArgumentException {
		this.authorsName = authorsName;
		
		this.titleOfTheBook = titleOfTheBook;
		
		this.yearPublished = yearPublished;
	}

	/**
	 * @return author name of book
	 */
	public Name getAuthorsName() {
		return authorsName;
	}

	/**
	 * @param authorsName
	 */
	public void setAuthorsName(Name authorsName) throws InvalidArgumentException {
		if(authorsName ==null) {
			this.authorsName = authorsName;
		}else {
			throw new InvalidArgumentException("Invalid author name!!!");
		}
	}

	/**
	 * @return title of book
	 */
	public String getTitleOfTheBook() {
		return titleOfTheBook;
	}

	
	/**
	 * @param titleOfTheBook
	 * @throws InvalidArgumentException
	 */
	public void setTitleOfTheBook(String titleOfTheBook) throws InvalidArgumentException{
		if(titleOfTheBook ==null || titleOfTheBook.isEmpty()) {
			this.titleOfTheBook = titleOfTheBook;
		}else {
			throw new InvalidArgumentException("Invalid title of book !!!");
		}
	}

	/**
	 * @return year published
	 */
	public int getYearPublished() {
		return yearPublished;
	}

	
	/**
	 * @param yearPublished
	 * @throws InvalidBookDateException
	 */
	public void setYearPublished(int yearPublished) throws InvalidBookDateException {
		if(yearPublished <0 || yearPublished>MAXIMUM_YEAR) {
			this.yearPublished = yearPublished;
		}else {
			throw new InvalidBookDateException("Invalid year");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorsName == null) ? 0 : authorsName.hashCode());
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
		Book other = (Book) obj;
		if (authorsName == null) {
			if (other.authorsName != null)
				return false;
		} else if (!authorsName.equals(other.authorsName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [authorsName=" + authorsName.getFullName() + ", titleOfTheBook=" + titleOfTheBook + ", yearPublished="
				+ yearPublished + "]";
	}
	
	@Override
    public int compareTo(Book bk) {
        return (int)(this.getYearPublished() - bk.getYearPublished());
    }

}
