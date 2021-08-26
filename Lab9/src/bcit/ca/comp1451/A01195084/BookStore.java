package bcit.ca.comp1451.A01195084;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Kulwinder Singh & Sunggeon Kim
 * @version 1.3
 *
 */
public class BookStore {
	private ArrayList<Book> book;
	
	
	public BookStore() {
		book = new ArrayList<Book>();
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param titleOfTheBook
	 * @param yearPublished
	 * @throws InvalidBookDateException
	 * @throws InvalidArgumentException
	 */
	public void addBook(String firstName, String lastName, String titleOfTheBook, int yearPublished) throws InvalidArgumentException,InvalidBookDateException
	{
	   book.add(new Book(new Name(firstName, lastName),titleOfTheBook, yearPublished));	
	}
	

	/**
	 * method display books
	 */
	public void displayBooks() {
     if(book!= null) {
    	 for(Book bs : book) {
    		 System.out.println(bs.toString());
    	 }
    	 Collections.sort(book);
    	 System.out.println("-------------------");
    	 for(Book bs : book) {
    		 System.out.println(bs.toString());
    	 }
     }

	}
	}
