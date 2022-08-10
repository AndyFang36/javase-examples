package examples.book_10_6.book_10_6_1.service;

import static net.mindview.util.Print.*;

class Implementation1 implements Service {
	private Implementation1() {
	}

	@Override
	public void method1() {
		print("Implementation1.method1()");
	}

	@Override
	public void method2() {
		print("Implementation1.method2()");
	}

	public static ServiceFactory factory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation1();
		}
	};
}