// TIJ4 Chapter Control, Exercise 5, page 140
/* Repeat exercise 10 from the last chapter using the ternary operator and a
 * bitwise test to display the ones and zeros, instead of Integer.toBinaryString()
 */
package exercises.e05;

import static net.mindview.util.Print.*;

public class BitTest {
	static int i = 1 + 4 + 16 + 64;
	static int j = 2 + 8 + 32 + 128;
	static int k = 0x100;
	static int m = 0;

	static void binaryPrint(int q) {
		if (q == 0)
			System.out.print(0);
		else {
			int nlz = Integer.numberOfLeadingZeros(q);
			q <<= nlz;
			for (int p = 0; p < 32 - nlz; p++) {
				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				System.out.print(n);
				q <<= 1;
			}
		}
		print();
	}

	public static void main(String[] args) {
		print("Using Integer.toBinaryString():");
		print("i = " + Integer.toBinaryString(i));
		print("j = " + Integer.toBinaryString(j));
		print("k = " + Integer.toBinaryString(k));
		print("m = " + Integer.toBinaryString(m));
		print("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
		print("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
		print("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
		print("~i = " + Integer.toBinaryString(~i));
		print("~j = " + Integer.toBinaryString(~j));

		System.out.print("\nUsing binaryPrint():");
		System.out.print("i = " + i + " = ");
		binaryPrint(i);
		System.out.print("j = " + j + " = ");
		binaryPrint(j);
		System.out.print("k = " + k + " = ");
		binaryPrint(k);
		System.out.print("m = " + m + " = ");
		binaryPrint(m);
		System.out.print("i & j = " + (i & j) + " = ");
		binaryPrint(i & j);
		System.out.print("i | j = " + (i | j) + " = ");
		binaryPrint(i | j);
		System.out.print("i ^ j = " + (i ^ j) + " = ");
		binaryPrint(i ^ j);
		System.out.print("~i = " + ~i + " = ");
		binaryPrint(~i);
		System.out.print("~j = " + ~j + " = ");
		binaryPrint(~j);
	}
}
