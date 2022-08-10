package exercises.ex19;

import examples.s08_finally._03_lost_exception.HoHumException;
import examples.s08_finally._03_lost_exception.LostMessage;

public class GuardedLostMessage {
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				try {
					lm.dispose();
				} catch (HoHumException e) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
