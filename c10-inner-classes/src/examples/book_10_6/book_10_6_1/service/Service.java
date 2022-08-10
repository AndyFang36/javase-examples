package examples.book_10_6.book_10_6_1.service;

public interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}
