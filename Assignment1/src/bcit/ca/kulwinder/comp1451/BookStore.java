package bcit.ca.kulwinder.comp1451;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
class BookStore extends Store {
	private BookType specialty;

	/**
	 * @param address
	 * @param name
	 * @param specialty
	 */
	public BookStore(Address address, String name, BookType specialty) {
		super(address, name);
		this.specialty = specialty;
		addBooks();
	}

	/**
	 * @param address
	 * @param name
	 * @param specialty
	 */
	public BookStore(Address address, String name, String specialty) {
		super(address, name);
		this.specialty = BookType.get(specialty);
		addBooks();
	}

	/**
	 * @return specialty
	 */
	public BookType getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty
	 */
	public void setSpecialty(BookType specialty) {
		if (specialty != null) {
			this.specialty = specialty;
		} else {
			throw new IllegalArgumentException("invalid");
		}
	}

	/**
	 * method addbooks
	 */
	private void addBooks() {
		Date birthDate = new Date(1919, 1, 1);
		Name name = new Name("Jerome", "David", "Salinger");
		BookType genre = BookType.get("fiction");
		Author author = new Author(birthDate, name, genre, "JD");
		Date datePublished = new Date(1951, 5, 14);
		String title = "The Catcher in the Rye";
		Book b = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
		addItem(b);

		datePublished = new Date(1948, 1, 31);
		title = "A Perfect Day for Bananafish";
		genre = BookType.get("fiction");
		b = new Book(1, 11, 12, "2345", author, datePublished, title, genre);
		addItem(b);

		datePublished = new Date(1945, 12, 12);
		title = "A Boy in France";
		genre = BookType.get("fiction");
		b = new Book(2, 33, 35, "3456", author, datePublished, title, genre);
		addItem(b);

		birthDate = new Date(1963, 9, 3);
		name = new Name("Malcolm", "Gladwell");
		genre = BookType.get("nonfiction");
		author = new Author(birthDate, name, genre);
		datePublished = new Date(2008, 11, 18);
		title = "Outliers";
		b = new Book(2.1, 2, 6, "4567", author, datePublished, title, genre);
		addItem(b);

		datePublished = new Date(2000, 3, 1);
		title = "The Tipping Point";
		genre = BookType.get("nonfiction");
		b = new Book(0.5, 3, 5, "5678", author, datePublished, title, genre);
		addItem(b);

		birthDate = new Date(1919, 11, 26);
		name = new Name("Frederik", "Pohl");
		genre = BookType.get("sciencefiction");
		author = new Author(birthDate, name, genre, "Paul Dennis Lavond");
		datePublished = new Date(1977, 7, 4);
		title = "Gateway";
		b = new Book(0.01, 4, 4, "6789", author, datePublished, title, genre);
		addItem(b);

		datePublished = new Date(1937, 10, 6);
		title = "Elegy to a Dead Planet: Luna";
		genre = BookType.get("sciencefiction");
		b = new Book(0.1, 5, 11, "abcd", author, datePublished, title, genre);
		addItem(b);

		birthDate = new Date(1918, 5, 11);
		name = new Name("Richard", "Phillips", "Feynman");
		genre = BookType.get("reference");
		author = new Author(birthDate, name, genre);
		datePublished = new Date(1942, 5, 20);
		title = "Principle of Least Action in Quantum Mechanics";
		b = new Book(0.8, 15, 30, "efgh", author, datePublished, title, genre);
		addItem(b);

		datePublished = new Date(1964, 6, 30);
		title = "The Messenger Lectures";
		genre = BookType.get("reference");
		b = new Book(0.6, 44, 45.5, "ijkl", author, datePublished, title, genre);
		addItem(b);

		datePublished = new Date(1985, 11, 1);
		title = "Surely You're Joking Mr. Feynman";
		genre = BookType.get("nonfiction");
		b = new Book(1.0, 3, 13, "mnop", author, datePublished, title, genre);
		addItem(b);
	}

