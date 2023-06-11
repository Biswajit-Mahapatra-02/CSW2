package CSW0905;

import java.util.Scanner;

public class CLL{
    public static class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static class CircularLinkedList{
        public Node tail;
        public void createList(int value){
            tail = new Node(value);
            tail.next = tail;
        }
        public void addNode(int value){
            Node temp = new Node(value, tail.next);
            tail.next = temp;
            tail = temp;
        }
        public void addAtFirst(int value){
            tail.next = new Node(value,tail.next);
        }
        public void display(){
            Node A = tail;
            A = A.next;
            while(A!=tail){
                System.out.print(A.value+" ");
                A = A.next;
            }
            System.out.print(A.value);
            System.out.println();
        }
        public void deleteEnd(){
            Node A = tail;
            A = A.next;
            while(A!=tail){
                A = A.next;
                if(A.next == tail){
                    A.next = tail.next;
                    tail = A;
                }
            }
        }
        public void deleteAny(int value){
            Node A = tail;
            if(A.value == value){
                deleteEnd();
                return;
            }
            A = A.next;
            while(A!=tail){
                if(A.next.value == value) {
                    A.next = A.next.next;
                    return;
                }
                A = A.next;
            }
            System.out.println("Value does not exist.");
        }
        public int size(){
            int i = 1;
            Node A = tail;
            A = A.next;
            while(A!=tail){
                i++;
                A = A.next;
            }
            return i;
        }
        public int search(int value){
            Node A = tail;
            if(A.value == value)
                return size()-1;
            A = A.next;
            int i = 0;
            while(A!=tail){
                if(A.value == value){
                    return i;
                }
                i++;
                A = A.next;
            }
            return -1;
        }
        public void copy(CircularLinkedList L2){
            Node A = tail.next;
            L2.createList(A.value);
            A = A.next;
            while(A!=tail){
                L2.addNode(A.value);
                A = A.next;
            }
            L2.addNode(tail.value);
        }
        public void copyReversed(CircularLinkedList L2){
            Node A = tail.next;
            L2.createList(A.value);
            A = A.next;
            while(A!=tail){
                L2.addAtFirst(A.value);
                A = A.next;
            }
            L2.addAtFirst(tail.value);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the linked list: ");
        int n = sc.nextInt();
        System.out.print("Enter the first value of the linked list: ");
        CircularLinkedList A = new CircularLinkedList();
        A.createList(sc.nextInt());
        System.out.print("Enter the rest "+(n-1)+" values: ");
        for (int i = 0; i < n - 1; i++) {
            A.addNode(sc.nextInt());
        }
        System.out.println("Size of the current list: "+A.size());
        System.out.print("Add at first: ");
        A.addAtFirst(sc.nextInt());
        A.deleteEnd();
        A.display();
        System.out.print("Enter value to be deleted: ");
        int val = sc.nextInt();
        A.deleteAny(val);
        A.display();
        System.out.print("Enter the value to search: ");
        int s = A.search(sc.nextInt());
        if(s!=-1)
            System.out.println("The value is found at: "+s);
        else System.out.println("The value cannot be found.");

        CircularLinkedList B = new CircularLinkedList();
        A.copy(B);
        B.display();
        CircularLinkedList C = new CircularLinkedList();
        A.copyReversed(C);
        C.display();
    }
}