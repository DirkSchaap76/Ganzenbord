package Ganzebord;

public class Board {

	// players move on the board
	// players aren't integers
	// change board from int[] to Player[]

	// int[] board = new int[63];
	Player[][] board = new Player[63][63];

	void movePlayer(Player player, Dice dice) {
		dice.throwDice();
		System.out.println("The dice have been cast.");
		board[10][0] = player;
		System.out.println("The following player is on the board: " + board[10][0].getPlayerName());
		System.out.println("This method will move players on the board");
	}

}
