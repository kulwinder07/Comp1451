package bcit.ca.comp1451.A01195084;

/**
 * @author Kulwinder Singh & Sunggeon Kim
 * @version 1.3
 *
 */

public class Main {

	/**
	 * @param args
	 * @throws InvalidBookDateException
	 * @throws InvalidArgumentException
	 */
	public static void main(String[] args) throws InvalidBookDateException, InvalidArgumentException {
		BookStore b = new BookStore();
		b.addBook("David", "Henry", "The notebook", 1990);
		b.addBook("Mike", "Hussy", "Math", 2000);
		b.addBook("Rahul", "Dravid", "Football", 1980);
		b.addBook("Patel", "Goyal", "Gadar", 2010);
		System.out.println("----------------");
        b.displayBooks();
        Name name = new Name("Math","Edition1");
        Name name2 = new Name("Physics","Edition4");
        
        Biography biography = new Biography(new Name("Brit","Lee"), "Applied Math", 2010, name);
        Biography biography2 = new Biography(new Name("Brit","Lee"), "Physics Dnymics", 2010, name2);
        System.out.println(biography.equals(biography2));
	}

}
