package others;

public interface Ex5 {
	// Error: cannot assign weaker access to public methods:
	// void sayOne() { System.out.println("one"); }
	// protected void sayTwo() { System.out.println("two"); }
	// private void sayThree() { System.out.println("three"); }
	// must be maintained public:
	public void sayOne();

	public void sayTwo();

	public void sayThree();
}
