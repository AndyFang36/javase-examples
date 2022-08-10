package exercises.ex02;

import java.util.ArrayList;
import java.util.List;

public class RepairRecursion {
	@Override
	public String toString() {
		return " RepairInfinite address: " + super.toString() + "\n";
	}

	public static void main(String[] args) {
		List<RepairRecursion> v = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			v.add(new RepairRecursion());
		System.out.println(v);
	}
}
