package Assignment4;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number of triangles: "+numberOfTriangles(arr,n));
    }
    public static int numberOfTriangles(int[] arr, int size) {
        int i, j, k, count = 0;
        for (i = 0; i < (size - 2); i++) {
            for (j = i + 1; j < (size - 1); j++) {
                for (k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] > arr[k])
                        count += 1;
                }
            }
        }
        return count;
    }

}
