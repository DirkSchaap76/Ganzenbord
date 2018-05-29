package Ganzebord;

import java.util.Random;

public class Dice {

	public int throwDice() {
		Random random = new Random();
		int dieOne = 1 + random.nextInt(6);
		int dieTwo = 1 + random.nextInt(6);

		int sum = dieOne + dieTwo;
		System.out.println("Dice 1: " + dieOne);
		System.out.println("Dice 2: " + dieTwo);
		System.out.println("the sum of this roll is: " + sum);
		return sum;

	}// end of method

} // end of Class
