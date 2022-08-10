package examples.book_10_6.book_10_6_1.game;

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}