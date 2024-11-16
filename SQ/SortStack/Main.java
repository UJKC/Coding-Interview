import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void sortStack(Stack<Integer> stack) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Pop all elements from the stack and store in result
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        
        // Sort the result list
        Collections.sort(result, Collections.reverseOrder());
        
        // Push all elements back to the stack
        for (Integer i : result) {
            stack.push(i);
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
        
    }
    
}

