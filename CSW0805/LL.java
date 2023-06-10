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
        public static Node start;
        public static void createList(int value){
            start = new Node(value);
            start.next = null;
        }
        public static void addNode(int value){
            Node A = start;
            while(A.next!=null){
                A = A.next;
            }
            A.next = new Node(value,null);
        }
        public static void display(){
            Node A = start;
            while(A!=null){
                System.out.print(A.value + " ");
                A = A.next;
            }
            System.out.println();
        }
        public static int search(int value){
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
        public static void deleteFirst(){
            start = start.next;
        }
        public static void deleteLast(){
            Node A = start;
            while(A.next.next!=null){
                A = A.next;
            }
            A.next = null;
        }
        public static void deleteAllOccurrences(int value){
            while(search(value)!=-1){
                deleteFirstOccurrence(value);
            }
        }
        public static void deleteFirstOccurrence(int value){
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
        public static void deleteAny(int index){
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
        public static int size(){
            Node A = start;
            int i = 0;
            while(A!=null){
                i++;
                A = A.next;
            }
            return i;
        }
        public static void reverse(Node node) {
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
        System.out.print("Enter the size of the linked list: ");
        int n = sc.nextInt();
        System.out.print("Enter the first value of the linked list: ");
        LinkedList.createList(sc.nextInt());
        System.out.println("Enter the next "+(n-1)+ " values: ");
        for (int i = 0; i < n-1; i++) {
            LinkedList.addNode(sc.nextInt());
        }
        System.out.print("Current list: ");
        LinkedList.display();
        System.out.print("Enter a value to be searched: ");
        int x = LinkedList.search(sc.nextInt());
        if(x!=-1)
            System.out.println("The element was found at index: "+x);
        else
            System.out.println("Element was not found.");
        System.out.print("Enter the index of the number to be deleted: ");
        LinkedList.deleteAny(sc.nextInt());
        System.out.print("Enter the number to remove all occurrences: ");
        LinkedList.deleteAllOccurrences(sc.nextInt());
        LinkedList.reverse(LinkedList.start);
        LinkedList.display();
    }
}
