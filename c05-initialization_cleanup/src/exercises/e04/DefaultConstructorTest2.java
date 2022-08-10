// TIJ4 Chapter Initialization, Exercise 4, page 167
/* Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.*/

package exercises.e04;

class Hello2 {
	Hello2() {
		System.out.println("hello world");
	}

	Hello2(String s) {
		System.out.println(s);
	}
}

public class DefaultConstructorTest2 {
	public static void main(String[] args) {
		new Hello2();
		new Hello2("(argument) hello world");
	}
}
