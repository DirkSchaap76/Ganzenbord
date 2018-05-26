package Ganzebord;

import java.util.Random;

public class Dice {

	Random random = new Random((6) + 1);
	
	Dice dieOne = new Dice();
	Dice dieTwo = new Dice();
	

	public Dice throwDice() {
		dieOne.random.nextInt(5);
		return dieOne;
	}

}
