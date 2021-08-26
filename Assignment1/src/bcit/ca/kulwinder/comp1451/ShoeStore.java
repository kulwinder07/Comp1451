package bcit.ca.kulwinder.comp1451;
import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author kulwinder singh
 * @version 1.0
 *
 */
public class ShoeStore extends Store {
	private ShoeType department;
	
	/**
	 * @param streetAddress
	 * @param name
	 * @param department
	 */
	public ShoeStore(Address streetAddress, String name, ShoeType department) {
		super(streetAddress, name);
		this.department = department;
		addShoes();
	}
	
	/**
	 * @param streetAddress
	 * @param name
	 * @param department
	 */
	public ShoeStore(Address streetAddress, String name, String department) {
		super(streetAddress, name);
		this.department = ShoeType.get(department);
		addShoes();
	}

	
	/**
	 * @return department
	 */
	public ShoeType getDepartment() {
		return department;
	}

	/**
	 * @param department
	 */
	public void setDepartment(ShoeType department) {
		this.department = department;
	}

	/**
	 * method add shoes
	 */
	private void addShoes() {
		Name designer = new Name("Sketchers");
        ShoeType department = ShoeType.get("men");
        Shoe s = new Shoe(1, 58.5, 90, "Diameter", Material.LEATHER, 10, designer, department, Color.DARK_GRAY);
        addItem(s);

        designer = new Name("Robert", "Cobbler");
        department = ShoeType.get("dress");
        s = new Shoe(1.15, 104, 160, "Wave", Material.LEATHER, 12, designer, department, Color.BLACK);
        addItem(s);

        designer = new Name("Geox");
        department = ShoeType.get("men");
        s = new Shoe(1, 110.5, 170, "Monet", Material.CLOTH, 7, designer, department, Color.BLUE);
        addItem(s);

        designer = new Name("Nine", "West");
        department = ShoeType.get("women");
        s = new Shoe(0.85, 84.5, 130, "Camya Multi Glitter", Material.PLASTIC, 8, designer, department, Color.BLACK);
        addItem(s);

        designer = new Name("Geox");
        department = ShoeType.get("women");
        s = new Shoe(0.9, 97.5, 150, "Marieclaire", Material.PLASTIC, 10, designer, department, Color.GRAY);
        addItem(s);

        designer = new Name("Stride", "Rite");
        department = ShoeType.get("children");
        s = new Shoe(0.6, 45.5, 70, "Balance Of The Force", Material.RUBBER, 9, designer, department, Color.GRAY);
        addItem(s);

        designer = new Name("Sperry");
        department = ShoeType.get("children");
        s = new Shoe(0.7, 39, 60, "Top-Sider Unisex Bluefish H&L", Material.CLOTH, 9, designer, department, Color.ORANGE);
        addItem(s);

        designer = new Name("Sketchers");
        department = ShoeType.get("children");
        s = new Shoe(0.85, 32.5, 50, "Lite Kicks Rainbow Sprite", Material.PLASTIC, 10, designer, department, Color.PINK);
        addItem(s);

        designer = new Name("Robert", "Cobbler");
        department = ShoeType.get("children");
        s = new Shoe(0.5, 39, 60, "Toachi", Material.CLOTH, 5, designer, department, Color.BLUE);
        addItem(s);

        designer = new Name("Nike");
        department = ShoeType.get("sports");
        s = new Shoe(1.2, 117, 180, "Jordan Ace 23 II", Material.RUBBER, 13, designer, department, Color.WHITE);
        addItem(s);
					
	}
	
