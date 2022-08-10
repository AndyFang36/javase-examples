package examples.s09_restrictions;

abstract class Inning {
	Inning() throws BaseballException {
	}

	public void event() throws BaseballException {
		// Doesn’t actually have to throw anything
	}

	abstract void atBat() throws Strike, Foul;

	void walk() {
	} // Throws no checked exceptions
}
