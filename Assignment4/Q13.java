package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Min diff: "+findMinDiff(arr, arr.length));
    }
    public static int findMinDiff(int[] arr, int size) {
        Arrays.sort(arr);
        int diff = 9999999;
        for (int i = 0; i < (size - 1); i++) {
            if ((arr[i + 1] - arr[i]) < diff)
                diff = arr[i + 1] - arr[i];
        }
        return diff;
    }
}
