package Ganzebord;

import java.util.Random;

public class Dice {

	public void throwDice() {
		Random random = new Random((6) + 1);
		int dieOne = random.nextInt((6) + 1);
		int dieTwo = random.nextInt((6) + 1);
		System.out.println("Dice 1: " + dieOne);
		System.out.println("Dice 2: " + dieTwo);

	}// end of method

} // end of Class
