package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Book extends Item {

	private Author author;
	private Date datePublished;
	private String title;
	private BookType genre;
	
	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollars
	 * @param uniqueID
	 * @param author
	 * @param datePublished
	 * @param title
	 * @param genre
	 */
	public Book(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars,
			String uniqueID,Author author, Date datePublished, String title, BookType genre) {
		super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars, uniqueID);
		this.author = author;
		this.datePublished = datePublished;
		this.title = title;
		this.genre = genre;
	}

	
	



	/**
	 * @return author
	 */
	public Author getAuthor() {
		return author;
	}


	/**
	 * @param author
	 */
	public void setAuthor(Author author) {
		if(author != null) {
		this.author = author;
		}else {
			throw new IllegalArgumentException("book author cannot be null");
		}
	}


	/**
	 * @return date published
	 */
	public Date getDatePublished() {
		
		return datePublished;
	}


	/**
	 * @param datePublished
	 */
	public void setDatePublished(Date datePublished) {
		if(datePublished!= null){
		this.datePublished = datePublished;
		}else {
			throw new IllegalArgumentException("date published cannot be null");
		}
	}


	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title
	 */
	public void setTitle(String title) {
		if(title!= null) {
		this.title = title;
		}else {
			throw new IllegalArgumentException("title cannot be null");
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
		}else {
              throw new IllegalArgumentException("genre cannpot be null");
		}
	}
	
	/**
	 * @return unique id
	 */
	public String getISBN() {
		return this.getUniqueID();
	}
	
	/**
	 * @param isbn
	 */
	public void setISBN(String isbn) {
		if(isbn!= null) {
			this.setISBN(isbn);
			
		}	
		
	}
	
	 /**
	 * @return year published
	 */
	public int getYearPublished() {
	        return this.getDatePublished().getYear();
	    }
	 
	 /**
	 * @return author full name
	 */
	public String getAuthorFullName() {
		 return this.getAuthor().getName().getFullName();
	 }
	 
	 /**
	 * @return genre string
	 */
	public String getGenreString() {
		 return genre.getTheBookType();
	 }
	

}
