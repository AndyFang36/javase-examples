package examples.s09_restrictions;

public class StormyInning extends Inning implements Storm {
	// OK to add new exceptions for constructors, but you
	// must deal with the base constructor exceptions:
	StormyInning() throws RainedOut, BaseballException {
	}

	StormyInning(String s) throws Foul, BaseballException {
	}

	// Regular methods must conform to base class:
	//! void walk() throws PopFoul {} //Compile error
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
	//! public void event() throws RainedOut {}
	// If the method doesn’t already exist in the
	// base class, the exception is OK:
	@Override
	public void rainHard() throws RainedOut {
	}

	// You can choose to not throw any exceptions,
	// even if the base version does:
	@Override
	public void event() {
	}

	// Overridden methods can throw inherited exceptions:
	@Override
	public void atBat() throws PopFoul {
	}

	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// Strike not thrown in derived version.
		try {
			// What happens if you upcast?
			Inning i = new StormyInning();
			i.atBat();
			// You must catch the exceptions from the
			// base-class version of the method:
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}
