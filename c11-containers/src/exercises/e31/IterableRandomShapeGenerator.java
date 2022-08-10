package exercises.e31;

public class IterableRandomShapeGenerator {
	public static void main(String[] args) {
		RandomShapeGenerator rsg = new RandomShapeGenerator(10);
		for (Shape shape : rsg)
			System.out.println(shape.getClass().getSimpleName());
	}
}