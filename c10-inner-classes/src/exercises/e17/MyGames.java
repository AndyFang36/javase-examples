package exercises.e17;

import java.util.Random;

import static net.mindview.util.Print.*;

class CoinToss implements Games {
	private final Random r = new Random();

	@Override
	public void play() {
		print("Toss Coin: ");
		switch (r.nextInt(2)) {
			case 0:
				print("Heads");
				return;
			case 1:
				print("Tails");
				return;
			default:
				print("OnEdge");
		}
	}

	public static GamesFactory factory = new GamesFactory() {
		@Override
		public Games getGames() {
			return new CoinToss();
		}
	};
}

class DiceThrow implements Games {
	private final Random r = new Random();

	@Override
	public void play() {
		print("Throw Dice: " + (r.nextInt(6) + 1));
	}

	public static GamesFactory factory = new GamesFactory() {
		@Override
		public Games getGames() {
			return new DiceThrow();
		}
	};
}
