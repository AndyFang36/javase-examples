package exercises.e06;

import others.Ex5;

public class Test implements Ex5 {
	@Override
	public void sayOne() {
		System.out.println("one");
	}

	@Override
	public void sayTwo() {
		System.out.println("two");
	}

	@Override
	public void sayThree() {
		System.out.println("three");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.sayOne();
		test.sayTwo();
		test.sayThree();
	}
}
