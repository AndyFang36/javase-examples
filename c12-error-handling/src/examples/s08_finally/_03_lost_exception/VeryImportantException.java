package examples.s08_finally._03_lost_exception;

public class VeryImportantException extends Exception{
	@Override
	public String toString() {
		return "A Very Important Exception!";
	}
}
