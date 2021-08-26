package bcit.ca.kulwinder.comp1451;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kulwinder singh
 * @version 1.0
 *
 */
public enum ShoeType {
	WOMEN("women"),
	MEN("men"),
	CHILDREN("children"),
	SPORTS("sports"),
	DRESS("dress") ;
private String theShoeType;
	
	private static Map<String, ShoeType> lookup = new HashMap<String, ShoeType>();

    static{
        for (ShoeType b : ShoeType.values()){
            lookup.put(b.getTheShoeType(), b);
        }
    }
	
        
        private ShoeType(String theShoeType) {
		this.theShoeType = theShoeType;
	}

        public String getTheShoeType() {

        	return theShoeType;

        	}

        	public static ShoeType get(String theShoeType) {

        	return lookup.get(theShoeType);

        	}
}
