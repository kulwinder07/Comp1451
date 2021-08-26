package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class King extends ChessPiece {
private static final int VALUE = 1000;
	
	public King(boolean white) 
	{
		super(white, VALUE);
	}

	/**
	 * Method to override move from the parent class
	 */
	@Override
	public void move()
	{
		System.out.println("one square");
	}
	
	/**
	 * Method to override toString()
	 */
	@Override
	public String toString()
	{
		return super.toString() + "(" + this.getValue() + ")";

	}
	

}
