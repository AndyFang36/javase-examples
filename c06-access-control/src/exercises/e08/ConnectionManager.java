package exercises.e08;

import static net.mindview.util.Print.*;

public class ConnectionManager {
	private static int total = 5;
	static int count = 0;
	static Connection[] connections = new Connection[total];

	static void getConnection() {
		if (count < total) {
			connections[count] = Connection.makeConnection();
			print(connections[count].toString());
			++count;
		} else
			print("No more connections");
	}

	public static void main(String[] args) {
		getConnection();
		getConnection();
		getConnection();
		getConnection();
		getConnection();
		print("\nHere is " + Connection.howMany() + " connections");
	}
}
