package bcit.ca.kulwinder.comp1451;

import java.awt.Color;

/**
 * @author kulwinder singh
 * @version 1.0
 *
 */
public class Shoe extends Item{
	
	private Material material;
	private int size;
	private Name designer;
	private ShoeType shoeType;
	private Color color;
	
	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollars
	 * @param uniqueID
	 * @param material
	 * @param size
	 * @param designer
	 * @param shoeType
	 * @param color
	 */
	public Shoe(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars,
			String uniqueID, Material material, int size, Name designer, ShoeType shoeType, Color color) {
		super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars, uniqueID);
		this.material = material;
		this.size = size;
		this.designer = designer;
		this.shoeType = shoeType;
		this.color = color;
	}

	/**
	 * @return material
	 */
	public Material getMaterial() {
		return material;
	}

	/**
	 * @param material
	 */
	public void setMaterial(Material material) {
		if(material!= null) {
		this.material = material;
		}else {
			throw new IllegalArgumentException("material cannot be null");
		}
	}

	/**
	 * @return size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(int size) {
		if(size >0) {
		this.size = size;
		}else {
			throw new IllegalArgumentException("size cannot be zero");
		}
	}

	/**
	 * @return designer
	 */
	public Name getDesigner() {
		return designer;
	}

	/**
	 * @param designer
	 */
	public void setDesigner(Name designer) {
		if(designer!= null) {
		this.designer = designer;
		}else {
			throw new IllegalArgumentException("designer cannot be null");
		}

	}

	/**
	 * @return shoe type
	 */
	public ShoeType getShoeType() {
		return shoeType;
	}

	/**
	 * @param shoeType
	 */
	public void setShoeType(ShoeType shoeType) {
		if(shoeType!= null) {
		this.shoeType = shoeType;
		}else {
			throw new IllegalArgumentException("shoe type cannot be null");
		}
             
	}

	/**
	 * @return color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color
	 */
	public void setColor(Color color) {
		if(color!= null) {
		this.color = color;
		}else {
			throw new IllegalArgumentException("color cannot be null");
		}
	}
	
	/**
	 * @param description
	 */
	public void setDescription(String description) {
		if(description!= null && !description.isEmpty()) {
		this.setUniqueID(description);
	}else {
		throw new IllegalArgumentException("Invalid shoe description");
	}
	}
	
	/**
	 * @return unique id
	 */
	public String getDescription() {
		return this.getUniqueID();
	}

}
