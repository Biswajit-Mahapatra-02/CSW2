package CSW0404;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrDeqStack {
    public static ArrayDeque<String> imposterStack = new ArrayDeque<>();
    public static void main(String[] args) {

        imposterStack.addLast("A");
        imposterStack.addLast("B");
        imposterStack.addLast("C");
        imposterStack.addLast("D");
        imposterStack.addLast("E");
        imposterStack.addLast("F");
        System.out.println("Imposter stack values: "+imposterStack);
        System.out.print("Imposter stack values in reverse: ");
        for (Iterator<String> it = imposterStack.descendingIterator(); it.hasNext(); ) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Imposter stack peek: "+peek());
        System.out.println("Imposter stack pop: "+pop());
        System.out.println("Imposter stack values: "+imposterStack);
        System.out.print("Checking if stack is empty: ");
        if(!imposterStack.isEmpty()) System.out.println("The imposter stack is not empty");
        else System.out.println("The imposter stack is empty");
        System.out.println("Imposter stack values: "+imposterStack);
    }
    public static String peek(){
        return imposterStack.peekLast();
    }
    public static String pop(){
        return imposterStack.removeLast();
    }
}
