package examples.s13_foreach;

import java.util.Map.Entry;

public class EnvironmentVariables {
	public static void main(String[] args) {
		for (Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
