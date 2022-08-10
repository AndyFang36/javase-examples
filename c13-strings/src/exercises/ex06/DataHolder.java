package exercises.ex06;

import static java.lang.String.*;

import java.util.Locale;

public class DataHolder {
	int intField = 1;
	long longField = 2L;
	float floatField = 3.0f;
	double doubleField = 4.0;

	@Override
	public String toString() {
		return "DataHolder: \n" +
			format(Locale.US, "intField: %d\n", intField) +
			format(Locale.US, "longField: %d\n", longField) +
			format(Locale.US, "floatField: %f\n", floatField) +
			format(Locale.US, "doubleField: %e\n", doubleField);
	}
}
