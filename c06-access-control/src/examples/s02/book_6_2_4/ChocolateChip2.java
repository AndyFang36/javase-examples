package examples.s02.book_6_2_4;

import others.Cookie2;

public class ChocolateChip2 extends Cookie2 {
	public ChocolateChip2() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		bite();
	}

	public static void main(String[] args) {
		ChocolateChip2 x = new ChocolateChip2();
		x.chomp();
	}
}
