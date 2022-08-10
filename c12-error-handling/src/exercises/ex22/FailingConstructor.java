package exercises.ex22;

class FailingConstructor {
	FailingConstructor(boolean fail) throws ConstructionException {
		if (fail)
			throw new ConstructionException();
	}
}
