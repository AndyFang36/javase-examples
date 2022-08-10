package exercises.e21;

interface In {
	String f();

	String g();

	class Nested {
		static void testIn(In i) {
			System.out.println(i.f() + i.g());
		}
	}
}
