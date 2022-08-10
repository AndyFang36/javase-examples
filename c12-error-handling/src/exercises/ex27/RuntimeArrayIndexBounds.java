package exercises.ex27;

public class RuntimeArrayIndexBounds {
	public static void main(String args[]) {
		char[] array = new char[10];
		try {
			array[10] = 'x';
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException(e);
		}
	}
}
