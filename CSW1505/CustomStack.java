package CSW1505;

import java.util.Scanner;

public class CustomStack {
    public static class stack{
        int[] arr;
        int top;
        int size;

        public stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }
        public boolean isEmpty(){
            return top == -1;
        }
        public void push(int data){
            if(top+1==arr.length){
                System.out.print("OVERFLOW");
                return;
            }
            arr[++top] = data;
        }
        public int pop(){
            if(isEmpty()) {
                System.out.println("UNDERFLOW");
                return -1;
            }
            return arr[top--];
        }
        public void print(){
            int i = top;
            while(i!=-1){
                System.out.println(arr[i--]);
            }
        }
    }

    public static void main(String[] args) {
        int size = 5;
        stack S = new stack(size);
        S.push(5);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(1);
        S.print();
        System.out.println("The popped element is: "+S.pop());
        S.print();
        System.out.println("The popped element is: "+S.pop());
        System.out.println("The popped element is: "+S.pop());
        System.out.println("The popped element is: "+S.pop());
        System.out.println("The popped element is: "+S.pop());
        System.out.println("The popped element is: "+S.pop());
        System.out.println("The popped element is: "+S.pop());
        System.out.println("The popped element is: "+S.pop());
        System.out.println("The popped element is: "+S.pop());
    }
}
