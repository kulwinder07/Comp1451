package bcit.ca.kulwinder.comp1451;


/**
 * @author kulwinder Singh
 * @version 1.0
 *
 */
public class ChessPiece {

	private boolean white;
	private int		value;
	
	/**
	 * Main Constructor
	 * @param white, boolean, true if white, false if black
	 * @param value, int, value of the chess piece
	 */
	public ChessPiece(boolean white, int value) 
	{
		this.white = white;
		this.value = value;
	}
	/**
	 * Getter
	 * @return the white, boolean, true if white, false if black
	 */
	public boolean isWhite() 
	{
		return white;
	}
	
	/**
	 * Setter
	 * @param white the white to set, true if white, false if black
	 */
	public void setWhite(boolean white) 
	{
		this.white = white;
	}
	
	/**
	 * Getter
	 * @return the value, int, value of the chess piece
	 */
	public int getValue() 
	{
		return value;
	}
	
	/**
	 * Setter
	 * @param value the value to set, int, value of the chess piece
	 */
	public void setValue(int value) 
	{
		this.value = value;
	}
	
	/**
	 * Method to print the movement of the chess piece
	 */

	public void move()
	{
		System.out.println("moving...");
	}
	
	/**
	 * Method to override the toString() method
	 */
	
	@Override
	public String toString()
	{
		if(white == true)
		{
			return "White " + this.getClass().getSimpleName();
		}
		else
		{
			return "Black " + this.getClass().getSimpleName();
		}
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	
	@Override
	   public boolean equals(Object obj)
	   {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChessPiece other = (ChessPiece) obj;
	           
	           if(getValue() - other.getValue() == 0)
	               return true;
	           else
	               return false;
	       
	   }

}
