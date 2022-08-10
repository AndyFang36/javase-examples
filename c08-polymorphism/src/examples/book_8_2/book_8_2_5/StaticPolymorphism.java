package examples.book_8_2.book_8_2_5;

class StaticSup {
	public static String staticGet() {
		return "base staticGet()";
	}

	public String dynamicGet() {
		return "base dynamicGet()";
	}
}

class StaticSub extends StaticSup {
	public static String staticGet() {
		return "derived staticGet()";
	}

	public String dynamicGet() {
		return "derived dynamicGet()";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSup sup = new StaticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}
