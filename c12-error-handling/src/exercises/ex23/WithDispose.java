package exercises.ex23;

class WithDispose {
	private final int id;

	WithDispose(int id) {
		this.id = id;
	}

	void dispose() {
		System.out.println("WithDispose.dispose(): " + id);
	}
}