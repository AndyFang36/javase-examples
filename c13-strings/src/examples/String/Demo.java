package examples.String;

public class Demo {
	public static String upCase(String s) { return s.toUpperCase(); }

	public static void main(String[] args) {
		String s1 = "Hello, String!";
		System.out.println(s1);
		String s2 = upCase(s1);
		System.out.println(s2);
		System.out.println(s1);
	}
}