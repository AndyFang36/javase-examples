package exercises.e19;

import java.util.Random;

import static net.mindview.util.Print.*;

interface Game {
	void play();
}

interface GameFactory {
	Game getGame();
}

class CoinToss implements Game {
	Random rand = new Random();

	@Override
	public void play() {
		print("Toss Coin: ");
		switch (rand.nextInt(2)) {
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
}

class CoinTossFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new CoinToss();
	}
}

class DiceThrow implements Game {
	Random rand = new Random();

	@Override
	public void play() {
		print("Throw Dice: " + (rand.nextInt(6) + 1));
	}
}

class DiceThrowFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new DiceThrow();
	}
}

public class Games {
	public static void playGame(GameFactory factory) {
		Game g = factory.getGame();
		g.play();
	}

	public static void main(String[] args) {
		playGame(new CoinTossFactory());
		playGame(new DiceThrowFactory());
	}
}
