package exercises.ex04;

public class Test {
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.printItem("Jack's Magic Beans", 4, 4.25);
		receipt.printItem("Princess Peas", 3, 5.1);
		receipt.printItem("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}