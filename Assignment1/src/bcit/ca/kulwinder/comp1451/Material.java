package bcit.ca.kulwinder.comp1451;

import java.util.HashMap;
import java.util.Map;


/**
 * @author kulwinder singh
 * @version 1.0
 *
 */
public enum Material {
	PLASTIC("plastic"),
	LEATHER("leather"),
	RUBBER("rubber"),
	CLOTH("cloth");

	private String theMaterial;

	private static Map<String, Material> lookup = new HashMap<String, Material>();

	static {
		for (Material b : Material.values()) {
			lookup.put(b.getTheMaterial(), b);
		}
	}

	private Material(String theMaterial) {
		this.theMaterial = theMaterial;
	}

	public String getTheMaterial() {

		return theMaterial;
    }
	

	public static Material get(String theMaterial) {
		return lookup.get(theMaterial);

	}

}
