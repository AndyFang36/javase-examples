package examples.s08_finally;

public class FinallyWorks {
	private static int count = 0;

	public static void main(String[] args) {
		while (true) {
			try {
				// post-increment is 0 first time
				if (count++ == 0)
					throw new ThreeException();
				else
					System.out.println("No exception");
			} catch (ThreeException te) {
				System.out.println("ThreeException");
			} finally {
				System.out.println("In finally clause");
				if (count == 2){
					System.out.println("count = 2");
					break; //out of while
				}
			}
		}
	}
}
