package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Author {
	private Date birthDate;
	private Name name;
	private BookType genre;
	private String pseudonym;
	
	/**
	 * @param birthDate
	 * @param name
	 * @param genre
	 * @param pseudonym
	 */
	public Author(Date birthDate, Name name, BookType genre, String pseudonym) {
		this.birthDate = birthDate;
		this.name = name;
		this.genre = genre;
		this.pseudonym = pseudonym;
	}


	/**
	 * @param birthDate
	 * @param name
	 * @param genre
	 */
	public Author(Date birthDate, Name name, BookType genre) {
		this.birthDate = birthDate;
		this.name = name;
		this.genre= genre;
	}
	
	
	/**
	 * @return birth date
	 */
	public Date getBirthDate() {
		return birthDate;
	}


	/**
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate) {
		if(birthDate != null) {
		this.birthDate = birthDate;
		}else {
			throw new IllegalArgumentException(" birth date cannot be null");
		}
	}


	/**
	 * @return name
	 */
	public Name getName() {
		return name;
	}


	/**
	 * @param name
	 */
	public void setName(Name name) {
		if(name != null){
		this.name = name;
		}else{
			throw new IllegalArgumentException("name cannot be null");
		}
	}


	/**
	 * @return genre
	 */
	public BookType getGenre() {
		return genre;
	}


	/**
	 * @param genre
	 */
	public void setGenre(BookType genre) {
		if(genre!= null) {
		this.genre = genre;
		}else{
			throw new IllegalArgumentException("genre cannot be null");
		}
	}


	/**
	 * @return pseudonym
	 */
	public String getPseudonym() {
		return pseudonym;
	}


	/**
	 * @param pseudonym
	 */
	public void setPseudonym(String pseudonym) {
		if(pseudonym!= null) {
		this.pseudonym = pseudonym;
		}else {
			throw new IllegalArgumentException("pseudonym can not be null"); 
		}
	}



	

}
