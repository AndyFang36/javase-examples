package examples.book_7_2.book_7_2_1;

class Game {
	Game(int i) {
		System.out.println("Game() Constructed");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame() Constructed");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(1);
		System.out.println("Chess() constructor");
	}

	public static void main(String[] args) {
		Chess c = new Chess();
	}
}