	/**
	 * @param ageInYears displayAllBooksWrittenByAuthorsOverThisAge
	 */
	public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears) {
		Collection<Item> books = getCollectionOfItems();
		Iterator<Item> it = books.iterator();
		boolean displayedSome = false;
		while (it.hasNext()) {
			Book b = (Book) it.next();
			int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
			if (ageYears > ageInYears) {
				System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName()
						+ " at age " + ageYears + ", which is more than " + ageInYears);
				displayedSome = true;
			}
		}
		if (displayedSome == false) {
			System.out.println("No books by authors over age " + ageInYears);
		}
	}

	/**
	 * method display all books by every author
	 */
	public void displayAllBooksByEveryAuthor() {
		Collection<Item> books = getCollectionOfItems();
		Iterator<Item> it = books.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getAuthor().getName().getLastName() + " wrote " + book.getTitle() + " in "
					+ book.getYearPublished());
		}
	}

	/**
	 * @param lastName displayAllBooksByAuthor
	 */
	public void displayAllBooksByAuthor(String lastName) {
		if (lastName != null) {
			lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
			Collection<Item> books = getCollectionOfItems();
			Iterator<Item> it = books.iterator();
			while (it.hasNext()) {
				Book book = (Book) it.next();
				if (book.getAuthor().getName().getLastName().equals(lastName)) {
					System.out.println(book.getAuthor().getName().getLastName() + " wrote " + book.getTitle());
				}
			}
		}
	}

	/**
	 * @param year displayAllBooksWrittenBefore
	 */
	public void displayAllBooksWrittenBefore(int year) {
		Collection<Item> books = getCollectionOfItems();
		Iterator<Item> it = books.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			int years = book.getDatePublished().getYear();
			if (years < year) {
				System.out.println(book.getTitle() + " was published in " + book.getDatePublished().getYear()
						+ ", which is before " + year);
			}
		}

	}

	/**
	 * @param pseudonym displayTitlesOfBooksWrittenBy
	 */
	public void displayTitlesOfBooksWrittenBy(String pseudonym) {
		if (pseudonym != null) {
			Collection<Item> books = getCollectionOfItems();
			Iterator<Item> it = books.iterator();
			while (it.hasNext()) {
				Book book = (Book) it.next();
				if (book.getAuthor().getPseudonym() != null) {
					if (book.getAuthor().getPseudonym().equals(pseudonym)) {
						System.out.println(book.getAuthor().getName().getLastName() + " wrote " + book.getTitle()
								+ " as " + pseudonym);
					}
				}

			}
		}

	}

	/**
	 * @param genre displayAllBooksForGenre
	 */
	public void displayAllBooksForGenre(String genre) {
		if (genre != null) {
			Collection<Item> books = getCollectionOfItems();
			Iterator<Item> it = books.iterator();
			while (it.hasNext()) {
				Book book = (Book) it.next();
				if (book.getGenreString().equals(genre)) {
					System.out.println(book.getTitle() + " is a " + genre + " book written by "
							+ book.getAuthor().getName().getLastName());
				}

			}
		}

	}

	/**
	 * method displayTotalWeightKgOfAllBooks
	 */
	public void displayTotalWeightKgOfAllBooks() {
		double totalWeightOfBook = 0.0;
		Collection<Item> books = getCollectionOfItems();
		Iterator<Item> it = books.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			totalWeightOfBook = totalWeightOfBook + book.getWeightKg();
		}
		System.out.println("total kg of books: " + totalWeightOfBook);
	}

	/**
	 * @param dayOfTheWeek displayAllBooksWrittenByAuthorsBornOn
	 */
	public void displayAllBooksWrittenByAuthorsBornOn(String dayOfTheWeek) {
		if (dayOfTheWeek != null) {
			dayOfTheWeek = dayOfTheWeek.toUpperCase().charAt(0) + dayOfTheWeek.substring(1).toLowerCase();
			Collection<Item> books = getCollectionOfItems();
			Iterator<Item> it = books.iterator();
			boolean authorBorn = false;
			while (it.hasNext()) {
				Book book = (Book) it.next();
				if (book.getAuthor().getBirthDate().getDayOfTheWeek().equals(dayOfTheWeek)) {
					System.out.println(book.getTitle() + " was written by " + book.getAuthor().getName().getLastName()
							+ ", who was born on a " + dayOfTheWeek);
					authorBorn = true;
				}
			}
			if (authorBorn == false) {
				System.out.println("No authors were born on a " + dayOfTheWeek);
			}
		}
	}

	/**
	 * @param dayOfTheWeek displayAllBooksPublishedOn
	 */
	public void displayAllBooksPublishedOn(String dayOfTheWeek) {
		if (dayOfTheWeek != null) {
			dayOfTheWeek = dayOfTheWeek.toUpperCase().charAt(0) + dayOfTheWeek.substring(1).toLowerCase();
			Collection<Item> books = getCollectionOfItems();
			Iterator<Item> it = books.iterator();
			boolean bookPublished = false;
			while (it.hasNext()) {
				Book book = (Book) it.next();
				if (book.getDatePublished().getDayOfTheWeek().equals(dayOfTheWeek)) {
					System.out.println(book.getTitle() + " was written by " + book.getAuthor().getName().getLastName()
							+ ", which was published on a " + dayOfTheWeek);
					bookPublished = true;
				}
			}
			if (bookPublished == false) {
				System.out.println("No books were published on a " + dayOfTheWeek);
			}
		}

	}

	/**
	 * method displayAllBooksWrittenByAuthorsWithAPseudonym
	 */
	public void displayAllBooksWrittenByAuthorsWithAPseudonym() {

		Collection<Item> books = getCollectionOfItems();
		Iterator<Item> it = books.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			String string = book.getAuthor().getPseudonym();
			if (string != null && !string.equals("")) {
				System.out.println(book.getAuthor().getName().getLastName() + " wrote " + book.getTitle() + " as "
						+ book.getAuthor().getPseudonym());
			}
		}

	}

	/**
	 * method displayBookWithBiggestPercentageMarkup
	 */
	public void displayBookWithBiggestPercentageMarkup() {
		Collection<Item> books = getCollectionOfItems();
		Iterator<Item> it = books.iterator();
		double biggestMarkup = 0.0;
		double temp;
		String title = null;
		String author = null;
		while (it.hasNext()) {
			Book book = (Book) it.next();
			temp = (book.getSuggestedRetailPriceDollars() - book.getManufacturingPriceDollars())
					/ book.getManufacturingPriceDollars();
			if (temp > biggestMarkup) {
				biggestMarkup = temp;
				title = book.getTitle();
				author = book.getAuthor().getName().getLastName();
			}
		}
		String str = String.format("%.14f", biggestMarkup * 100).substring(0, 17);
		System.out.println("Highest markup is " + str + "%, for " + title + " by " + author);
	}

	/**
	 * method displayAllBooksWrittenOutsideSpecialty
	 */
	public void displayAllBooksWrittenOutsideSpecialty() {
		Collection<Item> books = getCollectionOfItems();
		Iterator<Item> it = books.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (!book.getGenreString().equals(book.getAuthor().getGenre().getTheBookType())) {
				System.out.println(book.getAuthor().getName().getLastName() + " usually wrote "
						+ book.getAuthor().getGenre().getTheBookType() + " but wrote " + book.getTitle() + " which is "
						+ book.getGenreString());
			}

		}
	}

}
