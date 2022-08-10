package exercises.ex20;

public class Scanner {
	public static void main(String[] args) {
		DataHolder dh = new DataHolder("1 10000000000000 1.1 1e55 Howdy Hi");
		System.out.println(dh.toString());
	}
}