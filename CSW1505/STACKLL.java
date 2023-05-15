package CSW1505;

public class STACKLL {
    public static class stack{
        public Node start;
        public class Node{
            int data;
            Node next;

            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public void push(int data){
            start = new Node(data,start);
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("UNDERFLOW");
                return -1;
            } else {
                int i = start.data;
                start = start.next;
                return i;
            }
        }
        public void addLast(int data){
            Node A = start;
            while(A.next!=null){
                A = A.next;
            }
            A.next = new Node(data);
        }
        public boolean isEmpty(){
            return start == null;
        }
        public void print(){
            Node A = start;
            if(A==null)
                System.out.print("UNDERFLOW: List is empty");
            while(A!=null){
                System.out.print(A.data+ " ");
                A = A.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            stack S = new stack();
            S.push(5);
            S.push(3);
            S.push(1);
            S.push(4);
            S.push(2);
            S.addLast(6);
            S.print();
            S.pop();
            S.pop();
            S.pop();
            S.pop();
            S.pop();
            S.pop();
            S.print();
        }
    }


}
