package examples.s08_finally._01_original_state;

public class WithFinally {
	private static final Switch sw = new Switch();

	public static void main(String[] args) {
		try {
			sw.on();
			// code that can throw exception...
			OnOffSwitch.f();
		} catch (OnOffException1 oe) {
			System.out.println("OnOffException1");
		} catch (OnOffException2 oe) {
			System.out.println("OnOffException2");
		} finally {
			sw.off();
		}
	}
}
