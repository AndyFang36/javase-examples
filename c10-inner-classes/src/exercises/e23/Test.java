package exercises.e23;

import static net.mindview.util.Print.*;

public class Test {
	public static void main(String[] args) {
		A[] aa = {new A(), new A(), new A(), new A()};
		B b = new B(2);
		print("-----add-----");
		for (A temp : aa)
			b.addToArray(temp.getU());
		print("-----show-----");
		b.show();
		print("-----clean-----");
		b.setNULL(1);
		print("-----show-----");
		b.show();
	}
}
