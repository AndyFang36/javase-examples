package exercises.e23;

import static net.mindview.util.Print.*;

class B {
	U[] ua;
	private int index = 0;

	public B(int size) {
		ua = new U[size];
	}

	public void addToArray(U elem) {
		if (index < ua.length) {
			if (ua[index] == null) {
				ua[index] = elem;
				++index;
			}
		} else {
			print("Value out of bounds!");
		}
	}

	public void setNULL(int i) {
		if (i >= 0 & i < ua.length) {
			ua[i] = null;
			print("ua[" + i + "] is cleaned");
		} else {
			print("Value out of bounds!");
		}

	}

	public void show() {
		for (U temp : ua) {
			if (temp != null) {
				temp.f();
				temp.g();
				temp.h();
			}
			print();
		}
	}
}
