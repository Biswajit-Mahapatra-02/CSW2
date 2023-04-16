package Assignment2;

import java.util.Scanner;
import java.util.Stack;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Stack<Integer> bin = new Stack<>();
        while(n!=0){
            bin.push(n%2);
            n/=2;
        }
        while(!bin.isEmpty()){
            System.out.print(bin.pop());
        }
    }
}
