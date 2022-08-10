package examples.s08_finally._01_original_state;

public class OnOffSwitch {
	private static final Switch sw = new Switch();

	static void f() throws OnOffException1, OnOffException2 {
	}

	public static void main(String[] args) {
		try {
			sw.on();
			// code that can throw exception...
			f();
			sw.off();
		} catch (OnOffException1 oe) {
			System.out.println("OnOffException1");
			sw.off();
		} catch (OnOffException2 oe) {
			System.out.println("OnOffException2");
			sw.off();
		}
	}
}
