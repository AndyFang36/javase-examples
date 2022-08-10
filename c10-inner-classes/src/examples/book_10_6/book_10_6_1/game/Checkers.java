package examples.book_10_6.book_10_6_1.game;

class Checkers implements Game {
	private Checkers() {
	}

	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}

	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Checkers();
		}
	};
}
