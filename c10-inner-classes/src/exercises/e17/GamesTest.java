package exercises.e17;

public class GamesTest {
	public static void playGame(GamesFactory factory) {
		Games g = factory.getGames();
		g.play();
	}

	public static void main(String[] args) {
		playGame(CoinToss.factory);
		playGame(DiceThrow.factory);
	}
}
