package exercises.ex20;

public class StormyInning extends Inning implements Storm {
	StormyInning() throws RainedOut, BaseballException {
	}

	StormyInning(String s) throws Foul, BaseballException {
	}

	@Override
	public void rainHard() throws RainedOut {
	}

	@Override
	public void event() {
	}

	@Override
	void atBat() throws PopFoul, UmpireArgument {
		throw new UmpireArgument();
	}

	@Override
	void decision() throws UmpireArgument {
		throw new UmpireArgument();
	}
}
