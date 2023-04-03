package CSW0304;

import java.util.LinkedList;
import java.util.ListIterator;

public class CCLL {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        LL.add(6);
        LL.add(7);
        System.out.println("Current Linked List: "+ LL);
        System.out.println(".addFirst() function: ");
        LL.addFirst(0);
        System.out.println("Current Linked List: "+ LL);
        System.out.println(".addLast() function: ");
        LL.addLast(8);
        System.out.println("Current Linked List: "+ LL);
        System.out.println(".removeFirst() function: ");
        System.out.println("The first element that is now removed: "+LL.removeFirst()); // It returns the first element before removing it
        System.out.println("Current Linked List: "+ LL);
        System.out.println(".removeLast() function: ");
        System.out.println("The last element that is now removed: "+LL.removeLast()); // It returns the last element before removing it
        System.out.println("Current Linked List: "+ LL);


        ListIterator<Integer> LI = LL.listIterator(); // The argument takes what index we want to start from.
        System.out.println("Printing using ListIterator: ");
        while(LI.hasNext()){
            System.out.print(LI.next()+" ");
        }
        System.out.println();
        System.out.println("Printing in reverse using ListIterator: ");
        while(LI.hasPrevious()){
            System.out.print(LI.previous()+" ");
        }
    }
}