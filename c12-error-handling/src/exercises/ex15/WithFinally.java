package exercises.ex15;

import examples.s08_finally._01_original_state.OnOffException1;
import examples.s08_finally._01_original_state.OnOffException2;
import examples.s08_finally._01_original_state.Switch;

import static net.mindview.util.Print.*;

public class WithFinally {
	private static final Switch sw = new Switch();

	static void f() throws OnOffException1, OnOffException2 {
		throw new RuntimeException("Inside try");
	}

	public static void main(String[] args) {
		try {
			try {
				sw.on();
				// Code that can throw exceptions...
				f();
			} catch (OnOffException1 e) {
				print("OnOffException1");
			} catch (OnOffException2 e) {
				print("OnOffException2");
			} finally {
				sw.off();
			}
		} catch (RuntimeException e) {
			print("Exception '" + e + "'. Did the switch get turned off?");
			print(sw);
		}
	}
}
