package Ganzebord;

public class Board {

	;
	Player[][] board = new Player[63][63]; // not sure if I need this anymore

	void movePlayer(Player player, Dice dice) {

		// player position is changed on line ..
		// toDo: make change persistent:
		// player position should be: position + diceRoll = playerPosistion

		player.setPlayerPosition(dice.throwDice());
		System.out.println("Player " + player + ".");
		System.out.println("player position is" + player.getPlayerPosition());

	}

}
