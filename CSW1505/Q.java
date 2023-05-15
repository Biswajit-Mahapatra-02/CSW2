package CSW1505;

import java.util.Scanner;

public class Q {
    public static Node tail;
    public static int size = 0;
    public static class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void printList(){
        Node A = tail.next;
        while(A!=tail){
            System.out.print(A.data + " ");
            A = A.next;
        }
        System.out.print(A.data);
    }
    public static void addBeginning(int data){
        Node temp = new Node(data);
        if (isEmpty()) {
            tail = temp;
            temp.next = temp;
        } else {
            temp.next = tail.next;
            tail.next = temp;
        }
        size++;
    }
    public static boolean isEmpty(){
        return tail == null;
    }
    public static void addLast(int data){
        Node temp = new Node(data);
        temp.next = tail.next;
        tail.next = temp;
        tail = temp;
        size++;
    }
    public static void addAny(int data, int index){
        Node A = tail.next;
        if(index==size-1){
            addLast(data);
        }
        if(size == 0)
            addBeginning(data);
        int i = 1;
        if(index<size){
            while(index!=i){
                A = A.next;
                i++;
            }
            Node temp = new Node(data);
            temp.next = A.next;
            A.next = temp;
        }

    }
    public static void sortedInsert(int data){
        Node A = tail;
        if(A == null){
            addBeginning(data);
        }
//        else {
//            A = A.next;
//            int i = 0;
//            while (A != tail) {
//                if (data <= A.data)
//                    addAny(data, i);
//                A = A.next;
//                i++;
//            }
//        }
// THIS DOES NOT WORK YET
        Node temp = new Node(data);
        if(tail.next.data > temp.data)
            addBeginning(data);
        else{
            for (int i = 0; A != tail; i++) {
                if(temp.data < A.data)
                    if(i==0)
                        addBeginning(data);
                    else addAny(data,i);
                else if(tail.data < temp.data)
                    addLast(data);
            }
        }
    }
    public static void createList(int data){
        tail = new Node(data);
        tail.next = tail;
        size++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the initial list: ");
        int n = sc.nextInt();
//        System.out.print("Enter the first value: ");
//        createList(sc.nextInt());
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            sortedInsert(data);
        }
        addBeginning(0);
        addAny(69,3);
        printList();
    }
}
