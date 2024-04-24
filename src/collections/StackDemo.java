package collections;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("America");
        stack.push("Germany");
        stack.push("India");

        System.out.println("Stack: " + stack);

        String poppedElement = stack.pop();
        System.out.println("popped element: " + poppedElement);

        System.out.println("Now the stack looks like: " + stack);

        String peekedElement = stack.peek();
        System.out.println("The peeked element(only seeing but not popping: " + peekedElement);

        System.out.println("Now the stack looks like: " + stack);
    }
}
