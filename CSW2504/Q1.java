package CSW2504;

import java.util.Scanner;

public class Q1 {
    public static class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static class LinkedList{
        public static Node start;
        public static void addNode(int val){
            Node A = start;
            while(A.next != null){
                A = A.next;
            }
            Node newNode = new Node(val,null);
            A.next = newNode;
        }
        public static void createList(int val){
            start = new Node(val,null);
        }
        public static boolean search(int val){
            Node A = start;
            while(A.next!=null){
                if(val == A.value)
                    return true;
                A = A.next;
            }
            return false;
        }
        public static void display(){
            Node A = start;
            System.out.println("Following are the contents of the linked list: ");
            while(A != null){
                System.out.print(A.value+" ");
                A = A.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values to be inserted to linked list: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        int x = sc.nextInt();
        LinkedList.createList(x);
        for (int i = 0; i < n-1; i++) {
            LinkedList.addNode(sc.nextInt());
        }
        LinkedList.display();
        System.out.print("Enter the element to be searched: ");
        x = sc.nextInt();
        if(LinkedList.search(x))
            System.out.println("The element is found in the linked list");
        else
            System.out.println("The element is not found in the linked list.");
    }
}
