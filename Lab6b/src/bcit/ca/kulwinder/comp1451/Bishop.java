package bcit.ca.kulwinder.comp1451;

/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class Bishop extends ChessPiece {
private static final int VALUE = 3;
	
	public Bishop(boolean white) 
	{
		super(white, VALUE);

	}
	
	/**
	 * Method to override move from the parent class
	 */
	@Override
	public void move()
	{
		System.out.println("diagonally");
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
