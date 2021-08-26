package bcit.ca.kulwinder.comp1451;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author kulwinder singh
 * @version 1.0
 *
 */
public class Store {
	private Address streetAddress;
	private String name;
	private HashMap<String, Item> itemsForSale;

	/**
	 * @param streetAddress
	 * @param name
	 */
	public Store(Address streetAddress, String name) {
		this.streetAddress = streetAddress;
		this.name = name;
		initItemsForSale();

	}

	/**
	 * method initItemsForSale
	 */
	private void initItemsForSale() {
		itemsForSale = new HashMap<String, Item>();

	}

	/**
	 * @return street address
	 */
	public Address getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress
	 */
	public void setStreetAddress(Address streetAddress) {
		if (streetAddress != null) {
			this.streetAddress = streetAddress;
		} else {
			throw new IllegalArgumentException("street address cannot be null");
		}
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("name cannot be null");
		}
	}

	/**
	 * @param item
	 */
	public void addItem(Item item) {
		if (item != null) {
			itemsForSale.put(item.getUniqueID(), item);
		}
	}

	/**
	 * @param uniqueID
	 * @return
	 */
	public Item getItemByKey(String uniqueID) {
		if (uniqueID != null) {
			return itemsForSale.get(uniqueID);
		} else {
			throw new IllegalArgumentException("uique id cannot be null");
		}
	}

	/**
	 * @return
	 */
	public Collection<Item> getCollectionOfItems() {

		return itemsForSale.values();
	}

}
