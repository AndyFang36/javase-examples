package exercises.ex12;

interface Selector {
	boolean end();

	Object current();

	void next();
}