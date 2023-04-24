package Assignment4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> HS = new HashSet<>();
        for (int j : arr) {
            HS.add(j);
        }
        for (int i = 1; i < arr.length+1; i++) {
            if(!HS.contains(i))
                System.out.println("The missing element is: "+i);
        }
    }
}
