package Ganzebord;

/*
 * Rules:
 * 
 * number   name         			meaning
 * **************************************************
 *			Dutch/English
 *		---------------------	 
 * 6		brug/bridge	 				Player go to position 12
 * 19		herberg/Inn					Skip a turn
 * 31		put/the well				who falls in the well, stays in the well until:
 * 																another player passes you by
 * 																Whoever arrives here continues his/her turn
 * 42		doolhof/ maze
 * 			doornstruik/thorn bush		Go back to 39
 * 52		gevangenis/prison			same as 31			
 * 58		dood/ dead(or death)		Go back to beginning of the board, and start over
 * 63		einde / the end				Who arrives here first wins the game! 
 * 					(of finish)
 * 
 * 
 * Op sommige hokjes staat een gans afgebeeld. Het zijn die van de negenvouden en de negenvouden minus vier, 
 * dus de hokjes 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59. Wie hierop terechtkomt, 
 * moet hetzelfde aantal ogen verder tellen. 
 * Het is dus niet mogelijk dat een speler zijn beurt beëindigt op een hokje met een gans.
 * 
 * Wie te veel ogen gooit en daardoor voorbij 63 zou spelen, moet vanaf 63 weer terugspelen. 
 * Dit vergroot het risico dat men op het gevreesde hokje 58 of 52 terechtkomt. 
 * Komt men bij het terugtellen op een hokje met een gans, dan telt men weer het gegooide aantal ogen terug. 
 * Wie bijvoorbeeld op 60 staat en 7 gooit, komt in de gevangenis.
 * 
 * Wie bij de eerste worp een 5 en een 4 gooit, gaat meteen door naar 53. 
 * Wie bij de eerste worp een 6 en een 3 gooit, gaat door naar 26. 
 * Als deze regel er niet was, zouden deze spelers, via de ganzen, meteen doorlopen naar het einde.
 * 
 */

public class Game {
	Board board;
	Player player;
	Dice dice;

	public static void main(String[] args) {

		/*
		 * FG -> move the player on the board
		 * 
		 * TS -> Create movePlayer() in Class Board
		 */

		Player playerOne = new Player("Piet");
		Board board = new Board();
		board.movePlayer();
		Dice dice = new Dice();
		dice.throwDice();

	}

}
