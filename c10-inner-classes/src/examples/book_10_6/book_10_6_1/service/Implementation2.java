package examples.book_10_6.book_10_6_1.service;

import static net.mindview.util.Print.*;

public class Implementation2 implements Service {
	private Implementation2() {

	}

	@Override
	public void method1() {
		print("Implementation2.method1()");
	}

	@Override
	public void method2() {
		print("Implementation2.method2()");
	}

	public static ServiceFactory factory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation2();
		}
	};
}
