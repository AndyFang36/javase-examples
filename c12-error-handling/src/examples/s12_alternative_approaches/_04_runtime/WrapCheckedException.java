package examples.s12_alternative_approaches._04_runtime;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
				case 0:
					throw new FileNotFoundException();
				case 1:
					throw new IOException();
				case 2:
					throw new RuntimeException("Where am I?");
				default:
			}
		} catch (Exception e) { // Adapt to unchecked:
			throw new RuntimeException(e);
		}
	}
}