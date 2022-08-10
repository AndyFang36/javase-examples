package examples.s02.book_6_2_4;

import others.Cookie;

public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		//! bite(); can't access
	}

	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}
}
