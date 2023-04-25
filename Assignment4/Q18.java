package Assignment4;

import java.util.HashSet;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> HS = new HashSet<>();
        for (int x : arr) {
            HS.add(x);
        }
        Integer[] temp = HS.toArray(new Integer[HS.size()]);
        System.out.println("The second max element in the given array: "+temp[temp.length-2]);
    }
}
