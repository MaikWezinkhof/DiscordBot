package novaz.games;

/**
 * a turn in a game
 */
public abstract class GameTurn {

	public GameTurn() {

	}

	abstract public boolean parseInput(String input);

	abstract public String getInputErrorMessage();
}