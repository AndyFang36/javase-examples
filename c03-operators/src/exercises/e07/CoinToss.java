package exercises.e07;

import java.util.Random;

import static net.mindview.util.Print.*;

public class CoinToss {
	public static void main(String[] args) {
		Random random = new Random();
		int coin = random.nextInt();
		if (coin % 2 == 0)
			print("Heads");
		else
			print("tails");
	}
}
