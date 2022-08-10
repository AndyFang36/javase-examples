package exercises.e06;

class Dog2 {
	void bark(char c, int i) {
		System.out.println("caw...yow...");
	}

	void bark(int i, char c) {
		System.out.println("yow...caw...");
	}
}

public class DogTalk2 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.bark('c', 1);
		dog.bark(1, 'c');
	}
}
