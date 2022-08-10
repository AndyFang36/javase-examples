package examples.s01_safe_type;

import java.util.ArrayList;

public class WithoutGenerics {
	@SuppressWarnings("Unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		// Not prevented from adding an Orange to apples:
		apples.add(new Orange());
		for (Object apple : apples)
			((Apple) apple).id();
		// Orange is detected only at run time
	}
}