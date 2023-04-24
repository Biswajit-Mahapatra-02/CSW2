package Assignment4;

import java.util.HashSet;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = max(arr);
        System.out.println("Max value: "+max);
        int min = min(arr);
        System.out.println("Min value: "+min);
        HashSet<Integer> HS = new HashSet<>();
        for (int j : arr) {
            HS.add(j);
        }
        for (int i = min; i < max; i++) {
            if(!HS.contains(i))
                System.out.println("The missing element is: "+i);
        }
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if(x>max)
                max = x;
        }
        return max;
    }
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if(min>x)
                min = x;
        }
        return min;
    }
}
