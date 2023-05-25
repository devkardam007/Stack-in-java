import java.util.Stack;

public class stackUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();            // Creating Stack Using Stack Collection Framework
        list.push(1);                              // Add or Push the data in the Stack
        list.push(2);
        list.push(3);
        list.push(4);
        while (list.size() != 0){                       // Print the Stack
            System.out.println(list.peek());
            list.pop();
        }
    }
}