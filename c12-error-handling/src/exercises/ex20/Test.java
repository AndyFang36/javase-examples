package exercises.ex20;

public class Test {
	public static void main(String[] args) {
		// Same code as before, still catches
		// the new exception:
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic error");
		}
		// Strike not thrown in derived version.
		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// Or you can add code to catch the
		// specific type of exception:
		try {
			StormyInning si = new StormyInning();
			si.atBat();
			si.decision();
		} catch (PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (UmpireArgument e) {
			System.out.println("Argument with the umpire");
		} catch (BaseballException e) {
			System.out.println("Generic error");
		}
	}
}
