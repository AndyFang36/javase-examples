package examples.s01.book_6_1_3;

import static others.Range.*;

public class RangeTest {
	public static void main(String[] args) {
		int[] array1 = range(10);
		int[] array2 = range(0, 10);
		int[] array3 = range(0, 10, 2);
		for (int value : array1) {
			System.out.print(value + " ");
		}
		System.out.println();
		for (int value : array2) {
			System.out.print(value + " ");
		}
		System.out.println();
		for (int value : array3) {
			System.out.print(value + " ");
		}
	}
}
