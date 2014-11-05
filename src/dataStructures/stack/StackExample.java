package dataStructures.stack;

import java.util.Stack;

/**
 * Created by ksamykandil on 11/6/14.
 *
 * This is an example of using Stack.
 *
 * Stack is LIFO (Last In First Out).
 *
 * Stack<T> extends Vector<T> which violates the stack abstract concept.
 * Like having stack.get(index).. this is not a proper stack behavior.
 *
 * Stack is synchronized.
 */
public class StackExample {
    // Main Function to test Stack functions.
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();

        // Push() function is used to add element to the Stack.
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        System.out.println("Stack Size: " + integerStack.size()); // Output: 3 .. Size of the stack.
        System.out.println("Stack: " + integerStack); // Output: [1, 2, 3] .. Stack elements.
        System.out.println("--------------------------------------------------");

        /**
         * Pop() function is used to return the first element of stack.
         * Also pop() function remove the element returned from the stack.
         *
         * First element is the last element inserted as it is LIFO.. which is '3'.
         */
        Integer topStackUsingPop = integerStack.pop();
        System.out.println("Stack Top Using Pop(): " + topStackUsingPop);
        System.out.println("Stack Size: " + integerStack.size()); // Output: 2.. as '3' is removed.
        System.out.println("--------------------------------------------------");

        /**
         * Peek() function is used to return the first element of stack.
         * But peek() function don't remove the element returned from the stack (Just for viewing).
         *
         * First element is the last element inserted after '3' as it was removed.. which is '2'.
         */
        Integer topStackUsingPeek = integerStack.peek();
        System.out.println("Stack Top Using Peek(): " + topStackUsingPeek);
        System.out.println("Stack Size: " + integerStack.size()); // Output: Still 2.
        System.out.println("--------------------------------------------------");

        // isEmpty() used to check if the stack is empty or not.
        Boolean isStackEmpty = integerStack.isEmpty();
        System.out.println("Is The Stack Empty: " + isStackEmpty);
        System.out.println("Stack: " + integerStack); // Output: [1, 2] .. Stack elements "Not Empty".
        System.out.println("--------------------------------------------------");
    }
}
