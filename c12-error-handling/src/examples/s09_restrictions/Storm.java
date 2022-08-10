package examples.s09_restrictions;

interface Storm {
	public void event() throws RainedOut;

	public void rainHard() throws RainedOut;
}
