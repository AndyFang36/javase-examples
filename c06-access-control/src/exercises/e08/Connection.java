package exercises.e08;

class Connection {
	private static int count = 0;

	private Connection() {
		count++;
		System.out.println("A new connection has been set:");
	}

	// Allow creation via static method:
	static Connection makeConnection() {
		return new Connection();
	}

	static int howMany() {
		return count;
	}

	public String toString() {
		return ("Connection " + count + " success!");
	}
}
