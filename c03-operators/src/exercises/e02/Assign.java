//: operators/Assign.java
// TIJ4 Chapter Operators, Exercise 2, page 97 
// Create a class containing a float and use it to demonstrate aliasing
package exercises.e02;

import static net.mindview.util.Print.*;

public class Assign {
	public static void main(String[] args) {
		Tube t1 = new Tube();
		Tube t2 = new Tube();
		t1.level = 0.9f;
		t2.level = 0.47f;
		print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1 = t2;
		print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 0.27f;
		print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}
}

class Tube {
	float level;
}