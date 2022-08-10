package exercises.e06;

public class ProtectedData {
	public static void main(String[] args) {
		SomeData x = new SomeData();
		System.out.println(x.a);
		DataChanger.change(x, 14);
		System.out.println("After change: a = "+x.a);
	}
}
