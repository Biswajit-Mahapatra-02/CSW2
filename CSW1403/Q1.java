package CSW1403;

import java.util.Scanner;
// WAP in java to take n numbers as input into an array and calculate the sum of all the elements. Then search for a number given by the user.
public class Q1 {
    static int SOA(int[] a){
        int s = 0;
        for (int x: a) {
            s += x;
        }
        return s;
    }
    static int LOA(int[] a, int x){
        for (int i = 0; i< a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
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
        System.out.println("The sum of all the elements of the array: "+SOA(arr));
        System.out.print("Enter search element: ");
        int x = sc.nextInt();
        System.out.println("Searching...");
        if(LOA(arr,x)!=-1){
            System.out.println("Element was found.");
        } else System.out.println("Element does not exist.");
    }
}
