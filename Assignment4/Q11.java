package Assignment4;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(!FindPair(arr,arr.length,6))
            System.out.println("Pair does not exist");
    }
    public static boolean FindPair(int[] arr, int size, int value) {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j]) == value) {
                    System.out.println("Pair is: " + arr[i] + "," + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
