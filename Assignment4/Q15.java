package Assignment4;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ZeroSumTriplets(arr,arr.length);
    }
    public static void ZeroSumTriplets(int[] arr, int size) {
        for (int i = 0; i < (size - 2); i++) {
            for (int j = i + 1; j < (size - 1); j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0)
                        System.out.println("Triplet :: " + arr[i] + arr[j] + arr[k]);
                }
            }
        }
    }

}
