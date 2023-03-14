package CSW1403;

import java.util.Scanner;

public class Q1 {
    static int SOA(int[] a){
        int s = 0;
        for (int x: a) {
            s += x;
        }
        return s;
    }
    static boolean LOA(int[] a, int x){
        for (int j : a) {
            if (x == j)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int a = sc.nextInt();
        System.out.print("Enter "+a+" numbers: ");
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of all the elements of the array: "+SOA(arr) );
        System.out.print("Enter search element: ");
        int x = sc.nextInt();
        System.out.println("Searching...");
        if(LOA(arr,x)){
            System.out.println("Element was found.");
        } else System.out.println("Element does not exist.");
    }
}