	public void displayAllShoesAndDesigners() {
		 Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        System.out.println(shoe.getDesigner().getFullName()+" offers " + shoe.getMaterial().getTheMaterial()
	        		+ " size-" + shoe.getSize() +" "+shoe.getShoeType().getTheShoeType()+ "'s " + shoe.getDescription());
	      }
	}

	
	/**
	 * @param designerName displayAllShoesByDesigner
	 */
	public void displayAllShoesByDesigner(String designerName) {
		 Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        if(shoe.getDesigner().getFullName().equals(designerName)) {
	        	System.out.println(shoe.getDesigner().getFullName()+ " offers a size-"+ shoe.getSize()
	        	+" "+ shoe.getShoeType().getTheShoeType()+ "'s " + shoe.getDescription() );
	        	}
	        }
		
	}
	
	/**
	 * @param material displayAllShoesMadeOf
	 */
	public void displayAllShoesMadeOf(Material material) {
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        if(shoe.getMaterial().equals(material)) {
	        	System.out.println("The size-" + shoe.getSize() +" " +shoe.getDescription() + " is made of "
	        +shoe.getMaterial().getTheMaterial());
	        	}
	        }
		
	}
	
	/**
	 * @param material displayAllShoesMadeOf
	 */
	public void displayAllShoesMadeOf(String material) {
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        if(shoe.getMaterial().getTheMaterial().equals(material)) {
	        	System.out.println("The size-" + shoe.getSize() + " " +shoe.getDescription() + " is made of "
	        +shoe.getMaterial().getTheMaterial());
	        }
	}

}
	
	/**
	 * @param designer displayNumberOfShoesDesignedBy
	 */
	public void displayNumberOfShoesDesignedBy(Name designer) {
		if(designer!= null) {
		int number = 0;
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        if(shoe.getDesigner().getFullName().equals(designer.getFullName())) {
	        	number++;
	        	
	        }
	      }
	      System.out.println("This store has " + number + " shoes designed by "+ designer.getFullName());
	}
	}
	
	/**
	 * @param designerLastName displayNumberOfShoesDesignedBy
	 */
	public void displayNumberOfShoesDesignedBy(String designerLastName) {
		if(designerLastName!= null) {
		int number = 0;
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        if(shoe.getDesigner().getLastName().equals(designerLastName)) {
	        	number++;
	        	
	        }
	      }
	      System.out.println("This store has " + number+ " shoes designed by "+ designerLastName);
	}
	}
	
	/**
	 * method displaySmallestShoeSize
	 */
	public void displaySmallestShoeSize () {
		int smallSizeShoe = 99;
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        if(shoe.getSize()<= smallSizeShoe) {
	        	smallSizeShoe = shoe.getSize();
	        	
	        }
	      }
	      System.out.println("smallest shoe size: " + smallSizeShoe);
	}
	
	/**
	 * method displayTotalWeightKgOfAllShoes
	 */
	public void displayTotalWeightKgOfAllShoes() {
		double totalWrightOfShoes = 0.0;
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        totalWrightOfShoes = totalWrightOfShoes + shoe.getWeightKg();
	      }
	      System.out.println("total kg of shoes: " + totalWrightOfShoes);
	}
	
	/**
	 * @param m
	 * @param designer
	 */
	public void displayAllShoesOfThisMaterialMadeByThisDesigner(Material m, Name designer) {
		if(m!= null && designer!= null) {
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it 		= shoes.iterator();
	      boolean isMade = false;
	      while(it.hasNext()){
	    	  Shoe shoe = (Shoe)it.next();
	    	  if(shoe.getMaterial().equals(m) && shoe.getDesigner().getFullName().equals(designer.getFullName())) {
	            System.out.println("The " + shoe.getDescription() + " is a "+ shoe.getMaterial().getTheMaterial()
	            		+" shoe offered by " +shoe.getDesigner().getFullName());
	            isMade = true;
	    	  }
	      }
	      if(isMade== false) {
	    		  System.out.println("This store has no " + m.getTheMaterial()+" shoes designed by " + designer.getFullName());
	    
	    		  
	    	  }
	      }
	      }
	
	/**
	 * method displayAllShoesNotInMatchingStore
	 */
	public void displayAllShoesNotInMatchingStore() {
		Collection<Item> shoes 	= getCollectionOfItems(); 
	      Iterator<Item> it     = shoes.iterator();
	      while(it.hasNext()){
	        Shoe shoe = (Shoe)it.next();
	        if(!shoe.getShoeType().equals(this.department)) {
	        	System.out.println("The " + shoe.getDescription()+" is a " + shoe.getShoeType().getTheShoeType()
	        			+"'s shoe offered by "+ shoe.getDesigner().getFullName());
	        }

	      }
		
	}

}


