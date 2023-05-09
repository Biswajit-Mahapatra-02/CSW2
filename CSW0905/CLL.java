package CSW0905;

public class CLL {
    private static Node tail;
    private static int size = 0;
    private static class Node {
        private int value;
        private Node next;

        public Node(int v, Node n) {
            value = v;
            next = n;
        }

        public Node(int v) {
            value = v;
            next = null;
        }
    }
        public static void addHead(int value) {
        Node temp = new Node(value, null);
        if (isEmpty()) {
            tail = temp;
            temp.next = temp;
        } else {
            temp.next = tail.next;
            tail.next = temp;
        }
        size++;
    }

    private static boolean isEmpty() {
        if(tail==null)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        CLL ll = new CLL();
        addHead(1);
        addHead(2);
        addHead(3);
        addHead(1);
        addHead(2);
        addHead(3);
        ll.print();
    }
    public boolean searchList(int data) {
        Node temp = tail;
        for (int i = 0; i < size; i++) {
            if (temp.value == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void addTail(int value) {
        Node temp = new Node(value, null);
        if (isEmpty()) {
            tail = temp;
            temp.next = temp;
        } else {
            temp.next = tail.next;
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public int removeHead() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("EmptyListException");
        }
        int value = tail.next.value;
        if (tail == tail.next)
            tail = null;
        else
            tail.next = tail.next.next;
        size--;
        return value;
    }
    public boolean removeNode(int key) {
        if (isEmpty()) {
            return false;
        }
        Node prev = tail;
        Node curr = tail.next;
        Node head = tail.next;
        if (curr.value == key)// head and single node case.
        {
            if (curr == curr.next)// single node case
                tail = null;
            else // head case
                tail.next = tail.next.next;
            return true;
        }
        prev = curr;
        curr = curr.next;
        while (curr != head) {
            if (curr.value == key) {
                if (curr == tail)
                    tail = prev;
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }


    private void print() {
        if (isEmpty()) {
            return;
        }
        Node temp = tail.next;
        while (temp != tail) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.print(temp.value);

    }

}
