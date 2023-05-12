package CSW1205;

import java.util.Scanner;

public class DLL {
    public static Node start;
    public static Node end;


    public static class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        public Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int n = sc.nextInt();
        createList(n);
        printList(start);
        System.out.print("Enter a value to add to the start: ");
        n = sc.nextInt();
        addStart(n);
        printList(start);
        System.out.print("Enter the value to add to the end: ");
        n = sc.nextInt();
        addEnd(end,n);
        printList(start);
        System.out.print("Enter a value to be searched: ");
        n = sc.nextInt();
        int res = search(n);
        if(res!=-1)
            System.out.println("The element was found at index: "+res);
        else System.out.println("The element was not found.");

//        removeStart();
//        printList();
//        removeEnd();
//        printList();

        System.out.print("Enter the element to be removed: ");
        n = sc.nextInt();
        boolean flag = remove(n);
        if(flag){
            System.out.println("The element was successfully removed.");
        } else System.out.println("The element was not found.");
        printList(start);
        printList(copy());
    }
    public static void createList(int value){
        start = new Node(value);
        end = start;
    }
    public static void addStart(int value){
        Node temp = new Node(value);
        temp.next = start;
        start.prev = temp;
        temp.prev = null;
        start = temp;
    }
    public static void addEnd(Node end, int value){
        Node temp = new Node(value);
        temp.next = null;
        end.next = temp;
        temp.prev = end;
    }
    public static void printList(Node A){
        while(A!=null){
            System.out.print(A.value+" ");
            A = A.next;
        }
        System.out.println();
    }
    public static int search(int val){
        Node A = start;
        int index = 0;
        while(A!=null){
            if(A.value == val)
                return index;
            index++;
            A=A.next;
        }
        return -1;
    }
    public static void removeStart(){
        Node A = start;
        if(A==null){
            System.out.println("The list is empty.");
            return;
        }
        start = start.next;
        start.prev = null;
    }
    public static void removeEnd(){
        Node A = end;
        if(A==null){
            System.out.println("The list is empty.");
            return;
        }
        A.next = null;
    }
    public static int size(){
        Node A = start;
        int count = 0;
        while(A!=null){
            count++;
            A = A.next;
        }
        return count;
    }
    public static boolean remove(int val){
        Node A = start;
        int res = search(val);
        if(res == 0)
            removeStart();
        if(res == size())
            removeEnd();
        while(A!=null){
            if(A.value == val) {
                A.prev.next = A.next;
                A.next.prev = A.prev;
                return true;
            }
            A=A.next;
        }
        return false;
    }
    public static Node copy(){
        Node nStart = new Node(start.value);
        Node A = start.next;
        while(A!=null){
            addEnd(nStart,A.value);
            A=A.next;
        }
        return nStart;
    }

    //reverse not working
    public static void reverse(){
        Node nStart = new Node(start.value);
        Node A = start.next;
        while(A!=null){
            addStart(A.value);
            A=A.next;
        }
    }
}