package exercises.ex21;

public class BaseWithException {
	public BaseWithException() throws MyException {
		throw new MyException("thrown by BaseWithException");
	}
}
