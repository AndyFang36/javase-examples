package examples.s08_finally._03_lost_exception;

public class LostMessage {
	public void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	public void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				lm.dispose();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
