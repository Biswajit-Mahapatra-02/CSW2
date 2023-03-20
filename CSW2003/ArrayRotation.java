package CSW2003;

import java.util.Arrays;
import java.util.Scanner;

// Given an array, rotate the elements of the array k number of times.
// E.g. arr[] = {10,20,30,40,50,60} k = 2
// answer = {30,40,50,60,10,20}
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60};
        System.out.println("Current array: "+Arrays.toString(arr));
        System.out.print("Enter number of times elements are to be rotated: ");
        int k = sc.nextInt();
        System.out.println("Rotated array: "+ Arrays.toString(Rotate(arr,k)));
    }
    // Time complexity: O(N)
    // Space complexity: O(N) [Optimization possible]
    static int[] Rotate(int[] arr, int k){
        int[] temp = new int[arr.length];
        int n = arr.length;
        int x = 0;
        for (int i = k; i < n; i++,x++) {
            temp[x] = arr[i];
        }
        for (int i = 0; i < k; i++,x++) {
            temp[x] = arr[i];
        }
        return temp;
    }

    // Time complexity: O(N)
    // Space complexity: O(1)
    static int[] improvedRotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int i, j;
        // Reverse last k numbers
        for (i = n - k, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the first n-k terms
        for (i = 0, j = n - k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the entire array
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
