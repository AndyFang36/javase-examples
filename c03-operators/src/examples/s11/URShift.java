// Test of unsigned right shift.
package examples.s11;

import static net.mindview.util.Print.*;

public class URShift {
	public static void main(String[] args) {
		int i = -1;
		print("i:\n" + Integer.toBinaryString(i));
		print("i >>>= 10:\n" + Integer.toBinaryString(i >>>= 10));
		print();

		long l = -1;
		print("l:\n" + Long.toBinaryString(l));
		print("l >>>= 10:\n" + Long.toBinaryString(l >>>= 10));
		print();

		char c = (char) -1;
		print("c:\n" + Integer.toBinaryString(c));
		c >>>= 10;
		print("c >>>= 10:\n" + Integer.toBinaryString(c));
		print();

		short s = -1;
		print("s:\n" + Integer.toBinaryString(s));
		s >>>= 10;
		print("s >>>= 10:\n" + Integer.toBinaryString(s));
		print();

		byte b = -1;
		print("b:\n" + Integer.toBinaryString(b));
		b >>>= 10;
		print("b >>>= 10:\n" + Integer.toBinaryString(b));
		print();

		b = -1;
		print(Integer.toBinaryString(b));
		print(Integer.toBinaryString(b >>> 10));
	}
}