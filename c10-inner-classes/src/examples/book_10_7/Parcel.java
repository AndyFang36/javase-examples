package examples.book_10_7;

import examples.book_10_4.Contents;
import examples.book_10_4.Destination;

public class Parcel {
	private static class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	protected static class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		@Override
		public String readLabel() {
			return label;
		}

		// Nested classes can contain other static elements:
		public static void f() {
			System.out.println("PDestination.f()");
		}

		static int x = 10;

		static class AnotherLevel {
			static int x = 10;

			public static void f() {
				System.out.println("AnotherLevel.f()");
			}
		}
	}

	public static Contents contents() {
		return new PContents();
	}

	public static Destination destination(String s) {
		return new PDestination(s);
	}

	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
		PDestination.f();
		PDestination.AnotherLevel.f();
	}
}
