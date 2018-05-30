package Ganzebord;

public class Player {
	// fields
	private String playerName;
	private int playerPosition;

	// getters and setters

	// getters and setters
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		this.playerPosition = playerPosition;

	}

	// constructor(s)

	public Player() {
		System.out.println("no name was entered.");
	}

	public Player(String nameIn) {
		this.playerName = nameIn;
		System.out.println("Playername is: " + nameIn);
	}

	public Player(String nameIn, int positionIn) {
		this.playerName = nameIn;
		this.playerPosition = positionIn;

	}

}
