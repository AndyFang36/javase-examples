package examples.s08_finally._02_return;

import static net.mindview.util.Print.*;

public class MultipleReturns {
	static void f(int i) {
		print("Initialization that requires cleanup");
		try {
			print("point 1");
			if (i == 1) return;
			print("point 2");
			if (i == 2) return;
			print("point 3");
			if (i == 3) return;
			print("End");
		} finally {
			print("Performing cleanup");
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++)
			f(i);
	}
}
