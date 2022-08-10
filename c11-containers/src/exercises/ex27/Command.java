package exercises.ex27;

class Command {
	private final String cmd;

	Command(String cmd) {
		this.cmd = cmd;
	}

	public void operation() {
		System.out.println(cmd);
	}
}
