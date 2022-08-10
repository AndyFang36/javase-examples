package examples.s08;

class other {
	public static void main(String[] args) {
		for (String s : args)
			System.out.println(s + " ");
	}
}

public class DynamicArray {
	public static void main(String[] args) {
		other.main(new String[]{"one", "two", "three"});
	}
}
