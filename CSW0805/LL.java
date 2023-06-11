package CSW0805;

import java.util.Scanner;
public class LL {
    public static class Node{
        int value;
        Node next;
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    public static class LinkedList{
        public LinkedList(int value) {
            createList(value);
        }

        public LinkedList() {
            start = null;
        }

        public Node start;
        public void createList(int value){
            start = new Node(value);
            start.next = null;
        }


        public void addNode(int value){
            Node A = start;
            while(A.next!=null){
                A = A.next;
            }
            A.next = new Node(value,null);
        }
        public void display(){
            Node A = start;
            while(A!=null){
                System.out.print(A.value + " ");
                A = A.next;
            }
            System.out.println();
        }
        public int search(int value){
            Node A = start;
            int i = 0;
            while(A!=null){
                if(A.value == value)
                    return i;
                i++;
                A = A.next;
            }
            return -1;
        }
        public void deleteFirst(){
            start = start.next;
        }
        public void deleteLast(){
            Node A = start;
            while(A.next.next!=null){
                A = A.next;
            }
            A.next = null;
        }
        public void deleteAllOccurrences(int value){
            while(search(value)!=-1){
                deleteFirstOccurrence(value);
            }
        }
        public void deleteFirstOccurrence(int value){
            Node A = start;
            int i = 0;
            while(A!=null){
                if(A.value == value) {
                    deleteAny(i);
                    break;
                }
                A = A.next;
                i++;
            }
        }
        public void deleteAny(int index){
            if(index>=size()){
                System.out.println("Index Out of Bounds.");
                return;
            }
            if(index == 0)
                deleteFirst();
            else if (index == size()) {
                deleteLast();
            }
            else{
                int i = 1;
                Node A = start;
                while(A.next.next != null){
                    if(i == index)
                        break;
                    i++;
                    A = A.next;
                }
                A.next = A.next.next;
            }
        }
        public int size(){
            Node A = start;
            int i = 0;
            while(A!=null){
                i++;
                A = A.next;
            }
            return i;
        }
        public void reverse(Node node) {
            Node prev = null;
            Node current = node;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            start = node;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the linked list: ");
        int n = sc.nextInt();
        System.out.print("Enter the first value of the linked list: ");
        LinkedList A = new LinkedList(sc.nextInt());
        System.out.print("Enter the rest "+(n-1)+" values of the linked list: ");
        for (int i = 0; i < n-1; i++) {
            A.addNode(sc.nextInt());
        }
        System.out.print("Enter the index of the element to be deleted: ");
        int d = sc.nextInt();
        A.deleteAny(d);
        System.out.print("Enter the element of which all occurrences are to be deleted: ");
        int e = sc.nextInt();
        A.deleteAllOccurrences(e);
        System.out.println("Copy one linked list to other: ");
        LinkedList B = new LinkedList();
        copyList(A,B);
        A.display();
        B.display();
        B.addNode(23);
        A.display();
        B.display();
        copyListReverse(A,B);
        A.display();
        B.display();
    }
    public static void copyList(LinkedList L1, LinkedList L2){
        Node start = L1.start;
        L2.createList(start.value);
        start = start.next;
        while(start!=null){
            L2.addNode(start.value);
            start=start.next;
        }
    }
    public static void copyListReverse(LinkedList L1, LinkedList L2){
        LinkedList temp = new LinkedList();
        copyList(L1,temp);
        temp.reverse(temp.start);
        copyList(temp,L2);
    }
}
