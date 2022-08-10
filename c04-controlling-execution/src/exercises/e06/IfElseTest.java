// TIJ4 Chapter Control, Exercise 6, page 144
/* Modify the two test() methods in the previous two programs so that they take
 * two extra arguments begin and end, and so that guess is tested to see if it
 * is within the range between (and including) begin and end.
 */
package exercises.e06;

import static net.mindview.util.Print.*;

public class IfElseTest {
	static int test(int guess, int begin, int end) {
		if (end < begin) {
			print("end cannot be < begin");
			return 0;
		}
		if ((guess >= begin) && (guess <= end))
			return +1;
		if (guess < begin)
			return -1;
		print("exceptional case");
		return 13;
	}

	public static void main(String[] args) {
		print(test(10, 5, 4));
		print(test(5, 4, 10));
		print(test(5, 5, 6));
		print(test(10, 5, 7));
		print(test(5, 5, 5));
	}
}