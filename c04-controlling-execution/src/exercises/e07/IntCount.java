// TIJ4 Chapter Control, Exercise 7, page 146
// Modify exercise 1 so that the program exits by using the break keyword at
// value 99. Try using return instead.
package exercises.e07;

import static net.mindview.util.Print.*;

public class IntCount {
	static void Count1(int n) {
		for (int i = 0; i < n; i++)
			printnb(i + " ");
	}

	static void Count2(int n) {
		for (int i = 0; i < n; i++) {
			printnb(i + " ");
			if (i == 7)
				break;
		}
	}

	static void Count3(int n) {
		for (int i = 0; i < n; i++) {
			printnb(i + " ");
			if (i == 7)
				return;
		}
	}

	public static void main(String[] args) {
		print("\nWay1: ");
		Count1(10);
		print("\nWay2: ");
		Count2(10);
		print("\nWay3: ");
		Count3(10);
	}
}