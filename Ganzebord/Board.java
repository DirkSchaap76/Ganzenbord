package Ganzebord;

public class Board {

	// players move on the board
	// players aren't integers
	// change board from int[] to Player[]

	// int[] board = new int[63];
	Player[][] board = new Player[63][63];

	void movePlayer(Player player, Dice dice) {
		dice.throwDice();
	    board[dice.throwDice()][0] = player; // this line works, it moves player to index[sum of dice roll]

		// test prints
		System.out.println("The dice have been cast.");
		System.out.println("The following player is on the board: " + board[dice.throwDice()][0].getPlayerName()); // this line give a nullPointerException
		System.out.println("This method will move players on the board");

	}

}
