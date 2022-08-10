package exercises.ex07;

class IDClass {
	private static int counter;
	private final int count = counter++;

	@Override
	public String toString() {
		return "IDClass " + count;
	}
}