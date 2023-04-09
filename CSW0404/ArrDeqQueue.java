package CSW0404;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrDeqQueue {
    public static ArrayDeque <String> imposterQueue = new ArrayDeque<>();
    public static void main(String[] args) {
        enqueue("A");
        enqueue("B");
        enqueue("C");
        enqueue("D");
        enqueue("E");
        enqueue("F");
        System.out.println("Imposter queue values: "+imposterQueue);
        System.out.print("Imposter queue values in reverse: ");
        for (Iterator<String> it = imposterQueue.descendingIterator(); it.hasNext(); ) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Imposter queue peek/front: "+front());
        System.out.println("Imposter queue values: "+imposterQueue);
        System.out.println("Imposter queue dequeue: "+ dequeue());
        System.out.println("Imposter queue values: "+imposterQueue);
        if(!imposterQueue.isEmpty()) System.out.println("The imposter queue is not empty");
        else System.out.println("The imposter queue is empty");
        System.out.println("Imposter queue values: "+imposterQueue);
    }
    public static void enqueue(String val){
        imposterQueue.addLast(val);
    }
    public static String dequeue(){
        return imposterQueue.removeFirst();
    }
    public static String front(){
        return imposterQueue.peekFirst();
    }
}
