package exercises.ex23;

import exercises.ex22.ConstructionException;

class FailingConstructor {
	static int num = 1;

	FailingConstructor(boolean fail) throws ConstructionException {
		WithDispose wd = new WithDispose(num++);
		try {
			// "Simulate" other code that might throw exceptions
			if (fail)
				throw new ConstructionException();
		} catch (ConstructionException e) {
			wd.dispose();
			throw e;
		}
	}
}