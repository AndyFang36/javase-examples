package examples.s08_stack;

public class Test {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
