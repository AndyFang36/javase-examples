/*
*********************************************
Demonstrate that a derived-class constructor
cannot catch exceptions thrown by its
base-class constructor.
*********************************************
*/
package exercises.ex21;

public class ConstructorExceptions {
	public static void main(String[] args) {
		try {
			new DerivedWE();
		} catch (MyException mE) {
			System.out.println("Caught " + mE);
		}
	}
}
