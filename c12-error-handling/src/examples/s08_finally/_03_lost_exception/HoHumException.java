package examples.s08_finally._03_lost_exception;

public class HoHumException extends Exception {
	@Override
	public String toString() {
		return "A trivial exception";
	}
}
