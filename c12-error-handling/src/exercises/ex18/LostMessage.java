package exercises.ex18;

import examples.s08_finally._03_lost_exception.HoHumException;
import examples.s08_finally._03_lost_exception.VeryImportantException;

class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	void cleanup() throws YetAnotherException {
		throw new YetAnotherException();
	}
}