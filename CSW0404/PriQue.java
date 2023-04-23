package CSW0404;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriQue {
    public static void main(String[] args) {
        PriorityQueue<String> PQ = new PriorityQueue<>();
        PQ.add("Q2b");
        PQ.add("C");
        PQ.add("A");
        PQ.add("D");
        PQ.add("F");
        PQ.add("E");
        System.out.println("Values of priority queue: "+PQ);
        Iterator<String> it = PQ.iterator();
//        String W = "";
//        while(it.hasNext()){
//            W = it.next() + " " +W;
//        }
        System.out.print("Sort: ");
        while(it.hasNext()){
            System.out.print(PQ.remove()+" ");
        }
//        System.out.println("Value of priority queue in reverse order: "+W);
    }
}
