package examples.s05;

import java.util.Random;

import static net.mindview.util.Print.*;

public class MathOps {
	public static void main(String[] args) {
		int i, j, k;
		// Create a seeded random number generator:
		Random rand = new Random(47);
		// Choose value from 1 to 100:
		j = rand.nextInt(100) + 1;
		print("j = " + j);
		k = rand.nextInt(100) + 1;
		print("k = " + k);
		i = j + k;
		print("j + k = " + i);
		i = j - k;
		print("j - k = " + i);
		i = k / j;
		print("k / j = " + i);
		i = k * j;
		print("k * j = " + i);
		i = k % j;
		print("k % j = " + i);
		j %= k;
		print("j %= k = " + j);

		print("\nFloating-point number tests:");
		// Applies to doubles, too
		float u, v, w;
		v = rand.nextFloat();
		print("v = " + v);
		w = rand.nextFloat();
		print("w = " + w);
		u = v + w;
		print("v + w = " + u);
		u = v - w;
		print("v - w = " + u);
		u = v * w;
		print("v * w = " + u);
		u = v / w;
		print("v / w = " + u);
		/* The following also works for char, byte, short, int, long, and double. */
		u += v;
		print("u += v : " + u);
		u -= v;
		print("u -= v : " + u);
		u *= v;
		print("u *= v : " + u);
		u /= v;
		print("u /= v : " + u);
	}
} 