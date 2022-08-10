package examples.s11_matching;

public class Human {
	public static void main(String[] args) {
		// catch the exact type:
		try {
			throw new Sneeze();
		} catch (Sneeze s) {
			System.out.println("Caught Sneeze");
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
		// catch the base type:
		try {
			throw new Sneeze();
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
	}
}
