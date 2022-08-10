package exercises.ex20;

abstract class Inning {
	Inning() throws BaseballException {
	}

	public void event() throws BaseballException {
		// Doesn’t actually have to throw anything
	}

	abstract void atBat() throws Strike, Foul, UmpireArgument;

	abstract void decision() throws UmpireArgument;

	void walk() {
	} // Throws no checked exceptions
}
