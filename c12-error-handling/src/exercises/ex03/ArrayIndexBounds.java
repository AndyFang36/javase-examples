package exercises.ex03;

public class ArrayIndexBounds {
	public static void main(String[] args) {
		int[] ints = new int[10];
		try {
			ints[10] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e = " + e);
		}
	}
}
