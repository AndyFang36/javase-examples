package examples.book_8_2.book_8_2_5;

class Sup {
	public int field = 0;

	public int getField() {
		return field;
	}
}

class Sub extends Sup {
	public int field = 1;

	public int getField() {
		return field;
	}

	public int getSuperField(){
		return super.field;
	}
}

public class FieldAccess {
	public static void main(String[] args) {
		Sup sup = new Sub();
		System.out.println("sup.field = " + sup.field);
		System.out.println("sup.getField = " + sup.getField());
		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field);
		System.out.println("sub.getField = " + sub.getField());
		System.out.println("sub.getSuperField = " + sub.getSuperField());
	}
}
