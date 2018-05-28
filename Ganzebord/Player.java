package Ganzebord;

public class Player {
	// fields
	private String playerName;

	// getters and setters
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	// constructor(s)

	public Player() {
		System.out.println("no name was entered.");
	}

	public Player(String nameIn) {
		this.playerName = nameIn;
		System.out.println("Playername is: " + nameIn);
	}
}
