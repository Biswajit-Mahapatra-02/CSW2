package CSW1403;

import java.util.Scanner;

//WAP to take an array as input and find the sum of all the elements of the array
public class Q1 {
    static int SOA(int[] a){
        int s = 0;
        for (int x: a) {
            s+=x;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of array is: "+SOA(arr));
    }
}
