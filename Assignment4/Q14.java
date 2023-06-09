package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        MinDiffPair(arr1,n,arr2,n1);
    }
    public static void MinDiffPair(int[] arr1, int size1, int[] arr2, int size2) {
        int minDiff = 9999999;
        int f = 0;
        int s = 0;
        int out1 = 0, out2 = 0, diff;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (f < size1 && s < size2) {
            diff = Math.abs(arr1[f] - arr2[s]);
            if (minDiff > diff) {
                minDiff = diff;
                out1 = arr1[f];
                out2 = arr2[s];
            }
            if (arr1[f] < arr2[s])
                f += 1;
            else
                s += 1;
        }
        System.out.println("The pair is :: " + out1 + out2);
        System.out.println("Minimum difference is :: " + minDiff);
    }

}
