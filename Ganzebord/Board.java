package Ganzebord;

public class Board {

	/*
	 * responsibilities of Board class: move players around check if players land on
	 * positions with special rules
	 */

	Player[][] board = new Player[63][63]; // not sure if I need this anymore

	void movePlayer(Player player, Dice dice) {

		// player position is changed on line 18
		// toDo: make change persistent:
		// player position should be: position + diceRoll = playerPosistion

		player.setPlayerPosition(dice.throwDice());
		// setPlayerPosition() is now locked to throwDice(), this is not the desired
		// outcome...
		// desired outcome is: playerPosition = playerPosition + throwDice...
		// problem: I don't know how to achieve this.
		System.out.println("Player " + player.getPlayerName() + ".");
		System.out.println("player position is: " + player.getPlayerPosition());

	}

	// future goal:

	/*
	 * if(playerPosition == someSpecialPosition) { 
	 * 
	 * 		do special stuff as explained by the rules; 
	 * 
	 * }
	 * 
	 */

}
