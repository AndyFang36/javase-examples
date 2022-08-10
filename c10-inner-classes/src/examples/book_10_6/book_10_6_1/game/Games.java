package examples.book_10_6.book_10_6_1.game;

public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move()) ;
	}

	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
}
