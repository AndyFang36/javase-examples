package exercises.ex14;

import examples.s08_finally._01_original_state.OnOffException1;
import examples.s08_finally._01_original_state.OnOffException2;
import examples.s08_finally._01_original_state.Switch;

import static net.mindview.util.Print.*;

public class OnOffSwitch {
	private static final Switch sw = new Switch();

	static void f() throws OnOffException1, OnOffException2 {
		throw new RuntimeException("Inside try");
	}

	public static void main(String[] args) {
		print("1st try");
		try {
			print("2nd try");
			try {
				sw.on();
				// Code that can throw exceptions...
				f();
				sw.off();
			} catch (OnOffException1 e) {
				print("OnOffException1");
				sw.off();
			} catch (OnOffException2 e) {
				print("OnOffException2");
				sw.off();
			}
		} catch (RuntimeException e) {
			print(sw);
			print("Oops! the exception '" + e + "' slipped through without " + "turning the switch off!");
		}
	}
}
