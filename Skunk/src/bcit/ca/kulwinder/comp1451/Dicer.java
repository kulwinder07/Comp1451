package bcit.ca.kulwinder.comp1451;

import java.util.Random;

public class Dicer {
   private static final int MINIMUM_NUMBER=1;
   private static final int MAXIMUM_NUMBER=6;
   
   private int numbers;
   
   public Dicer(int numbers) {
	   this.numbers = numbers;
	   
   }

public Dicer() {
	// TODO Auto-generated constructor stub
}

public int getNumbers() {
	return numbers;
}

public void setNumbers(int numbers) {
	if(numbers>=MINIMUM_NUMBER &&  numbers<=MAXIMUM_NUMBER ) {
	this.numbers = numbers;
	}else {
		throw new IllegalArgumentException("invalid number");
	}
}
   
   public void RollingTheDice() {
	   Random ran = new Random();
	   numbers = ran.nextInt(MAXIMUM_NUMBER)+MINIMUM_NUMBER;
	   setNumbers(numbers);
   }
   
}
