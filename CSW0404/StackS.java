package CSW0404;

import java.util.ListIterator;
import java.util.Stack;

public class StackS {
    public static void main(String[] args) {
        Stack <String> stringStack = new Stack<>();
        stringStack.add("A");
        stringStack.add("Q2b");
        stringStack.add("C");
        stringStack.add("D");
        stringStack.add("E");
        stringStack.add("F");
        System.out.println("Stack values: "+stringStack);
        System.out.print("Stack values in reverse: ");
        for (ListIterator<String> it = stringStack.listIterator(stringStack.size()); it.hasPrevious(); ) {
            System.out.print(it.previous()+" ");
        }
        System.out.println();
        System.out.println("Peeking: "+stringStack.peek());
        System.out.println("Stack values: "+stringStack);
        System.out.println("Popping: "+stringStack.pop());
        System.out.println("Stack values: "+stringStack);
        System.out.print("Checking if stack is empty: ");
        if(!stringStack.isEmpty()){
            System.out.println("Stack is not empty.");
        } else System.out.println("Stack is empty.");
        System.out.println("Stack values: "+stringStack);
    }
}
