package exercises.e18;

public class Ex18 {
	Ex18() {
		System.out.println("Ex18()");
	}

	public static class Ex18Nest1 {
		Ex18Nest1() {
			System.out.println("Ex18Nest1()");
		}
	}

	private static class Ex18Nest2 {
		Ex18Nest2() {
			System.out.println("Ex18Nest2()");
		}
	}

	public static void main(String[] args) {
		Ex18Nest1 en1 = new Ex18Nest1();
		Ex18Nest2 en2 = new Ex18Nest2();
	}
}
