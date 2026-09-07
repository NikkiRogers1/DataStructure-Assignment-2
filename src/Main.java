import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);


        // Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        int poppedElement2 = stack.pop();
        System.out.println("Popped element: " + poppedElement2);

        int poppedElement3 = stack.pop();
        System.out.println("Popped element: " + poppedElement3);

     


        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

    }
}

