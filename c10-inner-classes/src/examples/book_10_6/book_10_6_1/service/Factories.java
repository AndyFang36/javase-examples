package examples.book_10_6.book_10_6_1.service;

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory);
		// Implementations are completely interchangeable:
		serviceConsumer(Implementation2.factory);
	}
}
