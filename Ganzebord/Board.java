package Ganzebord;

public class Board {

	/*
	 * responsibilities of Board class: move players around check if players land on
	 * positions with special rules
	 */

	Player[][] board = new Player[63][63]; // not sure if I need this anymore

	void movePlayer(Player player, Dice dice) {

		// player position is changed on line ..
		// toDo: make change persistent:
		// player position should be: position + diceRoll = playerPosistion

		int newPlayerPosition = player.getPlayerPosition() + dice.throwDice();
		player.setPlayerPosition(newPlayerPosition);
		System.out.println("Player " + player.getPlayerName() + ".");
		System.out.println("player position is: " + player.getPlayerPosition());

	}

}
