package examples.s08_stack;

import static net.mindview.util.Print.*;

public class StackCollision {
    public static void main(String[] args) {
        net.mindview.util.Stack<String> stack = new net.mindview.util.Stack<>();
        for (String word : "My dog has fleas".split(" ")) {
            stack.push(word);
        }
        while (!stack.empty()) {
            printnb(stack.pop() + " ");
        }
        print();
        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String word : "My dog has fleas".split(" ")) {
            stack2.push(word);
        }
        while (!stack2.empty()) {
            printnb(stack2.pop() + " ");
        }
    }
}